package defpackage;

/* renamed from: uno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uno implements Runnable {
    private final unp a;
    private final urq b;

    public uno(unp unp, urq urq) {
        this.a = unp;
        this.b = urq;
    }

    public final void run() {
        unp unp = this.a;
        unp.f.a(this.b);
    }
}
