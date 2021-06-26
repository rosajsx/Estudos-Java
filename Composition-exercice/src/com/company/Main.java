package com.company;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String departmentName, workerName, workerLevel, monthAndYear;
        double workerBaseSalary;
        int contractsQtd, month, year;

        System.out.print("Entre com o nome do departamento:");
        departmentName = scanner.nextLine();
        System.out.println("Entre com dados do trabalhador:");
        System.out.print("Name:");
        workerName = scanner.nextLine();
        System.out.print("Level:");
        workerLevel = scanner.nextLine();
        System.out.print("Salário Base:");
        workerBaseSalary = scanner.nextDouble();


        Department department = new Department(departmentName);
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, department);


        System.out.print("Quantos contratos desse trabalhador?");
        contractsQtd = scanner.nextInt();

        for(int i = 0; i < contractsQtd; i++){

            Date contractDate;
            double valuePerHour;
            int contractHours;

            System.out.println("Entre com o contrato #" + i + ":");
            System.out.print("Data (DD/MM/YYYY)");
            contractDate = dateFormat.parse(scanner.next());
            System.out.print("Valor por hora:");
            valuePerHour = scanner.nextDouble();
            System.out.print("Duração (Horas)");
            contractHours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour,contractHours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Entre com mês e ano para para calcular o valor (MM/YYYY)");
        monthAndYear = scanner.next();
        month = Integer.parseInt(monthAndYear.substring(0, 2));
        year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome:" + worker.getName());
        System.out.println("Departamento" + worker.getDepartment().getName());
        System.out.println("Ganhou em " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        scanner.close();
    }
}
