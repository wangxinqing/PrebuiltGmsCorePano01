package defpackage;

import android.app.usage.StorageStats;
import android.content.pm.PackageStats;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.util.UUID;

/* renamed from: agjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agjr {
    private static final anhq a = anhq.a("agjr");

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        r10 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092 A[ExcHandler: Error (e java.lang.Error), Splitter:B:5:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.PackageStats a(android.content.Context r10) {
        /*
            defpackage.agzj.c()
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            java.lang.Object r0 = r10.getSystemService(r0)
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            r1 = 0
            java.lang.String r2 = "agjr"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 != 0) goto L_0x002a
            anhq r10 = a
            anie r10 = r10.b()
            anhn r10 = (defpackage.anhn) r10
            r0 = 30
            anie r10 = r10.a((java.lang.String) r2, (java.lang.String) r3, (int) r0, (java.lang.String) r4)
            anhn r10 = (defpackage.anhn) r10
            java.lang.String r0 = "StorageManager is not available"
            r10.a((java.lang.String) r0)
            return r1
        L_0x002a:
            java.lang.Class<android.app.usage.StorageStatsManager> r5 = android.app.usage.StorageStatsManager.class
            java.lang.Object r5 = r10.getSystemService(r5)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            android.app.usage.StorageStatsManager r5 = (android.app.usage.StorageStatsManager) r5     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            android.content.pm.PackageStats r6 = new android.content.pm.PackageStats     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            r6.<init>(r10)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            java.util.List r0 = r0.getStorageVolumes()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
        L_0x0043:
            boolean r7 = r0.hasNext()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            if (r7 == 0) goto L_0x0091
            java.lang.Object r7 = r0.next()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            android.os.storage.StorageVolume r7 = (android.os.storage.StorageVolume) r7     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r8 = r7.getState()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r9 = "mounted"
            boolean r8 = r8.equals(r9)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            if (r8 == 0) goto L_0x0043
            java.util.UUID r7 = a((android.os.storage.StorageVolume) r7)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            if (r7 == 0) goto L_0x0043
            android.os.UserHandle r8 = android.os.Process.myUserHandle()     // Catch:{ NameNotFoundException -> 0x0077, IOException -> 0x0075, RuntimeException -> 0x0073, Error -> 0x0092 }
            android.app.usage.StorageStats r8 = r5.queryStatsForPackage(r7, r10, r8)     // Catch:{ NameNotFoundException -> 0x0077, IOException -> 0x0075, RuntimeException -> 0x0073, Error -> 0x0092 }
            java.util.UUID r9 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ NameNotFoundException -> 0x0077, IOException -> 0x0075, RuntimeException -> 0x0073, Error -> 0x0092 }
            boolean r7 = r9.equals(r7)     // Catch:{ NameNotFoundException -> 0x0077, IOException -> 0x0075, RuntimeException -> 0x0073, Error -> 0x0092 }
            a(r6, r8, r7)     // Catch:{ NameNotFoundException -> 0x0077, IOException -> 0x0075, RuntimeException -> 0x0073, Error -> 0x0092 }
            goto L_0x0043
        L_0x0073:
            r7 = move-exception
            goto L_0x0078
        L_0x0075:
            r7 = move-exception
            goto L_0x0078
        L_0x0077:
            r7 = move-exception
        L_0x0078:
            anhq r8 = a     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            anie r8 = r8.c()     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            anhn r8 = (defpackage.anhn) r8     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            r8.a((java.lang.Throwable) r7)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            r7 = 48
            anie r7 = r8.a((java.lang.String) r2, (java.lang.String) r3, (int) r7, (java.lang.String) r4)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            anhn r7 = (defpackage.anhn) r7     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r8 = "queryStatsForPackage() call failed"
            r7.a((java.lang.String) r8)     // Catch:{ RuntimeException -> 0x0094, Error -> 0x0092 }
            goto L_0x0043
        L_0x0091:
            return r6
        L_0x0092:
            r10 = move-exception
            goto L_0x0095
        L_0x0094:
            r10 = move-exception
        L_0x0095:
            anhq r0 = a
            anie r0 = r0.c()
            anhn r0 = (defpackage.anhn) r0
            r0.a((java.lang.Throwable) r10)
            r10 = 55
            anie r10 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r10, (java.lang.String) r4)
            anhn r10 = (defpackage.anhn) r10
            java.lang.String r0 = "StorageStatsManager is not available"
            r10.a((java.lang.String) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agjr.a(android.content.Context):android.content.pm.PackageStats");
    }

    private static UUID a(StorageVolume storageVolume) {
        String uuid = storageVolume.getUuid();
        if (uuid == null) {
            return StorageManager.UUID_DEFAULT;
        }
        try {
            return UUID.fromString(uuid);
        } catch (IllegalArgumentException e) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e);
            ((anhn) anhn.a("agjr", "a", 70, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid UUID format: '%s'", (Object) uuid);
            return null;
        }
    }

    private static void a(PackageStats packageStats, StorageStats storageStats, boolean z) {
        if (!z) {
            packageStats.externalCodeSize += storageStats.getAppBytes();
            packageStats.externalDataSize += storageStats.getDataBytes() - storageStats.getCacheBytes();
            packageStats.externalCacheSize += storageStats.getCacheBytes();
            return;
        }
        packageStats.codeSize += storageStats.getAppBytes();
        packageStats.dataSize += storageStats.getDataBytes() - storageStats.getCacheBytes();
        packageStats.cacheSize += storageStats.getCacheBytes();
    }
}
