package com.FirstProject;

import java.lang.StringBuilder;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Scanner inputUser = new Scanner(System.in);
//        inputUser = StringBuilder

        StringBuilder builderBro = new StringBuilder("Halo halo Bandung");
        System.out.println(builderBro);

        builderBro.append(" Ibukota periangan");
        printData(builderBro);

        builderBro.append(" sudah lama beta");
        printData(builderBro);

        builderBro.insert(26, "Jawa Barat ");
        printData(builderBro);

        builderBro.delete(25,36);
        printData(builderBro);

        builderBro.setCharAt(26, 'P');
        printData(builderBro);

        builderBro.replace(5,9,"hai");
        printData(builderBro);

        String kalimat = builderBro.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("alamat string kalimat : " + Integer.toHexString(addressString));
    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("tersimpan di alamat memori : " + Integer.toHexString(addressBuilder));

    }
}
