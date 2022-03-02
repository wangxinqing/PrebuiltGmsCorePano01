package defpackage;

import android.content.Intent;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: nry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nry implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ GcmChimeraService b;

    public nry(GcmChimeraService gcmChimeraService, Intent intent) {
        this.b = gcmChimeraService;
        this.a = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if ((defpackage.axlc.g() & 1) != 0) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.gcm.GcmChimeraService r0 = r10.b
            android.content.Intent r1 = r10.a
            r2 = 0
            if (r1 == 0) goto L_0x000c
            java.lang.String r3 = r1.getAction()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            java.lang.String r4 = "com.google.android.gcm.intent.USER_UNLOCKED"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0040
            boolean r3 = defpackage.aekv.a()
            if (r3 == 0) goto L_0x0040
            boolean r3 = defpackage.nrr.b()
            if (r3 == 0) goto L_0x0040
            nut r3 = r0.e
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0031
            nut r3 = r0.e
            r4 = 30
            r3.a((int) r4)
        L_0x0031:
            nrr r3 = defpackage.nrr.a()
            boolean r4 = defpackage.nrr.b()
            if (r4 == 0) goto L_0x0040
            nrj r3 = r3.f
            r3.c()
        L_0x0040:
            monitor-enter(r0)
            boolean r3 = defpackage.aekv.a(r0)     // Catch:{ all -> 0x0089 }
            r4 = 0
            if (r3 != 0) goto L_0x0055
            long r6 = defpackage.axlc.g()     // Catch:{ all -> 0x0089 }
            r8 = 2
            long r6 = r6 & r8
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0060
            goto L_0x0071
        L_0x0055:
            long r6 = defpackage.axlc.g()     // Catch:{ all -> 0x0089 }
            r8 = 1
            long r6 = r6 & r8
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0071
        L_0x0060:
            ntt r2 = r0.h     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x006b
            ntt r2 = new ntt     // Catch:{ all -> 0x0089 }
            r2.<init>(r0)     // Catch:{ all -> 0x0089 }
            r0.h = r2     // Catch:{ all -> 0x0089 }
        L_0x006b:
            ntt r2 = r0.h     // Catch:{ all -> 0x0089 }
            r2.a()     // Catch:{ all -> 0x0089 }
            goto L_0x007a
        L_0x0071:
            ntt r3 = r0.h     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x007a
            r3.b()     // Catch:{ all -> 0x0089 }
            r0.h = r2     // Catch:{ all -> 0x0089 }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0083
            nva r0 = r0.d
            r0.c()
            return
        L_0x0083:
            nva r0 = r0.d
            r0.b()
            return
        L_0x0089:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nry.run():void");
    }
}
