package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.managed.ui.ManagingAppInstallBroadcastReceiver;

/* renamed from: gis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gis extends Loader implements gir {
    public static final iwd a = ehv.a("AuthManaged", "ManagingAppInstallLoader");
    public Intent b;
    private final avwi c;
    private final gjh d;
    private final ManagingAppInstallBroadcastReceiver e = new ManagingAppInstallBroadcastReceiver(ihs.b(), this, this.c);
    private final long f;
    private Integer g;
    private Integer h;
    private boolean i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gis(Context context, long j, avwi avwi) {
        super(context);
        gjh a2 = gjh.a();
        this.f = j;
        this.c = avwi;
        this.d = a2;
    }

    public final void a(Intent intent) {
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        getContext().startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        this.h = null;
        if (this.i) {
            this.e.b();
            if (this.g != null) {
                Context context = getContext();
                int intValue = this.g.intValue();
                int i2 = Build.VERSION.SDK_INT;
                try {
                    context.getPackageManager().getPackageInstaller().abandonSession(intValue);
                } catch (SecurityException e2) {
                }
                this.g = null;
            }
            this.i = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c7, code lost:
        r2 = null;
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        r3 = null;
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00de, code lost:
        r2 = r4;
        r4 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd A[ExcHandler: all (th java.lang.Throwable), PHI: r4 
      PHI: (r4v10 android.os.ParcelFileDescriptor) = (r4v1 android.os.ParcelFileDescriptor), (r4v1 android.os.ParcelFileDescriptor), (r4v19 android.os.ParcelFileDescriptor) binds: [B:12:0x004b, B:14:0x0074, B:18:0x00bb] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStartLoading() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "Cannot find download file."
            iwd r0 = a
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "onStartLoading"
            r0.c(r5, r4)
            java.lang.Integer r0 = r1.h
            r4 = 0
            if (r0 != 0) goto L_0x001d
            android.content.Intent r0 = r1.b
            if (r0 == 0) goto L_0x0020
            r1.a((android.content.Intent) r0)
            r1.b = r4
            goto L_0x0020
        L_0x001d:
            r1.deliverResult((java.lang.Integer) r0)
        L_0x0020:
            boolean r0 = r1.i
            if (r0 != 0) goto L_0x013e
            r0 = 1
            r1.i = r0
            com.google.android.gms.auth.managed.ui.ManagingAppInstallBroadcastReceiver r5 = r1.e
            r5.a()
            gjh r5 = r1.d
            android.content.Context r6 = r20.getContext()
            long r7 = r1.f
            avwi r9 = r1.c
            int r10 = android.os.Build.VERSION.SDK_INT
            defpackage.iva.a((java.lang.Object) r9)
            java.lang.String r10 = "download"
            java.lang.Object r10 = r6.getSystemService(r10)
            android.app.DownloadManager r10 = (android.app.DownloadManager) r10
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.a
            android.os.ParcelFileDescriptor r7 = r10.openDownloadedFile(r7)     // Catch:{ FileNotFoundException -> 0x0103, IOException -> 0x00ee, all -> 0x00eb }
            if (r7 == 0) goto L_0x00ce
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            java.io.FileDescriptor r10 = r7.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r8.<init>(r10)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            android.content.pm.PackageInstaller$SessionParams r10 = new android.content.pm.PackageInstaller$SessionParams     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r10.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            java.lang.String r0 = r9.c     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r10.setAppLabel(r0)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            java.lang.String r0 = r9.b     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r10.setAppPackageName(r0)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            long r14 = r9.e     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r10.setSize(r14)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            int r10 = r0.createSession(r10)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            android.content.pm.PackageInstaller$Session r4 = r0.openSession(r10)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r0 = defpackage.jhg.b((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            java.security.DigestOutputStream r15 = new java.security.DigestOutputStream     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            java.lang.String r14 = r9.b     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            r16 = 0
            long r12 = r9.e     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            r18 = r14
            r14 = r4
            r3 = r15
            r15 = r18
            r18 = r12
            java.io.OutputStream r12 = r14.openWrite(r15, r16, r18)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            r3.<init>(r12, r0)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            defpackage.jjt.a(r8, r3)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            r3.close()     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            byte[] r0 = r0.digest()     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            boolean r0 = r5.a((byte[]) r0, (defpackage.avwi) r9)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            if (r0 == 0) goto L_0x00bb
            android.content.Intent r0 = new android.content.Intent     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            java.lang.String r3 = "com.google.android.gms.auth.DM_PACKAGE_INSTALLED"
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            r3 = 134217728(0x8000000, float:3.85186E-34)
            r5 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r6, r5, r0, r3)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            android.content.IntentSender r0 = r0.getIntentSender()     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            r4.commit(r0)     // Catch:{ FileNotFoundException -> 0x00ca, IOException -> 0x00c6, all -> 0x00dd }
            goto L_0x00d6
        L_0x00bb:
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r0 = 21515(0x540b, float:3.0149E-41)
            java.lang.String r3 = "Package signature mismatch."
            r11.<init>(r0, r3)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r10 = -1
            goto L_0x00d6
        L_0x00c6:
            r0 = move-exception
            r2 = r4
            r4 = r7
            goto L_0x00f1
        L_0x00ca:
            r0 = move-exception
            r3 = r4
            r4 = r7
            goto L_0x0106
        L_0x00ce:
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r3 = 21513(0x5409, float:3.0146E-41)
            r11.<init>(r3, r2)     // Catch:{ FileNotFoundException -> 0x00e6, IOException -> 0x00e1, all -> 0x00dd }
            r10 = -1
        L_0x00d6:
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r7)
            defpackage.jjt.a((java.io.Closeable) r4)
            goto L_0x0113
        L_0x00dd:
            r0 = move-exception
            r2 = r4
            r4 = r7
            goto L_0x0137
        L_0x00e1:
            r0 = move-exception
            r2 = r4
            r4 = r7
            r10 = -1
            goto L_0x00f1
        L_0x00e6:
            r0 = move-exception
            r3 = r4
            r4 = r7
            r10 = -1
            goto L_0x0106
        L_0x00eb:
            r0 = move-exception
            r2 = r4
            goto L_0x0137
        L_0x00ee:
            r0 = move-exception
            r2 = r4
            r10 = -1
        L_0x00f1:
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0101 }
            r0 = 21516(0x540c, float:3.015E-41)
            java.lang.String r3 = "IOException during installation."
            r11.<init>(r0, r3)     // Catch:{ all -> 0x0101 }
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r4)
            defpackage.jjt.a((java.io.Closeable) r2)
            goto L_0x0113
        L_0x0101:
            r0 = move-exception
            goto L_0x0137
        L_0x0103:
            r0 = move-exception
            r3 = r4
            r10 = -1
        L_0x0106:
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0135 }
            r5 = 21513(0x5409, float:3.0146E-41)
            r11.<init>(r5, r2)     // Catch:{ all -> 0x0135 }
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r4)
            defpackage.jjt.a((java.io.Closeable) r3)
        L_0x0113:
            gjf r0 = new gjf
            r0.<init>(r11, r10)
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a
            com.google.android.gms.common.api.Status r3 = r0.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x012b
            int r0 = r0.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.g = r0
            return
        L_0x012b:
            r2 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.deliverResult((java.lang.Integer) r0)
            return
        L_0x0135:
            r0 = move-exception
            r2 = r3
        L_0x0137:
            defpackage.jjt.a((android.os.ParcelFileDescriptor) r4)
            defpackage.jjt.a((java.io.Closeable) r2)
            throw r0
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gis.onStartLoading():void");
    }

    /* renamed from: a */
    public final void deliverResult(Integer num) {
        this.h = num;
        super.deliverResult(num);
    }
}
