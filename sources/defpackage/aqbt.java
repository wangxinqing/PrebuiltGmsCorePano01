package defpackage;

/* renamed from: aqbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbt implements Runnable {
    private final aqbv a;
    private final babj b;
    private final baaf c;

    public aqbt(aqbv aqbv, babj babj, baaf baaf) {
        this.a = aqbv;
        this.b = babj;
        this.c = baaf;
    }

    public final void run() {
        aqbv aqbv = this.a;
        babj babj = this.b;
        baaf baaf = this.c;
        aqbv.h = babj;
        aqbv.i = baaf;
        aqbv.f = true;
        aqbv.c();
    }
}
