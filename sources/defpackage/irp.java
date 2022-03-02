package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: irp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class irp extends qvr {
    final /* synthetic */ irx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irp(irx irx, Looper looper) {
        super(looper);
        this.a = irx;
    }

    private static final void b(Message message) {
        irq irq = (irq) message.obj;
        irq.b();
        irq.c();
    }

    private static final boolean c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            irx r0 = r7.a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.q
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = c(r8)
            if (r0 == 0) goto L_0x0015
            b(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002a
            int r0 = r8.what
            r4 = 7
            if (r0 == r4) goto L_0x002a
            int r0 = r8.what
            if (r0 == r1) goto L_0x002a
            int r0 = r8.what
            if (r0 != r3) goto L_0x0032
        L_0x002a:
            irx r0 = r7.a
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0178
        L_0x0032:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x0089
            irx r0 = r7.a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            java.lang.String[] r8 = defpackage.irx.r
            r0.n = r1
            irx r8 = r7.a
            boolean r0 = r8.o
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = r8.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0071
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0071
            java.lang.String r8 = r8.c()     // Catch:{ ClassNotFoundException -> 0x0070 }
            java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0070 }
            irx r8 = r7.a
            boolean r0 = r8.o
            if (r0 == 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            r8.a((int) r5, (android.os.IInterface) null)
            return
        L_0x0070:
            r8 = move-exception
        L_0x0071:
            irx r8 = r7.a
            com.google.android.gms.common.ConnectionResult r8 = r8.n
            if (r8 != 0) goto L_0x007c
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x007c:
            irx r0 = r7.a
            irr r0 = r0.i
            r0.a(r8)
            irx r0 = r7.a
            r0.a((com.google.android.gms.common.ConnectionResult) r8)
            return
        L_0x0089:
            int r0 = r8.what
            if (r0 != r3) goto L_0x00a7
            irx r8 = r7.a
            java.lang.String[] r0 = defpackage.irx.r
            com.google.android.gms.common.ConnectionResult r8 = r8.n
            if (r8 != 0) goto L_0x009a
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x009a:
            irx r0 = r7.a
            irr r0 = r0.i
            r0.a(r8)
            irx r0 = r7.a
            r0.a((com.google.android.gms.common.ConnectionResult) r8)
            return
        L_0x00a7:
            int r0 = r8.what
            if (r0 != r5) goto L_0x00cc
            java.lang.Object r0 = r8.obj
            boolean r0 = r0 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r8.obj
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            goto L_0x00b8
        L_0x00b7:
        L_0x00b8:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            irx r8 = r7.a
            irr r8 = r8.i
            r8.a(r0)
            irx r8 = r7.a
            r8.a((com.google.android.gms.common.ConnectionResult) r0)
            return
        L_0x00cc:
            int r0 = r8.what
            r1 = 6
            if (r0 != r1) goto L_0x00ee
            irx r0 = r7.a
            r0.a((int) r3, (android.os.IInterface) null)
            irx r0 = r7.a
            irn r0 = r0.l
            if (r0 == 0) goto L_0x00e1
            int r1 = r8.arg2
            r0.a((int) r1)
        L_0x00e1:
            irx r0 = r7.a
            int r8 = r8.arg2
            r0.a((int) r8)
            irx r8 = r7.a
            r8.a((int) r3, (int) r2, (android.os.IInterface) r6)
            return
        L_0x00ee:
            int r0 = r8.what
            r1 = 2
            if (r0 != r1) goto L_0x0100
            irx r0 = r7.a
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x00fc
            goto L_0x0100
        L_0x00fc:
            b(r8)
            return
        L_0x0100:
            boolean r0 = c(r8)
            if (r0 == 0) goto L_0x0158
            java.lang.Object r8 = r8.obj
            r0 = r8
            irq r0 = (defpackage.irq) r0
            monitor-enter(r0)
            java.lang.Object r8 = r0.d     // Catch:{ all -> 0x0155 }
            boolean r1 = r0.e     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x013b
            java.lang.String r1 = "GmsClient"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0155 }
            int r4 = r4.length()     // Catch:{ all -> 0x0155 }
            int r4 = r4 + 47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            r5.<init>(r4)     // Catch:{ all -> 0x0155 }
            java.lang.String r4 = "Callback proxy "
            r5.append(r4)     // Catch:{ all -> 0x0155 }
            r5.append(r3)     // Catch:{ all -> 0x0155 }
            java.lang.String r3 = " being reused. This is not safe."
            r5.append(r3)     // Catch:{ all -> 0x0155 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0155 }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x0155 }
        L_0x013b:
            monitor-exit(r0)     // Catch:{ all -> 0x0155 }
            if (r8 != 0) goto L_0x0142
            r0.b()
            goto L_0x0145
        L_0x0142:
            r0.a(r8)     // Catch:{ RuntimeException -> 0x0150 }
        L_0x0145:
            monitor-enter(r0)
            r0.e = r2     // Catch:{ all -> 0x014d }
            monitor-exit(r0)     // Catch:{ all -> 0x014d }
            r0.c()
            return
        L_0x014d:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014d }
            throw r8
        L_0x0150:
            r8 = move-exception
            r0.b()
            throw r8
        L_0x0155:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0155 }
            throw r8
        L_0x0158:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L_0x0178:
            b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irp.handleMessage(android.os.Message):void");
    }
}
