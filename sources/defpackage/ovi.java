package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ovi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovi extends ppr {
    private final osf a;
    private final boolean b;
    private boolean c;
    private final Map d = new HashMap();

    public ovi(osf osf, boolean z, boolean z2) {
        super(aonk.SLURP_USAGE_REPORTS, 2);
        this.a = osf;
        this.b = z;
        this.c = z2;
    }

    private final pxh a(osz osz) {
        pao pao = new pao(osz.e, osz.c);
        pxh pxh = (pxh) this.d.get(pao);
        if (pxh != null) {
            return pxh;
        }
        pxh pxh2 = new pxh();
        this.d.put(pao, pxh2);
        return pxh2;
    }

    private final void a(Exception exc) {
        this.a.n().a("SlurpUsageReportsTask uploadUserActions", exc, axrp.f());
    }

    /* JADX WARNING: type inference failed for: r7v32, types: [aucj] */
    /* JADX WARNING: type inference failed for: r1v38, types: [aucj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0505, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0510, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        defpackage.apev.a(r2, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:242:0x04ee, B:257:0x050c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x051d A[SYNTHETIC, Splitter:B:268:0x051d] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r25 = this;
            r1 = r25
            osf r0 = r1.a
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r0.n
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "Failed to apply pending usage report deletions in slurp task. Continuing anyway."
            defpackage.oso.e(r0)
        L_0x0011:
            osf r0 = r1.a
            ozq r2 = r0.b()
            opv r3 = new opv
            r3.<init>()
            r9 = 0
            boolean r0 = defpackage.axsp.e()     // Catch:{ IOException -> 0x0529 }
            if (r0 == 0) goto L_0x004d
            osf r0 = r1.a     // Catch:{ psv -> 0x0045 }
            android.content.Context r10 = r0.b     // Catch:{ psv -> 0x0045 }
            ozb r11 = r0.m     // Catch:{ psv -> 0x0045 }
            pas r12 = r0.t     // Catch:{ psv -> 0x0045 }
            prp r13 = r0.g     // Catch:{ psv -> 0x0045 }
            ozs r14 = r0.a()     // Catch:{ psv -> 0x0045 }
            osf r15 = r1.a     // Catch:{ psv -> 0x0045 }
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r15.n     // Catch:{ psv -> 0x0045 }
            oyq r4 = r15.r     // Catch:{ psv -> 0x0045 }
            agtt r5 = r15.u     // Catch:{ psv -> 0x0045 }
            r16 = r0
            r17 = r4
            r18 = r5
            ptb r0 = defpackage.psw.a(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ psv -> 0x0045 }
            r4 = r0
            goto L_0x004e
        L_0x0045:
            r0 = move-exception
            java.lang.String r0 = "No valid account for uploading user actions"
            defpackage.oso.e(r0)     // Catch:{ IOException -> 0x0529 }
            r4 = 0
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            osf r0 = r1.a     // Catch:{ all -> 0x0516 }
            pxw r0 = r0.l     // Catch:{ all -> 0x0516 }
            pws r0 = r0.a()     // Catch:{ all -> 0x0516 }
            osf r5 = r1.a     // Catch:{ all -> 0x0516 }
            android.content.Context r10 = r5.b     // Catch:{ all -> 0x0516 }
            ozq r5 = r5.b()     // Catch:{ all -> 0x0516 }
            osf r11 = r1.a     // Catch:{ all -> 0x0516 }
            oyq r11 = r11.r     // Catch:{ all -> 0x0516 }
            pws r5 = defpackage.pwr.a(r10, r5, r11)     // Catch:{ all -> 0x0516 }
            pxj r10 = new pxj     // Catch:{ all -> 0x0516 }
            r10.<init>(r0, r5)     // Catch:{ all -> 0x0516 }
            boolean r0 = r1.b     // Catch:{ all -> 0x0507 }
            if (r0 != 0) goto L_0x04f8
        L_0x006f:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0507 }
            if (r0 == 0) goto L_0x04c6
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0507 }
            r5 = r0
            pxu r5 = (defpackage.pxu) r5     // Catch:{ all -> 0x0507 }
            boolean r0 = r5.a()     // Catch:{ all -> 0x0507 }
            if (r0 != 0) goto L_0x0099
            osz r0 = r5.b     // Catch:{ all -> 0x0507 }
            osf r11 = r1.a     // Catch:{ all -> 0x0507 }
            com.google.android.gms.icing.nativeindex.NativeIndex r11 = r11.n     // Catch:{ all -> 0x0507 }
            otw r12 = r5.a(r0)     // Catch:{ all -> 0x0507 }
            pxh r0 = r1.a((defpackage.osz) r0)     // Catch:{ all -> 0x0507 }
            defpackage.opw.a(r11, r12, r0, r3)     // Catch:{ all -> 0x0507 }
            r22 = r2
            r6 = r4
            r2 = r5
            goto L_0x0384
        L_0x0099:
            oqo r0 = r5.b()     // Catch:{ all -> 0x0507 }
            oqo r0 = defpackage.pwo.a((defpackage.oqo) r0)     // Catch:{ all -> 0x0507 }
            ozc r11 = r5.c     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            osf r14 = r1.a     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            ozb r14 = r14.m     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            oyz r14 = r14.a((defpackage.ozc) r11)     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            boolean r15 = r14.a((long) r12)     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            if (r15 == 0) goto L_0x00c6
            java.lang.String r15 = r11.f     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            osz r15 = defpackage.ozq.a((java.lang.String) r15, (defpackage.oqo) r0)     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            osf r7 = r1.a     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            ozv r12 = defpackage.ozv.a(r15, r12)     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            osz r7 = r7.a(r11, r14, r9, r12)     // Catch:{ pau -> 0x04b3, pax -> 0x04b1, SecurityException -> 0x04af }
            goto L_0x00c7
        L_0x00c6:
            r7 = 0
        L_0x00c7:
            pxh r11 = r1.a((defpackage.osz) r7)     // Catch:{ all -> 0x0507 }
            osf r12 = r1.a     // Catch:{ all -> 0x0507 }
            ozq r12 = r12.b()     // Catch:{ all -> 0x0507 }
            pao r13 = new pao     // Catch:{ all -> 0x0507 }
            java.lang.String r14 = r7.e     // Catch:{ all -> 0x0507 }
            java.lang.String r15 = r7.c     // Catch:{ all -> 0x0507 }
            r13.<init>(r14, r15)     // Catch:{ all -> 0x0507 }
            otg r14 = r12.f((defpackage.pao) r13)     // Catch:{ all -> 0x0507 }
            if (r14 != 0) goto L_0x00e7
            r22 = r2
            r6 = r4
            r21 = r5
            goto L_0x01cf
        L_0x00e7:
            boolean r18 = defpackage.ozq.f((defpackage.osz) r7)     // Catch:{ all -> 0x0507 }
            if (r18 == 0) goto L_0x01ca
            osf r15 = r1.a     // Catch:{ all -> 0x01c4 }
            com.google.android.gms.icing.nativeindex.NativeIndex r15 = r15.n     // Catch:{ all -> 0x01c4 }
            int r6 = r7.b     // Catch:{ all -> 0x01c4 }
            long r8 = r15.b     // Catch:{ all -> 0x01c4 }
            long r8 = com.google.android.gms.icing.nativeindex.NativeIndex.nativeGetCorpusDocumentsSize(r8, r6)     // Catch:{ all -> 0x01c4 }
            r19 = 0
            int r6 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r6 < 0) goto L_0x01be
            r6 = r4
            r21 = r5
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b9 }
            otd r15 = r14.f     // Catch:{ all -> 0x01b9 }
            if (r15 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            otd r15 = defpackage.otd.d     // Catch:{ all -> 0x01b9 }
        L_0x010d:
            r22 = r2
            long r1 = r15.b     // Catch:{ all -> 0x04aa }
            long r1 = r4 - r1
            agvx r15 = defpackage.ozx.B     // Catch:{ all -> 0x04aa }
            java.lang.Object r15 = r15.c()     // Catch:{ all -> 0x04aa }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x04aa }
            long r23 = r15.longValue()     // Catch:{ all -> 0x04aa }
            int r15 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r15 <= 0) goto L_0x0184
            otd r1 = defpackage.otd.d     // Catch:{ all -> 0x04aa }
            aucd r1 = r1.o()     // Catch:{ all -> 0x04aa }
            boolean r2 = r1.c     // Catch:{ all -> 0x04aa }
            if (r2 != 0) goto L_0x012e
            goto L_0x0134
        L_0x012e:
            r1.c()     // Catch:{ all -> 0x04aa }
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x04aa }
        L_0x0134:
            aucj r2 = r1.b     // Catch:{ all -> 0x04aa }
            otd r2 = (defpackage.otd) r2     // Catch:{ all -> 0x04aa }
            int r15 = r2.a     // Catch:{ all -> 0x04aa }
            r18 = 1
            r15 = r15 | 1
            r2.a = r15     // Catch:{ all -> 0x04aa }
            r2.b = r4     // Catch:{ all -> 0x04aa }
            r4 = r15 | 2
            r2.a = r4     // Catch:{ all -> 0x04aa }
            r2.c = r8     // Catch:{ all -> 0x04aa }
            aucj r1 = r1.i()     // Catch:{ all -> 0x04aa }
            otd r1 = (defpackage.otd) r1     // Catch:{ all -> 0x04aa }
            r2 = 5
            java.lang.Object r4 = r14.c(r2)     // Catch:{ all -> 0x04aa }
            aucd r4 = (defpackage.aucd) r4     // Catch:{ all -> 0x04aa }
            r4.a((defpackage.aucj) r14)     // Catch:{ all -> 0x04aa }
            boolean r2 = r4.c     // Catch:{ all -> 0x04aa }
            if (r2 != 0) goto L_0x015d
            goto L_0x0163
        L_0x015d:
            r4.c()     // Catch:{ all -> 0x04aa }
            r2 = 0
            r4.c = r2     // Catch:{ all -> 0x04aa }
        L_0x0163:
            aucj r2 = r4.b     // Catch:{ all -> 0x04aa }
            otg r2 = (defpackage.otg) r2     // Catch:{ all -> 0x04aa }
            r1.getClass()     // Catch:{ all -> 0x04aa }
            r2.f = r1     // Catch:{ all -> 0x04aa }
            int r1 = r2.a     // Catch:{ all -> 0x04aa }
            r1 = r1 | 32
            r2.a = r1     // Catch:{ all -> 0x04aa }
            aucj r1 = r4.i()     // Catch:{ all -> 0x04aa }
            r14 = r1
            otg r14 = (defpackage.otg) r14     // Catch:{ all -> 0x04aa }
            otd r1 = r14.f     // Catch:{ all -> 0x04aa }
            if (r1 != 0) goto L_0x017f
            otd r1 = defpackage.otd.d     // Catch:{ all -> 0x04aa }
        L_0x017f:
            r2 = 0
            r12.a((defpackage.pao) r13, (java.util.List) r2, (java.lang.Integer) r2, (defpackage.otd) r1)     // Catch:{ all -> 0x04aa }
            goto L_0x0185
        L_0x0184:
        L_0x0185:
            otd r1 = r14.f     // Catch:{ all -> 0x04aa }
            if (r1 == 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            otd r1 = defpackage.otd.d     // Catch:{ all -> 0x04aa }
        L_0x018c:
            long r1 = r1.c     // Catch:{ all -> 0x04aa }
            long r8 = r8 - r1
            agvx r1 = defpackage.ozx.C     // Catch:{ all -> 0x04aa }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x04aa }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x04aa }
            long r1 = r1.longValue()     // Catch:{ all -> 0x04aa }
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x01cf
            java.lang.String r0 = "Too many pushes from %s"
            java.lang.String r1 = r7.e     // Catch:{ all -> 0x04aa }
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x04aa }
            int r0 = r3.d     // Catch:{ all -> 0x04aa }
            r1 = 1
            int r0 = r0 + r1
            r3.d = r0     // Catch:{ all -> 0x04aa }
            java.lang.String r0 = "push index rejected rate limit"
            r11.a((java.lang.String) r0)     // Catch:{ all -> 0x04aa }
            r9 = 0
            r1 = r25
            r4 = r6
            r2 = r22
            goto L_0x006f
        L_0x01b9:
            r0 = move-exception
            r22 = r2
            goto L_0x04ab
        L_0x01be:
            r22 = r2
            r6 = r4
            r21 = r5
            goto L_0x01cf
        L_0x01c4:
            r0 = move-exception
            r22 = r2
            r6 = r4
            goto L_0x04ab
        L_0x01ca:
            r22 = r2
            r6 = r4
            r21 = r5
        L_0x01cf:
            r1 = 5
            java.lang.Object r2 = r0.c(r1)     // Catch:{ all -> 0x04aa }
            aucd r2 = (defpackage.aucd) r2     // Catch:{ all -> 0x04aa }
            r2.a((defpackage.aucj) r0)     // Catch:{ all -> 0x04aa }
            int r0 = r7.b     // Catch:{ all -> 0x04aa }
            boolean r1 = r2.c     // Catch:{ all -> 0x04aa }
            if (r1 != 0) goto L_0x01e1
            goto L_0x01e7
        L_0x01e1:
            r2.c()     // Catch:{ all -> 0x04aa }
            r1 = 0
            r2.c = r1     // Catch:{ all -> 0x04aa }
        L_0x01e7:
            aucj r1 = r2.b     // Catch:{ all -> 0x04aa }
            oqo r1 = (defpackage.oqo) r1     // Catch:{ all -> 0x04aa }
            oqo r4 = defpackage.oqo.g     // Catch:{ all -> 0x04aa }
            int r4 = r1.a     // Catch:{ all -> 0x04aa }
            r5 = 1
            r4 = r4 | r5
            r1.a = r4     // Catch:{ all -> 0x04aa }
            r1.b = r0     // Catch:{ all -> 0x04aa }
            aucj r0 = r2.i()     // Catch:{ all -> 0x04aa }
            oqo r0 = (defpackage.oqo) r0     // Catch:{ all -> 0x04aa }
            r1 = r25
            osf r2 = r1.a     // Catch:{ all -> 0x04dc }
            com.google.android.gms.icing.nativeindex.NativeIndex r2 = r2.n     // Catch:{ all -> 0x04dc }
            otr r4 = defpackage.ozy.a()     // Catch:{ all -> 0x04dc }
            r8 = 0
            aojr r0 = r2.a((long) r8, (defpackage.oqo) r0, (defpackage.otr) r4)     // Catch:{ all -> 0x04dc }
            int r2 = r3.c     // Catch:{ all -> 0x04dc }
            r4 = 1
            int r2 = r2 + r4
            r3.c = r2     // Catch:{ all -> 0x04dc }
            if (r0 != 0) goto L_0x0214
            goto L_0x0239
        L_0x0214:
            int r0 = r0.c     // Catch:{ all -> 0x04dc }
            aond r0 = defpackage.aond.a(r0)     // Catch:{ all -> 0x04dc }
            if (r0 != 0) goto L_0x021e
            aond r0 = defpackage.aond.OK     // Catch:{ all -> 0x04dc }
        L_0x021e:
            java.lang.String r0 = com.google.android.gms.icing.nativeindex.NativeIndex.a((defpackage.aond) r0)     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x0239
            java.lang.String r2 = "push index "
            int r4 = r0.length()     // Catch:{ all -> 0x04dc }
            if (r4 != 0) goto L_0x0232
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x04dc }
            r0.<init>(r2)     // Catch:{ all -> 0x04dc }
            goto L_0x0236
        L_0x0232:
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x04dc }
        L_0x0236:
            r11.a((java.lang.String) r0)     // Catch:{ all -> 0x04dc }
        L_0x0239:
            osf r0 = r1.a     // Catch:{ all -> 0x04dc }
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r0.n     // Catch:{ all -> 0x04dc }
            r2 = r21
            otw r4 = r2.a(r7)     // Catch:{ all -> 0x04dc }
            defpackage.opw.a(r0, r4, r11, r3)     // Catch:{ all -> 0x04dc }
            ovc r0 = r2.a     // Catch:{ all -> 0x04dc }
            int r0 = r0.h     // Catch:{ all -> 0x04dc }
            ovg r0 = defpackage.ovg.a(r0)     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x0251
            goto L_0x0253
        L_0x0251:
            ovg r0 = defpackage.ovg.GENERAL_USE     // Catch:{ all -> 0x04dc }
        L_0x0253:
            ovg r4 = defpackage.ovg.FIREBASE_USER_ACTIONS_USE     // Catch:{ all -> 0x04dc }
            if (r0 != r4) goto L_0x0384
            ozc r0 = r2.c     // Catch:{ all -> 0x04dc }
            osf r4 = r1.a     // Catch:{ all -> 0x04dc }
            android.content.Context r4 = r4.b     // Catch:{ all -> 0x04dc }
            java.lang.String r5 = r0.f     // Catch:{ all -> 0x04dc }
            ovw r4 = defpackage.ovw.a((android.content.Context) r4, (java.lang.String) r5)     // Catch:{ all -> 0x04dc }
            if (r4 != 0) goto L_0x0271
            java.lang.String r4 = "3P AppIndexing disabled for package %s"
            java.lang.String r0 = r0.f     // Catch:{ all -> 0x04dc }
            defpackage.oso.a((java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ all -> 0x04dc }
            amzy r0 = defpackage.amzy.h()     // Catch:{ all -> 0x04dc }
            goto L_0x02a7
        L_0x0271:
            osf r5 = r1.a     // Catch:{ all -> 0x04dc }
            android.content.Context r7 = r5.b     // Catch:{ all -> 0x04dc }
            oyb r7 = defpackage.oyb.a((android.content.Context) r7)     // Catch:{ all -> 0x04dc }
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch:{ all -> 0x04dc }
            java.lang.String r8 = r0.f     // Catch:{ all -> 0x04dc }
            java.util.Set r4 = defpackage.ovv.a((android.database.sqlite.SQLiteDatabase) r4, (java.lang.String) r8, (defpackage.oyb) r7)     // Catch:{ all -> 0x04dc }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x04dc }
            r7.<init>()     // Catch:{ all -> 0x04dc }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x04dc }
        L_0x028c:
            boolean r9 = r4.hasNext()     // Catch:{ all -> 0x04dc }
            if (r9 == 0) goto L_0x02a6
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x04dc }
            oxe r9 = (defpackage.oxe) r9     // Catch:{ all -> 0x04dc }
            java.lang.String r9 = r9.b()     // Catch:{ all -> 0x04dc }
            osz r9 = r5.a((defpackage.ozc) r0, (java.lang.String) r9, (java.lang.String) r8)     // Catch:{ all -> 0x04dc }
            if (r9 == 0) goto L_0x028c
            r7.add(r9)     // Catch:{ all -> 0x04dc }
            goto L_0x028c
        L_0x02a6:
            r0 = r7
        L_0x02a7:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04dc }
        L_0x02ab:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x04dc }
            if (r4 == 0) goto L_0x0384
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x04dc }
            osz r4 = (defpackage.osz) r4     // Catch:{ all -> 0x04dc }
            osf r5 = r1.a     // Catch:{ all -> 0x04dc }
            com.google.android.gms.icing.nativeindex.NativeIndex r5 = r5.n     // Catch:{ all -> 0x04dc }
            ovc r7 = r2.a     // Catch:{ all -> 0x04dc }
            oqo r7 = r7.i     // Catch:{ all -> 0x04dc }
            if (r7 == 0) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            oqo r7 = defpackage.oqo.g     // Catch:{ all -> 0x04dc }
        L_0x02c4:
            aucx r7 = r7.e     // Catch:{ all -> 0x04dc }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x04dc }
        L_0x02ca:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x04dc }
            if (r8 == 0) goto L_0x02ee
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x04dc }
            oqn r8 = (defpackage.oqn) r8     // Catch:{ all -> 0x04dc }
            java.lang.String r9 = "intent_data"
            oqy r12 = r8.d     // Catch:{ all -> 0x04dc }
            if (r12 == 0) goto L_0x02dd
            goto L_0x02df
        L_0x02dd:
            oqy r12 = defpackage.oqy.r     // Catch:{ all -> 0x04dc }
        L_0x02df:
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x04dc }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04dc }
            if (r9 == 0) goto L_0x02ca
            auay r7 = r8.c     // Catch:{ all -> 0x04dc }
            java.lang.String r7 = r7.l()     // Catch:{ all -> 0x04dc }
            goto L_0x02ef
        L_0x02ee:
            r7 = 0
        L_0x02ef:
            ovc r8 = r2.a     // Catch:{ all -> 0x04dc }
            if (r7 == 0) goto L_0x037a
            r9 = 5
            java.lang.Object r12 = r8.c(r9)     // Catch:{ all -> 0x04dc }
            aucd r12 = (defpackage.aucd) r12     // Catch:{ all -> 0x04dc }
            r12.a((defpackage.aucj) r8)     // Catch:{ all -> 0x04dc }
            boolean r8 = r12.c     // Catch:{ all -> 0x04dc }
            if (r8 != 0) goto L_0x0302
            goto L_0x0308
        L_0x0302:
            r12.c()     // Catch:{ all -> 0x04dc }
            r8 = 0
            r12.c = r8     // Catch:{ all -> 0x04dc }
        L_0x0308:
            aucj r8 = r12.b     // Catch:{ all -> 0x04dc }
            ovc r8 = (defpackage.ovc) r8     // Catch:{ all -> 0x04dc }
            ovc r9 = defpackage.ovc.m     // Catch:{ all -> 0x04dc }
            r7.getClass()     // Catch:{ all -> 0x04dc }
            int r9 = r8.a     // Catch:{ all -> 0x04dc }
            r9 = r9 | 16
            r8.a = r9     // Catch:{ all -> 0x04dc }
            r8.f = r7     // Catch:{ all -> 0x04dc }
            java.lang.String r13 = r4.c     // Catch:{ all -> 0x04dc }
            r13.getClass()     // Catch:{ all -> 0x04dc }
            r9 = r9 | 8
            r8.a = r9     // Catch:{ all -> 0x04dc }
            r8.e = r13     // Catch:{ all -> 0x04dc }
            ovc r8 = r2.a     // Catch:{ all -> 0x04dc }
            oqo r8 = r8.i     // Catch:{ all -> 0x04dc }
            if (r8 == 0) goto L_0x032b
            goto L_0x032d
        L_0x032b:
            oqo r8 = defpackage.oqo.g     // Catch:{ all -> 0x04dc }
        L_0x032d:
            r9 = 5
            java.lang.Object r13 = r8.c(r9)     // Catch:{ all -> 0x04dc }
            aucd r13 = (defpackage.aucd) r13     // Catch:{ all -> 0x04dc }
            r13.a((defpackage.aucj) r8)     // Catch:{ all -> 0x04dc }
            boolean r8 = r13.c     // Catch:{ all -> 0x04dc }
            if (r8 != 0) goto L_0x033d
            goto L_0x0343
        L_0x033d:
            r13.c()     // Catch:{ all -> 0x04dc }
            r8 = 0
            r13.c = r8     // Catch:{ all -> 0x04dc }
        L_0x0343:
            aucj r8 = r13.b     // Catch:{ all -> 0x04dc }
            oqo r8 = (defpackage.oqo) r8     // Catch:{ all -> 0x04dc }
            r7.getClass()     // Catch:{ all -> 0x04dc }
            int r9 = r8.a     // Catch:{ all -> 0x04dc }
            r14 = 2
            r9 = r9 | r14
            r8.a = r9     // Catch:{ all -> 0x04dc }
            r8.c = r7     // Catch:{ all -> 0x04dc }
            boolean r7 = r12.c     // Catch:{ all -> 0x04dc }
            if (r7 != 0) goto L_0x0357
            goto L_0x035d
        L_0x0357:
            r12.c()     // Catch:{ all -> 0x04dc }
            r7 = 0
            r12.c = r7     // Catch:{ all -> 0x04dc }
        L_0x035d:
            aucj r7 = r12.b     // Catch:{ all -> 0x04dc }
            ovc r7 = (defpackage.ovc) r7     // Catch:{ all -> 0x04dc }
            aucj r8 = r13.i()     // Catch:{ all -> 0x04dc }
            oqo r8 = (defpackage.oqo) r8     // Catch:{ all -> 0x04dc }
            r8.getClass()     // Catch:{ all -> 0x04dc }
            r7.i = r8     // Catch:{ all -> 0x04dc }
            int r8 = r7.a     // Catch:{ all -> 0x04dc }
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.a = r8     // Catch:{ all -> 0x04dc }
            aucj r7 = r12.i()     // Catch:{ all -> 0x04dc }
            r8 = r7
            ovc r8 = (defpackage.ovc) r8     // Catch:{ all -> 0x04dc }
            goto L_0x037b
        L_0x037a:
        L_0x037b:
            otw r4 = defpackage.pxw.a(r4, r8)     // Catch:{ all -> 0x04dc }
            defpackage.opw.a(r5, r4, r11, r3)     // Catch:{ all -> 0x04dc }
            goto L_0x02ab
        L_0x0384:
            boolean r0 = r1.c     // Catch:{ all -> 0x04dc }
            if (r0 != 0) goto L_0x0471
            osf r0 = r1.a     // Catch:{ all -> 0x04dc }
            prp r0 = r0.g     // Catch:{ all -> 0x04dc }
            axsg r4 = defpackage.axsg.a     // Catch:{ all -> 0x04dc }
            axsh r4 = r4.a()     // Catch:{ all -> 0x04dc }
            boolean r4 = r4.b()     // Catch:{ all -> 0x04dc }
            if (r4 == 0) goto L_0x046e
            ovc r4 = r2.a     // Catch:{ all -> 0x04dc }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x04dc }
            boolean r0 = defpackage.psl.a(r4, r0)     // Catch:{ all -> 0x04dc }
            if (r0 != 0) goto L_0x046e
            oqo r0 = r2.b()     // Catch:{ all -> 0x04dc }
            aucx r0 = r0.e     // Catch:{ all -> 0x04dc }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x04dc }
        L_0x03ac:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x0430
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04dc }
            oqn r0 = (defpackage.oqn) r0     // Catch:{ all -> 0x04dc }
            java.lang.String r5 = ".private:action"
            oqy r7 = r0.d     // Catch:{ all -> 0x04dc }
            if (r7 == 0) goto L_0x03bf
            goto L_0x03c1
        L_0x03bf:
            oqy r7 = defpackage.oqy.r     // Catch:{ all -> 0x04dc }
        L_0x03c1:
            java.lang.String r7 = r7.m     // Catch:{ all -> 0x04dc }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x04dc }
            if (r5 == 0) goto L_0x03ac
            auay r0 = r0.c     // Catch:{ auda -> 0x0428 }
            aubs r5 = defpackage.aubs.c()     // Catch:{ auda -> 0x0428 }
            bazc r7 = defpackage.bazc.d     // Catch:{ auda -> 0x0428 }
            aubc r0 = r0.h()     // Catch:{ auda -> 0x0426 }
            r8 = 4
            java.lang.Object r7 = r7.c(r8)     // Catch:{ auda -> 0x0426 }
            aucj r7 = (defpackage.aucj) r7     // Catch:{ auda -> 0x0426 }
            aueh r8 = defpackage.aueh.a     // Catch:{ IOException -> 0x040c, RuntimeException -> 0x03fb }
            aueq r8 = r8.a((java.lang.Object) r7)     // Catch:{ IOException -> 0x040c, RuntimeException -> 0x03fb }
            aubd r9 = defpackage.aubd.a((defpackage.aubc) r0)     // Catch:{ IOException -> 0x040c, RuntimeException -> 0x03fb }
            r8.a(r7, r9, r5)     // Catch:{ IOException -> 0x040c, RuntimeException -> 0x03fb }
            r8.d(r7)     // Catch:{ IOException -> 0x040c, RuntimeException -> 0x03fb }
            r5 = 0
            r0.a((int) r5)     // Catch:{ auda -> 0x03f8 }
            defpackage.aucj.b((defpackage.aucj) r7)     // Catch:{ auda -> 0x0428 }
            bazc r7 = (defpackage.bazc) r7     // Catch:{ auda -> 0x0428 }
            java.lang.String r0 = r7.b     // Catch:{ auda -> 0x0428 }
            goto L_0x0432
        L_0x03f8:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch:{ auda -> 0x0426 }
        L_0x03fb:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ auda -> 0x0426 }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x0426 }
            if (r5 == 0) goto L_0x040b
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0426 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0426 }
            throw r0     // Catch:{ auda -> 0x0426 }
        L_0x040b:
            throw r0     // Catch:{ auda -> 0x0426 }
        L_0x040c:
            r0 = move-exception
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ auda -> 0x0426 }
            boolean r5 = r5 instanceof defpackage.auda     // Catch:{ auda -> 0x0426 }
            if (r5 != 0) goto L_0x041f
            auda r5 = new auda     // Catch:{ auda -> 0x0426 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ auda -> 0x0426 }
            r5.<init>((java.lang.String) r0)     // Catch:{ auda -> 0x0426 }
            throw r5     // Catch:{ auda -> 0x0426 }
        L_0x041f:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ auda -> 0x0426 }
            auda r0 = (defpackage.auda) r0     // Catch:{ auda -> 0x0426 }
            throw r0     // Catch:{ auda -> 0x0426 }
        L_0x0426:
            r0 = move-exception
            throw r0     // Catch:{ auda -> 0x0428 }
        L_0x0428:
            r0 = move-exception
            java.lang.String r0 = "Failed to parse schemaOrgAction proto."
            defpackage.oso.b(r0)     // Catch:{ all -> 0x04dc }
            goto L_0x03ac
        L_0x0430:
            java.lang.String r0 = ""
        L_0x0432:
            r4 = 44
            amsk r4 = defpackage.amsk.a((char) r4)     // Catch:{ all -> 0x04dc }
            amsk r4 = r4.a()     // Catch:{ all -> 0x04dc }
            axsg r5 = defpackage.axsg.a     // Catch:{ all -> 0x04dc }
            axsh r5 = r5.a()     // Catch:{ all -> 0x04dc }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x04dc }
            java.util.List r4 = r4.c(r5)     // Catch:{ all -> 0x04dc }
            boolean r0 = r4.contains(r0)     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x046c
            axsg r0 = defpackage.axsg.a     // Catch:{ all -> 0x04dc }
            axsh r0 = r0.a()     // Catch:{ all -> 0x04dc }
            long r4 = r0.c()     // Catch:{ all -> 0x04dc }
            int r0 = (int) r4     // Catch:{ all -> 0x04dc }
            if (r0 <= 0) goto L_0x046c
            java.util.Random r4 = new java.util.Random     // Catch:{ all -> 0x04dc }
            r4.<init>()     // Catch:{ all -> 0x04dc }
            int r0 = r4.nextInt(r0)     // Catch:{ all -> 0x04dc }
            if (r0 == 0) goto L_0x046a
            r0 = 0
            goto L_0x046f
        L_0x046a:
            r0 = 1
            goto L_0x046f
        L_0x046c:
            r0 = 0
            goto L_0x046f
        L_0x046e:
            r0 = 0
        L_0x046f:
            r1.c = r0     // Catch:{ all -> 0x04dc }
        L_0x0471:
            if (r6 == 0) goto L_0x04a4
            aorr r0 = r6.g     // Catch:{ InterruptedException -> 0x0493, ExecutionException -> 0x0489 }
            psx r4 = new psx     // Catch:{ InterruptedException -> 0x0493, ExecutionException -> 0x0489 }
            r4.<init>(r6, r2)     // Catch:{ InterruptedException -> 0x0493, ExecutionException -> 0x0489 }
            java.util.concurrent.Executor r2 = r6.h     // Catch:{ InterruptedException -> 0x0493, ExecutionException -> 0x0489 }
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.aoqb) r4, (java.util.concurrent.Executor) r2)     // Catch:{ InterruptedException -> 0x0493, ExecutionException -> 0x0489 }
            r0.get()     // Catch:{ InterruptedException -> 0x0493, ExecutionException -> 0x0489 }
            r4 = r6
            r2 = r22
            r9 = 0
            goto L_0x006f
        L_0x0489:
            r0 = move-exception
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x04dc }
            r4 = r6
            r2 = r22
            r9 = 0
            goto L_0x006f
        L_0x0493:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x04dc }
            r2.interrupt()     // Catch:{ all -> 0x04dc }
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x04dc }
            r4 = r6
            r2 = r22
            r9 = 0
            goto L_0x006f
        L_0x04a4:
            r4 = r6
            r2 = r22
            r9 = 0
            goto L_0x006f
        L_0x04aa:
            r0 = move-exception
        L_0x04ab:
            r1 = r25
            goto L_0x050b
        L_0x04af:
            r0 = move-exception
            goto L_0x04b4
        L_0x04b1:
            r0 = move-exception
            goto L_0x04b4
        L_0x04b3:
            r0 = move-exception
        L_0x04b4:
            r22 = r2
            r6 = r4
            java.lang.String r2 = "Implicit corpus from usage report failed: %s"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04dc }
            defpackage.oso.b((java.lang.String) r2, (java.lang.Object) r0)     // Catch:{ all -> 0x04dc }
            r4 = r6
            r2 = r22
            r9 = 0
            goto L_0x006f
        L_0x04c6:
            r22 = r2
            r6 = r4
            if (r6 == 0) goto L_0x04ee
            aorr r0 = r6.g     // Catch:{ InterruptedException -> 0x04e3, ExecutionException -> 0x04de }
            psy r2 = new psy     // Catch:{ InterruptedException -> 0x04e3, ExecutionException -> 0x04de }
            r2.<init>(r6)     // Catch:{ InterruptedException -> 0x04e3, ExecutionException -> 0x04de }
            java.util.concurrent.Executor r4 = r6.h     // Catch:{ InterruptedException -> 0x04e3, ExecutionException -> 0x04de }
            aorr r0 = defpackage.aopr.a((defpackage.aorr) r0, (defpackage.aoqb) r2, (java.util.concurrent.Executor) r4)     // Catch:{ InterruptedException -> 0x04e3, ExecutionException -> 0x04de }
            r0.get()     // Catch:{ InterruptedException -> 0x04e3, ExecutionException -> 0x04de }
            goto L_0x04ee
        L_0x04dc:
            r0 = move-exception
            goto L_0x050b
        L_0x04de:
            r0 = move-exception
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x04dc }
            goto L_0x04ee
        L_0x04e3:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x04dc }
            r2.interrupt()     // Catch:{ all -> 0x04dc }
            r1.a((java.lang.Exception) r0)     // Catch:{ all -> 0x04dc }
        L_0x04ee:
            r10.close()     // Catch:{ all -> 0x0505 }
            if (r6 != 0) goto L_0x04f4
        L_0x04f3:
            goto L_0x053b
        L_0x04f4:
            r6.close()     // Catch:{ IOException -> 0x0527 }
            goto L_0x04f3
        L_0x04f8:
            r22 = r2
            r6 = r4
            r10.close()     // Catch:{ all -> 0x0505 }
            if (r6 == 0) goto L_0x06c9
            r6.close()     // Catch:{ IOException -> 0x0527 }
            goto L_0x06c9
        L_0x0505:
            r0 = move-exception
            goto L_0x051a
        L_0x0507:
            r0 = move-exception
            r22 = r2
            r6 = r4
        L_0x050b:
            r2 = r0
            r10.close()     // Catch:{ all -> 0x0510 }
            goto L_0x0515
        L_0x0510:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0505 }
        L_0x0515:
            throw r2     // Catch:{ all -> 0x0505 }
        L_0x0516:
            r0 = move-exception
            r22 = r2
            r6 = r4
        L_0x051a:
            r2 = r0
            if (r6 == 0) goto L_0x0526
            r6.close()     // Catch:{ all -> 0x0521 }
            goto L_0x0526
        L_0x0521:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ IOException -> 0x0527 }
        L_0x0526:
            throw r2     // Catch:{ IOException -> 0x0527 }
        L_0x0527:
            r0 = move-exception
            goto L_0x052c
        L_0x0529:
            r0 = move-exception
            r22 = r2
        L_0x052c:
            osf r2 = r1.a
            oyt r2 = r2.n()
            long r4 = defpackage.axrp.f()
            java.lang.String r6 = "SlurpUsageReportsTask uploadUserActions"
            r2.a(r6, r0, r4)
        L_0x053b:
            java.util.Map r0 = r1.d
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0545:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05bc
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            pao r4 = (defpackage.pao) r4
            java.lang.Object r2 = r2.getValue()
            pxh r2 = (defpackage.pxh) r2
            java.lang.Object r5 = r22.a()
            monitor-enter(r5)
            r6 = r22
            r7 = 0
            otg r8 = r6.a((defpackage.pao) r4, (defpackage.otg) r7)     // Catch:{ all -> 0x05b9 }
            if (r8 != 0) goto L_0x0576
            java.lang.String r2 = "Cannot update counters for non-existent key: %s"
            java.lang.String r4 = r4.b()     // Catch:{ all -> 0x05b9 }
            defpackage.oso.b((java.lang.String) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x05b9 }
            r7 = 5
            goto L_0x05b5
        L_0x0576:
            boolean r7 = r2.a()     // Catch:{ all -> 0x05b9 }
            if (r7 == 0) goto L_0x05b4
            r7 = 5
            java.lang.Object r9 = r8.c(r7)     // Catch:{ all -> 0x05b9 }
            aucd r9 = (defpackage.aucd) r9     // Catch:{ all -> 0x05b9 }
            r9.a((defpackage.aucj) r8)     // Catch:{ all -> 0x05b9 }
            boolean r10 = r9.c     // Catch:{ all -> 0x05b9 }
            if (r10 != 0) goto L_0x058b
            goto L_0x0591
        L_0x058b:
            r9.c()     // Catch:{ all -> 0x05b9 }
            r10 = 0
            r9.c = r10     // Catch:{ all -> 0x05b9 }
        L_0x0591:
            aucj r10 = r9.b     // Catch:{ all -> 0x05b9 }
            otg r10 = (defpackage.otg) r10     // Catch:{ all -> 0x05b9 }
            aucx r11 = defpackage.aucj.s()     // Catch:{ all -> 0x05b9 }
            r10.b = r11     // Catch:{ all -> 0x05b9 }
            aucx r8 = r8.b     // Catch:{ all -> 0x05b9 }
            java.util.List r2 = r2.a((java.util.List) r8)     // Catch:{ all -> 0x05b9 }
            r9.L(r2)     // Catch:{ all -> 0x05b9 }
            r9.i()     // Catch:{ all -> 0x05b9 }
            aucj r2 = r9.i()     // Catch:{ all -> 0x05b9 }
            otg r2 = (defpackage.otg) r2     // Catch:{ all -> 0x05b9 }
            r6.b((defpackage.pao) r4, (defpackage.otg) r2)     // Catch:{ all -> 0x05b9 }
            r2 = 1
            r6.g = r2     // Catch:{ all -> 0x05b9 }
            goto L_0x05b5
        L_0x05b4:
            r7 = 5
        L_0x05b5:
            monitor-exit(r5)     // Catch:{ all -> 0x05b9 }
            r22 = r6
            goto L_0x0545
        L_0x05b9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x05b9 }
            throw r0
        L_0x05bc:
            osf r0 = r1.a
            oyq r0 = r0.r
            r2 = 4
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r2 = r3.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r4[r5] = r2
            int r2 = r3.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 1
            r4[r5] = r2
            int r2 = r3.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 2
            r4[r5] = r2
            r2 = 3
            int r5 = r3.d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r2 = "Usage reports ok %d, Failed Usage reports %d, indexed %d, rejected %d"
            defpackage.oso.d((java.lang.String) r2, (java.lang.Object[]) r4)
            int r2 = r3.a
            if (r2 <= 0) goto L_0x05f1
            goto L_0x05fe
        L_0x05f1:
            int r2 = r3.c
            if (r2 > 0) goto L_0x05fe
            int r2 = r3.d
            if (r2 > 0) goto L_0x05fe
            int r2 = r3.b
            if (r2 > 0) goto L_0x05fe
            goto L_0x0670
        L_0x05fe:
            aolc r2 = defpackage.aolc.f
            aucd r2 = r2.o()
            int r4 = r3.a
            boolean r5 = r2.c
            if (r5 != 0) goto L_0x060b
            goto L_0x0611
        L_0x060b:
            r2.c()
            r5 = 0
            r2.c = r5
        L_0x0611:
            aucj r5 = r2.b
            aolc r5 = (defpackage.aolc) r5
            int r6 = r5.a
            r7 = 1
            r6 = r6 | r7
            r5.a = r6
            r5.b = r4
            int r4 = r3.b
            r7 = 2
            r6 = r6 | r7
            r5.a = r6
            r5.c = r4
            int r4 = r3.c
            r7 = 4
            r6 = r6 | r7
            r5.a = r6
            r5.d = r4
            int r4 = r3.d
            r6 = r6 | 8
            r5.a = r6
            r5.e = r4
            aucj r2 = r2.i()
            aolc r2 = (defpackage.aolc) r2
            axrp r4 = defpackage.axrp.a
            axrq r4 = r4.a()
            long r4 = r4.t()
            boolean r6 = r0.a((long) r4)
            if (r6 == 0) goto L_0x0670
            aoji r6 = defpackage.aoji.R
            aucd r6 = r6.o()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0656
            goto L_0x065c
        L_0x0656:
            r6.c()
            r7 = 0
            r6.c = r7
        L_0x065c:
            aucj r7 = r6.b
            aoji r7 = (defpackage.aoji) r7
            r2.getClass()
            r7.F = r2
            int r2 = r7.b
            r2 = r2 | 256(0x100, float:3.59E-43)
            r7.b = r2
            r2 = 16002(0x3e82, float:2.2424E-41)
            r0.a((int) r2, (defpackage.aucd) r6, (long) r4)
        L_0x0670:
            int r0 = r3.c
            if (r0 <= 0) goto L_0x06c9
            boolean r0 = r1.c
            if (r0 == 0) goto L_0x06a2
            osf r0 = r1.a
            ppp r2 = r0.c
            opx r15 = new opx
            android.content.Context r4 = r0.b
            prp r5 = r0.g
            ozs r6 = r0.a()
            osf r11 = r1.a
            ozb r7 = r11.m
            pas r8 = r11.t
            com.google.android.gms.icing.nativeindex.NativeIndex r9 = r11.n
            oyq r10 = r11.r
            oyt r12 = r11.n()
            osf r0 = r1.a
            agtt r13 = r0.u
            agpk r14 = r0.v
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.d(r15)
            goto L_0x06c9
        L_0x06a2:
            osf r0 = r1.a
            android.content.Context r2 = r0.b
            prp r0 = r0.g
            boolean r3 = r0.f()
            if (r3 != 0) goto L_0x06c9
            defpackage.opx.a((android.content.Context) r2)
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r0.b     // Catch:{ all -> 0x06c6 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x06c6 }
            java.lang.String r3 = "app-history-upload-pending"
            r4 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r4)     // Catch:{ all -> 0x06c6 }
            r0.apply()     // Catch:{ all -> 0x06c6 }
            monitor-exit(r2)     // Catch:{ all -> 0x06c6 }
            goto L_0x06c9
        L_0x06c6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06c6 }
            throw r0
        L_0x06c9:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovi.a():java.lang.Object");
    }
}
