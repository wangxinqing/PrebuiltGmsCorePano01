package defpackage;

/* renamed from: avyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyi {
    public transient double a = Double.MIN_VALUE;
    public transient double b = Double.MIN_VALUE;
    private long c;
    private double d = 0.0d;
    private double e = 0.0d;
    private long f = 0;
    private transient double g = Double.MIN_VALUE;
    private transient double h = Double.MIN_VALUE;

    public avyi() {
        long currentTimeMillis = System.currentTimeMillis();
        this.c = currentTimeMillis;
    }

    public static final double a(double d2) {
        return a(d2, 6.283185307179586d);
    }

    private static final double b(double d2) {
        return a(d2 + 3.141592653589793d, 6.283185307179586d) - 1.4292036732051034d;
    }

    public final double a() {
        double d2 = this.g;
        if (d2 != Double.MIN_VALUE) {
            return d2;
        }
        double d3 = (double) (this.c + 210866760000000L);
        Double.isNaN(d3);
        double d4 = d3 / 8.64E7d;
        this.g = d4;
        return d4;
    }

    public final void a(long j) {
        this.c = j;
        this.g = Double.MIN_VALUE;
        this.a = Double.MIN_VALUE;
        this.b = Double.MIN_VALUE;
        this.h = Double.MIN_VALUE;
    }

    private static final double a(double d2, double d3) {
        return d2 - (d3 * Math.floor(d2 / d3));
    }

    public avyi(double d2, double d3) {
        long currentTimeMillis = System.currentTimeMillis();
        this.c = currentTimeMillis;
        this.d = b(d2 * 0.017453292519943295d);
        this.e = b(d3 * 0.017453292519943295d);
        this.f = (long) (((this.d * 24.0d) * 3600000.0d) / 6.283185307179586d);
    }

    public final long a(boolean z) {
        avyh avyh;
        long j = this.c;
        long j2 = this.f;
        a(((((j + j2) / 86400000) * 86400000) - j2) + 43200000 + ((!z ? 6 : -6) * 3600000));
        avyg avyg = new avyg(this);
        double tan = Math.tan(this.e);
        int i = 0;
        while (true) {
            avyi avyi = avyg.a;
            double d2 = avyi.a;
            if (d2 == Double.MIN_VALUE) {
                double a2 = a((a((avyi.a() - 1.747850774336257E-6d) * 0.017202791632524146d) + 4.87650757829735d) - 0.8830950019289039d);
                double[] dArr = new double[2];
                double d3 = a2;
                while (true) {
                    double sin = (d3 - (Math.sin(d3) * 0.016713d)) - a2;
                    d3 -= sin / (1.0d - (Math.cos(d3) * 0.016713d));
                    if (Math.abs(sin) <= 1.0E-5d) {
                        break;
                    }
                }
                double atan = Math.atan(Math.tan(d3 / 2.0d) * Math.sqrt(1.033994144130859d));
                dArr[0] = a(atan + atan + 4.935239984568769d);
                dArr[1] = a2;
                double d4 = dArr[0];
                avyi.a = d4;
                d2 = d4;
            }
            double d5 = avyi.b;
            if (d5 == Double.MIN_VALUE) {
                double a3 = (avyi.a() - 1.7461893548897933E-6d) / 36525.0d;
                d5 = 0.017453292519943295d * (((23.439292d - (0.013004166666666666d * a3)) - ((1.6666666666666665E-7d * a3) * a3)) + (5.027777777777778E-7d * a3 * a3 * a3));
                avyi.b = d5;
            }
            double sin2 = Math.sin(d5);
            double cos = Math.cos(d5);
            double sin3 = Math.sin(d2);
            avyh = new avyh(Math.atan2((sin3 * cos) - (Math.tan(0.0d) * sin2), Math.cos(d2)), Math.asin((Math.sin(0.0d) * cos) + (Math.cos(0.0d) * sin2 * sin3)));
            double acos = Math.acos((-tan) * Math.tan(avyh.b));
            if (z) {
                acos = 6.283185307179586d - acos;
            }
            double d6 = ((acos + avyh.a) * 24.0d) / 6.283185307179586d;
            double d7 = this.h;
            if (d7 == Double.MIN_VALUE) {
                double floor = ((Math.floor(a() - 8.0d) + 0.5d) - 1.7461893548897933E-6d) / 36525.0d;
                d7 = a((2400.051336d * floor) + 6.697374558d + (2.5862E-5d * floor * floor), 24.0d);
                this.h = d7;
            }
            double a4 = a((d6 - d7) * 0.9972695663d, 24.0d);
            long j3 = this.c;
            long j4 = this.f;
            long j5 = ((long) (a4 * 3600000.0d)) + ((((j3 + j4) / 86400000) * 86400000) - j4);
            long j6 = j5 - j3;
            a(j5);
            i++;
            if (i >= 5 || Math.abs(j6) <= 5000) {
                double cos2 = Math.cos(avyh.b);
                long asin = (long) ((((Math.asin(Math.sin(0.014541501551199421d) / Math.sin(Math.acos(Math.sin(this.e) / cos2))) * 240.0d) * 57.29577951308232d) / cos2) * 1000.0d);
                long j7 = this.c;
            }
        }
        double cos22 = Math.cos(avyh.b);
        long asin2 = (long) ((((Math.asin(Math.sin(0.014541501551199421d) / Math.sin(Math.acos(Math.sin(this.e) / cos22))) * 240.0d) * 57.29577951308232d) / cos22) * 1000.0d);
        long j72 = this.c;
        if (z) {
            asin2 = -asin2;
        }
        a(j);
        return j72 + asin2;
    }
}
