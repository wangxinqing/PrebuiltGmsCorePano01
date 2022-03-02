package defpackage;

/* renamed from: twz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class twz extends arwm {
    final /* synthetic */ txb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public twz(txb txb, String str) {
        super(str);
        this.a = txb;
    }

    public final void run() {
        synchronized (this.a) {
            if (this.a.d != null) {
                ((anih) tsp.a.d()).a("FastPairBattery: Dismiss battery notification after timeout");
                txb txb = this.a;
                txb.a(txb.b(txb.d));
            }
        }
    }
}
