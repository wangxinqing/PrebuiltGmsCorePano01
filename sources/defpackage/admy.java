package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;

/* renamed from: admy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admy {
    private static final iwd a = adnt.e("PackageFiles");
    private static final Pattern b = Pattern.compile("(.*)(/cache)(/.*|$)");

    public static long a(Context context, String str, boolean z) {
        if (!ayqi.b() || !jkr.e() || a(str)) {
            StatFs statFs = new StatFs(str);
            int i = Build.VERSION.SDK_INT;
            return statFs.getAvailableBytes();
        }
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        if (z) {
            try {
                return storageManager.getAllocatableBytes(storageManager.getUuidForPath(new File(str)), 1);
            } catch (SecurityException e) {
                a.d("Failed to getAllocatableBytes using aggressive flag for %s, falling back to regular getAllocatableBytes.", e, str);
            }
        }
        return storageManager.getAllocatableBytes(storageManager.getUuidForPath(new File(str)));
    }

    public static File b() {
        File file = new File("/cache");
        file.mkdirs();
        return file;
    }

    public static void b(Context context) {
        if (((Boolean) ((adrn) adrn.a.b()).b(adls.k)).booleanValue()) {
            b(a());
            b(a(context));
            jjc.a(new File(b(), "update.zip"));
            jjc.a(new File(b(), "update_s.zip"));
            jjc.a(new File(b(), "care_map.pb"));
            jjc.a(new File(b(), "care_map.txt"));
            jjc.a(new File(b(), "metadata"));
            ((adrn) adrn.a.b()).a(adls.k.b(false));
        }
    }

    public static File a() {
        return new File("/data/ota_package");
    }

    public static File a(Context context) {
        return context.getDir("download", 0);
    }

    private static void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File a2 : listFiles) {
                jjc.a(a2);
            }
        }
    }

    public static RandomAccessFile a(Context context, File file, long j, boolean z) {
        ((adrn) adrn.a.b()).a(adls.k.b(true));
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        if (!ayqi.b() || !jkr.e() || a(file.getAbsolutePath())) {
            a.c("Allocating file %s with size %d.", file.getAbsolutePath(), Long.valueOf(j));
            int i = Build.VERSION.SDK_INT;
            try {
                Os.posix_fallocate(randomAccessFile.getFD(), 0, j);
                randomAccessFile.setLength(j);
                return randomAccessFile;
            } catch (Exception e) {
                throw new IOException("Unable to allocate the file.", e);
            }
        } else {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            if (z) {
                try {
                    a.c("Aggressive allocating space for file %s with size %d.", file.getAbsolutePath(), Long.valueOf(j));
                    storageManager.allocateBytes(randomAccessFile.getFD(), j, 1);
                    return randomAccessFile;
                } catch (SecurityException e2) {
                    a.d("Failed to aggressive allocate space for %s using StorageManager, falling back to regular allocate using StorageManager.", e2, file.getName());
                }
            }
            a.c("Allocating space for file %s with size %d.", file.getAbsolutePath(), Long.valueOf(j));
            storageManager.allocateBytes(randomAccessFile.getFD(), j);
            return randomAccessFile;
        }
    }

    public static void a(File file) {
        int i = Build.VERSION.SDK_INT;
        String path = file.getPath();
        int gidForName = Process.getGidForName("cache");
        if (gidForName != -1) {
            try {
                Os.chown(path, Os.getuid(), gidForName);
                Os.chmod(path, 416);
            } catch (Exception e) {
                a.e("Failed to set group owner for the file: %s.", e, path);
            }
        }
    }

    private static boolean a(String str) {
        return b.matcher(str).matches();
    }
}
