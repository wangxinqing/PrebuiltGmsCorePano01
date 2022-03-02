package defpackage;

/* renamed from: acvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvq implements Runnable {
    final /* synthetic */ acwa a;
    final /* synthetic */ acvr b;

    public acvq(acvr acvr, acwa acwa) {
        this.b = acvr;
        this.a = acwa;
    }

    public final void run() {
        synchronized (this.b.a) {
            acvs acvs = this.b.b;
            if (acvs != null) {
                acvs.a(this.a.e());
            }
        }
    }
}
