class Prostokat
{
    double dlugosc;
    double szerokosc;
    Punkt wierzcholek;

    Prostokat(double dlugosc,double szerokosc)
    {
        this.dlugosc=dlugosc;
        this.szerokosc=szerokosc;
        this.wierzcholek=new Punkt(0,0);
    }

    Prostokat(double dlugosc,double szerokosc, Punkt wierzcholek)
    {
        this.dlugosc=dlugosc;
        this.szerokosc=szerokosc;
        this.wierzcholek=wierzcholek;
    }

    void przesun(double u,double v){

        this.wierzcholek.przesun(u,v);
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                ", wierzcholek=" + wierzcholek+
                '}';
    }

    double pole()
    {
        return dlugosc*szerokosc;
    }
    double obwod(){
        return 2*dlugosc+2*szerokosc;
    }
    boolean zawiera(Punkt punkt){
        Punkt B = new Punkt(this.wierzcholek.x+this.szerokosc,this.wierzcholek.y);
        Punkt C = new Punkt(this.wierzcholek.x,this.wierzcholek.y+this.dlugosc);
        Punkt D = new Punkt(this.wierzcholek.x+this.szerokosc,this.wierzcholek.y+this.dlugosc);
        if(punkt.x==wierzcholek.x)
            if(punkt.y >= wierzcholek.y && punkt.y <= B.y)
                return true;
        else
            return false;
        else
            return false;
    }
}