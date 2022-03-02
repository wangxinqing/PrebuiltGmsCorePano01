package defpackage;

import android.content.Intent;

/* renamed from: nqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class nqz implements Runnable {
    private final nrj a;
    private final Intent b;
    private final int c;

    public nqz(nrj nrj, Intent intent, int i) {
        this.a = nrj;
        this.b = intent;
        this.c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0291, code lost:
        if (r3.a(r4, (defpackage.amnc) r9.i()) == false) goto L_0x0293;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            nrj r2 = r1.a
            android.content.Intent r3 = r1.b
            int r4 = r1.c
            java.lang.String r0 = "google.ttl"
            java.lang.String r0 = r3.getStringExtra(r0)
            java.lang.String r5 = "google.message_id"
            java.lang.String r5 = r3.getStringExtra(r5)
            java.lang.String r6 = "collapse_key"
            java.lang.String r6 = r3.getStringExtra(r6)
            r7 = 0
            java.lang.String r8 = defpackage.nyq.a((android.content.Intent) r3)     // Catch:{ all -> 0x03ba }
            if (r8 != 0) goto L_0x002c
            java.lang.String r0 = "GCM"
            java.lang.String r2 = "Failed to send message - missing package name"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x03ba }
        L_0x0028:
            com.google.android.gms.gcm.GcmSenderChimeraProxy.a()
            return
        L_0x002c:
            amnc r9 = defpackage.amnc.r     // Catch:{ all -> 0x03ba }
            aucd r9 = r9.o()     // Catch:{ all -> 0x03ba }
            amnb r9 = (defpackage.amnb) r9     // Catch:{ all -> 0x03ba }
            boolean r10 = r9.c     // Catch:{ all -> 0x03ba }
            if (r10 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x003e:
            aucj r10 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r10 = (defpackage.amnc) r10     // Catch:{ all -> 0x03ba }
            r8.getClass()     // Catch:{ all -> 0x03ba }
            int r11 = r10.a     // Catch:{ all -> 0x03ba }
            r11 = r11 | 16
            r10.a = r11     // Catch:{ all -> 0x03ba }
            r10.e = r8     // Catch:{ all -> 0x03ba }
            java.lang.String r10 = "google.from"
            java.lang.String r10 = r3.getStringExtra(r10)     // Catch:{ all -> 0x03ba }
            if (r10 != 0) goto L_0x005c
            java.lang.String r10 = "from"
            java.lang.String r10 = r3.getStringExtra(r10)     // Catch:{ all -> 0x03ba }
            goto L_0x0061
        L_0x005c:
            java.lang.String r11 = "google.from"
            r3.removeExtra(r11)     // Catch:{ all -> 0x03ba }
        L_0x0061:
            java.lang.String r10 = defpackage.jlh.a(r10)     // Catch:{ all -> 0x03ba }
            boolean r11 = r9.c     // Catch:{ all -> 0x03ba }
            if (r11 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x006f:
            aucj r11 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r11 = (defpackage.amnc) r11     // Catch:{ all -> 0x03ba }
            r10.getClass()     // Catch:{ all -> 0x03ba }
            int r12 = r11.a     // Catch:{ all -> 0x03ba }
            r12 = r12 | 4
            r11.a = r12     // Catch:{ all -> 0x03ba }
            r11.c = r10     // Catch:{ all -> 0x03ba }
            axlc r10 = defpackage.axlc.a     // Catch:{ all -> 0x03ba }
            axld r10 = r10.a()     // Catch:{ all -> 0x03ba }
            long r10 = r10.i()     // Catch:{ all -> 0x03ba }
            int r11 = (int) r10
            if (r0 == 0) goto L_0x009a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0090 }
            goto L_0x0092
        L_0x0090:
            r0 = move-exception
            r0 = 0
        L_0x0092:
            if (r0 >= 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            if (r0 <= r11) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r11 = r0
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            boolean r0 = r9.c     // Catch:{ all -> 0x03ba }
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x00a5:
            aucj r0 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            int r10 = r0.a     // Catch:{ all -> 0x03ba }
            r12 = 32768(0x8000, float:4.5918E-41)
            r10 = r10 | r12
            r0.a = r10     // Catch:{ all -> 0x03ba }
            r0.l = r11     // Catch:{ all -> 0x03ba }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03ba }
            boolean r0 = r9.c     // Catch:{ all -> 0x03ba }
            if (r0 != 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x00c1:
            aucj r0 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            int r10 = r0.a     // Catch:{ all -> 0x03ba }
            r14 = 65536(0x10000, float:9.18355E-41)
            r10 = r10 | r14
            r0.a = r10     // Catch:{ all -> 0x03ba }
            r0.m = r12     // Catch:{ all -> 0x03ba }
            if (r5 == 0) goto L_0x00d9
            r5.getClass()     // Catch:{ all -> 0x03ba }
            r10 = r10 | 2
            r0.a = r10     // Catch:{ all -> 0x03ba }
            r0.b = r5     // Catch:{ all -> 0x03ba }
        L_0x00d9:
            if (r6 == 0) goto L_0x00e9
            r6.getClass()     // Catch:{ all -> 0x03ba }
            r10 = r10 | 32
            r0.a = r10     // Catch:{ all -> 0x03ba }
            r0.f = r6     // Catch:{ all -> 0x03ba }
            java.lang.String r0 = "collapse_key"
            r3.removeExtra(r0)     // Catch:{ all -> 0x03ba }
        L_0x00e9:
            if (r4 != 0) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            long r12 = (long) r4     // Catch:{ all -> 0x03ba }
            boolean r0 = r9.c     // Catch:{ all -> 0x03ba }
            if (r0 != 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x00f7:
            aucj r0 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            int r6 = r0.a     // Catch:{ all -> 0x03ba }
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r0.a = r6     // Catch:{ all -> 0x03ba }
            r0.k = r12     // Catch:{ all -> 0x03ba }
        L_0x0103:
            java.lang.String r0 = "google.to"
            java.lang.String r6 = r3.getStringExtra(r0)     // Catch:{ all -> 0x03ba }
            if (r6 == 0) goto L_0x03ad
            java.lang.String r0 = "google.to"
            r3.removeExtra(r0)     // Catch:{ all -> 0x03ba }
            boolean r0 = r9.c     // Catch:{ all -> 0x03ba }
            if (r0 != 0) goto L_0x0115
            goto L_0x011a
        L_0x0115:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x011a:
            aucj r0 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            r6.getClass()     // Catch:{ all -> 0x03ba }
            int r10 = r0.a     // Catch:{ all -> 0x03ba }
            r10 = r10 | 8
            r0.a = r10     // Catch:{ all -> 0x03ba }
            r0.d = r6     // Catch:{ all -> 0x03ba }
            java.lang.String r0 = "https://gcm.googleapis.com/local/"
            boolean r0 = r6.startsWith(r0)     // Catch:{ all -> 0x03ba }
            r10 = 1
            if (r0 != 0) goto L_0x031c
            java.lang.String r0 = "registration_id"
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ all -> 0x03ba }
            java.lang.String r6 = "registration_id"
            r3.removeExtra(r6)     // Catch:{ all -> 0x03ba }
            if (r0 == 0) goto L_0x0158
            boolean r6 = r9.c     // Catch:{ all -> 0x03ba }
            if (r6 != 0) goto L_0x0144
            goto L_0x0149
        L_0x0144:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x0149:
            aucj r6 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r6 = (defpackage.amnc) r6     // Catch:{ all -> 0x03ba }
            r0.getClass()     // Catch:{ all -> 0x03ba }
            int r12 = r6.a     // Catch:{ all -> 0x03ba }
            r12 = r12 | 2048(0x800, float:2.87E-42)
            r6.a = r12     // Catch:{ all -> 0x03ba }
            r6.j = r0     // Catch:{ all -> 0x03ba }
        L_0x0158:
            android.os.Bundle r0 = r3.getExtras()     // Catch:{ all -> 0x03ba }
            if (r0 == 0) goto L_0x01e2
            java.util.Set r3 = r0.keySet()     // Catch:{ all -> 0x03ba }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x03ba }
            r6 = 0
        L_0x0167:
            boolean r12 = r3.hasNext()     // Catch:{ all -> 0x03ba }
            if (r12 == 0) goto L_0x01e3
            java.lang.Object r12 = r3.next()     // Catch:{ all -> 0x03ba }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x03ba }
            java.lang.String r13 = "google."
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x03ba }
            if (r13 != 0) goto L_0x0167
            java.lang.Object r13 = r0.get(r12)     // Catch:{ all -> 0x03ba }
            if (r13 == 0) goto L_0x0167
            boolean r14 = r13 instanceof java.lang.String     // Catch:{ all -> 0x03ba }
            if (r14 == 0) goto L_0x0195
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03ba }
            defpackage.nrj.a((defpackage.amnb) r9, (java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x03ba }
            int r12 = r12.length()     // Catch:{ all -> 0x03ba }
            int r13 = r13.length()     // Catch:{ all -> 0x03ba }
            int r12 = r12 + r13
            int r6 = r6 + r12
            goto L_0x0167
        L_0x0195:
            boolean r14 = r13 instanceof byte[]     // Catch:{ all -> 0x03ba }
            if (r14 != 0) goto L_0x019a
        L_0x0199:
            goto L_0x01c6
        L_0x019a:
            java.lang.String r14 = "rawData"
            boolean r14 = r12.equals(r14)     // Catch:{ all -> 0x03ba }
            if (r14 == 0) goto L_0x0199
            byte[] r13 = (byte[]) r13     // Catch:{ all -> 0x03ba }
            auay r12 = defpackage.auay.a((byte[]) r13)     // Catch:{ all -> 0x03ba }
            boolean r14 = r9.c     // Catch:{ all -> 0x03ba }
            if (r14 != 0) goto L_0x01ad
            goto L_0x01b2
        L_0x01ad:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x01b2:
            aucj r14 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r14 = (defpackage.amnc) r14     // Catch:{ all -> 0x03ba }
            r12.getClass()     // Catch:{ all -> 0x03ba }
            int r15 = r14.a     // Catch:{ all -> 0x03ba }
            r16 = 524288(0x80000, float:7.34684E-40)
            r15 = r15 | r16
            r14.a = r15     // Catch:{ all -> 0x03ba }
            r14.o = r12     // Catch:{ all -> 0x03ba }
            int r12 = r13.length     // Catch:{ all -> 0x03ba }
            int r6 = r6 + r12
            goto L_0x0167
        L_0x01c6:
            java.lang.String r13 = "GCM"
            java.lang.String r14 = "Ignoring "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x03ba }
            int r15 = r12.length()     // Catch:{ all -> 0x03ba }
            if (r15 != 0) goto L_0x01da
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x03ba }
            r12.<init>(r14)     // Catch:{ all -> 0x03ba }
            goto L_0x01de
        L_0x01da:
            java.lang.String r12 = r14.concat(r12)     // Catch:{ all -> 0x03ba }
        L_0x01de:
            android.util.Log.w(r13, r12)     // Catch:{ all -> 0x03ba }
            goto L_0x0167
        L_0x01e2:
            r6 = 0
        L_0x01e3:
            long r12 = (long) r6     // Catch:{ all -> 0x03ba }
            axlc r0 = defpackage.axlc.a     // Catch:{ all -> 0x03ba }
            axld r0 = r0.a()     // Catch:{ all -> 0x03ba }
            long r14 = r0.g()     // Catch:{ all -> 0x03ba }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0207
            java.util.List r0 = r2.q     // Catch:{ all -> 0x03ba }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x03ba }
            if (r0 != 0) goto L_0x0207
            aucj r0 = r9.i()     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            java.lang.String r3 = "MessageTooBig"
            r2.a((defpackage.amnc) r0, (java.lang.String) r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x0207:
            long r12 = defpackage.axlo.b()     // Catch:{ all -> 0x03ba }
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0238
            aucj r0 = r9.i()     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            int r3 = r0.U     // Catch:{ all -> 0x03ba }
            r6 = -1
            if (r3 != r6) goto L_0x0228
            aueh r3 = defpackage.aueh.a     // Catch:{ all -> 0x03ba }
            aueq r3 = r3.a((java.lang.Object) r0)     // Catch:{ all -> 0x03ba }
            int r3 = r3.b(r0)     // Catch:{ all -> 0x03ba }
            r0.U = r3     // Catch:{ all -> 0x03ba }
        L_0x0228:
            long r12 = (long) r3     // Catch:{ all -> 0x03ba }
            long r14 = defpackage.axlo.b()     // Catch:{ all -> 0x03ba }
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0238
            java.lang.String r3 = "MessageTooBig"
            r2.a((defpackage.amnc) r0, (java.lang.String) r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x0238:
            if (r11 != 0) goto L_0x023c
            r0 = 0
            goto L_0x0241
        L_0x023c:
            if (r5 == 0) goto L_0x0240
            r0 = 1
            goto L_0x0241
        L_0x0240:
            r0 = 0
        L_0x0241:
            if (r0 == 0) goto L_0x02a0
            nts r3 = r2.e     // Catch:{ all -> 0x03ba }
            ntx r4 = defpackage.ntx.a((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x03ba }
            boolean r3 = r3.a((defpackage.ntx) r4)     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x025c
            aucj r0 = r9.i()     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            java.lang.String r3 = "TooManyMessages"
            r2.a((defpackage.amnc) r0, (java.lang.String) r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x025c:
            nts r3 = r2.e     // Catch:{ all -> 0x03ba }
            android.content.Context r4 = r3.b     // Catch:{ all -> 0x03ba }
            boolean r4 = defpackage.aekv.a(r4)     // Catch:{ all -> 0x03ba }
            if (r4 != 0) goto L_0x0293
            long r4 = r3.d()     // Catch:{ all -> 0x03ba }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x03ba }
            boolean r8 = r9.c     // Catch:{ all -> 0x03ba }
            if (r8 != 0) goto L_0x0273
            goto L_0x0278
        L_0x0273:
            r9.c()     // Catch:{ all -> 0x03ba }
            r9.c = r7     // Catch:{ all -> 0x03ba }
        L_0x0278:
            aucj r8 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r8 = (defpackage.amnc) r8     // Catch:{ all -> 0x03ba }
            r6.getClass()     // Catch:{ all -> 0x03ba }
            int r11 = r8.a     // Catch:{ all -> 0x03ba }
            r11 = r11 | 128(0x80, float:1.794E-43)
            r8.a = r11     // Catch:{ all -> 0x03ba }
            r8.h = r6     // Catch:{ all -> 0x03ba }
            aucj r6 = r9.i()     // Catch:{ all -> 0x03ba }
            amnc r6 = (defpackage.amnc) r6     // Catch:{ all -> 0x03ba }
            boolean r3 = r3.a((long) r4, (defpackage.amnc) r6)     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x02a0
        L_0x0293:
            aucj r0 = r9.i()     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            java.lang.String r3 = "save_error"
            r2.a((defpackage.amnc) r0, (java.lang.String) r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x02a0:
            nut r3 = r2.p     // Catch:{ all -> 0x03ba }
            boolean r3 = r3.b()     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x02ef
            aucj r3 = r9.b     // Catch:{ all -> 0x03ba }
            amnc r3 = (defpackage.amnc) r3     // Catch:{ all -> 0x03ba }
            int r3 = r3.l     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x02ed
            android.content.Context r3 = r2.a     // Catch:{ all -> 0x03ba }
            java.lang.String r4 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x03ba }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{ all -> 0x03ba }
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{ all -> 0x03ba }
            if (r3 == 0) goto L_0x02ed
            boolean r3 = r3.isConnected()     // Catch:{ all -> 0x03ba }
            if (r3 == 0) goto L_0x02ed
            nut r3 = r2.p     // Catch:{ all -> 0x03ba }
            r4 = r3
            nvh r4 = (defpackage.nvh) r4     // Catch:{ all -> 0x03ba }
            nvi r4 = r4.a     // Catch:{ all -> 0x03ba }
            boolean r5 = r4.g     // Catch:{ all -> 0x03ba }
            if (r5 != 0) goto L_0x02e3
            r4 = r3
            nvh r4 = (defpackage.nvh) r4     // Catch:{ all -> 0x03ba }
            java.util.List r4 = r4.h     // Catch:{ all -> 0x03ba }
            monitor-enter(r4)     // Catch:{ all -> 0x03ba }
            nvh r3 = (defpackage.nvh) r3     // Catch:{ all -> 0x02e0 }
            java.util.List r3 = r3.h     // Catch:{ all -> 0x02e0 }
            r3.add(r9)     // Catch:{ all -> 0x02e0 }
            monitor-exit(r4)     // Catch:{ all -> 0x02e0 }
            goto L_0x02e6
        L_0x02e0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02e0 }
            throw r0     // Catch:{ all -> 0x03ba }
        L_0x02e3:
            defpackage.nvh.a((defpackage.nvi) r4, (defpackage.audw) r9)     // Catch:{ all -> 0x03ba }
        L_0x02e6:
            nva r3 = r2.d     // Catch:{ all -> 0x03ba }
            r3.b()     // Catch:{ all -> 0x03ba }
            r3 = 1
            goto L_0x02f5
        L_0x02ed:
            r3 = 0
            goto L_0x02f5
        L_0x02ef:
            nut r3 = r2.p     // Catch:{ all -> 0x03ba }
            r3.a((defpackage.audw) r9)     // Catch:{ all -> 0x03ba }
            r3 = 1
        L_0x02f5:
            if (r3 != 0) goto L_0x031b
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = "Queued GCM %s"
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ all -> 0x0317 }
            aucj r4 = r9.b     // Catch:{ all -> 0x0317 }
            amnc r4 = (defpackage.amnc) r4     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = r4.e     // Catch:{ all -> 0x0317 }
            r2[r7] = r4     // Catch:{ all -> 0x0317 }
            com.google.android.gms.gcm.GcmChimeraService.a(r0, r2)     // Catch:{ all -> 0x0317 }
            goto L_0x0028
        L_0x030a:
            aucj r0 = r9.i()     // Catch:{ all -> 0x0317 }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x0317 }
            java.lang.String r4 = "SERVICE_NOT_AVAILABLE"
            r2.a((defpackage.amnc) r0, (java.lang.String) r4)     // Catch:{ all -> 0x0317 }
            goto L_0x0028
        L_0x0317:
            r0 = move-exception
            r7 = r3
            goto L_0x03bb
        L_0x031b:
            return
        L_0x031c:
            java.lang.String r0 = "https://gcm.googleapis.com/local/status"
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x03ba }
            if (r0 != 0) goto L_0x033d
            java.lang.String r0 = "GCM"
            java.lang.String r2 = "Ignoring unknown local RPC: "
            int r3 = r6.length()     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x0334
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x03ba }
            r3.<init>(r2)     // Catch:{ all -> 0x03ba }
            goto L_0x0338
        L_0x0334:
            java.lang.String r3 = r2.concat(r6)     // Catch:{ all -> 0x03ba }
        L_0x0338:
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x033d:
            java.lang.String r0 = "google.messenger"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)     // Catch:{ all -> 0x03ba }
            boolean r3 = r0 instanceof android.os.Messenger     // Catch:{ all -> 0x03ba }
            if (r3 == 0) goto L_0x0394
            android.os.Messenger r0 = (android.os.Messenger) r0     // Catch:{ all -> 0x03ba }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x03ba }
            r3.<init>()     // Catch:{ all -> 0x03ba }
            java.lang.String r4 = "In-Reply-To"
            r3.putExtra(r4, r5)     // Catch:{ all -> 0x03ba }
            java.lang.String r4 = "status"
            nut r2 = r2.p     // Catch:{ all -> 0x03ba }
            nvh r2 = (defpackage.nvh) r2     // Catch:{ all -> 0x03ba }
            nvi r2 = r2.a     // Catch:{ all -> 0x03ba }
            boolean r5 = r2.g     // Catch:{ all -> 0x03ba }
            if (r5 != 0) goto L_0x0367
            boolean r2 = r2.f     // Catch:{ all -> 0x03ba }
            if (r2 == 0) goto L_0x0365
            r10 = 2
            goto L_0x0368
        L_0x0365:
            r10 = 3
            goto L_0x0368
        L_0x0367:
        L_0x0368:
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x03ba }
            r3.putExtra(r4, r2)     // Catch:{ all -> 0x03ba }
            android.os.Message r2 = android.os.Message.obtain()     // Catch:{ all -> 0x03ba }
            r2.obj = r3     // Catch:{ all -> 0x03ba }
            r0.send(r2)     // Catch:{ RemoteException -> 0x037a }
            goto L_0x0028
        L_0x037a:
            r0 = move-exception
            java.lang.String r0 = "GCM"
            java.lang.String r2 = "RemoteException while handling rpc response for: "
            int r3 = r6.length()     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x038b
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x03ba }
            r3.<init>(r2)     // Catch:{ all -> 0x03ba }
            goto L_0x038f
        L_0x038b:
            java.lang.String r3 = r2.concat(r6)     // Catch:{ all -> 0x03ba }
        L_0x038f:
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x0394:
            java.lang.String r0 = "GCM"
            java.lang.String r2 = "Local RPC missing messenger: "
            int r3 = r6.length()     // Catch:{ all -> 0x03ba }
            if (r3 != 0) goto L_0x03a4
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x03ba }
            r3.<init>(r2)     // Catch:{ all -> 0x03ba }
            goto L_0x03a8
        L_0x03a4:
            java.lang.String r3 = r2.concat(r6)     // Catch:{ all -> 0x03ba }
        L_0x03a8:
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x03ad:
            aucj r0 = r9.i()     // Catch:{ all -> 0x03ba }
            amnc r0 = (defpackage.amnc) r0     // Catch:{ all -> 0x03ba }
            java.lang.String r3 = "missing_to"
            r2.a((defpackage.amnc) r0, (java.lang.String) r3)     // Catch:{ all -> 0x03ba }
            goto L_0x0028
        L_0x03ba:
            r0 = move-exception
        L_0x03bb:
            if (r7 != 0) goto L_0x03c0
            com.google.android.gms.gcm.GcmSenderChimeraProxy.a()
        L_0x03c0:
            goto L_0x03c2
        L_0x03c1:
            throw r0
        L_0x03c2:
            goto L_0x03c1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqz.run():void");
    }
}
