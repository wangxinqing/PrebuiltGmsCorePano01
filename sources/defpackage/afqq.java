package defpackage;

import java.util.List;

/* renamed from: afqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqq implements aoqb {
    private final afqr a;
    private final aflh b;
    private final String c;
    private final aflf d;
    private final afkn e;
    private final afku f;
    private final aflb g;
    private final int h;
    private final List i;
    private final aucd j;

    public afqq(afqr afqr, aucd aucd, aflh aflh, String str, aflf aflf, afkn afkn, afku afku, aflb aflb, int i2, List list) {
        this.a = afqr;
        this.j = aucd;
        this.b = aflh;
        this.c = str;
        this.d = aflf;
        this.e = afkn;
        this.f = afku;
        this.g = aflb;
        this.h = i2;
        this.i = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aorr a(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            afqr r1 = r0.a
            aucd r2 = r0.j
            aflh r3 = r0.b
            java.lang.String r4 = r0.c
            aflf r15 = r0.d
            afkn r13 = r0.e
            afku r14 = r0.f
            aflb r12 = r0.g
            int r11 = r0.h
            java.util.List r10 = r0.i
            r5 = r26
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r18 = r5.intValue()
            android.content.Context r5 = r1.a
            int r6 = r3.e
            int r6 = defpackage.afkq.a(r6)
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = 1
        L_0x002a:
            afmh r8 = r1.b
            amri r9 = r1.j
            android.net.Uri r4 = defpackage.afsp.a(r5, r6, r4, r8, r9)
            if (r4 != 0) goto L_0x004d
            java.lang.String r1 = "%s: Failed to get file uri!"
            java.lang.String r2 = "SharedFileManager"
            defpackage.afsh.a((java.lang.String) r1, (java.lang.Object) r2)
            afkd r1 = defpackage.afkf.a()
            afke r2 = defpackage.afke.UNABLE_TO_CREATE_FILE_URI_ERROR
            r1.a = r2
            afkf r1 = r1.a()
            aorr r1 = defpackage.aorl.a((java.lang.Throwable) r1)
            goto L_0x012e
        L_0x004d:
            amri r5 = r1.f
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0060
            r24 = r2
            r20 = r10
            r22 = r11
            r23 = r12
            r0 = r15
            goto L_0x00d0
        L_0x0060:
            if (r14 == 0) goto L_0x00c7
            afrr r19 = new afrr
            android.content.Context r6 = r1.a
            afqu r8 = r1.c
            agzs r9 = r1.e
            afmh r5 = r1.b
            int r7 = r3.e
            int r7 = defpackage.afkq.a(r7)
            if (r7 == 0) goto L_0x0077
            r16 = r7
            goto L_0x0079
        L_0x0077:
            r16 = 1
        L_0x0079:
            amri r7 = r1.f
            java.lang.Object r7 = r7.b()
            r17 = r7
            afmo r17 = (defpackage.afmo) r17
            afsb r7 = r1.h
            amri r0 = r1.j
            r20 = r5
            r5 = r19
            r21 = r7
            r7 = r8
            r8 = r9
            r9 = r20
            r20 = r10
            r10 = r13
            r22 = r11
            r11 = r16
            r23 = r12
            r12 = r17
            r13 = r14
            r24 = r2
            r2 = r14
            r14 = r21
            r21 = r15
            r16 = r18
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r21
            r1.a(r0, r4)
            afrz r5 = r1.d
            java.lang.String r9 = r2.b
            int r10 = r2.c
            r6 = r0
            r7 = r18
            r8 = r4
            r11 = r23
            r12 = r19
            r13 = r22
            r14 = r20
            aorr r0 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0103
        L_0x00c7:
            r24 = r2
            r20 = r10
            r22 = r11
            r23 = r12
            r0 = r15
        L_0x00d0:
            afrs r2 = new afrs
            afqu r6 = r1.c
            agzs r7 = r1.e
            int r5 = r3.e
            int r5 = defpackage.afkq.a(r5)
            if (r5 == 0) goto L_0x00e0
            r9 = r5
            goto L_0x00e1
        L_0x00e0:
            r9 = 1
        L_0x00e1:
            afsb r10 = r1.h
            r5 = r2
            r8 = r13
            r11 = r0
            r12 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.a(r0, r4)
            afrz r5 = r1.d
            java.lang.String r9 = r13.c
            int r10 = r13.d
            r6 = r0
            r7 = r18
            r8 = r4
            r11 = r23
            r12 = r2
            r13 = r22
            r14 = r20
            aorr r0 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0103:
            afle r2 = defpackage.afle.DOWNLOAD_IN_PROGRESS
            r4 = r24
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x010c
            goto L_0x0112
        L_0x010c:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x0112:
            aucj r5 = r4.b
            afli r5 = (defpackage.afli) r5
            afli r6 = defpackage.afli.d
            int r2 = r2.g
            r5.c = r2
            int r2 = r5.a
            r2 = r2 | 2
            r5.a = r2
            afqu r1 = r1.c
            aucj r2 = r4.i()
            afli r2 = (defpackage.afli) r2
            r1.a((defpackage.aflh) r3, (defpackage.afli) r2)
            r1 = r0
        L_0x012e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqq.a(java.lang.Object):aorr");
    }
}
