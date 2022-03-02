package defpackage;

/* renamed from: dps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class dps implements Runnable {
    private final dpv a;
    private final int b;
    private final dpk c;

    public dps(dpv dpv, int i, dpk dpk) {
        this.a = dpv;
        this.b = i;
        this.c = dpk;
    }

    public final void run() {
        dpv dpv = this.a;
        int i = this.b;
        dpk dpk = this.c;
        if (((dpu) dpv.b).a(i)) {
            dpk.b("Local AnalyticsService processed last dispatch request");
        }
    }
}
