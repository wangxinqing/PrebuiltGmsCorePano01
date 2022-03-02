package defpackage;

/* renamed from: yiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yiy {
    public final apfp a;
    public final int b;
    public final boolean c;
    public final int d;

    private yiy(apfp apfp, int i, boolean z, int i2) {
        this.a = apfp;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public static yiy a() {
        return new yiy((apfp) null, 0, false, 401);
    }

    public static yiy a(int i) {
        return new yiy((apfp) null, 0, true, i);
    }

    public static yiy a(apfp apfp, int i, int i2) {
        return new yiy(apfp, i, true, i2);
    }
}
