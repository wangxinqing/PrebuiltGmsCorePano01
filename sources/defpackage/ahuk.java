package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ahuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahuk {
    public static final ahuk a = new ahuk();
    private static final Logger b = Logger.getLogger(ahuk.class.getSimpleName());
    private final Set c = new HashSet();

    private ahuk() {
    }

    public final synchronized void a(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            File file2 = new File(canonicalPath, ".lck");
            if (file2.exists()) {
                file2.delete();
            }
            this.c.remove(canonicalPath);
        } catch (IOException e) {
            Logger logger = b;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(file.getAbsolutePath());
            logger.logp(level, "com.google.android.location.collectionlib.ScanResultOutputLock", "unlockDirectory", valueOf.length() == 0 ? new String("Failed to unlock directory ") : "Failed to unlock directory ".concat(valueOf));
        }
    }

    public final synchronized void b(String str) {
        a(new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.io.File r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            java.lang.String r1 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            java.lang.String r3 = ".lck"
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            java.util.Set r3 = r7.c     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            boolean r1 = r3.contains(r1)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r1 != 0) goto L_0x0033
            boolean r1 = r2.exists()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            r3 = 0
            if (r1 == 0) goto L_0x0031
            boolean r1 = r2.isFile()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            if (r1 == 0) goto L_0x0031
            long r1 = r2.lastModified()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0033
            r7.a((java.io.File) r8)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
        L_0x0031:
            monitor-exit(r7)
            return r3
        L_0x0033:
            monitor-exit(r7)
            return r0
        L_0x0035:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0038:
            r8 = move-exception
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahuk.b(java.io.File):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[Catch:{ IOException -> 0x0033 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.io.File r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r5 = r5.getCanonicalPath()     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.lang.String r1 = ".lck"
            r0.<init>(r5, r1)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            boolean r1 = r0.exists()     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            if (r1 == 0) goto L_0x001b
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            if (r1 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 1
            goto L_0x001f
        L_0x001b:
            boolean r1 = r0.createNewFile()     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
        L_0x001f:
            if (r1 == 0) goto L_0x002e
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            long r2 = r2 + r6
            r0.setLastModified(r2)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            java.util.Set r6 = r4.c     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
            r6.add(r5)     // Catch:{ IOException -> 0x0033, all -> 0x0030 }
        L_0x002e:
            monitor-exit(r4)
            return r1
        L_0x0030:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0033:
            r5 = move-exception
            r5 = 0
            monitor-exit(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahuk.a(java.io.File, long):boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(String str) {
        return a(new File(str), 7200000);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(String str, long j) {
        return a(new File(str), j);
    }
}
