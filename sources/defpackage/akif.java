package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.places.PlatformKeyManager$1;
import java.io.File;

/* renamed from: akif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akif {
    private static akif b = null;
    public String a = null;
    private final BroadcastReceiver c;
    private final Context d;
    private int e = 0;

    private akif(Context context) {
        this.d = context;
        PlatformKeyManager$1 platformKeyManager$1 = new PlatformKeyManager$1(this, "places");
        this.c = platformKeyManager$1;
        this.d.registerReceiver(platformKeyManager$1, new IntentFilter("com.google.android.places.PLATFORM_KEY_CHANGED_ACTION"), "com.google.android.gms.permission.INTERNAL_BROADCAST", new jfo(new jfp("PLATFORM_KEY_CHANGE_LISTENER", 10)));
    }

    public static akif a(Context context) {
        synchronized (akif.class) {
            if (b == null) {
                b = new akif(context.getApplicationContext());
            }
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[SYNTHETIC, Splitter:B:21:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a A[SYNTHETIC, Splitter:B:29:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067 A[SYNTHETIC, Splitter:B:37:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r8 = this;
            java.lang.String r0 = "Couldn't close platform key inputStream."
            java.lang.String r1 = "Places"
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r8.d
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r4 = "places_PlatformKey"
            r2.<init>(r3, r4)
            r3 = 0
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            r7.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0051, IOException -> 0x0041, all -> 0x003f }
            java.lang.String r5 = r4.readUTF()     // Catch:{ FileNotFoundException -> 0x003d, IOException -> 0x003b, all -> 0x0038 }
            r8.a = r5     // Catch:{ FileNotFoundException -> 0x003d, IOException -> 0x003b, all -> 0x0038 }
            r6 = 0
            r8.e = r6     // Catch:{ FileNotFoundException -> 0x003d, IOException -> 0x003b, all -> 0x0038 }
            r4.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r2 = move-exception
            defpackage.alfy.a(r1, r0)
        L_0x0037:
            return r5
        L_0x0038:
            r2 = move-exception
            r3 = r4
            goto L_0x0065
        L_0x003b:
            r5 = move-exception
            goto L_0x0043
        L_0x003d:
            r2 = move-exception
            goto L_0x0053
        L_0x003f:
            r2 = move-exception
            goto L_0x0065
        L_0x0041:
            r4 = move-exception
            r4 = r3
        L_0x0043:
            java.lang.String r5 = "Unexpected IOException when reading platform key."
            defpackage.alfy.a(r1, r5)     // Catch:{ all -> 0x0063 }
            r8.a((java.io.File) r2)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x0051:
            r2 = move-exception
            r4 = r3
        L_0x0053:
            java.lang.String r2 = "Couldn't find platform key file."
            defpackage.alfy.b(r1, r2)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r2 = move-exception
            defpackage.alfy.a(r1, r0)
        L_0x0062:
            return r3
        L_0x0063:
            r2 = move-exception
            r3 = r4
        L_0x0065:
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r3 = move-exception
            defpackage.alfy.a(r1, r0)
        L_0x006f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akif.b():java.lang.String");
    }

    private final void a(File file) {
        int i = this.e + 1;
        this.e = i;
        if (((long) i) >= azbe.a.a().n()) {
            file.delete();
            alfy.d("Places", "Deleted platform key file due to probable corruption");
        }
    }

    public final synchronized String a() {
        String str;
        str = this.a;
        if (str == null) {
            str = b();
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.DataOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009c A[SYNTHETIC, Splitter:B:51:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be A[SYNTHETIC, Splitter:B:68:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5 A[SYNTHETIC, Splitter:B:77:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e2 A[SYNTHETIC, Splitter:B:83:0x00e2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            defpackage.iva.c(r8)     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = r7.a     // Catch:{ all -> 0x00ef }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x0026
            android.content.Context r0 = r7.d     // Catch:{ all -> 0x00ef }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x00ef }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x00ef }
            if (r1 != 0) goto L_0x0028
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            java.lang.String r8 = "Places"
            java.lang.String r0 = "Failed to create filesDir."
            defpackage.alfy.a(r8, r0)     // Catch:{ all -> 0x00ef }
        L_0x0026:
            monitor-exit(r7)
            return
        L_0x0028:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00ef }
            android.content.Context r1 = r7.d     // Catch:{ all -> 0x00ef }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ all -> 0x00ef }
            java.lang.String r2 = "places_PlatformKey"
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00ef }
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c8, OverlappingFileLockException -> 0x00b1, all -> 0x00af }
            r2.<init>(r0)     // Catch:{ IOException -> 0x00c8, OverlappingFileLockException -> 0x00b1, all -> 0x00af }
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ all -> 0x0098 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ all -> 0x0098 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0094 }
            r5 = 0
            r4.<init>(r2, r5)     // Catch:{ all -> 0x0094 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ all -> 0x0094 }
            r2.<init>(r4)     // Catch:{ all -> 0x0094 }
            r2.writeUTF(r8)     // Catch:{ all -> 0x0092 }
            r2.flush()     // Catch:{ all -> 0x0092 }
            r4.finish()     // Catch:{ all -> 0x0092 }
            r2.close()     // Catch:{ all -> 0x0092 }
            android.content.Context r1 = r7.d     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "com.google.android.places.PLATFORM_KEY_CHANGED_ACTION"
            android.content.Intent r4 = defpackage.jhg.g((java.lang.String) r4)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = "com.google.android.gms.permission.INTERNAL_BROADCAST"
            r1.sendBroadcast(r4, r6)     // Catch:{ all -> 0x0092 }
            r7.e = r5     // Catch:{ all -> 0x0092 }
            r7.a = r8     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x0083
            boolean r8 = r3.isValid()     // Catch:{ IOException -> 0x0080, OverlappingFileLockException -> 0x007d, all -> 0x0079 }
            if (r8 == 0) goto L_0x0083
            r3.release()     // Catch:{ IOException -> 0x0080, OverlappingFileLockException -> 0x007d, all -> 0x0079 }
            goto L_0x0083
        L_0x0079:
            r8 = move-exception
            r1 = r2
            goto L_0x00e0
        L_0x007d:
            r8 = move-exception
            r1 = r2
            goto L_0x00b2
        L_0x0080:
            r8 = move-exception
            r1 = r2
            goto L_0x00c9
        L_0x0083:
            r2.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0086:
            monitor-exit(r7)
            return
        L_0x0088:
            r8 = move-exception
            java.lang.String r8 = "Places"
            java.lang.String r0 = "Couldn't close platform key outputStream."
        L_0x008d:
            defpackage.alfy.a(r8, r0)     // Catch:{ all -> 0x00ef }
        L_0x0090:
            monitor-exit(r7)
            return
        L_0x0092:
            r8 = move-exception
            goto L_0x0096
        L_0x0094:
            r8 = move-exception
            r2 = r1
        L_0x0096:
            r1 = r3
            goto L_0x009a
        L_0x0098:
            r8 = move-exception
            r2 = r1
        L_0x009a:
            if (r1 == 0) goto L_0x00a5
            boolean r3 = r1.isValid()     // Catch:{ IOException -> 0x00ac, OverlappingFileLockException -> 0x00a9, all -> 0x00a6 }
            if (r3 == 0) goto L_0x00a5
            r1.release()     // Catch:{ IOException -> 0x00ac, OverlappingFileLockException -> 0x00a9, all -> 0x00a6 }
        L_0x00a5:
            throw r8     // Catch:{ IOException -> 0x00ac, OverlappingFileLockException -> 0x00a9, all -> 0x00a6 }
        L_0x00a6:
            r8 = move-exception
            r1 = r2
            goto L_0x00e0
        L_0x00a9:
            r8 = move-exception
            r1 = r2
            goto L_0x00b2
        L_0x00ac:
            r8 = move-exception
            r1 = r2
            goto L_0x00c9
        L_0x00af:
            r8 = move-exception
            goto L_0x00e0
        L_0x00b1:
            r8 = move-exception
        L_0x00b2:
            java.lang.String r8 = "Places"
            java.lang.String r2 = "Platform key write failed due to held file lock."
            defpackage.alfy.c(r8, r2)     // Catch:{ all -> 0x00df }
            r7.a((java.io.File) r0)     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x0090
            r1.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x0086
        L_0x00c2:
            r8 = move-exception
            java.lang.String r8 = "Places"
            java.lang.String r0 = "Couldn't close platform key outputStream."
            goto L_0x008d
        L_0x00c8:
            r8 = move-exception
        L_0x00c9:
            java.lang.String r8 = "Places"
            java.lang.String r2 = "Unexpected IOException when writing platform key."
            defpackage.alfy.a(r8, r2)     // Catch:{ all -> 0x00df }
            r7.a((java.io.File) r0)     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x0090
            r1.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x0086
        L_0x00d9:
            r8 = move-exception
            java.lang.String r8 = "Places"
            java.lang.String r0 = "Couldn't close platform key outputStream."
            goto L_0x008d
        L_0x00df:
            r8 = move-exception
        L_0x00e0:
            if (r1 == 0) goto L_0x00ee
            r1.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00ee
        L_0x00e6:
            r0 = move-exception
            java.lang.String r0 = "Places"
            java.lang.String r1 = "Couldn't close platform key outputStream."
            defpackage.alfy.a(r0, r1)     // Catch:{ all -> 0x00ef }
        L_0x00ee:
            throw r8     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00f3
        L_0x00f2:
            throw r8
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akif.a(java.lang.String):void");
    }
}
