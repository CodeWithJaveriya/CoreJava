package com.xworkz.conversions.databaseToExcel;

import com.xworkz.conversions.databaseToExcel.ExcelExporter;
import com.xworkz.conversions.databaseToExcel.MySQLConnection;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tester {

    public static void main(String[] args) {

        try {
            ResultSet resultSet = MySQLConnection.getDataFromDatabase();
            ExcelExporter.exportToExcel(resultSet, "C:\\Users\\Javeriya Taj\\OneDrive\\Desktop\\UniversityData.xlsx");
            System.out.println("Data exported to Excel successfully.");
        }catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
