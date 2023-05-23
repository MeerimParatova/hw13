public class Class {
    private int nomer; //бутун сан
    private String soz;
    private double[] masiv;
    public Class(){
    }
    public Class (int nomer, String soz, double[] masiv){
        this.nomer=nomer;
        this.soz=soz;
        this.masiv=masiv;
    }
    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }
    public double[] getMasiv() {
        return masiv;
    }
    public void setMasiv(double[] masiv) {
        this.masiv = masiv;
    }
}
