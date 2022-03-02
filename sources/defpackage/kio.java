package defpackage;

/* renamed from: kio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kio extends Exception {
    public final int a;
    public final boolean b;

    public kio(int i) {
        this.a = i;
        this.b = true;
    }

    public kio(Exception exc, boolean z) {
        super(exc);
        this.a = -1;
        this.b = z;
    }

    public kio(String str, boolean z) {
        super(str);
        this.a = -1;
        this.b = z;
    }
}
