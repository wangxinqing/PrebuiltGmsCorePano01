package defpackage;

/* renamed from: aqcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqcd implements Runnable {
    private final aqch a;
    private final baaf b;

    public aqcd(aqch aqch, baaf baaf) {
        this.a = aqch;
        this.b = baaf;
    }

    public final void run() {
        aqch aqch = this.a;
        aqch.a.a(this.b);
    }
}
