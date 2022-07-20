/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.relari.util;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author cld_r
 */
public class MyRender extends DefaultTableCellRenderer {

    /**
     * getTableCellRendererComponent.
     * @param table {@link JTable}
     * @param value {@link Object}
     * @param isSelected {@link Boolean}
     * @param hasFocus {@link Boolean}
     * @param row {@link Integer}
     * @param column {@link Integer}
     * @return {@link Component}
     */
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        switch(column) {
            /**case 2:
                int age = Integer.parseInt(value.toString());
                if (age < 18) {
                    this.setBackground(Color.RED);
                    this.setForeground(Color.WHITE);
                }
                break;*/
            case 3:
                switch(value.toString()) {
                    case "true":
                        this.setBackground(Color.BLUE);
                        this.setForeground(Color.WHITE);
                        break;
                    case "false":
                        this.setBackground(Color.RED);
                        this.setForeground(Color.WHITE);
                        break;
                    default:
                        break;
                }
                break;
            default:
                this.setBackground(Color.WHITE);
                this.setForeground(Color.BLACK);
                break;
        }

        return this;
    }
}
