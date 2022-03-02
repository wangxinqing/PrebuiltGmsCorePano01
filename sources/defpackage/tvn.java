package defpackage;

/* renamed from: tvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tvn extends arwm {
    final /* synthetic */ nla a;
    final /* synthetic */ tvo b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tvn(tvo tvo, String str, nla nla) {
        super(str);
        this.b = tvo;
        this.a = nla;
    }

    public final void run() {
        try {
            this.b.d.unregisterReceiver(this.a);
        } catch (IllegalArgumentException e) {
            jjg jjg = tsp.a;
        }
    }
}
