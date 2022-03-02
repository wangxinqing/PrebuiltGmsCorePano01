package defpackage;

/* renamed from: tni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tni implements Runnable {
    private final tlh a;
    private final String b;
    private final tnm c;

    public tni(tlh tlh, String str, tnm tnm) {
        this.a = tlh;
        this.b = str;
        this.c = tnm;
    }

    public final void run() {
        tlh tlh = this.a;
        String str = this.b;
        tnm tnm = this.c;
        ausy ausy = tnl.a;
        ((anih) tky.a.d()).a("Timing out encryption for client %s to endpoint %s after %d ms", (Object) Long.valueOf(tlh.b()), (Object) str, (Object) Long.valueOf(aymi.z()));
        tnm.g();
    }
}
