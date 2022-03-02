package defpackage;

import com.google.android.gms.drive.query.Query;
import java.util.Set;

/* renamed from: kdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kdz implements ket {
    final /* synthetic */ boolean a;
    final /* synthetic */ Query b;
    final /* synthetic */ Query c;
    final /* synthetic */ String d;
    final /* synthetic */ Set e;
    final /* synthetic */ String f;
    final /* synthetic */ kwj g;
    final /* synthetic */ kec h;
    final /* synthetic */ kgn i;

    public kdz(kec kec, boolean z, Query query, Query query2, String str, Set set, String str2, kwj kwj, kgn kgn) {
        this.h = kec;
        this.a = z;
        this.b = query;
        this.c = query2;
        this.d = str;
        this.e = set;
        this.f = str2;
        this.g = kwj;
        this.i = kgn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (r4.a != false) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0173 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            kec r0 = r1.h
            kkf r0 = r0.e
            r0.d()
            r2 = 0
            boolean r0 = r1.a     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x000f
            goto L_0x0058
        L_0x000f:
            com.google.android.gms.drive.query.Query r0 = r1.b     // Catch:{ all -> 0x0176 }
            com.google.android.gms.drive.query.internal.LogicalFilter r0 = r0.a     // Catch:{ all -> 0x0176 }
            boolean r0 = defpackage.ljg.a((com.google.android.gms.drive.query.Filter) r0)     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0058
            boolean r0 = r17.isEmpty()     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x0057
            kec r0 = r1.h     // Catch:{ all -> 0x0176 }
            com.google.android.gms.drive.query.Query r3 = r1.b     // Catch:{ all -> 0x0176 }
            java.util.Set r9 = r1.e     // Catch:{ all -> 0x0176 }
            boolean r4 = r17.isEmpty()     // Catch:{ all -> 0x0176 }
            if (r4 != 0) goto L_0x0031
            kqy r4 = defpackage.lit.a(r17)     // Catch:{ all -> 0x0176 }
            r7 = r4
            goto L_0x0034
        L_0x0031:
            kqy r4 = defpackage.kqz.b     // Catch:{ all -> 0x0176 }
            r7 = r4
        L_0x0034:
            kkf r4 = r0.e     // Catch:{ all -> 0x0176 }
            khq r5 = r0.d     // Catch:{ all -> 0x0176 }
            r3.a()     // Catch:{ all -> 0x0176 }
            java.util.Set r6 = r3.a()     // Catch:{ all -> 0x0176 }
            r8 = 0
            boolean r10 = r3.e     // Catch:{ all -> 0x0176 }
            boolean r11 = r3.g     // Catch:{ all -> 0x0176 }
            boolean r13 = r0.l()     // Catch:{ all -> 0x0176 }
            r12 = r17
            lrw r3 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.common.data.DataHolder r4 = r3.a     // Catch:{ all -> 0x0176 }
            int r0 = r0.k     // Catch:{ all -> 0x0176 }
            defpackage.lbm.a(r4, r0)     // Catch:{ all -> 0x0176 }
            r2 = r3
            goto L_0x008f
        L_0x0057:
            goto L_0x008f
        L_0x0058:
            kec r0 = r1.h     // Catch:{ all -> 0x0176 }
            com.google.android.gms.drive.query.Query r3 = r1.c     // Catch:{ all -> 0x0176 }
            java.lang.String r4 = r1.d     // Catch:{ all -> 0x0176 }
            java.util.Set r5 = r1.e     // Catch:{ all -> 0x0176 }
            r6 = r17
            lrw r2 = r0.a((com.google.android.gms.drive.query.Query) r3, (java.lang.String) r4, (java.util.Set) r5, (java.util.List) r6)     // Catch:{ all -> 0x0176 }
            boolean r0 = r1.a     // Catch:{ all -> 0x0174 }
            if (r0 == 0) goto L_0x008e
            kec r4 = r1.h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.drive.query.Query r6 = r1.b     // Catch:{ all -> 0x0174 }
            java.lang.String r5 = r1.f     // Catch:{ all -> 0x0174 }
            java.lang.String r7 = r1.d     // Catch:{ all -> 0x0174 }
            java.util.Set r8 = r1.e     // Catch:{ all -> 0x0174 }
            kea r13 = new kea     // Catch:{ all -> 0x0174 }
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0174 }
            java.util.Set r14 = defpackage.kte.a((defpackage.lrw) r2)     // Catch:{ all -> 0x0174 }
            kec r0 = r1.h     // Catch:{ all -> 0x0174 }
            krr r9 = r0.l     // Catch:{ all -> 0x0174 }
            kwj r10 = r1.g     // Catch:{ all -> 0x0174 }
            com.google.android.gms.drive.query.Query r11 = r1.b     // Catch:{ all -> 0x0174 }
            java.lang.String r12 = r1.f     // Catch:{ all -> 0x0174 }
            r15 = r18
            r9.a(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0174 }
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            kec r0 = r1.h     // Catch:{ all -> 0x0174 }
            kkf r0 = r0.e     // Catch:{ all -> 0x0174 }
            r0.f()     // Catch:{ all -> 0x0174 }
            kec r0 = r1.h
            kkf r0 = r0.e
            r0.e()
            if (r2 == 0) goto L_0x00a7
            boolean r0 = r1.a
            if (r0 != 0) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            r2.a()
        L_0x00a7:
            boolean r0 = r1.a
            if (r0 != 0) goto L_0x0173
            if (r2 != 0) goto L_0x00cc
            kgn r2 = r1.i
            kgo r0 = r2.c     // Catch:{ RemoteException -> 0x00c2 }
            kwg r0 = r0.b     // Catch:{ RemoteException -> 0x00c2 }
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x00c2 }
            r4 = 7
            r3.<init>(r4)     // Catch:{ RemoteException -> 0x00c2 }
            r0.a((com.google.android.gms.common.api.Status) r3)     // Catch:{ RemoteException -> 0x00c2 }
            lfn r0 = r2.a     // Catch:{ RemoteException -> 0x00c2 }
            r0.b(r4)     // Catch:{ RemoteException -> 0x00c2 }
            goto L_0x00c8
        L_0x00c2:
            r0 = move-exception
            lfn r0 = r2.a
            r0.b()
        L_0x00c8:
            r2.a()
            return
        L_0x00cc:
            kgn r3 = r1.i
            com.google.android.gms.common.data.DataHolder r0 = r2.a     // Catch:{ all -> 0x016e }
            kgo r4 = r3.c     // Catch:{ all -> 0x016e }
            lfq r5 = r4.c     // Catch:{ all -> 0x016e }
            com.google.android.gms.drive.query.Query r6 = r3.b     // Catch:{ all -> 0x016e }
            int r4 = r0.h     // Catch:{ all -> 0x016e }
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x016e }
            r9 = 0
            r10 = 0
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x016e }
            kgo r4 = r3.c     // Catch:{ all -> 0x016e }
            kec r4 = r4.a     // Catch:{ all -> 0x016e }
            com.google.android.gms.drive.query.Query r5 = r3.b     // Catch:{ all -> 0x016e }
            defpackage.iva.a((java.lang.Object) r5)     // Catch:{ all -> 0x016e }
            java.util.Set r6 = r5.a()     // Catch:{ all -> 0x016e }
            java.lang.String r7 = "Query can't have null spaces (have you validated them?)"
            defpackage.iva.a((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x016e }
            java.util.Set r6 = r5.a()     // Catch:{ all -> 0x016e }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x016e }
            r7 = 1
            r6 = r6 ^ r7
            java.lang.String r8 = "Query can't have empty spaces (have you validated them?)"
            defpackage.iva.b(r6, r8)     // Catch:{ all -> 0x016e }
            ldd r4 = r4.p     // Catch:{ all -> 0x016e }
            boolean r6 = defpackage.ljg.a((com.google.android.gms.drive.query.Query) r5)     // Catch:{ all -> 0x016e }
            r8 = 0
            if (r6 != 0) goto L_0x0133
            java.util.Date r6 = r4.a(r5)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x0133
            lcl r5 = r4.a((com.google.android.gms.drive.query.Query) r5, (java.util.Date) r6)     // Catch:{ all -> 0x016e }
            kkf r9 = r4.b     // Catch:{ all -> 0x016e }
            kkz r4 = r4.c     // Catch:{ all -> 0x016e }
            lct r5 = defpackage.lct.a((defpackage.lcl) r5)     // Catch:{ all -> 0x016e }
            long r10 = r6.getTime()     // Catch:{ all -> 0x016e }
            koa r4 = r9.a((defpackage.kkz) r4, (defpackage.lcp) r5, (long) r10)     // Catch:{ all -> 0x016e }
            boolean r5 = r4.ao     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x0132
            boolean r4 = r4.c()     // Catch:{ all -> 0x016e }
            if (r4 == 0) goto L_0x0132
            r7 = 0
            goto L_0x0134
        L_0x0132:
            goto L_0x0134
        L_0x0133:
            r7 = 0
        L_0x0134:
            com.google.android.gms.drive.internal.OnListEntriesResponse r4 = new com.google.android.gms.drive.internal.OnListEntriesResponse     // Catch:{ all -> 0x016e }
            r4.<init>(r0, r7)     // Catch:{ all -> 0x016e }
            kgo r0 = r3.c     // Catch:{ RemoteException -> 0x0145 }
            kwg r0 = r0.b     // Catch:{ RemoteException -> 0x0145 }
            r0.a((com.google.android.gms.drive.internal.OnListEntriesResponse) r4)     // Catch:{ RemoteException -> 0x0145 }
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x016a
            goto L_0x0167
        L_0x0145:
            r0 = move-exception
            defpackage.jhg.a((android.os.RemoteException) r0)     // Catch:{ RemoteException -> 0x0161 }
            ith r0 = defpackage.kgo.f     // Catch:{ RemoteException -> 0x0161 }
            java.lang.String r4 = "QueryOperation"
            java.lang.String r5 = "Cannot pass complete response over binder!"
            r0.b((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ RemoteException -> 0x0161 }
            lfn r0 = r3.a     // Catch:{ RemoteException -> 0x0161 }
            r4 = 8
            r0.b(r4)     // Catch:{ RemoteException -> 0x0161 }
            kgo r0 = r3.c     // Catch:{ RemoteException -> 0x0161 }
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.c     // Catch:{ RemoteException -> 0x0161 }
            r0.a((com.google.android.gms.common.api.Status) r4)     // Catch:{ RemoteException -> 0x0161 }
            goto L_0x0167
        L_0x0161:
            r0 = move-exception
            lfn r0 = r3.a     // Catch:{ all -> 0x016e }
            r0.b()     // Catch:{ all -> 0x016e }
        L_0x0167:
            r2.a()
        L_0x016a:
            r3.a()
            return
        L_0x016e:
            r0 = move-exception
            r2.a()
            throw r0
        L_0x0173:
            return
        L_0x0174:
            r0 = move-exception
            goto L_0x0177
        L_0x0176:
            r0 = move-exception
        L_0x0177:
            kec r3 = r1.h
            kkf r3 = r3.e
            r3.e()
            if (r2 == 0) goto L_0x0187
            boolean r3 = r1.a
            if (r3 == 0) goto L_0x0187
            r2.a()
        L_0x0187:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdz.a(java.util.List, boolean):void");
    }
}
