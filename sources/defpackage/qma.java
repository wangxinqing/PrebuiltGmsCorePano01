package defpackage;

import android.content.pm.PackageInfo;
import android.os.ParcelFileDescriptor;

/* renamed from: qma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qma extends jba {
    private final qlx a;
    private final ifu d;
    private final PackageInfo e;
    private final ParcelFileDescriptor f;

    public qma(qlx qlx, ifu ifu, PackageInfo packageInfo, ParcelFileDescriptor parcelFileDescriptor) {
        super(121, "SetAppStorageDataOperation");
        this.a = qlx;
        this.d = ifu;
        this.e = packageInfo;
        this.f = parcelFileDescriptor;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
        defpackage.qmb.a.a(r0, "Failed to persist instant app data.", new java.lang.Object[0]);
        r1.d.a(com.google.android.gms.common.api.Status.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9 A[ExcHandler: qlw (r0v2 'e' qlw A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = 0
            qlx r3 = r1.a     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            android.content.pm.PackageInfo r0 = r1.e     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            java.lang.String r4 = r0.packageName     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            android.content.pm.PackageInfo r0 = r1.e     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            android.os.ParcelFileDescriptor r5 = r1.f     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            defpackage.iva.c(r4)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r3.a()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            long r6 = r5.getStatSize()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r8 = 104857600(0x6400000, double:5.1806538E-316)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x00c1
            java.io.File r6 = r3.b(r4)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            boolean r7 = r6.exists()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            if (r7 == 0) goto L_0x0030
            r6.delete()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
        L_0x0030:
            qgy r7 = r3.d     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            java.nio.charset.Charset r10 = defpackage.qlx.b     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            byte[] r10 = r4.getBytes(r10)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r7.b(r10)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            java.lang.String r10 = r3.e     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            java.io.File[] r7 = r7.listFiles()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            int r10 = r7.length     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r11 = 0
            r13 = 0
        L_0x004a:
            if (r13 >= r10) goto L_0x0077
            r14 = r7[r13]     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            long r15 = r14.length()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            long r15 = r15 + r11
            long r17 = r5.getStatSize()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            long r17 = r8 - r17
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x006f
            java.lang.String r14 = r14.getName()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            int r15 = r14.length()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            int r15 = r15 + -5
            java.lang.String r14 = r14.substring(r2, r15)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r3.a(r14)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            goto L_0x0074
        L_0x006f:
            long r14 = r14.length()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            long r11 = r11 + r14
        L_0x0074:
            int r13 = r13 + 1
            goto L_0x004a
        L_0x0077:
            qix r7 = defpackage.qix.b     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            aucd r7 = r7.o()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            int r8 = r0.length     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r9 = 0
        L_0x007f:
            if (r9 >= r8) goto L_0x0091
            r10 = r0[r9]     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            byte[] r10 = r10.toByteArray()     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            auay r10 = defpackage.auay.a((byte[]) r10)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r7.d((defpackage.auay) r10)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x007f
        L_0x0091:
            android.os.ParcelFileDescriptor$AutoCloseInputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            qgy r5 = r3.d     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            java.nio.charset.Charset r8 = defpackage.qlx.b     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            byte[] r8 = r4.getBytes(r8)     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            aucj r7 = r7.i()     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            qix r7 = (defpackage.qix) r7     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            byte[] r7 = r7.k()     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            r5.a(r8, r7)     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            r6 = 1
            defpackage.jjt.a(r0, r5, r6)     // Catch:{ IOException -> 0x00bc, qlw -> 0x00c9 }
            ifu r0 = r1.d     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            r0.a(r3)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            return
        L_0x00bc:
            r0 = move-exception
            r3.a(r4)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            throw r0     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
        L_0x00c1:
            qlw r0 = new qlw     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            java.lang.String r3 = "Data size too big."
            r0.<init>(r3)     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
            throw r0     // Catch:{ IOException -> 0x00db, qlw -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            qfn r3 = defpackage.qmb.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Failed to persist instant app data."
            r3.a(r0, r4, r2)
            ifu r0 = r1.d
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.c
            r0.a(r2)
            return
        L_0x00db:
            r0 = move-exception
            qfn r3 = defpackage.qmb.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Unexpected failure to persist instant app data"
            r3.a(r0, r4, r2)
            ifu r0 = r1.d
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.c
            r0.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qma.a(android.content.Context):void");
    }
}
