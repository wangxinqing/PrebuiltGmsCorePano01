package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: adaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adaj extends aczl {
    private final adef k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adaj(Context context, adbx adbx, ClientContext clientContext, String str, aczg aczg, byte[] bArr) {
        super(context, adbx, clientContext, str, "WriteConsentOperation", aczg, bArr);
        adef adef = new adef(context);
        this.k = adef;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d8, code lost:
        throw new defpackage.nja(10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e1, code lost:
        throw new defpackage.nja(4505, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        throw new defpackage.nja(4503, (java.lang.String) null);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d2 A[ExcHandler: adab (e adab), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d9 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e2 A[ExcHandler: auda (e auda), Splitter:B:1:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "WriteConsent"
            super.a((android.content.Context) r20)
            atzx r3 = defpackage.atzx.f
            aucd r3 = r3.o()
            r4 = 10
            r5 = 0
            r19.b()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            byte[] r6 = r1.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aubs r7 = defpackage.aubs.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r3.b(r6, r7)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r6 = r19.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            android.content.Context r7 = r1.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atyh r7 = defpackage.adhi.a(r7, r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L_0x002b
            goto L_0x0043
        L_0x002b:
            boolean r10 = r3.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 != 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            r3.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r3.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0035:
            aucj r10 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzx r10 = (defpackage.atzx) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.getClass()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10.b = r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r7 = r10.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7 = r7 | r8
            r10.a = r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0043:
            aucj r7 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzx r7 = (defpackage.atzx) r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r7 = r7.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r7 = a((java.lang.String) r7)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            boolean r10 = r3.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r3.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r3.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0057:
            aucj r10 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzx r10 = (defpackage.atzx) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.getClass()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r11 = r10.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r12 = 2
            r11 = r11 | r12
            r10.a = r11     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10.c = r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aczg r7 = r1.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            com.google.android.gms.common.internal.ClientContext r14 = r1.e     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucj r10 = r3.i()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzx r10 = (defpackage.atzx) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.a()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aczf r11 = r7.a     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            iyn r13 = r11.a     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.<init>()     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r15 = r10.c     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r15 = defpackage.iyv.a(r15)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r16 = java.lang.String.valueOf(r15)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r16 = r16.length()     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r8 = r16 + 25
            r12.<init>(r8)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r8 = "/users/"
            r12.append(r8)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r12.append(r15)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r8 = "/consent?alt=proto"
            r12.append(r8)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r8 = r12.toString()     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.append(r8)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r16 = r11.toString()     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            byte[] r17 = r10.k()     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r15 = 2
            atzy r18 = defpackage.atzy.e     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.Object r8 = r13.a((com.google.android.gms.common.internal.ClientContext) r14, (int) r15, (java.lang.String) r16, (byte[]) r17, (java.lang.Object) r18)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzy r8 = (defpackage.atzy) r8     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.a((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ eif -> 0x02ca, VolleyError -> 0x02bf, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atyi r2 = r8.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r2 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            atyi r2 = defpackage.atyi.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x00c4:
            android.content.Context r7 = r1.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            defpackage.adhi.a(r2, r7, r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucx r2 = r8.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r2 = r2.size()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r2 > 0) goto L_0x00d2
            goto L_0x012a
        L_0x00d2:
            adao r2 = r19.a()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucx r6 = r8.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzg[] r7 = new defpackage.atzg[r9]     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzg[] r6 = (defpackage.atzg[]) r6     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r2.a((defpackage.atzg[]) r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            adao r2 = r19.a()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucx r6 = r8.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzg[] r7 = new defpackage.atzg[r9]     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzg[] r6 = (defpackage.atzg[]) r6     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucj r3 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzx r3 = (defpackage.atzx) r3     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r3 = r3.e     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            boolean r7 = r2.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r7 == 0) goto L_0x0122
            adat r7 = r2.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10.<init>()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r11 = r6.length     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r12 = 0
        L_0x0104:
            if (r12 >= r11) goto L_0x0114
            r13 = r6[r12]     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r13 = r13.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10.add(r13)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r12 = r12 + 1
            goto L_0x0104
        L_0x0114:
            boolean r7 = r7.a(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r7 == 0) goto L_0x011f
            com.google.android.gms.common.api.Status r2 = r2.a((defpackage.atzg[]) r6, (java.lang.String) r3)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            goto L_0x0124
        L_0x011f:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            goto L_0x0124
        L_0x0122:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0124:
            boolean r3 = r2.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r3 == 0) goto L_0x02b5
        L_0x012a:
            r1.a((int) r9)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            adbx r2 = r1.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            byte[] r6 = r8.k()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r2.d(r3, r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            addp r2 = new addp     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            android.content.Context r3 = r1.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aded r3 = defpackage.adee.a(r3)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            android.accounts.Account r6 = r1.g     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aoru r7 = defpackage.jfm.a(r4)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aorr r3 = r3.a(r6, r7)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            adhv r6 = r1.j     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r2.<init>(r3, r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            acyb r3 = r2.a()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r3 == 0) goto L_0x02b4
            int r6 = r3.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x02b4
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r6.<init>()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwh r7 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r7 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            atwh r7 = defpackage.atwh.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0168:
            aucx r7 = r7.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x016e:
            boolean r10 = r7.hasNext()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 == 0) goto L_0x0184
            java.lang.Object r10 = r7.next()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r10 = (defpackage.atwg) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r11 = r10.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r11 = defpackage.adht.a(r11)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r6.put(r11, r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            goto L_0x016e
        L_0x0184:
            aucx r7 = r8.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x018a:
            boolean r8 = r7.hasNext()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r8 == 0) goto L_0x0206
            java.lang.Object r8 = r7.next()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atzh r8 = (defpackage.atzh) r8     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = r8.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.Object r10 = r6.get(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r10 = (defpackage.atwg) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 == 0) goto L_0x018a
            r11 = 5
            java.lang.Object r11 = r10.c(r11)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.a((defpackage.aucj) r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = r8.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = defpackage.atzq.a(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 == 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r10 = 1
        L_0x01b4:
            int r10 = r10 + -1
            r12 = 2
            if (r10 != r12) goto L_0x01bb
            r10 = 1
            goto L_0x01bc
        L_0x01bb:
            r10 = 0
        L_0x01bc:
            boolean r12 = r11.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r12 != 0) goto L_0x01c1
            goto L_0x01c6
        L_0x01c1:
            r11.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x01c6:
            aucj r12 = r11.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r12 = (defpackage.atwg) r12     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r13 = r12.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r14 = 2
            r13 = r13 | r14
            r12.a = r13     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r12.c = r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = r8.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = defpackage.atzq.a(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 == 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r10 = 1
        L_0x01dc:
            int r10 = r10 + -1
            r12 = 2
            if (r10 != r12) goto L_0x01e3
            r10 = 1
            goto L_0x01e4
        L_0x01e3:
            r10 = 0
        L_0x01e4:
            boolean r12 = r11.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r12 != 0) goto L_0x01e9
            goto L_0x01ee
        L_0x01e9:
            r11.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x01ee:
            aucj r12 = r11.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r12 = (defpackage.atwg) r12     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r13 = r12.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r13 = r13 | 4
            r12.a = r13     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r12.d = r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r8 = r8.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucj r10 = r11.i()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r10 = (defpackage.atwg) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r6.put(r8, r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            goto L_0x018a
        L_0x0206:
            atwh r7 = defpackage.atwh.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucd r7 = r7.o()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwh r8 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r8 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            atwh r8 = defpackage.atwh.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0213:
            aucx r8 = r8.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0219:
            boolean r10 = r8.hasNext()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r10 == 0) goto L_0x0258
            java.lang.Object r10 = r8.next()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r10 = (defpackage.atwg) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = r10.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r10 = defpackage.adht.a(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.Object r10 = r6.get(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwg r10 = (defpackage.atwg) r10     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            boolean r11 = r7.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r11 != 0) goto L_0x0236
            goto L_0x023b
        L_0x0236:
            r7.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x023b:
            aucj r11 = r7.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwh r11 = (defpackage.atwh) r11     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10.getClass()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucx r12 = r11.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            boolean r12 = r12.a()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r12 != 0) goto L_0x0252
            aucx r12 = r11.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.b = r12     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0252:
            aucx r11 = r11.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r11.add(r10)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            goto L_0x0219
        L_0x0258:
            acyb r6 = defpackage.acyb.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucd r6 = r6.o()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            boolean r8 = r6.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r8 != 0) goto L_0x0263
            goto L_0x0268
        L_0x0263:
            r6.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r6.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0268:
            aucj r8 = r6.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            acyb r8 = (defpackage.acyb) r8     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            aucj r7 = r7.i()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwh r7 = (defpackage.atwh) r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.getClass()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r8.b = r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r7 = r8.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10 = 1
            r7 = r7 | r10
            r8.a = r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r7 = r3.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r8 = 2
            r7 = r7 & r8
            if (r7 != 0) goto L_0x0284
            goto L_0x029c
        L_0x0284:
            long r7 = r3.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            boolean r3 = r6.c     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r3 != 0) goto L_0x028b
            goto L_0x0290
        L_0x028b:
            r6.c()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r6.c = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x0290:
            aucj r3 = r6.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            acyb r3 = (defpackage.acyb) r3     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r9 = r3.a     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r10 = 2
            r9 = r9 | r10
            r3.a = r9     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r3.c = r7     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x029c:
            aucj r3 = r6.i()     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            acyb r3 = (defpackage.acyb) r3     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            acyb r2 = r2.a((defpackage.acyb) r3)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            adef r6 = r1.k     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            android.accounts.Account r7 = r1.g     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            atwh r3 = r3.b     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            if (r3 != 0) goto L_0x02b0
            atwh r3 = defpackage.atwh.d     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x02b0:
            r6.a(r7, r3, r2)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            return
        L_0x02b4:
            return
        L_0x02b5:
            nja r3 = new nja     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            int r6 = r2.i     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            java.lang.String r2 = r2.j     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r3.<init>(r6, r2)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            throw r3     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x02bf:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = defpackage.aczg.a(r3)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            r7.a((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            throw r3     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x02ca:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "AUTH"
            r7.a((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
            throw r3     // Catch:{ eif -> 0x02f2, VolleyError -> 0x02eb, auda -> 0x02e2, IOException -> 0x02d9, adab -> 0x02d2 }
        L_0x02d2:
            r0 = move-exception
            nja r2 = new nja
            r2.<init>(r4, r5)
            throw r2
        L_0x02d9:
            r0 = move-exception
            nja r2 = new nja
            r3 = 4505(0x1199, float:6.313E-42)
            r2.<init>(r3, r5)
            throw r2
        L_0x02e2:
            r0 = move-exception
            nja r2 = new nja
            r3 = 4503(0x1197, float:6.31E-42)
            r2.<init>(r3, r5)
            throw r2
        L_0x02eb:
            r0 = move-exception
            r2 = r0
            nja r2 = r1.a((com.android.volley.VolleyError) r2)
            throw r2
        L_0x02f2:
            r0 = move-exception
            nja r2 = new nja
            r3 = 4504(0x1198, float:6.311E-42)
            r2.<init>(r3, r5)
            goto L_0x02fc
        L_0x02fb:
            throw r2
        L_0x02fc:
            goto L_0x02fb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adaj.a(android.content.Context):void");
    }

    public final void a(Status status) {
        a(status.i);
        this.d.d(status, (byte[]) null);
    }
}
