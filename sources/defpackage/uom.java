package defpackage;

/* renamed from: uom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uom implements Runnable {
    private final uon a;
    private final urq b;

    public uom(uon uon, urq urq) {
        this.a = uon;
        this.b = urq;
    }

    public final void run() {
        uon uon = this.a;
        uon.g.a(this.b);
    }
}
