package defpackage;

/* renamed from: cdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cdd implements Runnable {
    final /* synthetic */ cdg a;

    public cdd(cdg cdg) {
        this.a = cdg;
    }

    public final void run() {
        cdg cdg = this.a;
        cdg.r.requestTriggerSensor(cdg.l, cdg.s);
    }
}
