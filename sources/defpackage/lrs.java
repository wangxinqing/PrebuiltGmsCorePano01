package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;

/* renamed from: lrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrs {
    private static final ith b = new ith("FileSystemUtils", "");
    public final Context a;
    private final ixk c;

    public lrs(Context context) {
        ixk ixk = ixk.a;
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) ixk);
        this.c = ixk;
    }

    private final boolean g() {
        return this.c.a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final long b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long a2 = a(statFs);
        int i = Build.VERSION.SDK_INT;
        return a2 * statFs.getBlockCountLong();
    }

    public final long c() {
        long longValue = ((Long) jzq.x.c()).longValue();
        double doubleValue = ((Double) jzq.y.c()).doubleValue();
        long b2 = b();
        long max = Math.max(0, a() - ((Long) jzq.z.c()).longValue());
        double d = (double) b2;
        Double.isNaN(d);
        return Math.min(Math.min(longValue, (long) (doubleValue * d)), max);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File d() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.g()     // Catch:{ all -> 0x0027 }
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r4.a     // Catch:{ all -> 0x0027 }
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "pinned_docs_files_do_not_edit"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0027 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r4)
            return r2
        L_0x0025:
            monitor-exit(r4)
            return r1
        L_0x0027:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrs.d():java.io.File");
    }

    public final File e() {
        File dir = this.a.getDir("drive_content_do_not_modify", 0);
        a(dir);
        return dir;
    }

    public final File f() {
        File externalFilesDir;
        if (!g()) {
            return null;
        }
        try {
            if (Environment.isExternalStorageEmulated() || (externalFilesDir = this.a.getExternalFilesDir((String) null)) == null) {
                return null;
            }
            try {
                File file = new File(externalFilesDir, "drive_content_do_not_modify");
                a(file);
                return file;
            } catch (IOException e) {
                b.c("FileSystemUtils", "Unable to create shared content directory; disabling shared storage.", e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            b.c("FileSystemUtils", "Unable to locate external storage device; disabling shared storage.", e2);
            return null;
        }
    }

    private static final long a(StatFs statFs) {
        int i = Build.VERSION.SDK_INT;
        return statFs.getBlockSizeLong();
    }

    private static final void a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 42);
                sb.append("Unable to create directory: ");
                sb.append(absolutePath);
                sb.append(" - file exists");
                throw new IOException(sb.toString());
            }
        }
        if (!file.mkdirs()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() == 0 ? new String("Unable to create cache directory: ") : "Unable to create cache directory: ".concat(valueOf));
        }
    }

    public final long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long a2 = a(statFs);
        int i = Build.VERSION.SDK_INT;
        return a2 * statFs.getAvailableBlocksLong();
    }
}
