package defpackage;

/* renamed from: ardx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardx {
    public static final double a = (-Math.log10(1.0E-11d));
    private final ardw[] b = new ardw[ardv.b.length];

    public ardx(ardo ardo) {
        ardw ardw = new ardw(ardo.c, 0);
        ardw[] ardwArr = this.b;
        ardwArr[0] = ardw;
        ardwArr[1] = ardw;
        ardw ardw2 = new ardw(ardo.d, 2);
        ardw[] ardwArr2 = this.b;
        ardwArr2[2] = ardw2;
        ardwArr2[3] = ardw2;
        this.b[5] = new ardw(ardo.e, 5);
    }

    public final ardw a(int i) {
        return this.b[i];
    }
}
