package com.pe.relari.repository.impl;

import com.pe.relari.config.DatabaseConfig;
import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Class EmployeeRepositoryImpl.
 * Clase donde se va a realizar la persistencia de los datos.
 * @author Relari
 */
@Log4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final int VALUE_SUCCESS = 1;

    private static EmployeeRepository employeeRepository;

    public static EmployeeRepository getInstance() {
        if (employeeRepository == null) {
            employeeRepository = new EmployeeRepositoryImpl();
        }
        return employeeRepository;
    }

    private static final DatabaseConfig databaseConfig =
            DatabaseConfig.getInstance();
    private PreparedStatement preparedStatement = null;

    @Override
    public boolean save(Employee person) {

        try {
            String sql = "INSERT INTO public.employee " +
                    "(father_last_name, first_name, is_active, mother_last_name, position, salary, sex)" +
                    "VALUES(?,?,?,?,?,?,?);";

            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, person.getFatherLastName());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setBoolean(3, true);
            preparedStatement.setString(4, person.getMotherLastName());
            preparedStatement.setString(5, person.getPosition());
            preparedStatement.setDouble(6, person.getSalary());
            preparedStatement.setString(7, person.getSex());

            return VALUE_SUCCESS == preparedStatement.executeUpdate();

        } catch (SQLException e) {
            log.error("Ocurrio un error al guardar al empleado.", e);
        } finally {
            databaseConfig.closeConnection();
        }
        return false;
    }

    @Override
    public boolean updatedStatusById(int employeeId, boolean status) {

        try {
            String sql = "update employee set is_active = ? where id = ?;";
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);
            preparedStatement.setBoolean(1, status);
            preparedStatement.setInt(2, employeeId);

            return VALUE_SUCCESS == preparedStatement.executeUpdate();

        } catch (SQLException e) {
            log.error("Ocurrio un error al eliminar al empleado", e);
        } finally {
            databaseConfig.closeConnection();
        }
        return false;
    }

    @Override
    public Employee findById(int employeeId) {

        log.info("Buscando al emplado por su id=" + employeeId);

        String sql = "select * from employee where id = ?";

        Employee employee = null;

        try {
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, employeeId);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                employee = mapEmployee(rs);
            }

        } catch (SQLException e) {
            log.error("Ocurrio un error al buscar al empleado", e);
        } finally {
            databaseConfig.closeConnection();
        }

        return employee;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();

        String sql = "select * from employee;";

        try {
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee employee = mapEmployee(rs);

                employees.add(employee);
            }

        } catch (SQLException e) {
            log.error("Ocurrio un error al listar todos los empleados.", e);
        } finally {
            databaseConfig.closeConnection();
        }
        return employees;
    }

//    @Override
//    public void update(EmployeeEntity person) {
//        try {
//            String sql = "UPDATE Employee SET "
//                    + "Nombre_Employee = ?,"
//                    + "Direccion = ?,"
//                    + "Telefono = ?,"
//                    + "Correo_Electronico = ?,"
//                    + "Contactos_Referencia = ?"
//                    + " where Ruc_Employee = ?;";
//
//            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);
//
//            preparedStatement.setString(1, person.getName());
//            preparedStatement.setString(2, person.getSex());
//            preparedStatement.setString(3, person.getPosition());
//            preparedStatement.setInt(4, person.getSalary());
//            preparedStatement.setString(5, person.getId());
//
//            preparedStatement.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Se Actualizo Correctamente", INFO, JOptionPane.INFORMATION_MESSAGE);
//        } catch (HeadlessException | SQLException e) {
//            JOptionPane.showMessageDialog(null, "No se Actualizo la Employee", ALERT, JOptionPane.WARNING_MESSAGE);
//        } finally {
//            databaseConfig.closeConnection();
//        }
//    }

    @Override
    public List<Employee> findByStatus(boolean status) {

        List<Employee> employees = new ArrayList<>();

        String sql = "select * from employee where is_active = ?";

        try {
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            preparedStatement.setBoolean(1, status);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee employee = mapEmployee(rs);

                employees.add(employee);
            }

        } catch (SQLException e) {
            log.error("Ocurrio un error al listar los empleados activos o inactivos.", e);
        } finally {
            databaseConfig.closeConnection();
        }
        return employees;
    }

    private Employee mapEmployee(ResultSet rs) throws SQLException {
        return Employee.builder()
                .id(rs.getInt("id"))
                .fatherLastName(rs.getString("father_last_name"))
                .motherLastName(rs.getString("mother_last_name"))
                .firstName(rs.getString("first_name"))
                .sex(rs.getString("sex"))
                .position(rs.getString("position"))
                .salary(rs.getDouble("salary"))
                .isActive(rs.getBoolean("is_active"))
                .build();
    }
}