package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvs {
    public final tvr a;
    public final Map b = new ConcurrentHashMap();
    private final Context c;

    public tvs(Context context) {
        tvr tvr = new tvr(context);
        this.c = context;
        this.a = tvr;
    }

    public final boolean a(String str, tzi tzi) {
        if (!aymw.a.a().bE()) {
            ((anih) tsp.a.d()).a("FastPair: Flag is not turned on for uploading first connection to FMA.");
            return false;
        }
        b(str, tzi);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r12, defpackage.tzi r13) {
        /*
            r11 = this;
            tvr r0 = r11.a
            android.content.Context r1 = r11.c
            int r2 = r12.hashCode()
            r3 = -301431627(0xffffffffee0884b5, float:-1.0562599E28)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x001f
            r3 = 1821585647(0x6c9330ef, float:1.4235454E27)
            if (r2 == r3) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r2 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r2 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0029
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            if (r2 == 0) goto L_0x0032
            if (r2 == r4) goto L_0x0030
            r2 = 2
            goto L_0x0033
        L_0x0030:
            r2 = 4
            goto L_0x0033
        L_0x0032:
            r2 = 3
        L_0x0033:
            auay r3 = r13.c
            java.lang.String r6 = r13.b
            com.google.android.gms.common.internal.ClientContext r7 = new com.google.android.gms.common.internal.ClientContext
            r7.<init>()
            int r8 = android.os.Process.myUid()
            r7.b = r8
            android.content.Context r8 = r0.a
            java.lang.String r8 = r8.getPackageName()
            r7.e = r8
            android.content.Context r8 = r0.a
            java.lang.String r8 = r8.getPackageName()
            r7.f = r8
            int r6 = defpackage.arww.a((java.lang.String) r6)
            avuu r8 = defpackage.avuu.g
            aucd r8 = r8.o()
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r8.c()
            r8.c = r5
        L_0x0066:
            aucj r9 = r8.b
            avuu r9 = (defpackage.avuu) r9
            r3.getClass()
            aucx r10 = r9.a
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x007d
            aucx r10 = r9.a
            aucx r10 = defpackage.aucj.a((defpackage.aucx) r10)
            r9.a = r10
        L_0x007d:
            aucx r9 = r9.a
            r9.add(r3)
            android.content.Context r3 = r0.a
            java.lang.String r9 = "android_id"
            long r9 = defpackage.iqi.b(r3, r9)
            boolean r3 = r8.c
            if (r3 != 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            r8.c()
            r8.c = r5
        L_0x0094:
            aucj r3 = r8.b
            avuu r3 = (defpackage.avuu) r3
            r3.b = r9
            r3.e = r4
            aucj r3 = r8.b
            avuu r3 = (defpackage.avuu) r3
            int r2 = r2 + -2
            r3.c = r2
            android.content.Context r2 = r0.a
            java.lang.Class<jiq> r3 = defpackage.jiq.class
            java.lang.Object r2 = defpackage.thl.a((android.content.Context) r2, (java.lang.Class) r3)
            jiq r2 = (defpackage.jiq) r2
            long r2 = r2.a()
            boolean r4 = r8.c
            if (r4 != 0) goto L_0x00b7
            goto L_0x00bc
        L_0x00b7:
            r8.c()
            r8.c = r5
        L_0x00bc:
            aucj r4 = r8.b
            avuu r4 = (defpackage.avuu) r4
            r4.d = r2
            avut r2 = defpackage.avut.b
            aucd r2 = r2.o()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x00cd
            goto L_0x00d2
        L_0x00cd:
            r2.c()
            r2.c = r5
        L_0x00d2:
            aucj r3 = r2.b
            avut r3 = (defpackage.avut) r3
            r3.a = r6
            boolean r3 = r8.c
            if (r3 != 0) goto L_0x00dd
            goto L_0x00e2
        L_0x00dd:
            r8.c()
            r8.c = r5
        L_0x00e2:
            aucj r3 = r8.b
            avuu r3 = (defpackage.avuu) r3
            aucj r2 = r2.i()
            avut r2 = (defpackage.avut) r2
            r2.getClass()
            r3.f = r2
            aucj r2 = r8.i()
            avuu r2 = (defpackage.avuu) r2
            tww r3 = r0.b
            boolean r4 = r0.a(r1)
            twv r3 = r3.a(r1, r7, r2, r4)
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.d()
            anih r4 = (defpackage.anih) r4
            avuv r5 = r3.a()
            boolean r6 = r3.b()
            java.lang.String r8 = "FastPair: Got a result from StoreAccessoryHelper: response=%s, isRetriable=%b"
            r4.a((java.lang.String) r8, (java.lang.Object) r5, (boolean) r6)
            avuv r4 = r3.a()
            avuv r5 = defpackage.avuv.SUCCESS
            if (r4 == r5) goto L_0x01f6
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x01f6
            jjg r4 = defpackage.tsp.a
            anie r4 = r4.d()
            anih r4 = (defpackage.anih) r4
            long r5 = r2.d
            java.lang.String r8 = "FastPair: Saving a request that failed at %d"
            r4.a((java.lang.String) r8, (long) r5)
            tub r0 = r0.c
            tuf r4 = new tuf
            r4.<init>()
            if (r1 == 0) goto L_0x01ee
            r4.a = r1
            if (r2 == 0) goto L_0x01e6
            r4.b = r2
            r4.c = r7
            aymt r1 = defpackage.aymt.a
            aymu r1 = r1.a()
            long r1 = r1.W()
            int r2 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4.d = r1
            android.content.Context r1 = r4.a
            if (r1 != 0) goto L_0x015c
            java.lang.String r1 = " context"
            goto L_0x015e
        L_0x015c:
            java.lang.String r1 = ""
        L_0x015e:
            avuu r2 = r4.b
            if (r2 != 0) goto L_0x0168
            java.lang.String r2 = " request"
            java.lang.String r1 = r1.concat(r2)
        L_0x0168:
            com.google.android.gms.common.internal.ClientContext r2 = r4.c
            if (r2 != 0) goto L_0x0176
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " clientContext"
            java.lang.String r1 = r1.concat(r2)
        L_0x0176:
            java.lang.Integer r2 = r4.d
            if (r2 != 0) goto L_0x0184
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " allowedAttempts"
            java.lang.String r1 = r1.concat(r2)
        L_0x0184:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x01a6
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Missing required properties:"
            int r1 = r13.length()
            if (r1 != 0) goto L_0x019e
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
            goto L_0x01a2
        L_0x019e:
            java.lang.String r13 = r0.concat(r13)
        L_0x01a2:
            r12.<init>(r13)
            throw r12
        L_0x01a6:
            ttw r1 = new ttw
            android.content.Context r2 = r4.a
            avuu r5 = r4.b
            com.google.android.gms.common.internal.ClientContext r6 = r4.c
            java.lang.Integer r4 = r4.d
            int r4 = r4.intValue()
            r1.<init>(r2, r5, r6, r4)
            boolean r2 = r1.e()
            if (r2 != 0) goto L_0x01c1
            defpackage.tub.a(r1)
            goto L_0x01f6
        L_0x01c1:
            java.util.Queue r2 = r0.a
            r2.add(r1)
            jjg r2 = defpackage.tsp.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            long r4 = r1.f()
            java.lang.String r1 = "FailedStoreAccessoryRequestsController: Saving a request which failed at %d"
            r2.a((java.lang.String) r1, (long) r4)
            java.util.concurrent.ScheduledFuture r1 = r0.b
            if (r1 != 0) goto L_0x01f6
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01f6
            java.util.concurrent.ScheduledFuture r1 = r0.a()
            r0.b = r1
            goto L_0x01f6
        L_0x01e6:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null request"
            r12.<init>(r13)
            throw r12
        L_0x01ee:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null context"
            r12.<init>(r13)
            throw r12
        L_0x01f6:
            avuv r0 = r3.a()
            jjg r1 = defpackage.tsp.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "FastPair: notify FMA, uploaded action (%s) and got response from FMA request: %s"
            r1.a((java.lang.String) r2, (java.lang.Object) r12, (java.lang.Object) r0)
            auay r12 = r13.c
            java.util.Map r13 = r11.b
            long r0 = android.os.SystemClock.elapsedRealtime()
            aymt r2 = defpackage.aymt.a
            aymu r2 = r2.a()
            long r2 = r2.V()
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.put(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvs.b(java.lang.String, tzi):void");
    }
}
