package defpackage;

import android.os.Looper;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;

/* renamed from: aazu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazu extends qvr {
    final /* synthetic */ InternalApkUploadChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aazu(InternalApkUploadChimeraService internalApkUploadChimeraService, Looper looper) {
        super(looper);
        this.a = internalApkUploadChimeraService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            int r0 = r14.arg1
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r14.what
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 1
            r2[r5] = r3
            int r14 = r14.what
            if (r14 == 0) goto L_0x0036
            if (r14 == r5) goto L_0x0026
            if (r14 == r1) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            com.google.android.gms.security.verifier.InternalApkUploadChimeraService r14 = r13.a
            int r1 = com.google.android.gms.security.verifier.InternalApkUploadChimeraService.a
            r14.a((int) r0)
            return
        L_0x0026:
            com.google.android.gms.security.verifier.InternalApkUploadChimeraService r14 = r13.a
            int r1 = com.google.android.gms.security.verifier.InternalApkUploadChimeraService.a
            boolean r14 = r14.a((int) r0)
            if (r14 != 0) goto L_0x0035
            com.google.android.gms.security.verifier.InternalApkUploadChimeraService r14 = r13.a
            r14.a((boolean) r5)
        L_0x0035:
            return
        L_0x0036:
            com.google.android.gms.security.verifier.InternalApkUploadChimeraService r14 = r13.a
            aazk r2 = r14.f
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0174
            java.lang.Object r3 = r2.next()
            com.google.android.gms.security.verifier.ApkUploadEntry r3 = (com.google.android.gms.security.verifier.ApkUploadEntry) r3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r3.toString()
            r6[r4] = r7
            android.content.pm.PackageManager r6 = r14.getPackageManager()
            java.lang.String r7 = r3.b     // Catch:{ NameNotFoundException -> 0x005d }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r6 = move-exception
            r6 = 0
        L_0x005f:
            java.lang.String r7 = "Upload for package %s has expired, removing from upload queue"
            if (r6 == 0) goto L_0x014a
            int r8 = r3.g
            if (r8 != 0) goto L_0x008e
            int r8 = r3.c
            int r9 = r6.versionCode
            if (r8 != r9) goto L_0x0134
            long r8 = r3.h
            long r10 = r6.lastUpdateTime
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0134
            byte[] r8 = r3.d
            boolean r8 = r14.a((android.content.pm.PackageInfo) r6, (byte[]) r8)
            if (r8 == 0) goto L_0x0085
            aazk r8 = r14.f
            long r9 = r6.lastUpdateTime
            r8.b(r3, r9)
            goto L_0x00d3
        L_0x0085:
            aazk r8 = r14.f
            long r9 = r6.lastUpdateTime
            r8.a(r3, r9)
            goto L_0x0134
        L_0x008e:
            if (r8 == r5) goto L_0x00a9
            java.lang.Object[] r6 = new java.lang.Object[r1]
            long r8 = r3.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6[r4] = r8
            int r8 = r3.g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r5] = r8
            java.lang.String r8 = "Invalid entry state for id=%d: %d"
            defpackage.abaa.a(r8, r6)
            goto L_0x0134
        L_0x00a9:
            int r8 = r3.c
            int r9 = r6.versionCode
            if (r8 == r9) goto L_0x00b5
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            goto L_0x003e
        L_0x00b5:
            long r8 = r3.h
            long r10 = r6.lastUpdateTime
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x00d3
            byte[] r8 = r3.d
            boolean r8 = r14.a((android.content.pm.PackageInfo) r6, (byte[]) r8)
            if (r8 != 0) goto L_0x00cc
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            goto L_0x003e
        L_0x00cc:
            aazk r8 = r14.f
            long r9 = r6.lastUpdateTime
            r8.a(r3, r9)
        L_0x00d3:
            boolean r8 = r14.b()
            if (r8 == 0) goto L_0x0134
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r3.b
            r8[r4] = r9
            java.lang.String r9 = "Starting upload for package %s"
            defpackage.abaa.b(r9, r8)
            java.io.File r8 = new java.io.File
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo
            java.lang.String r6 = r6.sourceDir
            r8.<init>(r6)
            byte[] r6 = r3.d
            byte[] r9 = r3.e
            int r10 = r3.j
            int r6 = r14.a(r8, r6, r9, r10)
            if (r6 != r5) goto L_0x010b
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r3.b
            r6[r4] = r7
            java.lang.String r7 = "Upload for package %s was successful, removing from upload queue"
            defpackage.abaa.b(r7, r6)
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            goto L_0x003e
        L_0x010b:
            int r6 = r3.i
            int r6 = r6 + r5
            r8 = 3
            if (r6 >= r8) goto L_0x0122
            aazk r6 = r14.f
            r6.c(r3)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r8 = r3.b
            r6[r4] = r8
            java.lang.String r8 = "Upload for package %s was not successful"
            defpackage.abaa.b(r8, r6)
            goto L_0x0134
        L_0x0122:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r3.b
            r6[r4] = r7
            java.lang.String r7 = "Retry attempts for package %s exceeded, removing upload"
            defpackage.abaa.b(r7, r6)
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            goto L_0x003e
        L_0x0134:
            boolean r6 = com.google.android.gms.security.verifier.InternalApkUploadChimeraService.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            if (r6 == 0) goto L_0x003e
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r8 = r3.b
            r6[r4] = r8
            defpackage.abaa.b(r7, r6)
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            goto L_0x003e
        L_0x014a:
            int r6 = r3.g
            if (r6 != r5) goto L_0x015e
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r8 = r3.b
            r6[r4] = r8
            java.lang.String r8 = "Package %s is no longer installed, removing from upload queue"
            defpackage.abaa.b(r8, r6)
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
        L_0x015e:
            boolean r6 = com.google.android.gms.security.verifier.InternalApkUploadChimeraService.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            if (r6 == 0) goto L_0x003e
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r8 = r3.b
            r6[r4] = r8
            defpackage.abaa.b(r7, r6)
            aazk r6 = r14.f
            r6.a((com.google.android.gms.security.verifier.ApkUploadEntry) r3)
            goto L_0x003e
        L_0x0174:
            com.google.android.gms.security.verifier.InternalApkUploadChimeraService r14 = r13.a
            int r1 = com.google.android.gms.security.verifier.InternalApkUploadChimeraService.a
            r14.a((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazu.handleMessage(android.os.Message):void");
    }
}
