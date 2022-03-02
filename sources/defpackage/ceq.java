package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: ceq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ceq extends ccy implements Runnable {
    public static final ccj b = new ccj(new ceo(), "PowerConnectionProducer", new int[]{8}, (int[]) null);
    private final IntentFilter k = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private attx l;

    public ceq(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but, false);
        a(8);
    }

    private final void a(cep cep, long j) {
        aucd o = attx.d.o();
        attw attw = cep.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        attx attx = (attx) o.b;
        attx.b = attw.f;
        int i = attx.a | 1;
        attx.a = i;
        double d = cep.b;
        attx.a = i | 2;
        attx.c = d;
        attx attx2 = (attx) o.i();
        this.l = attx2;
        jti jti = new jti(7, 8, 1);
        jti.a(jut.b(j));
        jti.a(attx.e, attx2);
        d(jti.a());
    }

    private final cep j() {
        return new cep(this.d.registerReceiver((BroadcastReceiver) null, this.k));
    }

    /* access modifiers changed from: protected */
    public final synchronized void b() {
        a(cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        return intentFilter;
    }

    public final synchronized void run() {
        cep j = j();
        if (!g()) {
            ((anih) ((anih) bxk.a.c()).a("ceq", "run", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PowerConnectionProducer] No ongoing data (powerConnectionState=%s)", (Object) j);
            a(j, cbi.i().a());
            return;
        }
        long a = cbi.i().a();
        a(a);
        a(j, a + 1);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a() {
        a(j(), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.l = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r3.l.c == r4.b) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r4 = r5.getAction()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            monitor-exit(r3)
            return
        L_0x0020:
            cep r4 = r3.j()     // Catch:{ all -> 0x0050 }
            boolean r5 = r3.g()     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0044
            attx r5 = r3.l     // Catch:{ all -> 0x0050 }
            int r5 = r5.b     // Catch:{ all -> 0x0050 }
            attw r5 = defpackage.attw.a(r5)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x0036
            attw r5 = defpackage.attw.UNKNOWN     // Catch:{ all -> 0x0050 }
        L_0x0036:
            attw r0 = r4.a     // Catch:{ all -> 0x0050 }
            if (r5 != r0) goto L_0x0044
            attx r5 = r3.l     // Catch:{ all -> 0x0050 }
            double r0 = r5.c     // Catch:{ all -> 0x0050 }
            double r4 = r4.b     // Catch:{ all -> 0x0050 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
        L_0x0044:
            but r4 = r3.a     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "ReceivedBroadcast_PowerConnection"
            bvp r5 = defpackage.bvq.a(r5)     // Catch:{ all -> 0x0050 }
            r4.a(r3, r5)     // Catch:{ all -> 0x0050 }
            goto L_0x001e
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0054
        L_0x0053:
            throw r4
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceq.a(android.content.Context, android.content.Intent):void");
    }
}
