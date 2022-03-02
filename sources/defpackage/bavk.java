package defpackage;

/* renamed from: bavk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavk implements Runnable {
    final /* synthetic */ bawc a;

    public bavk(bawc bawc) {
        this.a = bawc;
    }

    public final void run() {
        bawc bawc = this.a;
        bawc.m = bawc.p;
        bawc.p = null;
        bawc.c();
    }
}
