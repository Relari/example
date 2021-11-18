package com.pe.relari.people.dao.impl;

import com.pe.relari.config.DatabaseConfig;
import com.pe.relari.people.dao.repository.EmployeeRepository;
import com.pe.relari.people.model.domain.Employee;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lombok.extern.java.Log;

/**
 * Class EmployeeRepositoryImpl.
 * @author Relari
 */
@Log
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final String ALERT = "Alert";
    private static final String INFO = "Alert";
    
    private final DatabaseConfig databaseConfig = DatabaseConfig.getInstance();
    private PreparedStatement preparedStatement = null;

    @Override
    public void save(Employee person) {
        try {
            String sql = "insert into Employee"
                    + " (RUC_Employee,Nombre_Employee,Direccion,Telefono,Correo_Electronico,Contactos_Referencia,Estado)"
                    + " values (?,?,?,?,?,?,?);";

            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getSex());
            preparedStatement.setString(3, person.getPosition());
            preparedStatement.setInt(4, person.getSalary());
            preparedStatement.setBoolean(5, true);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se Grabo Correctamente", INFO, JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se Grabo la Employee", ALERT, JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void deleteById(int employeeId) {

        try {
            String sql = "update Employee set Estado = ? where Ruc_Employee = ?;";
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, "0");
            preparedStatement.setInt(2, employeeId);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se Elimino Correctamente", INFO, JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se Elimino la Employee", ALERT, JOptionPane.WARNING_MESSAGE);
        } finally {
            databaseConfig.closeConnection();
        }

    }

    @Override
    public Employee findById(int employeeId) {

        String sql = "select Ruc_Employee, Nombre_Employee, Direccion, Telefono, Correo_Electronico, Contactos_Referencia,Estado"
                + " from Employee where Ruc_Employee = ?";

        Employee person = null;

        try {
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, employeeId);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                person = mapEmployee(rs);

            }

        } catch (SQLException e) {
            System.err.println("Error al Buscar Employee " + e.getMessage());
        } finally {
            databaseConfig.closeConnection();
        }

        return person;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> people = new ArrayList<>();

        String sql = "select * from person;";

        try {
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee person = mapEmployee(rs);

                people.add(person);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar Employee " + e.getMessage());
        } finally {
            databaseConfig.closeConnection();
        }
        return people;
    }

    @Override
    public void update(Employee person) {
        try {
            String sql = "UPDATE Employee SET "
                    + "Nombre_Employee = ?,"
                    + "Direccion = ?,"
                    + "Telefono = ?,"
                    + "Correo_Electronico = ?,"
                    + "Contactos_Referencia = ?"
                    + " where Ruc_Employee = ?;";

            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getSex());
            preparedStatement.setString(3, person.getPosition());
            preparedStatement.setInt(4, person.getSalary());
            preparedStatement.setString(5, person.getId());

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se Actualizo Correctamente", INFO, JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se Actualizo la Employee", ALERT, JOptionPane.WARNING_MESSAGE);
        } finally {
            databaseConfig.closeConnection();
        }
    }

    @Override
    public List<Employee> findByStatus(boolean status) {

        List<Employee> people = new ArrayList<>();

        String sql = "select Ruc_Employee, Nombre_Employee, Direccion, Telefono, Correo_Electronico, Contactos_Referencia, Estado"
                + " from Employee where Estado = ?";

        try {
            preparedStatement = databaseConfig.getConnection().prepareStatement(sql);

            preparedStatement.setBoolean(1, status);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee person = mapEmployee(rs);

                people.add(person);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar Employee " + e.getMessage());
        } finally {
            databaseConfig.closeConnection();
        }
        return people;
    }

    private Employee mapEmployee(ResultSet rs) throws SQLException {
        return Employee.builder()
                .id(rs.getString("Correo_Electronico"))
                .name(rs.getString("Ruc_Employee"))
                .sex(rs.getString("Nombre_Employee"))
                .position(rs.getString("Direccion"))
                .salary(rs.getInt("Telefono"))
                .status(rs.getBoolean("Estado"))
                .build();
    }
}