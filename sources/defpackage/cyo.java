package defpackage;

import com.google.android.chimera.Fragment;

/* renamed from: cyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cyo implements cyq {
    private static final iwd a = dit.a("ExternalLauncher");
    private final aqpp b;
    private final cyn c;

    public cyo(aqpp aqpp, Fragment fragment, dih dih, cvm cvm, czc czc, czb czb) {
        cyn cyn = new cyn(fragment, dih, a, cvm, czc, czb);
        this.b = aqpp;
        this.c = cyn;
    }

    public static boolean a(aqpp aqpp) {
        int i = aqpp.a;
        return ((i & 16) == 0 && (i & 4) == 0 && (i & 2) == 0 && (i & 128) == 0) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [cyq] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r2v7, types: [cza] */
    /* JADX WARNING: type inference failed for: r2v8, types: [cyk] */
    /* JADX WARNING: type inference failed for: r2v9, types: [czd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            aqpp r0 = r10.b
            int r1 = r0.a
            r2 = r1 & 16
            if (r2 == 0) goto L_0x0026
            cyn r1 = r10.c
            aqtu r0 = r0.e
            if (r0 == 0) goto L_0x0010
            r3 = r0
            goto L_0x0013
        L_0x0010:
            aqtu r0 = defpackage.aqtu.c
            r3 = r0
        L_0x0013:
            czd r0 = new czd
            dih r4 = r1.b
            com.google.android.chimera.Fragment r5 = r1.a
            iwd r6 = r1.c
            cvm r7 = r1.f
            czc r8 = r1.d
            czb r9 = r1.e
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0082
        L_0x0026:
            r2 = r1 & 4
            if (r2 == 0) goto L_0x0046
            cyn r1 = r10.c
            aqqf r0 = r0.c
            if (r0 != 0) goto L_0x0034
            aqqf r0 = defpackage.aqqf.d
            r3 = r0
            goto L_0x0035
        L_0x0034:
            r3 = r0
        L_0x0035:
            cyk r0 = new cyk
            dih r4 = r1.b
            com.google.android.chimera.Fragment r5 = r1.a
            iwd r6 = r1.c
            czc r7 = r1.d
            czb r8 = r1.e
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0082
        L_0x0046:
            r2 = r1 & 2
            if (r2 == 0) goto L_0x0067
            cyn r1 = r10.c
            aqrv r0 = r0.b
            if (r0 != 0) goto L_0x0054
            aqrv r0 = defpackage.aqrv.e
            r3 = r0
            goto L_0x0055
        L_0x0054:
            r3 = r0
        L_0x0055:
            cza r0 = new cza
            dih r4 = r1.b
            com.google.android.chimera.Fragment r5 = r1.a
            czc r6 = r1.d
            cyl r7 = new cyl
            r7.<init>(r1, r3)
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0082
        L_0x0067:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0086
            cyn r1 = r10.c
            aqpt r0 = r0.h
            if (r0 != 0) goto L_0x0073
            aqpt r0 = defpackage.aqpt.d
        L_0x0073:
            cyp r2 = new cyp
            com.google.android.chimera.Fragment r3 = r1.a
            czc r4 = r1.d
            cym r5 = new cym
            r5.<init>(r1)
            r2.<init>(r0, r3, r4, r5)
            r0 = r2
        L_0x0082:
            r0.a()
            return
        L_0x0086:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The alternative doesn't have any launchable alternatives included"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyo.a():void");
    }
}
