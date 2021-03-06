package com.company;

public class Main {

    public void writeNameParts(String fullName) {
        String space = " ";
        int firstIndex = fullName.indexOf(space);
        String firstName = fullName.substring(0, firstIndex);

        int lastIndex = fullName.lastIndexOf(space);
        String lastName = fullName.substring(lastIndex);

        String middleName = null;

        if (firstIndex != lastIndex) {
            middleName = fullName.substring(firstIndex, lastIndex);
            System.out.print(firstName);
            System.out.print(middleName);
            System.out.println(lastName);
        } else {
            System.out.print(firstName);
            System.out.println(lastName);
        }
    }

    public void writeNameParts(String lastName, String firstName, String middleName) {
        System.out.println(firstName + lastName);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.writeNameParts("Frederik Hallengreen Hansen");
        obj.writeNameParts("Hansen", "Frederik ", null);
    }
}