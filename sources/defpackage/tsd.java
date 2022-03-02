package defpackage;

/* renamed from: tsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tsd extends arwm {
    final /* synthetic */ tsm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tsd(tsm tsm, String str) {
        super(str);
        this.a = tsm;
    }

    public final void run() {
        synchronized (this.a.e) {
            while (true) {
                tsl tsl = (tsl) this.a.f.poll();
                if (tsl == null) {
                    jjg jjg = tsp.a;
                } else {
                    int ordinal = tsl.ordinal();
                    if (ordinal == 0) {
                        this.a.a();
                    } else if (ordinal == 1) {
                        this.a.b();
                    }
                }
            }
        }
    }
}
