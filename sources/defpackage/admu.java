package defpackage;

import android.content.Context;

/* renamed from: admu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admu extends adlq {
    public static final adro e = new adro("dir_path", "");
    private static final iwd f = adnt.e("StreamingProcessPackageAction");
    private final Context g;
    private final adrn h = ((adrn) adrn.a.b());
    private final adla i = ((adla) adla.h.b());

    protected admu(Context context, adre adre) {
        super("streaming-process-package", adre);
        this.g = context;
    }

    public static admu a(Context context, adre adre) {
        iva.a(adjw.a());
        iva.a(jkr.c());
        return new admu(context, adre);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0176, code lost:
        if (((java.lang.Boolean) android.os.RecoverySystem.class.getMethod("verifyPackageCompatibility", new java.lang.Class[]{java.io.File.class}).invoke((java.lang.Object) null, new java.lang.Object[]{r5})).booleanValue() == false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.adll c() {
        /*
            r14 = this;
            adla r0 = r14.i
            r1 = 3
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.a((int) r1, (double) r2)
            r0 = 274(0x112, float:3.84E-43)
            r1 = 1
            r4 = 0
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x01f4 }
            adro r6 = e     // Catch:{ IOException -> 0x01f4 }
            java.lang.Object r6 = r14.a(r6)     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r7 = "metadata"
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x01f4 }
            adqw r5 = defpackage.adkb.a((java.io.File) r5)     // Catch:{ IOException -> 0x01f4 }
            adrn r6 = r14.h     // Catch:{ IOException -> 0x01f4 }
            adrc[] r7 = new defpackage.adrc[r1]     // Catch:{ IOException -> 0x01f4 }
            adrj r8 = defpackage.adls.g     // Catch:{ IOException -> 0x01f4 }
            amri r5 = defpackage.amri.b(r5)     // Catch:{ IOException -> 0x01f4 }
            adrc r5 = r8.b(r5)     // Catch:{ IOException -> 0x01f4 }
            r7[r4] = r5     // Catch:{ IOException -> 0x01f4 }
            r6.a((defpackage.adrc[]) r7)     // Catch:{ IOException -> 0x01f4 }
            adjz r5 = defpackage.adke.i     // Catch:{ IOException -> 0x01f4 }
            java.lang.Object r5 = r5.a()     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r5 = defpackage.amrk.b(r5)     // Catch:{ IOException -> 0x01f4 }
            java.util.List r5 = defpackage.adkd.a(r5)     // Catch:{ IOException -> 0x01f4 }
            amrm r6 = defpackage.admt.a     // Catch:{ IOException -> 0x01f4 }
            amri r5 = defpackage.anbs.d(r5, r6)     // Catch:{ IOException -> 0x01f4 }
            boolean r6 = r5.a()     // Catch:{ IOException -> 0x01f4 }
            if (r6 == 0) goto L_0x01ec
            adla r6 = r14.i     // Catch:{ IOException -> 0x01f4 }
            com.google.android.gms.update.SystemUpdateStatus r6 = r6.d()     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r6 = r6.a     // Catch:{ IOException -> 0x01f4 }
            java.lang.Object r7 = r5.b()     // Catch:{ IOException -> 0x01f4 }
            adkc r7 = (defpackage.adkc) r7     // Catch:{ IOException -> 0x01f4 }
            long r7 = r7.b     // Catch:{ IOException -> 0x01f4 }
            java.lang.Object r5 = r5.b()     // Catch:{ IOException -> 0x01f4 }
            adkc r5 = (defpackage.adkc) r5     // Catch:{ IOException -> 0x01f4 }
            long r9 = r5.c     // Catch:{ IOException -> 0x01f4 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x01f4 }
            adro r11 = e     // Catch:{ IOException -> 0x01f4 }
            java.lang.Object r11 = r14.a(r11)     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r12 = "payload_properties.txt"
            r5.<init>(r11, r12)     // Catch:{ IOException -> 0x01f4 }
            defpackage.iva.c(r6)     // Catch:{ IOException -> 0x01f4 }
            boolean r11 = defpackage.jkr.c()     // Catch:{ IOException -> 0x01f4 }
            defpackage.iva.a((boolean) r11)     // Catch:{ IOException -> 0x01f4 }
            adqq r11 = defpackage.adqq.d     // Catch:{ IOException -> 0x01f4 }
            aucd r11 = r11.o()     // Catch:{ IOException -> 0x01f4 }
            boolean r12 = r11.c     // Catch:{ IOException -> 0x01f4 }
            if (r12 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r11.c()     // Catch:{ IOException -> 0x01f4 }
            r11.c = r4     // Catch:{ IOException -> 0x01f4 }
        L_0x008f:
            aucj r12 = r11.b     // Catch:{ IOException -> 0x01f4 }
            adqq r12 = (defpackage.adqq) r12     // Catch:{ IOException -> 0x01f4 }
            r6.getClass()     // Catch:{ IOException -> 0x01f4 }
            r12.a = r6     // Catch:{ IOException -> 0x01f4 }
            adqr r6 = defpackage.adqr.d     // Catch:{ IOException -> 0x01f4 }
            aucd r6 = r6.o()     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r12 = "payload.bin"
            boolean r13 = r6.c     // Catch:{ IOException -> 0x01f4 }
            if (r13 != 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            r6.c()     // Catch:{ IOException -> 0x01f4 }
            r6.c = r4     // Catch:{ IOException -> 0x01f4 }
        L_0x00aa:
            aucj r13 = r6.b     // Catch:{ IOException -> 0x01f4 }
            adqr r13 = (defpackage.adqr) r13     // Catch:{ IOException -> 0x01f4 }
            r12.getClass()     // Catch:{ IOException -> 0x01f4 }
            r13.a = r12     // Catch:{ IOException -> 0x01f4 }
            r13.b = r7     // Catch:{ IOException -> 0x01f4 }
            r13.c = r9     // Catch:{ IOException -> 0x01f4 }
            boolean r7 = r11.c     // Catch:{ IOException -> 0x01f4 }
            if (r7 != 0) goto L_0x00bc
            goto L_0x00c1
        L_0x00bc:
            r11.c()     // Catch:{ IOException -> 0x01f4 }
            r11.c = r4     // Catch:{ IOException -> 0x01f4 }
        L_0x00c1:
            aucj r7 = r11.b     // Catch:{ IOException -> 0x01f4 }
            adqq r7 = (defpackage.adqq) r7     // Catch:{ IOException -> 0x01f4 }
            aucj r6 = r6.i()     // Catch:{ IOException -> 0x01f4 }
            adqr r6 = (defpackage.adqr) r6     // Catch:{ IOException -> 0x01f4 }
            r6.getClass()     // Catch:{ IOException -> 0x01f4 }
            r7.c = r6     // Catch:{ IOException -> 0x01f4 }
            java.nio.charset.Charset r6 = defpackage.amqn.c     // Catch:{ IOException -> 0x01f4 }
            anms r5 = defpackage.anne.a((java.io.File) r5, (java.nio.charset.Charset) r6)     // Catch:{ IOException -> 0x01f4 }
            annb r6 = new annb     // Catch:{ IOException -> 0x01f4 }
            r6.<init>()     // Catch:{ IOException -> 0x01f4 }
            defpackage.amrl.a((java.lang.Object) r6)     // Catch:{ IOException -> 0x01f4 }
            anmx r7 = defpackage.anmx.a()     // Catch:{ IOException -> 0x01f4 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x01e1 }
            r9 = r5
            anmn r9 = (defpackage.anmn) r9     // Catch:{ all -> 0x01e1 }
            anmo r9 = r9.b     // Catch:{ all -> 0x01e1 }
            annd r9 = (defpackage.annd) r9     // Catch:{ all -> 0x01e1 }
            java.io.FileInputStream r9 = r9.b()     // Catch:{ all -> 0x01e1 }
            anmn r5 = (defpackage.anmn) r5     // Catch:{ all -> 0x01e1 }
            java.nio.charset.Charset r5 = r5.a     // Catch:{ all -> 0x01e1 }
            r8.<init>(r9, r5)     // Catch:{ all -> 0x01e1 }
            r7.a((java.io.Closeable) r8)     // Catch:{ all -> 0x01e1 }
            defpackage.amrl.a((java.lang.Object) r8)     // Catch:{ all -> 0x01e1 }
            defpackage.amrl.a((java.lang.Object) r6)     // Catch:{ all -> 0x01e1 }
            anng r5 = new anng     // Catch:{ all -> 0x01e1 }
            r5.<init>(r8)     // Catch:{ all -> 0x01e1 }
        L_0x0104:
            java.lang.String r8 = r5.a()     // Catch:{ all -> 0x01e1 }
            if (r8 == 0) goto L_0x0110
            java.util.List r9 = r6.a     // Catch:{ all -> 0x01e1 }
            r9.add(r8)     // Catch:{ all -> 0x01e1 }
            goto L_0x0104
        L_0x0110:
            java.util.List r5 = r6.a     // Catch:{ all -> 0x01e1 }
            r7.close()     // Catch:{ IOException -> 0x01f4 }
            r11.ah(r5)     // Catch:{ IOException -> 0x01f4 }
            aucj r5 = r11.i()     // Catch:{ IOException -> 0x01f4 }
            adqq r5 = (defpackage.adqq) r5     // Catch:{ IOException -> 0x01f4 }
            adrn r6 = r14.h     // Catch:{ IOException -> 0x01f4 }
            adrc[] r7 = new defpackage.adrc[r1]     // Catch:{ IOException -> 0x01f4 }
            adrj r8 = defpackage.adls.h     // Catch:{ IOException -> 0x01f4 }
            amri r5 = defpackage.amri.b(r5)     // Catch:{ IOException -> 0x01f4 }
            adrc r5 = r8.b(r5)     // Catch:{ IOException -> 0x01f4 }
            r7[r4] = r5     // Catch:{ IOException -> 0x01f4 }
            r6.a((defpackage.adrc[]) r7)     // Catch:{ IOException -> 0x01f4 }
            boolean r5 = defpackage.jkr.e()
            if (r5 == 0) goto L_0x01a5
            ayox r5 = defpackage.ayox.a
            ayoy r5 = r5.a()
            boolean r5 = r5.H()
            if (r5 == 0) goto L_0x01a5
            java.io.File r5 = new java.io.File
            adro r6 = e
            java.lang.Object r6 = r14.a(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "compatibility.zip"
            r5.<init>(r6, r7)
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x0159
            goto L_0x01a5
        L_0x0159:
            java.lang.Class<android.os.RecoverySystem> r6 = android.os.RecoverySystem.class
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            java.lang.Class<java.io.File> r8 = java.io.File.class
            r7[r4] = r8     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            java.lang.String r8 = "verifyPackageCompatibility"
            java.lang.reflect.Method r6 = r6.getMethod(r8, r7)     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            r1[r4] = r5     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            r5 = 0
            java.lang.Object r1 = r6.invoke(r5, r1)     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            boolean r1 = r1.booleanValue()     // Catch:{ NoSuchMethodException -> 0x017f, IllegalArgumentException -> 0x017d, IllegalAccessException -> 0x017b, InvocationTargetException -> 0x0179 }
            if (r1 != 0) goto L_0x01a5
            goto L_0x0189
        L_0x0179:
            r1 = move-exception
            goto L_0x0180
        L_0x017b:
            r1 = move-exception
            goto L_0x0180
        L_0x017d:
            r1 = move-exception
            goto L_0x0180
        L_0x017f:
            r1 = move-exception
        L_0x0180:
            iwd r5 = f
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = "Failed to call RecoverySystem.verifyPackageCompatibility()."
            r5.e(r7, r1, r6)
        L_0x0189:
            iwd r1 = f
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Failed to verify package compatibility."
            r1.e(r6, r5)
            adla r1 = r14.i
            r1.a((int) r0, (double) r2)
            adll r0 = new adll
            adrc[] r1 = new defpackage.adrc[r4]
            adre r1 = defpackage.adre.a((defpackage.adrc[]) r1)
            java.lang.String r2 = "finished-execution"
            r0.<init>(r2, r1)
            return r0
        L_0x01a5:
            java.io.File r0 = new java.io.File
            adro r1 = e
            java.lang.Object r1 = r14.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto L_0x01b9
            goto L_0x01c4
        L_0x01b9:
            int r1 = r0.length
        L_0x01ba:
            if (r4 >= r1) goto L_0x01c4
            r2 = r0[r4]
            defpackage.admy.a((java.io.File) r2)
            int r4 = r4 + 1
            goto L_0x01ba
        L_0x01c4:
            adll r0 = new adll
            adrd r1 = defpackage.adre.a()
            adro r2 = defpackage.admr.e
            adro r3 = e
            java.lang.Object r3 = r14.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            r1.a(r2, r3)
            adre r1 = r1.a()
            java.lang.String r2 = "streaming-apply"
            r0.<init>(r2, r1)
            return r0
        L_0x01e1:
            r5 = move-exception
            java.lang.RuntimeException r5 = r7.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x01e7 }
            throw r5     // Catch:{ all -> 0x01e7 }
        L_0x01e7:
            r5 = move-exception
            r7.close()     // Catch:{ IOException -> 0x01f4 }
            throw r5     // Catch:{ IOException -> 0x01f4 }
        L_0x01ec:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r6 = "Failed to find payload.bin entry."
            r5.<init>(r6)     // Catch:{ IOException -> 0x01f4 }
            throw r5     // Catch:{ IOException -> 0x01f4 }
        L_0x01f4:
            r5 = move-exception
            iwd r6 = f
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = "Failed to parse package files."
            r6.e(r7, r5, r4)
            adla r4 = r14.i
            r4.a((int) r0, (double) r2)
            android.content.Context r0 = r14.g
            adll r0 = defpackage.admq.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admu.c():adll");
    }
}
