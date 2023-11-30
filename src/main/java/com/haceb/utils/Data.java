package com.haceb.utils;

import com.haceb.utils.Excel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;



public class Data {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataHaceb.xlsx","Credenciales");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public static ArrayList<Map<String, String>> extracion(){
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataHaceb.xlsx","Adicionales");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

}
