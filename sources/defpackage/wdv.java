package defpackage;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: wdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wdv implements Runnable {
    private final wgu a;
    private final ShareTarget b;
    private final vtx c;
    private final String d;

    public wdv(wgu wgu, ShareTarget shareTarget, vtx vtx, String str) {
        this.a = wgu;
        this.b = shareTarget;
        this.c = vtx;
        this.d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0278  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            wgu r0 = r1.a
            com.google.android.gms.nearby.sharing.ShareTarget r2 = r1.b
            vtx r3 = r1.c
            java.lang.String r4 = r1.d
            int r5 = defpackage.vva.a()
            long r5 = (long) r5
            r0.t = r5
            java.util.concurrent.ConcurrentMap r5 = r0.l
            r5.clear()
            vtx r5 = r0.a((com.google.android.gms.nearby.sharing.ShareTarget) r2, (defpackage.vtx) r3)
            vtv r6 = new vtv
            r7 = 1
            r6.<init>(r7)
            com.google.android.gms.nearby.sharing.TransferMetadata r6 = r6.a()
            r5.a(r2, r6)
            tjc[] r6 = r0.q(r2)
            int r6 = r6.length
            java.lang.String r8 = "a"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r10 = "wgu"
            java.lang.String r11 = "w"
            if (r6 > 0) goto L_0x0215
            tjc[] r6 = r0.p(r2)
            int r6 = r6.length
            if (r6 > 0) goto L_0x0211
            tjc[] r6 = r0.r(r2)
            int r6 = r6.length
            if (r6 <= 0) goto L_0x0049
            r14 = r4
            r17 = r5
            goto L_0x0218
        L_0x0049:
            java.util.List r6 = r2.g     // Catch:{ IOException -> 0x01e9 }
            int r12 = r6.size()     // Catch:{ IOException -> 0x01e9 }
            tjc[] r13 = new defpackage.tjc[r12]     // Catch:{ IOException -> 0x01e9 }
            r15 = 0
        L_0x0052:
            int r7 = r6.size()     // Catch:{ IOException -> 0x01e9 }
            if (r15 < r7) goto L_0x01b3
            jjg r6 = defpackage.vvj.a     // Catch:{ IOException -> 0x01e9 }
            anie r6 = r6.d()     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            r7 = 2020(0x7e4, float:2.83E-42)
            anie r6 = r6.a((java.lang.String) r10, (java.lang.String) r8, (int) r7, (java.lang.String) r9)     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "Created file payloads of length %d"
            r6.a((java.lang.String) r7, (int) r12)     // Catch:{ IOException -> 0x01e9 }
            wgm r6 = r0.l(r2)     // Catch:{ IOException -> 0x01e9 }
            r6.i = r13     // Catch:{ IOException -> 0x01e9 }
            java.util.List r6 = r2.f     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "b"
            int r12 = r6.size()     // Catch:{ IOException -> 0x01e9 }
            tjc[] r13 = new defpackage.tjc[r12]     // Catch:{ IOException -> 0x01e9 }
            r15 = 0
        L_0x007e:
            int r14 = r6.size()     // Catch:{ IOException -> 0x01e9 }
            if (r15 < r14) goto L_0x018b
            jjg r6 = defpackage.vvj.a     // Catch:{ IOException -> 0x01e9 }
            anie r6 = r6.d()     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            r14 = 2032(0x7f0, float:2.847E-42)
            anie r6 = r6.a((java.lang.String) r10, (java.lang.String) r7, (int) r14, (java.lang.String) r9)     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "Created text payloads of length %d"
            r6.a((java.lang.String) r7, (int) r12)     // Catch:{ IOException -> 0x01e9 }
            wgm r6 = r0.l(r2)     // Catch:{ IOException -> 0x01e9 }
            r6.h = r13     // Catch:{ IOException -> 0x01e9 }
            java.util.List r6 = r2.h     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "c"
            int r12 = r6.size()     // Catch:{ IOException -> 0x01e9 }
            tjc[] r13 = new defpackage.tjc[r12]     // Catch:{ IOException -> 0x01e9 }
            r14 = 0
        L_0x00aa:
            int r15 = r6.size()     // Catch:{ IOException -> 0x01e9 }
            if (r14 < r15) goto L_0x0116
            jjg r6 = defpackage.vvj.a     // Catch:{ IOException -> 0x01e9 }
            anie r6 = r6.d()     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            r14 = 2055(0x807, float:2.88E-42)
            anie r6 = r6.a((java.lang.String) r10, (java.lang.String) r7, (int) r14, (java.lang.String) r9)     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "Created wifi payloads of length %d"
            r6.a((java.lang.String) r7, (int) r12)     // Catch:{ IOException -> 0x01e9 }
            wgm r6 = r0.l(r2)     // Catch:{ IOException -> 0x01e9 }
            r6.j = r13     // Catch:{ IOException -> 0x01e9 }
            tjc[] r6 = r0.q(r2)     // Catch:{ IOException -> 0x01e9 }
            int r6 = r6.length     // Catch:{ IOException -> 0x01e9 }
            if (r6 <= 0) goto L_0x00d3
            goto L_0x00f8
        L_0x00d3:
            tjc[] r6 = r0.p(r2)     // Catch:{ IOException -> 0x01e9 }
            int r6 = r6.length     // Catch:{ IOException -> 0x01e9 }
            if (r6 > 0) goto L_0x00f8
            tjc[] r6 = r0.r(r2)     // Catch:{ IOException -> 0x01e9 }
            int r6 = r6.length     // Catch:{ IOException -> 0x01e9 }
            if (r6 > 0) goto L_0x00f8
            jjg r0 = defpackage.vvj.a     // Catch:{ IOException -> 0x01e9 }
            anie r0 = r0.d()     // Catch:{ IOException -> 0x01e9 }
            anih r0 = (defpackage.anih) r0     // Catch:{ IOException -> 0x01e9 }
            r4 = 1998(0x7ce, float:2.8E-42)
            anie r0 = r0.a((java.lang.String) r10, (java.lang.String) r11, (int) r4, (java.lang.String) r9)     // Catch:{ IOException -> 0x01e9 }
            anih r0 = (defpackage.anih) r0     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r4 = "Failed to create any payloads for ShareTarget %s."
            r0.a((java.lang.String) r4, (java.lang.Object) r2)     // Catch:{ IOException -> 0x01e9 }
            goto L_0x0202
        L_0x00f8:
            jjg r6 = defpackage.vvj.a     // Catch:{ IOException -> 0x01e9 }
            anie r6 = r6.d()     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            r7 = 1995(0x7cb, float:2.796E-42)
            anie r6 = r6.a((java.lang.String) r10, (java.lang.String) r11, (int) r7, (java.lang.String) r9)     // Catch:{ IOException -> 0x01e9 }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "Created %s payloads for ShareTarget %s."
            java.util.List r12 = r2.b()     // Catch:{ IOException -> 0x01e9 }
            r6.a((java.lang.String) r7, (java.lang.Object) r12, (java.lang.Object) r2)     // Catch:{ IOException -> 0x01e9 }
            r14 = r4
            r17 = r5
            goto L_0x022d
        L_0x0116:
            java.lang.Object r15 = r6.get(r14)     // Catch:{ IOException -> 0x01e9 }
            com.google.android.gms.nearby.sharing.WifiCredentialsAttachment r15 = (com.google.android.gms.nearby.sharing.WifiCredentialsAttachment) r15     // Catch:{ IOException -> 0x01e9 }
            vnx r17 = defpackage.vnx.d     // Catch:{ IOException -> 0x01e9 }
            aucd r1 = r17.o()     // Catch:{ IOException -> 0x01e9 }
            r17 = r6
            java.lang.String r6 = r15.d     // Catch:{ IOException -> 0x01e9 }
            if (r6 == 0) goto L_0x014a
            r18 = r7
            boolean r7 = r1.c     // Catch:{ IOException -> 0x01e9 }
            if (r7 != 0) goto L_0x012f
        L_0x012e:
            goto L_0x0136
        L_0x012f:
            r1.c()     // Catch:{ IOException -> 0x01e9 }
            r7 = 0
            r1.c = r7     // Catch:{ IOException -> 0x01e9 }
            goto L_0x012e
        L_0x0136:
            aucj r7 = r1.b     // Catch:{ IOException -> 0x01e9 }
            vnx r7 = (defpackage.vnx) r7     // Catch:{ IOException -> 0x01e9 }
            r6.getClass()     // Catch:{ IOException -> 0x01e9 }
            r19 = r12
            int r12 = r7.a     // Catch:{ IOException -> 0x01e9 }
            r16 = 1
            r12 = r12 | 1
            r7.a = r12     // Catch:{ IOException -> 0x01e9 }
            r7.b = r6     // Catch:{ IOException -> 0x01e9 }
            goto L_0x0150
        L_0x014a:
            r18 = r7
            r19 = r12
            r16 = 1
        L_0x0150:
            boolean r6 = r15.e     // Catch:{ IOException -> 0x01e9 }
            boolean r7 = r1.c     // Catch:{ IOException -> 0x01e9 }
            if (r7 != 0) goto L_0x0158
            r7 = 0
            goto L_0x015e
        L_0x0158:
            r1.c()     // Catch:{ IOException -> 0x01e9 }
            r7 = 0
            r1.c = r7     // Catch:{ IOException -> 0x01e9 }
        L_0x015e:
            aucj r12 = r1.b     // Catch:{ IOException -> 0x01e9 }
            vnx r12 = (defpackage.vnx) r12     // Catch:{ IOException -> 0x01e9 }
            int r7 = r12.a     // Catch:{ IOException -> 0x01e9 }
            r7 = r7 | 2
            r12.a = r7     // Catch:{ IOException -> 0x01e9 }
            r12.c = r6     // Catch:{ IOException -> 0x01e9 }
            aucj r1 = r1.i()     // Catch:{ IOException -> 0x01e9 }
            vnx r1 = (defpackage.vnx) r1     // Catch:{ IOException -> 0x01e9 }
            byte[] r1 = r1.k()     // Catch:{ IOException -> 0x01e9 }
            tjc r1 = defpackage.tjc.a((byte[]) r1)     // Catch:{ IOException -> 0x01e9 }
            r13[r14] = r1     // Catch:{ IOException -> 0x01e9 }
            long r6 = r1.a     // Catch:{ IOException -> 0x01e9 }
            r0.a((com.google.android.gms.nearby.sharing.Attachment) r15, (long) r6)     // Catch:{ IOException -> 0x01e9 }
            int r14 = r14 + 1
            r1 = r20
            r6 = r17
            r7 = r18
            r12 = r19
            goto L_0x00aa
        L_0x018b:
            r1 = 0
            r16 = 1
            java.lang.Object r14 = r6.get(r15)     // Catch:{ IOException -> 0x01e9 }
            com.google.android.gms.nearby.sharing.TextAttachment r14 = (com.google.android.gms.nearby.sharing.TextAttachment) r14     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r1 = r14.a     // Catch:{ IOException -> 0x01e9 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException -> 0x01e9 }
            tjc r1 = defpackage.tjc.a((byte[]) r1)     // Catch:{ IOException -> 0x01e9 }
            r13[r15] = r1     // Catch:{ IOException -> 0x01e9 }
            r17 = r6
            r18 = r7
            long r6 = r1.a     // Catch:{ IOException -> 0x01e9 }
            r0.a((com.google.android.gms.nearby.sharing.Attachment) r14, (long) r6)     // Catch:{ IOException -> 0x01e9 }
            int r15 = r15 + 1
            r1 = r20
            r6 = r17
            r7 = r18
            goto L_0x007e
        L_0x01b3:
            r16 = 1
            java.lang.Object r1 = r6.get(r15)     // Catch:{ IOException -> 0x01e9 }
            com.google.android.gms.nearby.sharing.FileAttachment r1 = (com.google.android.gms.nearby.sharing.FileAttachment) r1     // Catch:{ IOException -> 0x01e9 }
            android.net.Uri r7 = r1.d     // Catch:{ IOException -> 0x01e9 }
            if (r7 != 0) goto L_0x01c3
            r14 = r4
            r17 = r5
            goto L_0x01df
        L_0x01c3:
            android.content.Context r14 = r0.f     // Catch:{ IOException -> 0x01e9 }
            android.os.ParcelFileDescriptor r7 = defpackage.whw.a((android.content.Context) r14, (android.net.Uri) r7)     // Catch:{ IOException -> 0x01e9 }
            tja r7 = defpackage.tja.a(r7)     // Catch:{ IOException -> 0x01e9 }
            r14 = r4
            r17 = r5
            long r4 = defpackage.tjc.a()     // Catch:{ IOException -> 0x01e9 }
            tjc r4 = defpackage.tjc.a((defpackage.tja) r7, (long) r4)     // Catch:{ IOException -> 0x01e9 }
            r13[r15] = r4     // Catch:{ IOException -> 0x01e9 }
            long r4 = r4.a     // Catch:{ IOException -> 0x01e9 }
            r0.a((com.google.android.gms.nearby.sharing.Attachment) r1, (long) r4)     // Catch:{ IOException -> 0x01e9 }
        L_0x01df:
            int r15 = r15 + 1
            r1 = r20
            r4 = r14
            r5 = r17
            r7 = 1
            goto L_0x0052
        L_0x01e9:
            r0 = move-exception
            jjg r1 = defpackage.vvj.a
            anie r1 = r1.c()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r0)
            r0 = 2002(0x7d2, float:2.805E-42)
            anie r0 = r1.a((java.lang.String) r10, (java.lang.String) r11, (int) r0, (java.lang.String) r9)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Failed to create file payloads for the given attachments. Disconnecting."
            r0.a((java.lang.String) r1)
        L_0x0202:
            vtv r0 = new vtv
            r1 = 11
            r0.<init>(r1)
            com.google.android.gms.nearby.sharing.TransferMetadata r0 = r0.a()
            r3.a(r2, r0)
            return
        L_0x0211:
            r14 = r4
            r17 = r5
            goto L_0x0218
        L_0x0215:
            r14 = r4
            r17 = r5
        L_0x0218:
            jjg r1 = defpackage.vvj.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            r3 = 1979(0x7bb, float:2.773E-42)
            anie r1 = r1.a((java.lang.String) r10, (java.lang.String) r11, (int) r3, (java.lang.String) r9)
            anih r1 = (defpackage.anih) r1
            java.lang.String r3 = "Skipping payload creation for ShareTarget %s. Payloads already created."
            r1.a((java.lang.String) r3, (java.lang.Object) r2)
        L_0x022d:
            boolean r1 = r2.k
            if (r1 == 0) goto L_0x0257
            wcu r1 = r0.q
            boolean r1 = r1.b((com.google.android.gms.nearby.sharing.ShareTarget) r2)
            if (r1 != 0) goto L_0x023c
            r1 = r17
            goto L_0x0259
        L_0x023c:
            jjg r1 = defpackage.vvj.a
            anie r1 = r1.d()
            anih r1 = (defpackage.anih) r1
            r3 = 1425(0x591, float:1.997E-42)
            anie r1 = r1.a((java.lang.String) r10, (java.lang.String) r8, (int) r3, (java.lang.String) r9)
            anih r1 = (defpackage.anih) r1
            java.lang.String r3 = "%s is outdated, attempting to rescan and send."
            r1.a((java.lang.String) r3, (java.lang.Object) r2)
            r1 = r17
            r0.b(r14, r2, r1)
            return
        L_0x0257:
            r1 = r17
        L_0x0259:
            java.lang.String r3 = r0.m(r2)
            if (r3 != 0) goto L_0x0278
            jjg r3 = defpackage.vvj.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            r4 = 1428(0x594, float:2.001E-42)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r8, (int) r4, (java.lang.String) r9)
            anih r3 = (defpackage.anih) r3
            java.lang.String r4 = "%s is not discovered yet, attempting to rescan and send."
            r3.a((java.lang.String) r4, (java.lang.Object) r2)
            r0.b(r14, r2, r1)
            return
        L_0x0278:
            jjg r3 = defpackage.vvj.a
            anie r3 = r3.d()
            anih r3 = (defpackage.anih) r3
            r4 = 1432(0x598, float:2.007E-42)
            anie r3 = r3.a((java.lang.String) r10, (java.lang.String) r8, (int) r4, (java.lang.String) r9)
            anih r3 = (defpackage.anih) r3
            java.lang.String r4 = "%s is not outdated, attempting to send."
            r3.a((java.lang.String) r4, (java.lang.Object) r2)
            r0.c(r14, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdv.run():void");
    }
}
