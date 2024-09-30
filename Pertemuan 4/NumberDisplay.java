public class NumberDisplay{
    private int batas;
    private int nilai;

    public NumberDisplay(int batasKembali){
        batas = batasKembali;
        nilai = 0;
    }

    public int getNilai(){
        return nilai;
    }

    public String getNilaiTampilan(){
        if(nilai < 10){
            return "0" + nilai;
        } else {
            return "" + nilai;
        }
    }

    public void setNilai(int nilaiBaru){
        if((nilaiBaru >= 0) && (nilaiBaru < batas)){
            nilai = nilaiBaru;
        }
    }

    public void increment(){
        nilai = (nilai + 1) % batas;
    }
}