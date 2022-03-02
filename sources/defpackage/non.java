package defpackage;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: non  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class non extends npc {
    private static final long a = TimeUnit.SECONDS.toMillis(300);
    private RequestQueue c = null;

    private final nqa a(npz npz) {
        RequestFuture newFuture = RequestFuture.newFuture();
        izs izs = new izs(1, axja.a.a().d(), npz.k(), nqa.d, newFuture, newFuture, (String) null, (String) null, false, new HashMap(), 12288, -1);
        if (this.c == null) {
            this.c = ihs.b().getRequestQueue();
        }
        this.c.add(izs);
        try {
            return (nqa) newFuture.get(a, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            new Object[1][0] = e.toString();
            return null;
        }
    }

    private static final boolean a(nqa nqa) {
        return nqa != null && !nqa.c.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.content.Context r12, defpackage.nqf r13) {
        /*
            r11 = this;
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            npz r1 = defpackage.npz.d
            aucd r1 = r1.o()
            int r2 = r13.a
            r3 = 2
            r2 = r2 & r3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x002a
            auay r13 = r13.c
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r1.c()
            r1.c = r5
        L_0x001c:
            aucj r2 = r1.b
            npz r2 = (defpackage.npz) r2
            r13.getClass()
            int r6 = r2.a
            r6 = r6 | r4
            r2.a = r6
            r2.b = r13
        L_0x002a:
            nom r13 = new nom
            r13.<init>()
            aucj r2 = r1.b
            npz r2 = (defpackage.npz) r2
            int r6 = r2.a
            r6 = r6 & r4
            r7 = 4
            r8 = 0
            if (r6 == 0) goto L_0x00d2
            auay r2 = r2.b
            byte[] r2 = r2.k()
            java.lang.String r6 = "SHA-256"
            java.security.MessageDigest r6 = defpackage.jhg.b((java.lang.String) r6)
            if (r6 == 0) goto L_0x005b
            byte[] r2 = r6.digest(r2)
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r9 = "AdAttestationContentBinding"
            r6.put(r9, r2)
            goto L_0x005c
        L_0x005b:
            r6 = r8
        L_0x005c:
            if (r6 != 0) goto L_0x0064
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            r1 = r8
            r2 = r1
            goto L_0x00d6
        L_0x0064:
            java.lang.String r2 = "ad_attest"
            java.lang.String r2 = defpackage.lxz.a((android.content.Context) r12, (java.lang.String) r2, (java.util.Map) r6)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0077
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            r1 = r8
            r2 = r1
            goto L_0x00d6
        L_0x0077:
            boolean r6 = r1.c
            if (r6 != 0) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            r1.c()
            r1.c = r5
        L_0x0081:
            aucj r6 = r1.b
            npz r6 = (defpackage.npz) r6
            r2.getClass()
            int r9 = r6.a
            r9 = r9 | r3
            r6.a = r9
            r6.c = r2
            aucj r1 = r1.i()
            npz r1 = (defpackage.npz) r1
            r2 = 0
        L_0x0096:
            r6 = 5
            if (r2 >= r6) goto L_0x00b9
            nqa r6 = r11.a((defpackage.npz) r1)
            boolean r9 = a((defpackage.nqa) r6)
            if (r9 == 0) goto L_0x00a4
            goto L_0x00ba
        L_0x00a4:
            if (r6 == 0) goto L_0x00b8
            boolean r9 = r6.a
            if (r9 != 0) goto L_0x00ab
            goto L_0x00ba
        L_0x00ab:
            if (r2 < r7) goto L_0x00ae
            goto L_0x00b5
        L_0x00ae:
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r9)     // Catch:{ InterruptedException -> 0x00b4 }
            goto L_0x00b5
        L_0x00b4:
            r6 = move-exception
        L_0x00b5:
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00b8:
            goto L_0x00ba
        L_0x00b9:
            r6 = r8
        L_0x00ba:
            boolean r1 = a((defpackage.nqa) r6)
            if (r1 == 0) goto L_0x00c9
            auay r1 = r6.c
            byte[] r1 = r1.k()
            java.lang.String r2 = r6.b
            goto L_0x00d6
        L_0x00c9:
            byte[] r0 = defpackage.augg.a
            r13.c = r0
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            r1 = r8
            r2 = r1
            goto L_0x00d6
        L_0x00d2:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            r1 = r8
            r2 = r1
        L_0x00d6:
            r13.a = r0
            r13.c = r1
            r13.b = r2
            nqb r0 = defpackage.nqb.f
            aucd r0 = r0.o()
            java.lang.Long r1 = defpackage.nol.a()
            long r1 = r1.longValue()
            boolean r6 = r0.c
            if (r6 == 0) goto L_0x00f3
            r0.c()
            r0.c = r5
        L_0x00f3:
            aucj r6 = r0.b
            nqb r6 = (defpackage.nqb) r6
            int r9 = r6.a
            r9 = r9 | r4
            r6.a = r9
            r6.b = r1
            r6.c = r3
            r1 = r9 | 2
            r6.a = r1
            com.google.android.gms.common.api.Status r1 = r13.a
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0132
            byte[] r13 = new byte[r4]
            r1 = 122(0x7a, float:1.71E-43)
            r13[r5] = r1
            auay r13 = defpackage.auay.a((byte[]) r13)
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x011d
            goto L_0x0122
        L_0x011d:
            r0.c()
            r0.c = r5
        L_0x0122:
            aucj r1 = r0.b
            nqb r1 = (defpackage.nqb) r1
            r13.getClass()
            int r2 = r1.a
            r2 = r2 | 8
            r1.a = r2
            r1.e = r13
            goto L_0x0171
        L_0x0132:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r0.c()
            r0.c = r5
        L_0x013c:
            aucj r1 = r0.b
            nqb r1 = (defpackage.nqb) r1
            r1.c = r4
            int r2 = r1.a
            r2 = r2 | r3
            r1.a = r2
            byte[] r1 = r13.c
            auay r1 = defpackage.auay.a((byte[]) r1)
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0152
            goto L_0x0157
        L_0x0152:
            r0.c()
            r0.c = r5
        L_0x0157:
            aucj r2 = r0.b
            nqb r2 = (defpackage.nqb) r2
            r1.getClass()
            int r3 = r2.a
            r3 = r3 | 8
            r2.a = r3
            r2.e = r1
            java.lang.String r13 = r13.b
            r13.getClass()
            r1 = r3 | 4
            r2.a = r1
            r2.d = r13
        L_0x0171:
            aucj r13 = r0.i()
            nqb r13 = (defpackage.nqb) r13
            nog r8 = defpackage.nog.a(r12)     // Catch:{ all -> 0x018a }
            nnq r12 = r8.b     // Catch:{ noh -> 0x0183, all -> 0x0181 }
            r12.a((defpackage.nqb) r13)     // Catch:{ noh -> 0x0183, all -> 0x0181 }
            goto L_0x0184
        L_0x0181:
            r12 = move-exception
            goto L_0x018b
        L_0x0183:
            r12 = move-exception
        L_0x0184:
            if (r8 == 0) goto L_0x0189
            r8.a()
        L_0x0189:
            return r5
        L_0x018a:
            r12 = move-exception
        L_0x018b:
            if (r8 == 0) goto L_0x0190
            r8.a()
        L_0x0190:
            goto L_0x0192
        L_0x0191:
            throw r12
        L_0x0192:
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.non.a(android.content.Context, nqf):int");
    }
}
