package defpackage;

/* renamed from: tmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmd implements Runnable {
    private final tnm a;

    public tmd(tnm tnm) {
        this.a = tnm;
    }

    public final void run() {
        tnm tnm = this.a;
        ((anih) tky.a.b()).a("In BasePCPHandler, failed to read the ConnectionRequestFrame after %d ms. Timing out and closing EndpointChannel %s.", aymi.t(), (Object) tnm.a());
        tnm.g();
    }
}
