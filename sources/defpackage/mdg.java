package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: mdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mdg {
    public static final /* synthetic */ int d = 0;
    private static volatile mdg f = null;
    public final Context a;
    public long b = 0;
    public boz c = null;
    private final BroadcastReceiver e = new mdf(this);

    private mdg(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        applicationContext.registerReceiver(this.e, new IntentFilter("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED"), "com.google.android.gms.chimera.permission.CONFIG_CHANGE", (Handler) null);
    }

    public static final boz a(Context context, long j) {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder(65);
        sb.append("content://com.google.android.gms.chimera/api/");
        sb.append(j);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(sb.toString()), "r");
            if (openFileDescriptor != null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    boz c2 = bkq.c(fileInputStream);
                    boo.a().a(c2);
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    try {
                        openFileDescriptor.close();
                    } catch (IOException e2) {
                    }
                    return c2;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    try {
                        openFileDescriptor.close();
                    } catch (IOException e3) {
                    }
                    throw th;
                }
            } else {
                throw new IOException("Config file descriptor is null");
            }
            throw th;
        } catch (NullPointerException e4) {
            throw new IOException("Exception while loading config file descriptor", e4);
        }
    }

    private static boolean b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("checkFingerprint");
        if (columnIndex < 0 || cursor.getInt(columnIndex) == 0) {
            return false;
        }
        return true;
    }

    public static mdg a(Context context) {
        mdg mdg = f;
        if (mdg == null) {
            synchronized (mdg.class) {
                mdg = f;
                if (mdg == null) {
                    mdg = new mdg(context);
                    f = mdg;
                }
            }
        }
        return mdg;
    }

    private static boolean a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("usePlatformClassLoaders");
        if (columnIndex < 0 || cursor.getInt(columnIndex) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r7 == r1.b) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r1.c = a(r2, r7);
        r1.b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r14 = r1.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        android.os.StrictMode.setThreadPolicy(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r11 != 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r8 = defpackage.mcx.b(r2, r21, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        if (r8 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        if (r8.moveToFirst() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        if (r8.getInt(0) >= r22) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        r5 = r8.getInt(5);
        r12 = r8.getLong(6);
        r16 = a(r8);
        r18 = b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r11 = r11 - 1;
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        android.util.Log.e("DynamiteLoaderV2Impl", "Failed to create module context.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r1.c != null) goto L_0x0032;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[ExcHandler: bop | InvalidConfigException | IOException (r0v6 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context a(android.content.Context r20, java.lang.String r21, int r22, android.database.Cursor r23) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = r23
            r3 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x00be
        L_0x000b:
            boolean r4 = r23.moveToFirst()
            if (r4 == 0) goto L_0x00be
            r4 = 5
            int r5 = r0.getInt(r4)
            r6 = 6
            long r7 = r0.getLong(r6)
            boolean r9 = a((android.database.Cursor) r23)
            boolean r0 = b(r23)
            android.os.StrictMode$ThreadPolicy r10 = defpackage.jlg.a()
            r11 = 2
            r18 = r0
            r16 = r9
        L_0x002c:
            monitor-enter(r19)     // Catch:{ IOException -> 0x006f, InvalidConfigException -> 0x006d, bop -> 0x006b }
            boz r0 = r1.c     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            long r12 = r1.b     // Catch:{ all -> 0x0066 }
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
        L_0x0038:
            boz r0 = a(r2, r7)     // Catch:{ all -> 0x0066 }
            r1.c = r0     // Catch:{ all -> 0x0066 }
            r1.b = r7     // Catch:{ all -> 0x0066 }
        L_0x0040:
            boz r14 = r1.c     // Catch:{ all -> 0x0066 }
            monitor-exit(r19)     // Catch:{ all -> 0x0066 }
            bpa r15 = r14.b(r5)     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
            heo r13 = defpackage.heo.a(r20)     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
            if (r13 != 0) goto L_0x0058
            java.lang.String r0 = "DynamiteLoaderV2Impl"
            java.lang.String r2 = "Failed to create dynamite context."
            android.util.Log.e(r0, r2)     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
        L_0x0054:
            android.os.StrictMode.setThreadPolicy(r10)
            return r3
        L_0x0058:
            boo r12 = defpackage.boo.a()     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
            r17 = 0
            android.content.Context r0 = r12.a((android.content.Context) r13, (defpackage.boz) r14, (defpackage.bpa) r15, (boolean) r16, (boolean) r17, (boolean) r18)     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
            android.os.StrictMode.setThreadPolicy(r10)
            return r0
        L_0x0066:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ IOException -> 0x006f, InvalidConfigException -> 0x006d, bop -> 0x006b }
        L_0x0069:
            r0 = move-exception
            goto L_0x00ba
        L_0x006b:
            r0 = move-exception
            goto L_0x00b2
        L_0x006d:
            r0 = move-exception
            goto L_0x00b2
        L_0x006f:
            r0 = move-exception
            if (r11 == 0) goto L_0x00b0
            r5 = 0
            r7 = r21
            android.database.Cursor r8 = defpackage.mcx.b(r2, r7, r5)     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
            if (r8 == 0) goto L_0x00a1
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x00a2 }
            if (r9 == 0) goto L_0x00a1
            int r5 = r8.getInt(r5)     // Catch:{ all -> 0x00a2 }
            r9 = r22
            if (r5 < r9) goto L_0x00a0
            int r5 = r8.getInt(r4)     // Catch:{ all -> 0x00a2 }
            long r12 = r8.getLong(r6)     // Catch:{ all -> 0x00a2 }
            boolean r16 = a((android.database.Cursor) r8)     // Catch:{ all -> 0x00a2 }
            boolean r18 = b(r8)     // Catch:{ all -> 0x00a2 }
            r8.close()     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
            int r11 = r11 + -1
            r7 = r12
            goto L_0x002c
        L_0x00a0:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            r2 = r0
            if (r8 == 0) goto L_0x00af
            r8.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00af
        L_0x00aa:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r2, (java.lang.Throwable) r4)     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
        L_0x00af:
            throw r2     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
        L_0x00b0:
            throw r0     // Catch:{ IOException -> 0x00b1, InvalidConfigException -> 0x006d, bop -> 0x006b }
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            java.lang.String r2 = "DynamiteLoaderV2Impl"
            java.lang.String r4 = "Failed to create module context."
            android.util.Log.e(r2, r4, r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0054
        L_0x00ba:
            android.os.StrictMode.setThreadPolicy(r10)
            throw r0
        L_0x00be:
            java.lang.String r0 = "DynamiteLoaderV2Impl"
            java.lang.String r2 = "Failed to read query result"
            android.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdg.a(android.content.Context, java.lang.String, int, android.database.Cursor):android.content.Context");
    }
}
