package defpackage;

/* renamed from: agwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agwk implements amsv {
    private final agwo a;

    public agwk(agwo agwo) {
        this.a = agwo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        defpackage.apev.a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        android.os.StrictMode.setThreadPolicy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r5 = this;
            agwo r0 = r5.a
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            java.io.File r3 = r0.b()     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            agxe r3 = defpackage.agxe.g     // Catch:{ all -> 0x001d }
            aucj r3 = defpackage.aucj.a((defpackage.aucj) r3, (java.io.InputStream) r2)     // Catch:{ all -> 0x001d }
            agxe r3 = (defpackage.agxe) r3     // Catch:{ all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x001b, all -> 0x0027 }
            goto L_0x002f
        L_0x001b:
            r2 = move-exception
            goto L_0x002f
        L_0x001d:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r2 = move-exception
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r2)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
        L_0x0026:
            throw r3     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)
            throw r0
        L_0x002c:
            r2 = move-exception
            r2 = 0
            r3 = r2
        L_0x002f:
            android.os.StrictMode.setThreadPolicy(r1)
            if (r3 == 0) goto L_0x005d
            java.lang.String r1 = r3.b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x005d
            agvm r1 = r0.b
            android.content.Context r1 = r1.d
            yey r1 = defpackage.yef.a((android.content.Context) r1)
            java.lang.String r2 = r3.b
            acwa r1 = r1.a((java.lang.String) r2)
            agvm r2 = r0.b
            aorv r2 = r2.a()
            agwm r4 = new agwm
            r4.<init>(r0)
            acvp r0 = defpackage.agwu.a((defpackage.acvp) r4)
            r1.a((java.util.concurrent.Executor) r2, (defpackage.acvp) r0)
            goto L_0x0060
        L_0x005d:
            r0.a()
        L_0x0060:
            if (r3 != 0) goto L_0x0065
            anaf r0 = defpackage.anfu.b
            goto L_0x0069
        L_0x0065:
            java.util.Map r0 = defpackage.agwo.a(r3)
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agwk.a():java.lang.Object");
    }
}
