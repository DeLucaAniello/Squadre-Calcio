/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.squadre;

/**
 *
 * @author Alunno06
 */
public class Giocatore {
  private String nome;
    private int cognome;
    private int ruolo;
     private float goalSegnati;
     
     public Giocatore() {}
public giocatore(string nome, int cognome,int ruolo,float golSegnati){
this.nome = nome;
this.cognome = cognome;
this.ruolo = ruolo;
this.golSegnati = golSegnati;
}
public Giocatore(Giocatore G)
{
  this.nome = G.getNome();
  this.cognome = G.getcognome();
  this.ruolo = G.getruolo;
  this.golSegnati = G. getgolSegnati;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCognome () {
         return cognome;
    }
    
    public void setCognome(String nome) {
        this.cognome = cognome;
    }
    
    public String getruolo() {
        return ruolo;
    }
    public void setruolo(String ruolo){
       this.ruolo = ruolo;    
    }

    public String getgoalSegnati() {
        return  goalSegnati;
    }
    public void setgoalSegnati(){
    
           this.goalSegnati = goalsegnati;   
    }
