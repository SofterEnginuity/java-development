package com.pluralsight;

public class NameFormatter {


    private NameFormatter(String prefix, String firstName, String middleName, String lastName, String suffix) {

    }

    //here we are using the format method (#2) to pull just the first and last name
    public static String format(String firstName, String lastName) {
        return format("", firstName, "", lastName, "");
    }


    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder sb = new StringBuilder();
//lastName, (mandatory) to start our name formatting
        sb.append(lastName).append(", ");
//if the prefix is empty, only append a space
        if (!prefix.isEmpty()) {
            sb.append(prefix).append(" ");
        }
        sb.append(firstName).append(" ");
        if (!middleName.isEmpty()) {
            sb.append(" ").append(middleName);
        }
        if (!suffix.isEmpty()) {
            sb.append(", ").append(suffix);
        }
//return the contents of name as a string
        return sb.toString();
    }


    public static String format(String fullName) {
//splits based on the , making everything before comma the first part and everything after the suffix
        String[] parts = fullName.split(", ");
        //part - or the main part is the lastName, firstName
        String mainPart = parts[0];
        //if there is more than one part, the suffix is part 1, if not, set suffix to nothing
        String suffix = parts.length > 1 ? parts[1] : "";
    }

}