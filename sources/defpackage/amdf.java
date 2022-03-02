package defpackage;

/* renamed from: amdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdf {
    public final int a;
    public final int b;
    public final double c;
    public final int d;

    public amdf(int i, int i2, double d2, int i3) {
        boolean z = true;
        amrl.a(i > 0);
        amrl.a(i2 >= i);
        amrl.a(d2 > 0.0d);
        amrl.a(i3 <= 0 ? false : z);
        this.a = i;
        this.b = i2;
        this.c = d2;
        this.d = i3;
    }
}
