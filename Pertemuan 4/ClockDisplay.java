public class ClockDisplay {
    private NumberDisplay jam;
    private NumberDisplay menit;
    private String stringTampilan;   
    
    public ClockDisplay(){
        jam = new NumberDisplay(24);
        menit = new NumberDisplay(60);
        perbaruiTampilan();
    }

    public ClockDisplay(int jam, int menit){
        this.jam = new NumberDisplay(24);
        this.menit = new NumberDisplay(60);
        aturWaktu(jam, menit);
    }

    public void detikWaktu(){
        menit.increment();
        if(menit.getNilai() == 0){ 
            jam.increment();
        }
        perbaruiTampilan();
    }

    public void aturWaktu(int jam, int menit){
        this.jam.setNilai(jam);
        this.menit.setNilai(menit);
        perbaruiTampilan();
    }

    public String ambilWaktu(){
        return stringTampilan;
    }
    
    private void perbaruiTampilan(){
        stringTampilan = jam.getNilaiTampilan() + ":" + menit.getNilaiTampilan();
    }
}