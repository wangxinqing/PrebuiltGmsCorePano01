package defpackage;

/* renamed from: tty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tty extends arwm {
    final /* synthetic */ ttz a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tty(ttz ttz, String str) {
        super(str);
        this.a = ttz;
    }

    public final void run() {
        try {
            ttz ttz = this.a;
            if (ttz.a) {
                ttz.c.unregisterReceiver(ttz.b);
                this.a.a = false;
            }
        } catch (IllegalArgumentException e) {
            jjg jjg = tsp.a;
        }
    }
}
