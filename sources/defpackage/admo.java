package defpackage;

import android.content.Context;

/* renamed from: admo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admo extends adlq {
    private static final iwd e = adnt.e("PreDownloadValidateAction");
    private static final adra f = new adra("payload_metadata_downloaded", false);
    private static final adrg g = new adrg("network_error_attempts", 0);
    private final Context h;
    private final adla i = ((adla) adla.h.b());

    public admo(Context context, adre adre) {
        super("pre-download-validate", adre);
        this.h = context;
    }

    private static adll e() {
        if (!ayox.i() || amrk.a((String) adke.i.a())) {
            return new adll("non-streaming-download", adre.a(new adrc[0]));
        }
        return new adll("streaming-download", adre.a(new adrc[0]));
    }

    private static adll f() {
        return new adll("finished-execution", adre.a(new adrc[0]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0169 A[Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0210 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.adll c() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "Failed to download."
            java.lang.String r3 = "pre-download-validate"
            ayox r0 = defpackage.ayox.a
            ayoy r0 = r0.a()
            boolean r0 = r0.j()
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r6 = 0
            if (r0 != 0) goto L_0x001e
            adll r0 = e()
            amri r0 = defpackage.amri.b(r0)
            goto L_0x003c
        L_0x001e:
            adla r0 = r1.i
            com.google.android.gms.update.SystemUpdateStatus r0 = r0.d()
            java.lang.String r0 = r0.a
            boolean r0 = defpackage.amrk.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x003a
            adla r0 = r1.i
            r0.a((int) r6, (double) r4)
            adll r0 = f()
            amri r0 = defpackage.amri.b(r0)
            goto L_0x003c
        L_0x003a:
            ampu r0 = defpackage.ampu.a
        L_0x003c:
            boolean r7 = r0.a()
            if (r7 == 0) goto L_0x0049
            java.lang.Object r0 = r0.b()
            adll r0 = (defpackage.adll) r0
            return r0
        L_0x0049:
            adla r0 = r1.i
            r7 = 23
            r0.a((int) r7, (double) r4)
            adra r0 = f
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r8 = 278(0x116, float:3.9E-43)
            r9 = 1
            boolean r0 = defpackage.adjw.a()     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            if (r0 == 0) goto L_0x00d9
            boolean r0 = defpackage.jkr.c()     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            if (r0 != 0) goto L_0x006d
            r0 = 1
            goto L_0x00da
        L_0x006d:
            if (r7 != 0) goto L_0x007f
            android.content.Context r0 = r1.h     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            adla r10 = r1.i     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            com.google.android.gms.update.SystemUpdateStatus r10 = r10.d()     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            java.lang.String r10 = r10.a     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            boolean r0 = defpackage.admz.a(r0, r10)     // Catch:{ adnw -> 0x01d9, adnx -> 0x01a0, adnv -> 0x017d }
            r7 = r0
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            if (r7 == 0) goto L_0x00d9
            ayox r0 = defpackage.ayox.a     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            ayoy r0 = r0.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            boolean r0 = r0.l()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            if (r0 == 0) goto L_0x00d9
            boolean r0 = defpackage.jkr.g()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            if (r0 == 0) goto L_0x00d9
            java.io.File r0 = new java.io.File     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.io.File r10 = defpackage.admy.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r10 = r10.getAbsolutePath()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r11 = "payload_metadata.bin"
            r0.<init>(r10, r11)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            defpackage.admy.a((java.io.File) r0)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adqz r10 = defpackage.adnq.b     // Catch:{ Exception -> 0x00cd }
            java.lang.Object r10 = r10.b()     // Catch:{ Exception -> 0x00cd }
            adnq r10 = (defpackage.adnq) r10     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00cd }
            iwd r11 = defpackage.adnq.a     // Catch:{ Exception -> 0x00cd }
            java.lang.String r12 = "verifyPayloadMetadata()"
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00cd }
            r11.c(r12, r13)     // Catch:{ Exception -> 0x00cd }
            android.os.UpdateEngine r10 = r10.d     // Catch:{ Exception -> 0x00cd }
            boolean r0 = r10.verifyPayloadMetadata(r0)     // Catch:{ Exception -> 0x00cd }
            if (r0 != 0) goto L_0x00cc
            iwd r10 = e     // Catch:{ Exception -> 0x00cd }
            java.lang.String r11 = "UpdateEngine.verifyPayloadMetadata() failed."
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00cd }
            r10.e(r11, r12)     // Catch:{ Exception -> 0x00cd }
        L_0x00cc:
            goto L_0x00da
        L_0x00cd:
            r0 = move-exception
            iwd r10 = e     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r11 = "UpdateEngine.verifyPayloadMetadata() exception."
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r10.e(r11, r0, r12)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r0 = 1
            goto L_0x00da
        L_0x00d9:
            r0 = 1
        L_0x00da:
            java.lang.String r10 = "metadata"
            amri r10 = defpackage.adnd.a(r10)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            boolean r11 = r10.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            if (r11 == 0) goto L_0x0169
            java.lang.Object r10 = r10.b()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adkc r10 = (defpackage.adkc) r10     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            android.content.Context r11 = r1.h     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r12 = r10.a     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r13 = ""
            boolean r14 = defpackage.adjx.c()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            admv r11 = defpackage.admv.a(r11, r12, r13, r14)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            amzt r12 = new amzt     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r12.<init>()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            android.content.Context r13 = r1.h     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            amzy r13 = defpackage.admx.a(r13)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r12.b((java.lang.Iterable) r13)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r13 = "X-Package-Validation-Info"
            adqx r14 = defpackage.adqx.c     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            aucd r14 = r14.o()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r0 = r0 ^ r9
            boolean r15 = r14.c     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            if (r15 != 0) goto L_0x0116
            goto L_0x011b
        L_0x0116:
            r14.c()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r14.c = r6     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
        L_0x011b:
            aucj r15 = r14.b     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adqx r15 = (defpackage.adqx) r15     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            int r4 = r15.a     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4 = r4 | r9
            r15.a = r4     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r15.b = r0     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            aucj r0 = r14.i()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adqx r0 = (defpackage.adqx) r0     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            byte[] r0 = r0.k()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r0 = defpackage.jhy.b((byte[]) r0)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            oq r0 = defpackage.oq.a(r13, r0)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r12.c(r0)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            amzy r0 = r12.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            android.content.Context r4 = r1.h     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adnu r4 = defpackage.adoc.a((android.content.Context) r4)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adla r5 = r1.i     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            com.google.android.gms.update.SystemUpdateStatus r5 = r5.d()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r5 = r5.a     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4.a = r5     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            admw r5 = defpackage.admw.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4.h = r5     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4.b = r11     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4.f = r0     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            long r11 = r10.b     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4.d = r11     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            long r10 = r10.c     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r4.e = r10     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            adoc r0 = r4.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r0.a()     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            goto L_0x0172
        L_0x0169:
            iwd r0 = e     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            java.lang.String r4 = "Unable to get package metadata from the G-service flags."
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
            r0.b(r4, r5)     // Catch:{ adnw -> 0x017b, adnx -> 0x0179, adnv -> 0x0177 }
        L_0x0172:
            adll r0 = e()
            return r0
        L_0x0177:
            r0 = move-exception
            goto L_0x017e
        L_0x0179:
            r0 = move-exception
            goto L_0x01a1
        L_0x017b:
            r0 = move-exception
            goto L_0x01da
        L_0x017d:
            r0 = move-exception
        L_0x017e:
            iwd r4 = e
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r4.e(r2, r0, r5)
            adll r0 = new adll
            adre r2 = r16.a()
            adrd r2 = r2.b()
            adra r4 = f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r2.a(r4, r5)
            adre r2 = r2.a()
            r0.<init>(r3, r2)
            return r0
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            iwd r2 = e
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = "Unable to create the file."
            r2.e(r5, r0, r4)
            adla r0 = r1.i
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.a((int) r8, (double) r4)
            admd r0 = defpackage.adme.f()
            long r4 = defpackage.ayou.c()
            r0.a(r4)
            adre r2 = r16.a()
            adrd r2 = r2.b()
            adra r4 = f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r2.a(r4, r5)
            adre r2 = r2.a()
            r0.a(r3, r2)
            adll r0 = r0.b()
            return r0
        L_0x01d9:
            r0 = move-exception
        L_0x01da:
            iwd r4 = e
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r4.e(r2, r0, r5)
            anaf r0 = r0.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01eb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0210
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "X-Package-Validation-Error-Details"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x01eb
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            amri r0 = defpackage.amri.b(r0)
            goto L_0x0212
        L_0x0210:
            ampu r0 = defpackage.ampu.a
        L_0x0212:
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x027f
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = defpackage.jhy.a((java.lang.String) r0)     // Catch:{ auda -> 0x0270 }
            adqu r2 = defpackage.adqu.b     // Catch:{ auda -> 0x0270 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r0)     // Catch:{ auda -> 0x0270 }
            adqu r0 = (defpackage.adqu) r0     // Catch:{ auda -> 0x0270 }
            iwd r2 = e     // Catch:{ auda -> 0x0270 }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ auda -> 0x0270 }
            int r4 = r0.a     // Catch:{ auda -> 0x0270 }
            int r4 = defpackage.adqt.a(r4)     // Catch:{ auda -> 0x0270 }
            if (r4 == 0) goto L_0x0237
            goto L_0x0238
        L_0x0237:
            r4 = 1
        L_0x0238:
            if (r4 == r9) goto L_0x023d
            java.lang.String r4 = "REJECT"
            goto L_0x023f
        L_0x023d:
            java.lang.String r4 = "UNKNOWN"
        L_0x023f:
            r3[r6] = r4     // Catch:{ auda -> 0x0270 }
            java.lang.String r4 = "Failed to validate package, with resolution=%s."
            r2.e(r4, r3)     // Catch:{ auda -> 0x0270 }
            int r0 = r0.a     // Catch:{ auda -> 0x0270 }
            int r0 = defpackage.adqt.a(r0)     // Catch:{ auda -> 0x0270 }
            if (r0 == 0) goto L_0x024f
            goto L_0x0250
        L_0x024f:
            r0 = 1
        L_0x0250:
            int r0 = r0 + -1
            if (r0 == r9) goto L_0x0262
            iwd r0 = e     // Catch:{ auda -> 0x0270 }
            java.lang.String r2 = "Unknown package validation resolution."
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ auda -> 0x0270 }
            r0.b(r2, r3)     // Catch:{ auda -> 0x0270 }
            adll r0 = e()     // Catch:{ auda -> 0x0270 }
            goto L_0x027e
        L_0x0262:
            adla r0 = r1.i     // Catch:{ auda -> 0x0270 }
            r2 = 22
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r0.a((int) r2, (double) r3)     // Catch:{ auda -> 0x0270 }
            adll r0 = f()     // Catch:{ auda -> 0x0270 }
            goto L_0x027e
        L_0x0270:
            r0 = move-exception
            iwd r2 = e
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = "Unable to parse the proto value for ErrorDetails proto."
            r2.e(r4, r0, r3)
            adll r0 = e()
        L_0x027e:
            return r0
        L_0x027f:
            adre r0 = r16.a()
            adrd r0 = r0.b()
            adra r2 = f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r0.a(r2, r4)
            adrg r2 = g
            java.lang.Object r4 = r1.a(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.a(r2, r4)
            adre r0 = r0.a()
            adla r2 = r1.i
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r2.a((int) r8, (double) r4)
            adma r2 = defpackage.admb.f()
            long r4 = defpackage.ayou.d()
            long r6 = defpackage.ayou.e()
            r2.a(r4, r6)
            double r4 = defpackage.ayou.f()
            r2.a((double) r4)
            adrg r4 = g
            java.lang.Object r4 = r1.a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.a((int) r4)
            r2.a(r3, r0)
            adll r0 = r2.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admo.c():adll");
    }
}
