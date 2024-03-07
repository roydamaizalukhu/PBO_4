public class BangunDatar {
    private double sisi1;
    private double sisi2;

    public BangunDatar(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public double hitungLuas() {
        return sisi1 * sisi2;
    }
}

public class Segitiga extends BangunDatar {
    private double sisi3;

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        super(sisi1, sisi2);
        this.sisi3 = sisi3;
    }

    public double hitungLuas() {
        double sisi1 = getSisi1();
        double sisi2 = getSisi2();
        double sisi3 = this.sisi3;
        return 0.5 * (sisi1 * sisi2 + sisi1 * sisi3 + sisi2 * sisi3);
    }
}

public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double sisi1, double sisi2) {
        super(sisi1, sisi2, sisi1);
    }
}

public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double sisi1, double sisi2) {
        super(sisi1, sisi2, sisi1);
    }
}

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double sisi) {
        super(sisi, sisi, sisi);
    }
}

public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(double sisi1, double sisi2, double sisi3) {
        super(sisi1, sisi2, sisi3);
    }
}

public class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        super(sisi, sisi);
    }
}

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        super(jariJari, jariJari);
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}