class Okrag{
    double promien;
    Punkt srodek;

    public Okrag(double promien, Punkt srodek) {
        this.promien = promien;
        this.srodek = srodek;
    }

    double obwod(){
        return 2*Math.PI*promien;
    }
    double pole(){
        return Math.PI*Math.pow(promien,2);
    }

    @Override
    public String toString() {
        return "Okrag{" +
                "promien=" + promien +
                ", srodek=" + srodek +
                '}';
    }
    boolean zawiera(Punkt punkt){
        return Math.pow(punkt.x - srodek.x,2) + Math.pow(punkt.y - srodek.y,2) == Math.pow(promien,2);
    }
}