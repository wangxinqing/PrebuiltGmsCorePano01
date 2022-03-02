package defpackage;

/* renamed from: tpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tpu implements Runnable {
    private final tpv a;
    private final usd b;

    public tpu(tpv tpv, usd usd) {
        this.a = tpv;
        this.b = usd;
    }

    public final void run() {
        tpv tpv = this.a;
        usd usd = this.b;
        tmu tmu = (tmu) tpv.d.remove(usd);
        jjg jjg = tky.a;
        if (tmu != null) {
            tpv.f.c(tpv.a, (tms) tmu);
        }
        tmq tmq = (tmq) tpv.e.remove(usd);
        if (tmq != null) {
            tpv.f.c(tpv.a, (tms) tmq);
        }
    }
}
