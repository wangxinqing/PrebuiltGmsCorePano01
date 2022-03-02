package defpackage;

/* renamed from: aqbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqbg implements Runnable {
    private final aqbq a;
    private final aqau b;

    public aqbg(aqbq aqbq, aqau aqau) {
        this.a = aqbq;
        this.b = aqau;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
