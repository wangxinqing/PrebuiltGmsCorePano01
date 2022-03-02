package defpackage;

/* renamed from: axf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axf {
    public final String a;
    public final String b;
    public final double c;
    public final int d;
    public final double e;
    public final double f;
    public final int g;
    public final int h;
    public final double i;
    public final boolean j;
    public final int k;

    public axf(String str, String str2, double d2, int i2, int i3, double d3, double d4, int i4, int i5, double d5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d2;
        this.k = i2;
        this.d = i3;
        this.e = d3;
        this.f = d4;
        this.g = i4;
        this.h = i5;
        this.i = d5;
        this.j = z;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        double d2 = this.c;
        int i2 = this.k;
        int i3 = i2 - 1;
        if (i2 != 0) {
            int i4 = this.d;
            long doubleToLongBits = Double.doubleToLongBits(this.e);
            double d3 = (double) (((hashCode * 31) + hashCode2) * 31);
            Double.isNaN(d3);
            return (((((((((int) (d3 + d2)) * 31) + i3) * 31) + i4) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits))) * 31) + this.g;
        }
        throw null;
    }
}
