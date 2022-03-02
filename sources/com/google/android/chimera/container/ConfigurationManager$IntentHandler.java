package com.google.android.chimera.container;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigurationManager$IntentHandler extends IntentOperation {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r10, boolean r11) {
        /*
            r9 = this;
            bkv r0 = defpackage.bkv.a((android.content.Context) r9)
            java.lang.String r1 = r10.getAction()
            defpackage.amtf.a((java.lang.Object) r1)
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 3
            r5 = -1
            r6 = 1
            r7 = 0
            switch(r2) {
                case -1709763626: goto L_0x0036;
                case -110071292: goto L_0x002c;
                case 798292259: goto L_0x0022;
                case 2069809336: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0040
        L_0x0018:
            java.lang.String r2 = "com.google.android.chimera.IntentOperation.NEW_MODULE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 1
            goto L_0x0041
        L_0x0022:
            java.lang.String r2 = "android.intent.action.BOOT_COMPLETED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 0
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "com.google.android.chimera.container.NEW_MODULE_TIMEOUT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 2
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "com.google.android.chimera.container.CHECK_MODULES_INIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0040
            r1 = 3
            goto L_0x0041
        L_0x0040:
            r1 = -1
        L_0x0041:
            if (r1 == 0) goto L_0x012c
            if (r1 == r6) goto L_0x006b
            if (r1 == r3) goto L_0x0050
            if (r1 == r4) goto L_0x004b
            goto L_0x0153
        L_0x004b:
            r0.a((boolean) r7, (boolean) r6)
            return
        L_0x0050:
            if (r11 != 0) goto L_0x006a
            java.lang.String r11 = "chimera_retries"
            int r10 = r10.getIntExtra(r11, r4)
            int r10 = r10 + r5
            if (r10 > 0) goto L_0x0064
            r0.i()
            r10 = 40
            defpackage.bla.a((android.content.Context) r9, (int) r10)
            return
        L_0x0064:
            r0.a((int) r10)
            r0.a((boolean) r6, (boolean) r7)
        L_0x006a:
            return
        L_0x006b:
            java.lang.Object r11 = r0.e
            monitor-enter(r11)
            aucd r1 = r0.n()     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "chimera_complete"
            int r2 = r10.getIntExtra(r2, r5)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = "chimera_full_reinit"
            boolean r10 = r10.getBooleanExtra(r3, r7)     // Catch:{ all -> 0x0129 }
            aucj r3 = r1.b     // Catch:{ all -> 0x0129 }
            bno r3 = (defpackage.bno) r3     // Catch:{ all -> 0x0129 }
            int r4 = r3.c     // Catch:{ all -> 0x0129 }
            int r3 = r3.d     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r8 = 106(0x6a, float:1.49E-43)
            r5.<init>(r8)     // Catch:{ all -> 0x0129 }
            java.lang.String r8 = "Received com.google.android.chimera.IntentOperation.NEW_MODULE("
            r5.append(r8)     // Catch:{ all -> 0x0129 }
            r5.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = "/"
            r5.append(r4)     // Catch:{ all -> 0x0129 }
            r5.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = "): "
            r5.append(r3)     // Catch:{ all -> 0x0129 }
            r5.append(r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = ","
            r5.append(r3)     // Catch:{ all -> 0x0129 }
            r5.append(r10)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = "ChimeraCfgMgr"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0129 }
            android.util.Log.i(r3, r4)     // Catch:{ all -> 0x0129 }
            if (r2 < 0) goto L_0x00f7
            aucj r3 = r1.b     // Catch:{ all -> 0x0129 }
            bno r3 = (defpackage.bno) r3     // Catch:{ all -> 0x0129 }
            int r4 = r3.c     // Catch:{ all -> 0x0129 }
            if (r2 <= r4) goto L_0x00c1
            goto L_0x00f7
        L_0x00c1:
            int r3 = r3.d     // Catch:{ all -> 0x0129 }
            if (r2 <= r3) goto L_0x00f7
            int r3 = r3 + r6
            if (r2 != r3) goto L_0x00c9
            goto L_0x00d3
        L_0x00c9:
            if (r10 != 0) goto L_0x00d3
            java.lang.String r10 = "ChimeraCfgMgr"
            java.lang.String r3 = "Ignoring out-of-order com.google.android.chimera.IntentOperation.NEW_MODULE"
            android.util.Log.w(r10, r3)     // Catch:{ all -> 0x0129 }
            goto L_0x00fe
        L_0x00d3:
            boolean r10 = r1.c     // Catch:{ all -> 0x0129 }
            if (r10 != 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            r1.c()     // Catch:{ all -> 0x0129 }
            r1.c = r7     // Catch:{ all -> 0x0129 }
        L_0x00dd:
            aucj r10 = r1.b     // Catch:{ all -> 0x0129 }
            bno r10 = (defpackage.bno) r10     // Catch:{ all -> 0x0129 }
            bno r3 = defpackage.bno.e     // Catch:{ all -> 0x0129 }
            int r3 = r10.a     // Catch:{ all -> 0x0129 }
            r3 = r3 | 4
            r10.a = r3     // Catch:{ all -> 0x0129 }
            r10.d = r2     // Catch:{ all -> 0x0129 }
            int r10 = r10.c     // Catch:{ all -> 0x0129 }
            if (r10 == r2) goto L_0x00f3
            r0.a((defpackage.aucd) r1)     // Catch:{ all -> 0x0129 }
            goto L_0x0127
        L_0x00f3:
            r0.k()     // Catch:{ all -> 0x0129 }
            goto L_0x0127
        L_0x00f7:
            java.lang.String r10 = "ChimeraCfgMgr"
            java.lang.String r3 = "Ignoring unexpected com.google.android.chimera.IntentOperation.NEW_MODULE"
            android.util.Log.w(r10, r3)     // Catch:{ all -> 0x0129 }
        L_0x00fe:
            aucj r10 = r1.b     // Catch:{ all -> 0x0129 }
            bno r10 = (defpackage.bno) r10     // Catch:{ all -> 0x0129 }
            int r10 = r10.c     // Catch:{ all -> 0x0129 }
            if (r2 != r10) goto L_0x0127
            defpackage.bkn.b()     // Catch:{ all -> 0x0129 }
            awxo r10 = defpackage.awxo.a     // Catch:{ all -> 0x0129 }
            awxv r10 = r10.a()     // Catch:{ all -> 0x0129 }
            boolean r10 = r10.s()     // Catch:{ all -> 0x0129 }
            if (r10 == 0) goto L_0x0127
            android.app.PendingIntent r10 = r0.a((int) r7)     // Catch:{ all -> 0x0129 }
            if (r10 == 0) goto L_0x0127
            java.lang.String r0 = "ChimeraCfgMgr"
            java.lang.String r1 = "Triggering early com.google.android.chimera.container.NEW_MODULE_TIMEOUT"
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0129 }
            r10.send()     // Catch:{ CanceledException -> 0x0126 }
            goto L_0x0127
        L_0x0126:
            r10 = move-exception
        L_0x0127:
            monitor-exit(r11)     // Catch:{ all -> 0x0129 }
            return
        L_0x0129:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0129 }
            throw r10
        L_0x012c:
            bny r10 = defpackage.bkv.b((android.content.Context) r9)
            if (r10 == 0) goto L_0x014a
            java.lang.String r11 = "ChimeraCfgMgr"
            java.lang.String r1 = "Auto-enable components using current configuration."
            android.util.Log.i(r11, r1)
            boz r11 = r0.f()     // Catch:{ InvalidConfigException -> 0x0141 }
            r10.a((defpackage.boz) r11)
            goto L_0x014a
        L_0x0141:
            r10 = move-exception
            java.lang.String r11 = "ChimeraCfgMgr"
            java.lang.String r0 = "Cannot get current Chimera configuration, so skip auto-enabling components."
            android.util.Log.e(r11, r0, r10)
            return
        L_0x014a:
            boolean r10 = defpackage.aekv.a()
            if (r10 == 0) goto L_0x0153
            r0.a((boolean) r7, (boolean) r6)
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.chimera.container.ConfigurationManager$IntentHandler.onHandleIntent(android.content.Intent, boolean):void");
    }
}
