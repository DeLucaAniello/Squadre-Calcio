public class Squadre{
private  Squadra  lista[];
private int i=0;
public Squadre(){
lista=new Squadra[10];
}

public void setLista(Squadra lista[]){
    this.lista=lista;
}
public Squadra[] getLista(){
    
    return lista;
}
public Squadra getSquadra(int i){
    return lista[i];
}
public void setSquadra(Squadra squadra, int i){
    this.lista[i]=squadra;
}

}