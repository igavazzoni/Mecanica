/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplobigdecimal;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Controller {
    
    public static ArrayList<Ordem> OrdemList;
    public static ArrayList<Pecas> PecasList;
    public static ArrayList<Servicos> ServicoList;
    public static ArrayList<Diagnostico> DiagnosticoList;

    public static ArrayList<Ordem> getOrdemList() {
        return OrdemList;
    }

    public static void setOrdemList(ArrayList<Ordem> OrdemList) {
        Controller.OrdemList = OrdemList;
    }

    public static ArrayList<Pecas> getPecasList() {
        return PecasList;
    }

    public static void setPecasList(ArrayList<Pecas> PecasList) {
        Controller.PecasList = PecasList;
    }

    public static ArrayList<Servicos> getServicoList() {
        return ServicoList;
    }

    public static void setServicoList(ArrayList<Servicos> ServicoList) {
        Controller.ServicoList = ServicoList;
    }

    public static ArrayList<Diagnostico> getDiagnosticoList() {
        return DiagnosticoList;
    }

    public static void setDiagnosticoList(ArrayList<Diagnostico> DiagnosticoList) {
        Controller.DiagnosticoList = DiagnosticoList;
    }
    
    
    
    
   
    
            
}
