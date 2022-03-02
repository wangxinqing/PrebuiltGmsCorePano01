package defpackage;

import com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService;
import org.apache.http.HttpEntity;

/* renamed from: erj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erj implements Runnable {
    final /* synthetic */ HttpEntity a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ GcmReceiverChimeraService e;

    public erj(GcmReceiverChimeraService gcmReceiverChimeraService, HttpEntity httpEntity, String str, String str2, long j) {
        this.e = gcmReceiverChimeraService;
        this.a = httpEntity;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b1 A[SYNTHETIC, Splitter:B:66:0x01b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = defpackage.ent.aG()     // Catch:{ IOException -> 0x01b5 }
            org.apache.http.HttpEntity r2 = r9.a     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r3 = r9.b     // Catch:{ IOException -> 0x01b5 }
            java.util.Map r3 = com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService.a((java.lang.String) r3)     // Catch:{ IOException -> 0x01b5 }
            org.apache.http.HttpResponse r1 = defpackage.emt.a(r1, r2, r3)     // Catch:{ IOException -> 0x01b5 }
            r2 = 0
            org.apache.http.StatusLine r3 = r1.getStatusLine()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            int r4 = r3.getStatusCode()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r5 = "Location"
            org.apache.http.Header r5 = r1.getLastHeader(r5)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 == r6) goto L_0x0068
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r3 = r3.getReasonPhrase()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            int r6 = r6.length()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            int r6 = r6 + 41
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            int r7 = r7.length()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            r7.<init>(r6)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r6 = "Rejected response from server: "
            r7.append(r6)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            r7.append(r1)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r1 = " \nReason: "
            r7.append(r1)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            r7.append(r3)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r1 = r7.toString()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            r3 = 301(0x12d, float:4.22E-43)
            if (r4 != r3) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            java.lang.String r1 = r5.getValue()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
        L_0x0062:
            org.apache.http.client.HttpResponseException r3 = new org.apache.http.client.HttpResponseException     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            r3.<init>(r4, r1)     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            throw r3     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
        L_0x0068:
            org.apache.http.HttpEntity r2 = r1.getEntity()     // Catch:{ RuntimeException -> 0x01a5, all -> 0x01a3 }
            if (r2 == 0) goto L_0x019b
            byte[] r1 = defpackage.emt.a(r1)     // Catch:{ RuntimeException -> 0x0199 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ RuntimeException -> 0x0199 }
            avqb r4 = defpackage.avqb.c     // Catch:{ RuntimeException -> 0x0199 }
            aucj r1 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r1, (defpackage.aubs) r3)     // Catch:{ RuntimeException -> 0x0199 }
            avqb r1 = (defpackage.avqb) r1     // Catch:{ RuntimeException -> 0x0199 }
            r2.consumeContent()     // Catch:{ IOException -> 0x01b5 }
            int r2 = r1.a     // Catch:{ IOException -> 0x01b5 }
            int r2 = defpackage.avqa.a(r2)     // Catch:{ IOException -> 0x01b5 }
            if (r2 == 0) goto L_0x0198
            r3 = 2
            if (r2 != r3) goto L_0x0198
            avpx r1 = r1.b     // Catch:{ IOException -> 0x01b5 }
            if (r1 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            avpx r1 = defpackage.avpx.b     // Catch:{ IOException -> 0x01b5 }
        L_0x0093:
            avpu r1 = r1.a     // Catch:{ IOException -> 0x01b5 }
            if (r1 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            avpu r1 = defpackage.avpu.d     // Catch:{ IOException -> 0x01b5 }
        L_0x009a:
            int r1 = r1.c     // Catch:{ IOException -> 0x01b5 }
            int r1 = defpackage.avps.a(r1)     // Catch:{ IOException -> 0x01b5 }
            if (r1 == 0) goto L_0x0198
            if (r1 != r3) goto L_0x0198
            android.accounts.Account r1 = new android.accounts.Account     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r2 = r9.c     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r4 = "com.google"
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x01b5 }
            com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService r2 = r9.e     // Catch:{ IOException -> 0x01b5 }
            android.content.Context r4 = r2.getApplicationContext()     // Catch:{ IOException -> 0x01b5 }
            android.content.Intent r1 = com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService.a(r4, r1)     // Catch:{ IOException -> 0x01b5 }
            r2.startService(r1)     // Catch:{ IOException -> 0x01b5 }
            long r1 = r9.d     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r2 = r9.c     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r4 = r9.b     // Catch:{ IOException -> 0x01b5 }
            avpv r5 = defpackage.avpv.d     // Catch:{ IOException -> 0x01b5 }
            aucd r5 = r5.o()     // Catch:{ IOException -> 0x01b5 }
            boolean r6 = r5.c     // Catch:{ IOException -> 0x01b5 }
            if (r6 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            r5.c()     // Catch:{ IOException -> 0x01b5 }
            r5.c = r0     // Catch:{ IOException -> 0x01b5 }
        L_0x00d4:
            aucj r6 = r5.b     // Catch:{ IOException -> 0x01b5 }
            avpv r6 = (defpackage.avpv) r6     // Catch:{ IOException -> 0x01b5 }
            r1.getClass()     // Catch:{ IOException -> 0x01b5 }
            int r7 = r6.a     // Catch:{ IOException -> 0x01b5 }
            r8 = 1
            r7 = r7 | r8
            r6.a = r7     // Catch:{ IOException -> 0x01b5 }
            r6.b = r1     // Catch:{ IOException -> 0x01b5 }
            r2.getClass()     // Catch:{ IOException -> 0x01b5 }
            r1 = r7 | 2
            r6.a = r1     // Catch:{ IOException -> 0x01b5 }
            r6.c = r2     // Catch:{ IOException -> 0x01b5 }
            aucj r1 = r5.i()     // Catch:{ IOException -> 0x01b5 }
            avpv r1 = (defpackage.avpv) r1     // Catch:{ IOException -> 0x01b5 }
            avqc r2 = defpackage.avqc.d     // Catch:{ IOException -> 0x01b5 }
            aucd r2 = r2.o()     // Catch:{ IOException -> 0x01b5 }
            boolean r5 = r2.c     // Catch:{ IOException -> 0x01b5 }
            if (r5 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r2.c()     // Catch:{ IOException -> 0x01b5 }
            r2.c = r0     // Catch:{ IOException -> 0x01b5 }
        L_0x0102:
            aucj r5 = r2.b     // Catch:{ IOException -> 0x01b5 }
            avqc r5 = (defpackage.avqc) r5     // Catch:{ IOException -> 0x01b5 }
            r4.getClass()     // Catch:{ IOException -> 0x01b5 }
            int r6 = r5.a     // Catch:{ IOException -> 0x01b5 }
            r6 = r6 | r8
            r5.a = r6     // Catch:{ IOException -> 0x01b5 }
            r5.b = r4     // Catch:{ IOException -> 0x01b5 }
            avpu r4 = defpackage.avpu.d     // Catch:{ IOException -> 0x01b5 }
            aucd r4 = r4.o()     // Catch:{ IOException -> 0x01b5 }
            boolean r5 = r4.c     // Catch:{ IOException -> 0x01b5 }
            if (r5 != 0) goto L_0x011b
            goto L_0x0120
        L_0x011b:
            r4.c()     // Catch:{ IOException -> 0x01b5 }
            r4.c = r0     // Catch:{ IOException -> 0x01b5 }
        L_0x0120:
            aucj r5 = r4.b     // Catch:{ IOException -> 0x01b5 }
            avpu r5 = (defpackage.avpu) r5     // Catch:{ IOException -> 0x01b5 }
            r5.b = r8     // Catch:{ IOException -> 0x01b5 }
            int r6 = r5.a     // Catch:{ IOException -> 0x01b5 }
            r6 = r6 | r8
            r5.a = r6     // Catch:{ IOException -> 0x01b5 }
            r5.c = r3     // Catch:{ IOException -> 0x01b5 }
            r6 = r6 | r3
            r5.a = r6     // Catch:{ IOException -> 0x01b5 }
            boolean r5 = r2.c     // Catch:{ IOException -> 0x01b5 }
            if (r5 != 0) goto L_0x0135
            goto L_0x013a
        L_0x0135:
            r2.c()     // Catch:{ IOException -> 0x01b5 }
            r2.c = r0     // Catch:{ IOException -> 0x01b5 }
        L_0x013a:
            aucj r5 = r2.b     // Catch:{ IOException -> 0x01b5 }
            avqc r5 = (defpackage.avqc) r5     // Catch:{ IOException -> 0x01b5 }
            aucj r4 = r4.i()     // Catch:{ IOException -> 0x01b5 }
            avpu r4 = (defpackage.avpu) r4     // Catch:{ IOException -> 0x01b5 }
            r4.getClass()     // Catch:{ IOException -> 0x01b5 }
            r5.c = r4     // Catch:{ IOException -> 0x01b5 }
            int r4 = r5.a     // Catch:{ IOException -> 0x01b5 }
            r3 = r3 | r4
            r5.a = r3     // Catch:{ IOException -> 0x01b5 }
            aucj r2 = r2.i()     // Catch:{ IOException -> 0x01b5 }
            avqc r2 = (defpackage.avqc) r2     // Catch:{ IOException -> 0x01b5 }
            avpy r3 = defpackage.avpy.e     // Catch:{ IOException -> 0x01b5 }
            aucd r3 = r3.o()     // Catch:{ IOException -> 0x01b5 }
            boolean r4 = r3.c     // Catch:{ IOException -> 0x01b5 }
            if (r4 != 0) goto L_0x015f
            goto L_0x0164
        L_0x015f:
            r3.c()     // Catch:{ IOException -> 0x01b5 }
            r3.c = r0     // Catch:{ IOException -> 0x01b5 }
        L_0x0164:
            aucj r4 = r3.b     // Catch:{ IOException -> 0x01b5 }
            avpy r4 = (defpackage.avpy) r4     // Catch:{ IOException -> 0x01b5 }
            r1.getClass()     // Catch:{ IOException -> 0x01b5 }
            r4.b = r1     // Catch:{ IOException -> 0x01b5 }
            int r1 = r4.a     // Catch:{ IOException -> 0x01b5 }
            r1 = r1 | r8
            r4.a = r1     // Catch:{ IOException -> 0x01b5 }
            r2.getClass()     // Catch:{ IOException -> 0x01b5 }
            r4.d = r2     // Catch:{ IOException -> 0x01b5 }
            r1 = r1 | 4
            r4.a = r1     // Catch:{ IOException -> 0x01b5 }
            aucj r1 = r3.i()     // Catch:{ IOException -> 0x01b5 }
            avpy r1 = (defpackage.avpy) r1     // Catch:{ IOException -> 0x01b5 }
            org.apache.http.entity.ByteArrayEntity r2 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ IOException -> 0x01b5 }
            byte[] r1 = r1.k()     // Catch:{ IOException -> 0x01b5 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r1 = defpackage.ent.aG()     // Catch:{ IOException -> 0x01b5 }
            java.lang.String r3 = r9.b     // Catch:{ IOException -> 0x01b5 }
            java.util.Map r3 = com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService.a((java.lang.String) r3)     // Catch:{ IOException -> 0x01b5 }
            defpackage.emt.a(r1, r2, r3)     // Catch:{ IOException -> 0x01b5 }
            return
        L_0x0198:
            return
        L_0x0199:
            r1 = move-exception
            goto L_0x01a6
        L_0x019b:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0199 }
            java.lang.String r3 = "Empty response from server."
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0199 }
            throw r1     // Catch:{ RuntimeException -> 0x0199 }
        L_0x01a3:
            r1 = move-exception
            goto L_0x01af
        L_0x01a5:
            r1 = move-exception
        L_0x01a6:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01ae }
            java.lang.String r4 = "Can't parse dm response"
            r3.<init>(r4, r1)     // Catch:{ all -> 0x01ae }
            throw r3     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r1 = move-exception
        L_0x01af:
            if (r2 == 0) goto L_0x01b4
            r2.consumeContent()     // Catch:{ IOException -> 0x01b5 }
        L_0x01b4:
            throw r1     // Catch:{ IOException -> 0x01b5 }
        L_0x01b5:
            r1 = move-exception
            iwd r2 = com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService.a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Exception communicating account wipe status"
            r2.d(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erj.run():void");
    }
}
