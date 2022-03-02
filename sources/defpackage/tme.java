package defpackage;

/* renamed from: tme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tme implements Runnable {
    private final tnm a;

    public tme(tnm tnm) {
        this.a = tnm;
    }

    public final void run() {
        tnm tnm = this.a;
        ((anih) tky.a.b()).a("In BasePCPHandler, failed to read the PairedKeyEncryption after %d ms. Timing out and closing EndpointChannel %s.", aymi.J(), (Object) tnm.a());
        tnm.g();
    }
}
