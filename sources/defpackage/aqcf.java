package defpackage;

/* renamed from: aqcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqcf implements Runnable {
    private final aqch a;
    private final babj b;
    private final baaf c;

    public aqcf(aqch aqch, babj babj, baaf baaf) {
        this.a = aqch;
        this.b = babj;
        this.c = baaf;
    }

    public final void run() {
        aqch aqch = this.a;
        aqch.a.a(this.b, this.c);
    }
}
