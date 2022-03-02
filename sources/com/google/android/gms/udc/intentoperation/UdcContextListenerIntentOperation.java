package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcContextListenerIntentOperation extends IntentOperation {
    private static final jjg a = jjg.a();

    private static Account a(Intent intent) {
        String stringExtra = intent.getStringExtra("UdcAccountName");
        if (!jlh.d(stringExtra)) {
            return new Account(stringExtra, "com.google");
        }
        ((anih) ((anih) a.c()).a("com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation", "a", 57, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Account missing");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.util.SparseIntArray} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [ile] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r12 = defpackage.adhj.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r6.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r8 = (defpackage.anih) defpackage.adbd.a.c();
        r8.a((java.lang.Throwable) r12);
        ((defpackage.anih) r8.a("adbd", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't parse Context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0164, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x0083, B:41:0x00b5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "adbd"
            if (r12 == 0) goto L_0x0188
            boolean r1 = defpackage.azrk.b()
            if (r1 == 0) goto L_0x0188
            boolean r1 = defpackage.azrk.i()
            if (r1 != 0) goto L_0x001e
            boolean r1 = defpackage.azrk.j()
            if (r1 != 0) goto L_0x001e
            boolean r1 = defpackage.jix.a()
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            return
        L_0x001e:
            java.lang.String r1 = "UdcAccountName"
            java.lang.String r1 = r12.getStringExtra(r1)
            boolean r2 = defpackage.jlh.d(r1)
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            r5 = 0
            if (r2 == 0) goto L_0x0049
            jjg r1 = a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r2 = 57
            java.lang.String r6 = "com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation"
            anie r1 = r1.a((java.lang.String) r6, (java.lang.String) r4, (int) r2, (java.lang.String) r3)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Account missing"
            r1.a((java.lang.String) r2)
            r2 = r5
            goto L_0x0050
        L_0x0049:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r6 = "com.google"
            r2.<init>(r1, r6)
        L_0x0050:
            if (r2 == 0) goto L_0x0187
            int[] r1 = com.google.android.gms.contextmanager.ContextData.a
            java.lang.String r1 = "context_data_byte_array"
            byte[] r12 = r12.getByteArrayExtra(r1)
            if (r12 == 0) goto L_0x0062
            com.google.android.gms.contextmanager.ContextData r1 = new com.google.android.gms.contextmanager.ContextData
            r1.<init>((byte[]) r12)
            goto L_0x0063
        L_0x0062:
            r1 = r5
        L_0x0063:
            if (r1 == 0) goto L_0x0187
            jjg r12 = defpackage.adbd.a
            boolean r12 = defpackage.azrk.n()
            if (r12 == 0) goto L_0x0187
            java.lang.String r12 = r1.d()
            attc r1 = defpackage.adhj.a(r1)     // Catch:{ auda -> 0x016d }
            java.lang.String r6 = r2.name
            adhj r6 = new adhj
            r6.<init>(r11, r2)
            jtk r6 = r6.a()     // Catch:{ all -> 0x0166 }
            r7 = 0
            if (r6 != 0) goto L_0x009d
            jjg r12 = defpackage.adbd.a     // Catch:{ all -> 0x009a }
            anie r12 = r12.c()     // Catch:{ all -> 0x009a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x009a }
            r8 = 107(0x6b, float:1.5E-43)
            anie r12 = r12.a((java.lang.String) r0, (java.lang.String) r4, (int) r8, (java.lang.String) r3)     // Catch:{ all -> 0x009a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "No buffers returned returned by ContextManager."
            r12.a((java.lang.String) r0)     // Catch:{ all -> 0x009a }
            r12 = r5
            goto L_0x00da
        L_0x009a:
            r12 = move-exception
            goto L_0x0164
        L_0x009d:
            r8 = 0
        L_0x009e:
            int r9 = r6.a()     // Catch:{ all -> 0x009a }
            if (r8 >= r9) goto L_0x00d6
            com.google.android.gms.contextmanager.ContextData r9 = r6.b(r8)     // Catch:{ all -> 0x009a }
            java.lang.String r10 = r9.d()     // Catch:{ all -> 0x009a }
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x009a }
            if (r10 == 0) goto L_0x00b5
            int r8 = r8 + 1
            goto L_0x009e
        L_0x00b5:
            attc r12 = defpackage.adhj.a(r9)     // Catch:{ auda -> 0x00bd }
            r6.c()
            goto L_0x00da
        L_0x00bd:
            r12 = move-exception
            jjg r8 = defpackage.adbd.a     // Catch:{ all -> 0x009a }
            anie r8 = r8.c()     // Catch:{ all -> 0x009a }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x009a }
            r8.a((java.lang.Throwable) r12)     // Catch:{ all -> 0x009a }
            r12 = 117(0x75, float:1.64E-43)
            anie r12 = r8.a((java.lang.String) r0, (java.lang.String) r4, (int) r12, (java.lang.String) r3)     // Catch:{ all -> 0x009a }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "Couldn't parse Context"
            r12.a((java.lang.String) r0)     // Catch:{ all -> 0x009a }
        L_0x00d6:
            r6.c()
            r12 = r5
        L_0x00da:
            if (r12 == 0) goto L_0x00dd
            goto L_0x00e4
        L_0x00dd:
            boolean r0 = defpackage.azrk.i()
            if (r0 != 0) goto L_0x00e4
            return
        L_0x00e4:
            java.util.Set r0 = defpackage.jir.b()
            aucx r3 = r1.a
            int r3 = r3.size()
            if (r3 != 0) goto L_0x00f1
            goto L_0x014a
        L_0x00f1:
            if (r12 == 0) goto L_0x0112
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>()
            aucx r12 = r12.a
            int r3 = r12.size()
            r4 = 0
        L_0x00ff:
            if (r4 >= r3) goto L_0x0111
            java.lang.Object r6 = r12.get(r4)
            attb r6 = (defpackage.attb) r6
            int r8 = r6.a
            int r6 = r6.b
            r5.put(r8, r6)
            int r4 = r4 + 1
            goto L_0x00ff
        L_0x0111:
            goto L_0x0113
        L_0x0112:
        L_0x0113:
            java.util.Set r12 = defpackage.adhs.a()
            aucx r1 = r1.a
            int r3 = r1.size()
            r4 = 0
        L_0x011e:
            if (r4 >= r3) goto L_0x014a
            java.lang.Object r6 = r1.get(r4)
            attb r6 = (defpackage.attb) r6
            if (r5 == 0) goto L_0x0132
            int r8 = r6.a
            int r8 = r5.get(r8, r7)
            int r9 = r6.b
            if (r8 == r9) goto L_0x0147
        L_0x0132:
            int r8 = r6.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r12.contains(r8)
            if (r8 != 0) goto L_0x0147
            int r6 = r6.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.add(r6)
        L_0x0147:
            int r4 = r4 + 1
            goto L_0x011e
        L_0x014a:
            java.lang.String r12 = ","
            ium r12 = defpackage.ium.a((java.lang.String) r12)
            r12.a((java.lang.Iterable) r0)
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L_0x0187
            java.lang.String r12 = r2.name
            int[] r0 = defpackage.jhx.a((java.util.Collection) r0)
            defpackage.itg.a((android.content.Context) r11, (java.lang.String) r12, (int[]) r0)
            return
        L_0x0164:
            r5 = r6
            goto L_0x0167
        L_0x0166:
            r12 = move-exception
        L_0x0167:
            if (r5 == 0) goto L_0x016c
            r5.c()
        L_0x016c:
            throw r12
        L_0x016d:
            r12 = move-exception
            jjg r1 = defpackage.adbd.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r12)
            r12 = 41
            anie r12 = r1.a((java.lang.String) r0, (java.lang.String) r4, (int) r12, (java.lang.String) r3)
            anih r12 = (defpackage.anih) r12
            java.lang.String r0 = "Couldn't parse context"
            r12.a((java.lang.String) r0)
            return
        L_0x0187:
            return
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
