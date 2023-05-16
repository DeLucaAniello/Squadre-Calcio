public class Giocatore {
  private String nome;
    private String cognome;
    private String ruolo;
     private int goalSegnati;
     
     public Giocatore() {}
public Giocatore(String nome, String cognome,String ruolo,int goalSegnati){
this.nome=nome;
this.cognome=cognome;
this.ruolo=ruolo;
this.goalSegnati=goalSegnati;
}
public Giocatore(Giocatore G)
{
  this.nome=G.getNome();
  this.cognome=G.getCognome();
  this.ruolo=G.getRuolo();
  this.goalSegnati=G.getGoalSegnati();
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
   
    public String getCognome () {
         return cognome;
    }
   
    public void setCognome(String Cognome) {
        this.cognome=cognome;
    }
   
    public String getRuolo() {
        return ruolo;
    }
    public void setRuolo(String ruolo){
       this.ruolo=ruolo;    
    }

    public int getGoalSegnati() {
        return  goalSegnati;
    }
    public void setGoalSegnati(){
   
           this.goalSegnati=goalSegnati;  
    }
}