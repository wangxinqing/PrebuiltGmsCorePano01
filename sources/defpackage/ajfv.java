package defpackage;

/* renamed from: ajfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajfv implements Runnable {
    private final ajfw a;

    public ajfv(ajfw ajfw) {
        this.a = ajfw;
    }

    public final void run() {
        ajfw ajfw = this.a;
        ajge ajge = ajfw.d;
        ajfw.d = ajfw.a.a(ajfw.c, ayab.l());
        if (ajge == null || ajfw.d.b != ajge.b) {
            ajfw.g.a();
        }
    }
}
