package defpackage;

/* renamed from: ajuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajuv implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ajvf b;

    public ajuv(ajvf ajvf, int i) {
        this.b = ajvf;
        this.a = i;
    }

    public final void run() {
        this.b.f.smoothScrollToPosition(this.a);
    }
}
