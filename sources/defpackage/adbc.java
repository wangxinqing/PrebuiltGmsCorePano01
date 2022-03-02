package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver;

/* renamed from: adbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class adbc implements Runnable {
    private final GcmChimeraBroadcastReceiver a;
    private final Context b;
    private final Intent c;
    private final BroadcastReceiver.PendingResult d;

    public adbc(GcmChimeraBroadcastReceiver gcmChimeraBroadcastReceiver, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.a = gcmChimeraBroadcastReceiver;
        this.b = context;
        this.c = intent;
        this.d = pendingResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0405  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver r2 = r1.a
            android.content.Context r0 = r1.b
            android.content.Intent r3 = r1.c
            android.content.BroadcastReceiver$PendingResult r4 = r1.d
            android.content.Context r5 = r0.getApplicationContext()
            amqy r0 = r2.e
            java.lang.Object r0 = r0.a(r5)
            adde r0 = (defpackage.adde) r0
            amsv r6 = r0.c
            java.lang.Object r6 = r6.a()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            afts r8 = r0.d
            boolean r8 = r8.a(r6)
            java.lang.String r9 = "com.google.android.gms#udc-facs"
            r10 = 3
            r11 = 1
            r12 = 0
            if (r8 == 0) goto L_0x00b8
            amsv r0 = r0.b
            java.lang.Object r0 = r0.a()
            hol r0 = (defpackage.hol) r0
            atwz r8 = defpackage.atwz.h
            aucd r8 = r8.o()
            int r7 = (int) r6
            boolean r6 = r8.c
            if (r6 != 0) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            r8.c()
            r8.c = r12
        L_0x0048:
            aucj r6 = r8.b
            atwz r6 = (defpackage.atwz) r6
            int r13 = r6.a
            r13 = r13 | 64
            r6.a = r13
            r6.d = r7
            atvy r6 = defpackage.atvy.c
            boolean r7 = r8.c
            if (r7 != 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            r8.c()
            r8.c = r12
        L_0x0060:
            aucj r7 = r8.b
            atwz r7 = (defpackage.atwz) r7
            r6.getClass()
            r7.c = r6
            r7.b = r10
            atws r6 = defpackage.atws.d
            aucd r6 = r6.o()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r6.c()
            r6.c = r12
        L_0x007b:
            aucj r7 = r6.b
            atws r7 = (defpackage.atws) r7
            r9.getClass()
            int r13 = r7.a
            r13 = r13 | r11
            r7.a = r13
            r7.b = r9
            boolean r7 = r8.c
            if (r7 != 0) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            r8.c()
            r8.c = r12
        L_0x0093:
            aucj r7 = r8.b
            atwz r7 = (defpackage.atwz) r7
            aucj r6 = r6.i()
            atws r6 = (defpackage.atws) r6
            r6.getClass()
            r7.e = r6
            int r6 = r7.a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r7.a = r6
            aucj r6 = r8.i()
            hoi r0 = r0.a((defpackage.audx) r6)
            r6 = 1002(0x3ea, float:1.404E-42)
            r0.b((int) r6)
            r0.b()
        L_0x00b8:
            aekn r0 = r2.g
            long r6 = r0.b()
            boolean r0 = defpackage.azrk.r()
            java.lang.String r8 = "a"
            java.lang.String r13 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r14 = "com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver"
            if (r0 != 0) goto L_0x00cc
            goto L_0x023b
        L_0x00cc:
            r15 = 2
            java.lang.String r0 = "fsc_v1"
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ auda -> 0x00e1 }
            byte[] r0 = android.util.Base64.decode(r0, r12)     // Catch:{ auda -> 0x00e1 }
            atvh r3 = defpackage.atvh.b     // Catch:{ auda -> 0x00e1 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r0)     // Catch:{ auda -> 0x00e1 }
            atvh r0 = (defpackage.atvh) r0     // Catch:{ auda -> 0x00e1 }
            r3 = r0
            goto L_0x0110
        L_0x00e1:
            r0 = move-exception
            amqy r0 = r2.e
            java.lang.Object r0 = r0.a(r5)
            adde r0 = (defpackage.adde) r0
            atwu r3 = defpackage.atwu.d
            aucd r3 = r3.o()
            boolean r10 = r3.c
            if (r10 != 0) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            r3.c()
            r3.c = r12
        L_0x00fa:
            aucj r10 = r3.b
            atwu r10 = (defpackage.atwu) r10
            r10.b = r15
            int r15 = r10.a
            r15 = r15 | r11
            r10.a = r15
            aucj r3 = r3.i()
            atwu r3 = (defpackage.atwu) r3
            r0.a(r3)
            r0 = 0
            r3 = r0
        L_0x0110:
            if (r3 != 0) goto L_0x0138
            anij r0 = com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver.b
            anie r0 = r0.c()
            r3 = 148(0x94, float:2.07E-43)
            java.lang.String r10 = "b"
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r10, (int) r3, (java.lang.String) r13)
            java.lang.String r3 = "Corrupted push notification payload, pinging all accounts..."
            r0.a((java.lang.String) r3)
            amqy r0 = r2.c
            java.lang.Object r0 = r0.a(r5)
            afyy r0 = (defpackage.afyy) r0
            afxr r0 = r0.c()
            acyn r3 = defpackage.acyn.PUSH_MESSAGE
            r0.a((java.lang.Enum) r3)
            goto L_0x023b
        L_0x0138:
            java.lang.String r0 = "com.google.android.gms"
            java.util.List r0 = defpackage.jgu.d(r5, r0)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            amqy r15 = r2.d
            java.lang.Object r15 = r15.a(r5)
            adhf r15 = (defpackage.adhf) r15
            java.util.Iterator r17 = r0.iterator()
        L_0x0150:
            boolean r0 = r17.hasNext()
            if (r0 != 0) goto L_0x03ae
            aucx r0 = r3.a
            int r15 = r0.size()
            r11 = 0
        L_0x015d:
            if (r11 >= r15) goto L_0x023b
            java.lang.Object r17 = r0.get(r11)
            r12 = r17
            atvg r12 = (defpackage.atvg) r12
            java.lang.String r12 = r12.a
            boolean r17 = r10.containsKey(r12)
            if (r17 == 0) goto L_0x01db
            java.lang.Object r12 = r10.get(r12)
            android.accounts.Account r12 = (android.accounts.Account) r12
            r17 = r0
            amqy r0 = r2.c
            java.lang.Object r0 = r0.a(r5)
            afyy r0 = (defpackage.afyy) r0
            afxr r0 = r0.a(r12)
            acyn r12 = defpackage.acyn.PUSH_MESSAGE
            r0.a((java.lang.Enum) r12)
            amqy r0 = r2.e
            java.lang.Object r0 = r0.a(r5)
            adde r0 = (defpackage.adde) r0
            atwu r12 = defpackage.atwu.d
            aucd r12 = r12.o()
            boolean r1 = r12.c
            if (r1 == 0) goto L_0x01a0
            r12.c()
            r1 = 0
            r12.c = r1
        L_0x01a0:
            aucj r1 = r12.b
            atwu r1 = (defpackage.atwu) r1
            r18 = r15
            r15 = 1
            r1.b = r15
            r19 = r10
            int r10 = r1.a
            r10 = r10 | r15
            r1.a = r10
            aucx r1 = r3.a
            int r1 = r1.size()
            boolean r10 = r12.c
            if (r10 != 0) goto L_0x01bb
            goto L_0x01c1
        L_0x01bb:
            r12.c()
            r10 = 0
            r12.c = r10
        L_0x01c1:
            aucj r10 = r12.b
            atwu r10 = (defpackage.atwu) r10
            int r15 = r10.a
            r16 = 2
            r15 = r15 | 2
            r10.a = r15
            r10.c = r1
            aucj r1 = r12.i()
            atwu r1 = (defpackage.atwu) r1
            r0.a(r1)
            r16 = 2
            goto L_0x022e
        L_0x01db:
            r17 = r0
            r19 = r10
            r18 = r15
            amqy r0 = r2.e
            java.lang.Object r0 = r0.a(r5)
            adde r0 = (defpackage.adde) r0
            atwu r1 = defpackage.atwu.d
            aucd r1 = r1.o()
            boolean r10 = r1.c
            if (r10 == 0) goto L_0x01f9
            r1.c()
            r10 = 0
            r1.c = r10
        L_0x01f9:
            aucj r10 = r1.b
            atwu r10 = (defpackage.atwu) r10
            r12 = 3
            r10.b = r12
            int r12 = r10.a
            r15 = 1
            r12 = r12 | r15
            r10.a = r12
            aucx r10 = r3.a
            int r10 = r10.size()
            boolean r12 = r1.c
            if (r12 != 0) goto L_0x0211
            goto L_0x0217
        L_0x0211:
            r1.c()
            r12 = 0
            r1.c = r12
        L_0x0217:
            aucj r12 = r1.b
            atwu r12 = (defpackage.atwu) r12
            int r15 = r12.a
            r16 = 2
            r15 = r15 | 2
            r12.a = r15
            r12.c = r10
            aucj r1 = r1.i()
            atwu r1 = (defpackage.atwu) r1
            r0.a(r1)
        L_0x022e:
            int r11 = r11 + 1
            r1 = r20
            r0 = r17
            r15 = r18
            r10 = r19
            r12 = 0
            goto L_0x015d
        L_0x023b:
            anij r0 = com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver.b     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            r1 = 111(0x6f, float:1.56E-43)
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r8, (int) r1, (java.lang.String) r13)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            java.lang.String r1 = "Scheduling sync in reaction to push notification..."
            r0.a((java.lang.String) r1)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            amqy r0 = r2.f     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            java.lang.Object r0 = r0.a(r5)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            aful r0 = (defpackage.aful) r0     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            aczd r1 = defpackage.aczd.SYNC_ID_CUSTOM_CACHE     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            aorr r0 = r0.e(r1)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            boolean r0 = r0.booleanValue()     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            if (r0 != 0) goto L_0x0278
            anij r0 = com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver.b     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            r1 = 121(0x79, float:1.7E-43)
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r8, (int) r1, (java.lang.String) r13)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            java.lang.String r1 = "Sync is disabled!"
            r0.a((java.lang.String) r1)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            goto L_0x0289
        L_0x0278:
            anij r0 = com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver.b     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            anie r0 = r0.d()     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            r1 = 119(0x77, float:1.67E-43)
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r8, (int) r1, (java.lang.String) r13)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
            java.lang.String r1 = "Sync scheduled successfully."
            r0.a((java.lang.String) r1)     // Catch:{ ExecutionException -> 0x0396, InterruptedException -> 0x0394 }
        L_0x0289:
            aekn r0 = r2.g
            long r0 = r0.b()
            amqy r2 = r2.e
            java.lang.Object r2 = r2.a(r5)
            adde r2 = (defpackage.adde) r2
            long r0 = r0 - r6
            amsv r3 = r2.c
            java.lang.Object r3 = r3.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            afts r3 = r2.d
            boolean r3 = r3.a(r5)
            if (r3 == 0) goto L_0x037f
            amsv r2 = r2.b
            java.lang.Object r2 = r2.a()
            hol r2 = (defpackage.hol) r2
            atwz r3 = defpackage.atwz.h
            aucd r3 = r3.o()
            int r6 = (int) r5
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x02c0
            goto L_0x02c6
        L_0x02c0:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x02c6:
            aucj r5 = r3.b
            atwz r5 = (defpackage.atwz) r5
            int r7 = r5.a
            r7 = r7 | 64
            r5.a = r7
            r5.d = r6
            atvy r5 = defpackage.atvy.c
            aucd r5 = r5.o()
            atvw r6 = defpackage.atvw.c
            aucd r6 = r6.o()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x02e3
            goto L_0x02e9
        L_0x02e3:
            r6.c()
            r7 = 0
            r6.c = r7
        L_0x02e9:
            aucj r7 = r6.b
            atvw r7 = (defpackage.atvw) r7
            int r10 = r7.a
            r11 = 1
            r10 = r10 | r11
            r7.a = r10
            r7.b = r0
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x02fa
            goto L_0x0300
        L_0x02fa:
            r5.c()
            r1 = 0
            r5.c = r1
        L_0x0300:
            aucj r0 = r5.b
            atvy r0 = (defpackage.atvy) r0
            aucj r1 = r6.i()
            atvw r1 = (defpackage.atvw) r1
            r1.getClass()
            r0.b = r1
            r1 = 1
            r0.a = r1
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0317
            goto L_0x031d
        L_0x0317:
            r3.c()
            r1 = 0
            r3.c = r1
        L_0x031d:
            aucj r0 = r3.b
            atwz r0 = (defpackage.atwz) r0
            aucj r1 = r5.i()
            atvy r1 = (defpackage.atvy) r1
            r1.getClass()
            r0.c = r1
            r1 = 3
            r0.b = r1
            atws r0 = defpackage.atws.d
            aucd r0 = r0.o()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x033a
            goto L_0x0340
        L_0x033a:
            r0.c()
            r1 = 0
            r0.c = r1
        L_0x0340:
            aucj r1 = r0.b
            atws r1 = (defpackage.atws) r1
            r9.getClass()
            int r5 = r1.a
            r10 = 1
            r5 = r5 | r10
            r1.a = r5
            r1.b = r9
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x0354
            goto L_0x035a
        L_0x0354:
            r3.c()
            r11 = 0
            r3.c = r11
        L_0x035a:
            aucj r1 = r3.b
            atwz r1 = (defpackage.atwz) r1
            aucj r0 = r0.i()
            atws r0 = (defpackage.atws) r0
            r0.getClass()
            r1.e = r0
            int r0 = r1.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.a = r0
            aucj r0 = r3.i()
            hoi r0 = r2.a((defpackage.audx) r0)
            r1 = 1003(0x3eb, float:1.406E-42)
            r0.b((int) r1)
            r0.b()
        L_0x037f:
            r4.finish()
            anij r0 = com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver.b
            anie r0 = r0.d()
            r1 = 99
            anie r0 = r0.a((java.lang.String) r14, (java.lang.String) r8, (int) r1, (java.lang.String) r13)
            java.lang.String r1 = "GCM push notification handled successfully."
            r0.a((java.lang.String) r1)
            return
        L_0x0394:
            r0 = move-exception
            goto L_0x0397
        L_0x0396:
            r0 = move-exception
        L_0x0397:
            anij r1 = com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver.b
            anie r1 = r1.c()
            r2 = 124(0x7c, float:1.74E-43)
            anie r1 = r1.a((java.lang.String) r14, (java.lang.String) r8, (int) r2, (java.lang.String) r13)
            java.lang.String r2 = "Failed to handle GCM push notification!"
            r1.a((java.lang.String) r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03ae:
            r19 = r10
            r1 = 3
            r10 = 1
            r11 = 0
            r16 = 2
            java.lang.Object r0 = r17.next()
            android.accounts.Account r0 = (android.accounts.Account) r0
            java.lang.String r12 = r15.a(r0)     // Catch:{ eif -> 0x03d1, IOException -> 0x03cf }
            r1 = r19
            r1.put(r12, r0)     // Catch:{ eif -> 0x03cd, IOException -> 0x03cb }
            r10 = r1
            r11 = 1
            r12 = 0
            r1 = r20
            goto L_0x0150
        L_0x03cb:
            r0 = move-exception
            goto L_0x03d4
        L_0x03cd:
            r0 = move-exception
            goto L_0x03d4
        L_0x03cf:
            r0 = move-exception
            goto L_0x03d2
        L_0x03d1:
            r0 = move-exception
        L_0x03d2:
            r1 = r19
        L_0x03d4:
            azrk r12 = defpackage.azrk.a
            azrl r12 = r12.a()
            boolean r12 = r12.j()
            if (r12 == 0) goto L_0x0405
            anij r12 = defpackage.addh.a()
            anie r12 = r12.c()
            long r10 = defpackage.azrk.k()
            int r11 = (int) r10
            r12.a((int) r11)
            r12.a((java.lang.Throwable) r0)
            r0 = 214(0xd6, float:3.0E-43)
            anie r0 = r12.a((java.lang.String) r14, (java.lang.String) r8, (int) r0, (java.lang.String) r13)
            java.lang.String r10 = "Failed to retrieve obfuscated Gaia id!"
            r0.a((java.lang.String) r10)
            r10 = r1
            r11 = 1
            r12 = 0
            r1 = r20
            goto L_0x0150
        L_0x0405:
            r10 = r1
            r11 = 1
            r12 = 0
            r1 = r20
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adbc.run():void");
    }
}
