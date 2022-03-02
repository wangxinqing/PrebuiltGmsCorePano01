package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aczp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczp extends aczl {
    public aczp(Context context, adbx adbx, ClientContext clientContext, String str, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, "FetchConsentConfigOperation", aczg, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a8, code lost:
        throw new defpackage.nja(10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        throw new defpackage.nja(4505, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        throw new defpackage.nja(4503, (java.lang.String) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a0 A[ExcHandler: adab (e adab), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x000c] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b2 A[ExcHandler: auda (e auda), Splitter:B:1:0x000c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "FetchConsentConfig"
            super.a((android.content.Context) r13)
            atyw r13 = defpackage.atyw.j
            aucd r13 = r13.o()
            r1 = 0
            r12.b()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            byte[] r2 = r12.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aubs r3 = defpackage.aubs.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r13.b(r2, r3)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aucj r2 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r2 = (defpackage.atyw) r2     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atzv r2 = r2.g     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r2 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            atzv r2 = defpackage.atzv.i     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x0023:
            aucd r2 = r12.a((defpackage.atzv) r2)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r3 = r12.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            android.content.Context r4 = r12.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyh r4 = defpackage.adhi.a(r4, r3)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r5 = 0
            if (r4 != 0) goto L_0x0035
            goto L_0x004e
        L_0x0035:
            boolean r6 = r13.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r6 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r13.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r13.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x003f:
            aucj r6 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r6 = (defpackage.atyw) r6     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.getClass()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r6.b = r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r4 = r6.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4 = r4 | 1
            r6.a = r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x004e:
            aucj r4 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r4 = (defpackage.atyw) r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r4 = r4.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r4 = a((java.lang.String) r4)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            boolean r6 = r13.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r6 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            r13.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r13.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x0062:
            aucj r6 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r6 = (defpackage.atyw) r6     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.getClass()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r7 = r6.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r7 = r7 | 2
            r6.a = r7     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r6.c = r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r4 = r6.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            boolean r4 = a(r4, r3)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r4 == 0) goto L_0x00fe
            adao r4 = r12.a()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            adan r6 = r4.a()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r6 != 0) goto L_0x0084
            goto L_0x00c7
        L_0x0084:
            com.google.android.gms.common.api.Status r7 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            com.google.android.gms.common.api.Status r8 = r6.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            boolean r7 = r7.equals(r8)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r7 == 0) goto L_0x00c7
            boolean r7 = r13.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r7 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            r13.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r13.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x0098:
            aucj r7 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r7 = (defpackage.atyw) r7     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r7.h = r8     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.util.List r6 = r6.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            boolean r7 = r13.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r7 != 0) goto L_0x00a9
            goto L_0x00ae
        L_0x00a9:
            r13.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r13.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x00ae:
            aucj r7 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r7 = (defpackage.atyw) r7     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aucx r8 = r7.h     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            boolean r8 = r8.a()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r8 != 0) goto L_0x00c2
            aucx r8 = r7.h     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r7.h = r8     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x00c2:
            aucx r7 = r7.h     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r7)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x00c7:
            atzu r4 = r4.b()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r4 == 0) goto L_0x00e8
            boolean r6 = r2.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r6 != 0) goto L_0x00d2
        L_0x00d1:
            goto L_0x00d8
        L_0x00d2:
            r2.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            goto L_0x00d1
        L_0x00d8:
            aucj r6 = r2.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atzv r6 = (defpackage.atzv) r6     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.getClass()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r6.h = r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r4 = r6.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4 = r4 | 128(0x80, float:1.794E-43)
            r6.a = r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            goto L_0x00fe
        L_0x00e8:
            boolean r4 = r2.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r4 != 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            r2.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x00f2:
            aucj r4 = r2.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atzv r4 = (defpackage.atzv) r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.h = r1     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r6 = r4.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r6 = r6 & -129(0xffffffffffffff7f, float:NaN)
            r4.a = r6     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x00fe:
            boolean r4 = r13.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r4 != 0) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r13.c()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r13.c = r5     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x0108:
            aucj r4 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r4 = (defpackage.atyw) r4     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aucj r2 = r2.i()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atzv r2 = (defpackage.atzv) r2     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2.getClass()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.g = r2     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r2 = r4.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2 = r2 | 16
            r4.a = r2     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aczg r2 = r12.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            com.google.android.gms.common.internal.ClientContext r7 = r12.e     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aucj r13 = r13.i()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyw r13 = (defpackage.atyw) r13     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2.a()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            aczf r4 = r2.a     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            iyn r6 = r4.a     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.<init>()     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r8 = r13.c     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r8 = defpackage.iyv.a(r8)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r9 = r9.length()     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            int r9 = r9 + 31
            r10.<init>(r9)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r9 = "/users/"
            r10.append(r9)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r10.append(r8)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r8 = "/consentConfig?alt=proto"
            r10.append(r8)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r8 = r10.toString()     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r4.append(r8)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.String r9 = r4.toString()     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            byte[] r10 = r13.k()     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r8 = 1
            atyx r11 = defpackage.atyx.n     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            java.lang.Object r13 = r6.a((com.google.android.gms.common.internal.ClientContext) r7, (int) r8, (java.lang.String) r9, (byte[]) r10, (java.lang.Object) r11)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyx r13 = (defpackage.atyx) r13     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2.a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ eif -> 0x0199, VolleyError -> 0x018f, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            atyi r0 = r13.b     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            if (r0 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            atyi r0 = defpackage.atyi.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x017b:
            android.content.Context r2 = r12.c     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            defpackage.adhi.a(r0, r2, r3)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r12.a((int) r5)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            adbx r0 = r12.d     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            byte[] r13 = r13.k()     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r0.c(r2, r13)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            return
        L_0x018f:
            r13 = move-exception
            java.lang.String r3 = defpackage.aczg.a(r13)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            r2.a((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            throw r13     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x0199:
            r13 = move-exception
            java.lang.String r3 = "AUTH"
            r2.a((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
            throw r13     // Catch:{ eif -> 0x01c1, VolleyError -> 0x01bb, auda -> 0x01b2, IOException -> 0x01a9, adab -> 0x01a0 }
        L_0x01a0:
            r13 = move-exception
            nja r13 = new nja
            r0 = 10
            r13.<init>(r0, r1)
            throw r13
        L_0x01a9:
            r13 = move-exception
            nja r13 = new nja
            r0 = 4505(0x1199, float:6.313E-42)
            r13.<init>(r0, r1)
            throw r13
        L_0x01b2:
            r13 = move-exception
            nja r13 = new nja
            r0 = 4503(0x1197, float:6.31E-42)
            r13.<init>(r0, r1)
            throw r13
        L_0x01bb:
            r13 = move-exception
            nja r13 = r12.a((com.android.volley.VolleyError) r13)
            throw r13
        L_0x01c1:
            r13 = move-exception
            nja r13 = new nja
            r0 = 4504(0x1198, float:6.311E-42)
            r13.<init>(r0, r1)
            goto L_0x01cb
        L_0x01ca:
            throw r13
        L_0x01cb:
            goto L_0x01ca
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aczp.a(android.content.Context):void");
    }

    public final void a(Status status) {
        a(status.i);
        this.d.c(status, (byte[]) null);
    }
}
