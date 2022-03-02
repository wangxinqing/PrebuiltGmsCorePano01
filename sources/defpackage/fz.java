package defpackage;

/* renamed from: fz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fz implements Runnable {
    final /* synthetic */ gc a;

    public fz(gc gcVar) {
        this.a = gcVar;
    }

    public final void run() {
        gc gcVar = this.a;
        gcVar.b.onDismiss(gcVar.h);
    }
}
