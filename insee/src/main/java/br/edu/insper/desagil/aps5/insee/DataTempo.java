package br.edu.insper.desagil.aps5.insee;

public class DataTempo  extends Referencia{
    private Data data;
    private Tempo tempo;

    public DataTempo(Data data, Tempo tempo){
        this.data = data;
        this.tempo = tempo;
    }

    public Data getData() {
        return data;
    }

    public Tempo getTempo() {
        return tempo;
    }

    @Override
    public int comoInteiro(){
        int total_data = data.comoInteiro()*24*60;
        int total_tempo = tempo.comoInteiro();
        return total_data + total_tempo;
    }
}
