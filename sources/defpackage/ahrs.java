package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrs implements ahtm {
    private static final Set o;
    public final Context a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Handler e;
    public final ahry f;
    public long g;
    public final ajrh h;
    public final byte[] i;
    public volatile boolean j = false;
    public final ajbg k;
    public volatile boolean l = false;
    public final CountDownLatch m = new CountDownLatch(1);
    public ahrr n;
    private final Runnable p = new ahrj(this);

    static {
        HashSet hashSet = new HashSet();
        o = hashSet;
        hashSet.add(".lck");
        o.add("sessionId");
        o.add("uploadedSeq");
        o.add("sessionSummary");
    }

    public ahrs(Context context, ajbg ajbg, String str, String str2, byte[] bArr, ahry ahry, Looper looper, ajrh ajrh) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (looper != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "looper could not be null when listener is not null.");
        amrl.a((Object) context);
        amrl.a((Object) str);
        if (bArr != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.a(z2, (Object) "Need non empty key");
        amrl.a(bArr.length == 32 ? true : z3, (Object) "signingKey needs to be 32 byte long.");
        this.h = ahvx.a(ajrh);
        this.a = context;
        this.b = str2;
        this.k = ajbg;
        if (!str.endsWith("/")) {
            this.c = String.valueOf(str).concat("/");
        } else {
            this.c = str;
        }
        this.i = bArr;
        this.d = true;
        this.f = ahry;
        this.e = new qvr(looper);
    }

    public final void a() {
        Thread thread = new Thread(this.p, "BatchScanResultUploader.Thread");
        thread.setPriority(4);
        thread.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006a A[SYNTHETIC, Splitter:B:42:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.c
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r2.<init>(r0, r7)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            if (r0 == 0) goto L_0x0039
            boolean r0 = r2.isDirectory()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0037 }
            r2.<init>()     // Catch:{ IOException -> 0x0037 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x0037 }
        L_0x0022:
            int r4 = r0.read(r3)     // Catch:{ IOException -> 0x0037 }
            if (r4 >= 0) goto L_0x0032
            byte[] r7 = r2.toByteArray()     // Catch:{ IOException -> 0x0037 }
            r0.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x005d
        L_0x0030:
            r0 = move-exception
            goto L_0x005d
        L_0x0032:
            r5 = 0
            r2.write(r3, r5, r4)     // Catch:{ IOException -> 0x0037 }
            goto L_0x0022
        L_0x0037:
            r2 = move-exception
            goto L_0x003f
        L_0x0039:
            r7 = r1
            goto L_0x005d
        L_0x003b:
            r7 = move-exception
            goto L_0x0068
        L_0x003d:
            r0 = move-exception
            r0 = r1
        L_0x003f:
            java.lang.String r2 = "Could not read file: "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0066 }
            int r3 = r7.length()     // Catch:{ all -> 0x0066 }
            if (r3 != 0) goto L_0x0051
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0066 }
            r7.<init>(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x0054
        L_0x0051:
            r2.concat(r7)     // Catch:{ all -> 0x0066 }
        L_0x0054:
            if (r0 == 0) goto L_0x005c
            r0.close()     // Catch:{ IOException -> 0x005b }
            r7 = r1
            goto L_0x005d
        L_0x005b:
            r7 = move-exception
        L_0x005c:
            r7 = r1
        L_0x005d:
            if (r7 == 0) goto L_0x0065
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            return r0
        L_0x0065:
            return r1
        L_0x0066:
            r7 = move-exception
            r1 = r0
        L_0x0068:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x006f
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            goto L_0x0071
        L_0x0070:
            throw r7
        L_0x0071:
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrs.b(java.lang.String):java.lang.String");
    }

    public final void b() {
        this.l = true;
    }

    public final void c() {
        if (System.currentTimeMillis() > this.g) {
            ahuk.a.a(this.c);
            this.g = System.currentTimeMillis() + 3600000;
        }
    }

    public final boolean d() {
        File file = new File(this.c);
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                if (valueOf.length() == 0) {
                    new String("Error: Trying to delete non-directory");
                } else {
                    "Error: Trying to delete non-directory".concat(valueOf);
                }
                return false;
            }
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    File file2 = listFiles[i2];
                    if (file2.isDirectory() || !o.contains(file2.getName())) {
                        break;
                    }
                    i2++;
                } else if (listFiles.length <= o.size()) {
                    return a(file);
                }
            }
            return false;
        } catch (SecurityException e2) {
            String valueOf2 = String.valueOf(file.getAbsolutePath());
            if (valueOf2.length() == 0) {
                new String("Failed to delete directory ");
            } else {
                "Failed to delete directory ".concat(valueOf2);
            }
        }
    }

    public final void a(String str) {
        if (this.f != null) {
            this.e.post(new ahrk(this, str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[SYNTHETIC, Splitter:B:18:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[SYNTHETIC, Splitter:B:24:0x003c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.lang.String r6) {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.c
            java.lang.String r2 = "sessionId"
            r0.<init>(r1, r2)
            r1 = 1
            r2 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            r4.<init>(r0, r3)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            r4.write(r6)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            r4.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r6 = move-exception
        L_0x001d:
            return r1
        L_0x001e:
            r6 = move-exception
            r2 = r4
            goto L_0x003a
        L_0x0021:
            r6 = move-exception
            r2 = r4
            goto L_0x0027
        L_0x0024:
            r6 = move-exception
            goto L_0x003a
        L_0x0026:
            r6 = move-exception
        L_0x0027:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0039 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0039 }
            r0[r3] = r6     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
            r6 = move-exception
        L_0x0038:
            return r3
        L_0x0039:
            r6 = move-exception
        L_0x003a:
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrs.c(java.lang.String):boolean");
    }

    public final boolean a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    file2.delete();
                }
            }
            if (file.delete()) {
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 19);
                sb.append("Directory ");
                sb.append(absolutePath);
                sb.append(" deleted.");
                sb.toString();
                return true;
            }
            String valueOf = String.valueOf(file.getAbsolutePath());
            if (valueOf.length() == 0) {
                new String("Failed to delete directory ");
            } else {
                "Failed to delete directory ".concat(valueOf);
            }
        }
        return false;
    }
}
