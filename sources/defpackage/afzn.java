package defpackage;

import java.io.File;

/* renamed from: afzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzn implements agae {
    private static final String a = afzn.class.getSimpleName();
    private final File b;
    private final File c;

    public afzn(File file, String str) {
        this.b = file;
        this.c = new File(file, str);
    }

    public final long a() {
        return this.c.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd A[Catch:{ all -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d0 A[Catch:{ all -> 0x00c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.io.InputStream r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Error closing buffered source"
            java.lang.String r1 = "Error closing download file"
            java.io.File r2 = r9.b
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x002c
            java.io.File r2 = r9.b
            boolean r2 = r2.mkdirs()
            if (r2 != 0) goto L_0x002c
            java.io.File r2 = r9.b
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x001d
            goto L_0x002c
        L_0x001d:
            agaa r10 = new agaa
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Error creating output directory"
            r11.<init>(r12)
            afzo r12 = defpackage.afzo.FILE_SYSTEM_ERROR
            r10.<init>(r11, r12)
            throw r10
        L_0x002c:
            java.io.File r2 = r9.c
            long r2 = r2.length()
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00eb
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0043
            java.io.File r11 = r9.c
            batz r11 = defpackage.batq.b((java.io.File) r11)
            goto L_0x0049
        L_0x0043:
            java.io.File r11 = r9.c
            batz r11 = defpackage.batq.c((java.io.File) r11)
        L_0x0049:
            baua r10 = defpackage.batq.a((java.io.InputStream) r10)
            batf r10 = defpackage.batq.a((defpackage.baua) r10)
            batd r12 = new batd     // Catch:{ IOException -> 0x00c7 }
            r12.<init>()     // Catch:{ IOException -> 0x00c7 }
            r4 = r2
        L_0x0057:
            boolean r6 = r10.b()     // Catch:{ IOException -> 0x00c2 }
            if (r6 == 0) goto L_0x00b0
            r11.flush()     // Catch:{ IOException -> 0x00c7 }
            java.io.File r12 = r9.c     // Catch:{ IOException -> 0x00c7 }
            long r2 = r12.length()     // Catch:{ IOException -> 0x00c7 }
            java.io.File r12 = r9.c     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r6 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x00c7 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x00c7 }
            int r6 = r6 + 92
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c7 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r6 = "Wrote response to file: "
            r7.append(r6)     // Catch:{ IOException -> 0x00c7 }
            r7.append(r12)     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r12 = ", size: "
            r7.append(r12)     // Catch:{ IOException -> 0x00c7 }
            r7.append(r2)     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r12 = " bytes, read: "
            r7.append(r12)     // Catch:{ IOException -> 0x00c7 }
            r7.append(r4)     // Catch:{ IOException -> 0x00c7 }
            java.lang.String r12 = " bytes"
            r7.append(r12)     // Catch:{ IOException -> 0x00c7 }
            r7.toString()     // Catch:{ IOException -> 0x00c7 }
            r11.close()     // Catch:{ IOException -> 0x009f }
            goto L_0x00a5
        L_0x009f:
            r11 = move-exception
            java.lang.String r12 = a
            android.util.Log.wtf(r12, r1, r11)
        L_0x00a5:
            r10.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00af
        L_0x00a9:
            r10 = move-exception
            java.lang.String r11 = a
            android.util.Log.wtf(r11, r0, r10)
        L_0x00af:
            return r2
        L_0x00b0:
            r6 = 65536(0x10000, double:3.2379E-319)
            r10.c(r12, r6)     // Catch:{ IOException -> 0x00c2 }
            long r6 = r12.b     // Catch:{ IOException -> 0x00c7 }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x00bd
            goto L_0x00c0
        L_0x00bd:
            r11.a(r12, r6)     // Catch:{ IOException -> 0x00c7 }
        L_0x00c0:
            long r4 = r4 + r6
            goto L_0x0057
        L_0x00c2:
            r12 = move-exception
            r2 = 1
            goto L_0x00c9
        L_0x00c5:
            r12 = move-exception
            goto L_0x00d6
        L_0x00c7:
            r12 = move-exception
            r2 = 0
        L_0x00c9:
            agaa r3 = new agaa     // Catch:{ all -> 0x00c5 }
            if (r2 != 0) goto L_0x00d0
            afzo r2 = defpackage.afzo.DISK_IO_ERROR     // Catch:{ all -> 0x00c5 }
            goto L_0x00d2
        L_0x00d0:
            afzo r2 = defpackage.afzo.NETWORK_IO_ERROR     // Catch:{ all -> 0x00c5 }
        L_0x00d2:
            r3.<init>(r12, r2)     // Catch:{ all -> 0x00c5 }
            throw r3     // Catch:{ all -> 0x00c5 }
        L_0x00d6:
            r11.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00e0
        L_0x00da:
            r11 = move-exception
            java.lang.String r2 = a
            android.util.Log.wtf(r2, r1, r11)
        L_0x00e0:
            r10.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00ea
        L_0x00e4:
            r10 = move-exception
            java.lang.String r11 = a
            android.util.Log.wtf(r11, r0, r10)
        L_0x00ea:
            throw r12
        L_0x00eb:
            java.io.IOException r10 = new java.io.IOException
            java.io.File r0 = r9.c
            long r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 100
            r2.<init>(r3)
            java.lang.String r3 = "Given offsetBytes does not correspond with existing data: "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = ", "
            r2.append(r11)
            r2.append(r0)
            java.lang.String r11 = r2.toString()
            r10.<init>(r11)
            goto L_0x0113
        L_0x0112:
            throw r10
        L_0x0113:
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzn.a(java.io.InputStream, long):long");
    }
}
