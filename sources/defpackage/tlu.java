package defpackage;

/* renamed from: tlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tlu extends Exception {
    final asnt a;
    final int b;

    public tlu(asnt asnt, int i, String str) {
        super(str);
        this.a = asnt;
        this.b = i;
    }

    public tlu(asnt asnt, int i, String str, Throwable th) {
        super(str, th);
        this.a = asnt;
        this.b = i;
    }
}
