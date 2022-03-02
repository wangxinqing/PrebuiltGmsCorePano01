package defpackage;

/* renamed from: tlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tlo implements Runnable {
    private final tnm a;

    public tlo(tnm tnm) {
        this.a = tnm;
    }

    public final void run() {
        tnm tnm = this.a;
        ((anih) tky.a.b()).a("In BandwidthUpgradeManager, failed to read the ClientIntroductionFrame after %d ms. Timing out and closing EndpointChannel %s.", aymi.s(), (Object) tnm.a());
        tnm.g();
    }
}
