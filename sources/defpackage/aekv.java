package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: aekv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekv {
    private static UserManager a;
    private static volatile boolean b = (!a());
    private static boolean c = false;

    private aekv() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static synchronized void b() {
        synchronized (aekv.class) {
            c = true;
        }
    }

    public static Context c(Context context) {
        return !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
    }

    public static Context d(Context context) {
        return a() ? c(context) : context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean e(android.content.Context r8) {
        /*
            boolean r0 = b
            r1 = 1
            if (r0 != 0) goto L_0x007f
            java.lang.Class<aekv> r0 = defpackage.aekv.class
            monitor-enter(r0)
            boolean r2 = b     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x007a
            boolean r2 = c     // Catch:{ all -> 0x007c }
            r3 = 0
            if (r2 == 0) goto L_0x0036
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x007c }
            r2.<init>()     // Catch:{ all -> 0x007c }
            java.lang.Class<com.google.android.libraries.directboot.DirectBootHelperService> r4 = com.google.android.libraries.directboot.DirectBootHelperService.class
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x007c }
            android.content.Intent r2 = r2.setClassName(r8, r4)     // Catch:{ all -> 0x007c }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ all -> 0x007c }
            r4 = 512(0x200, float:7.175E-43)
            java.util.List r8 = r8.queryIntentServices(r2, r4)     // Catch:{ all -> 0x007c }
            if (r8 == 0) goto L_0x0035
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x007c }
            if (r8 == 0) goto L_0x0033
            goto L_0x0074
        L_0x0033:
            r3 = 1
            goto L_0x0074
        L_0x0035:
            goto L_0x0074
        L_0x0036:
            r2 = 1
        L_0x0037:
            r4 = 2
            r5 = 0
            if (r2 > r4) goto L_0x006f
            android.os.UserManager r4 = a     // Catch:{ all -> 0x007c }
            if (r4 != 0) goto L_0x0049
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r8.getSystemService(r4)     // Catch:{ all -> 0x007c }
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch:{ all -> 0x007c }
            a = r4     // Catch:{ all -> 0x007c }
        L_0x0049:
            android.os.UserManager r4 = a     // Catch:{ all -> 0x007c }
            if (r4 == 0) goto L_0x006d
            boolean r6 = r4.isUserUnlocked()     // Catch:{ NullPointerException -> 0x0060 }
            if (r6 != 0) goto L_0x005e
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x0060 }
            boolean r8 = r4.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x0060 }
            if (r8 == 0) goto L_0x005e
            goto L_0x006f
        L_0x005e:
            r3 = 1
            goto L_0x0070
        L_0x0060:
            r4 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r4)     // Catch:{ all -> 0x007c }
            a = r5     // Catch:{ all -> 0x007c }
            int r2 = r2 + 1
            goto L_0x0037
        L_0x006d:
            r3 = 1
            goto L_0x0074
        L_0x006f:
        L_0x0070:
            if (r3 == 0) goto L_0x0074
            a = r5     // Catch:{ all -> 0x007c }
        L_0x0074:
            if (r3 == 0) goto L_0x0078
            b = r1     // Catch:{ all -> 0x007c }
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return r3
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return r1
        L_0x007c:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r8
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekv.e(android.content.Context):boolean");
    }

    public static boolean a(Context context) {
        return a() && !e(context);
    }

    public static boolean b(Context context) {
        return !a() || e(context);
    }
}
