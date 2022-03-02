package defpackage;

import android.util.Log;

/* renamed from: qwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qwn implements acvs {
    private final qwq a;
    private final agz b;
    private final int c;
    private final int d;

    public qwn(qwq qwq, agz agz, int i, int i2) {
        this.a = qwq;
        this.b = agz;
        this.c = i;
        this.d = i2;
    }

    public final void a(Exception exc) {
        qwq qwq = this.a;
        agz agz = this.b;
        int i = this.c;
        int i2 = this.d;
        Log.e("GmsTaskScheduler", "API unavailable, fallback to SchedulerClientBroadcastStrategy", exc);
        agz.a((Object) new qxo(qwq.a, i, i2));
    }
}
