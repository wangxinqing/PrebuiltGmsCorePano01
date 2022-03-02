package com.google.android.gms.clearcut.init;

import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearcutBootCompleteIntentOperation extends IntentOperation {
    private static final void a() {
        if (!awtf.g()) {
            ClearcutLoggerChimeraService.a.execute(hsh.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r8 = r8.getAction()
            int r0 = r8.hashCode()
            r1 = -101572338(0xfffffffff9f2210e, float:-1.5715078E35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001f
            r1 = -60251293(0xfffffffffc68a363, float:-4.831707E36)
            if (r0 == r1) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r0 = "android.intent.action.CLEARCUT_BOOT_COMPLETED"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0029
            r8 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r0 = "android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0029
            r8 = 0
            goto L_0x002a
        L_0x0029:
            r8 = -1
        L_0x002a:
            if (r8 == 0) goto L_0x0086
            if (r8 == r3) goto L_0x002f
            goto L_0x0085
        L_0x002f:
            long r0 = defpackage.awtf.h()
            r4 = 0
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x003d
            com.google.android.gms.clearcut.init.VacuumChimeraService.b()
            goto L_0x0078
        L_0x003d:
            r4 = 60
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r8.convert(r0, r6)
            long r0 = java.lang.Math.max(r4, r0)
            ihs r8 = defpackage.ihs.b()
            qwq r8 = defpackage.qwq.a((android.content.Context) r8)
            qxi r4 = new qxi
            r4.<init>()
            r5 = 2
            r4.b(r5, r5)
            r4.a = r0
            r4.b = r0
            java.lang.String r0 = "com.google.android.gms.clearcut.service.VacuumService"
            r4.i = r0
            java.lang.String r0 = "VacuumService"
            r4.k = r0
            r4.a(r3, r3)
            r4.a((boolean) r2)
            r4.b((int) r3)
            qxj r0 = r4.b()
            r8.a((defpackage.qxx) r0)
        L_0x0078:
            defpackage.hpk.b(r7)
            boolean r8 = defpackage.aekv.a()
            if (r8 != 0) goto L_0x0085
            a()
            return
        L_0x0085:
            return
        L_0x0086:
            a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.init.ClearcutBootCompleteIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
