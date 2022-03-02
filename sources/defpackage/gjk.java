package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: gjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjk implements gjj {
    public static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.managed.admin.DeviceAdminReceiver");
    private static final iwd b = ehv.a("AuthManaged", "PasswordComplexityHelperImpl");
    private static gjk c;

    private gjk() {
    }

    private static final synchronized void a(Context context, boolean z) {
        synchronized (gjk.class) {
            try {
                b.c((!z ? "Disabling " : "Enabling ").concat("com.google.android.gms.auth.managed.admin.DeviceAdminReceiver"), new Object[0]);
                jhg.a(context, "com.google.android.gms.auth.managed.admin.DeviceAdminReceiver", z);
            } catch (IllegalArgumentException e) {
                b.d("Component does not exist.", e, new Object[0]);
            }
        }
    }

    public static synchronized gjk b() {
        gjk gjk;
        synchronized (gjk.class) {
            if (c == null) {
                c = new gjk();
            }
            gjk = c;
        }
        return gjk;
    }

    private static final DevicePolicyManager d(Context context) {
        return (DevicePolicyManager) context.getSystemService("device_policy");
    }

    public final jbs c(Context context) {
        return new jbs(context);
    }

    private static final void b(Context context, boolean z) {
        try {
            b.c((!z ? "Disabling " : "Enabling ").concat("com.google.android.gms.auth.managed.ui.SetNewPasswordActivity"), new Object[0]);
            jhg.a(context, "com.google.android.gms.auth.managed.ui.SetNewPasswordActivity", z);
        } catch (IllegalArgumentException e) {
            b.d("Component does not exist.", e, new Object[0]);
        }
    }

    public final boolean c() {
        return a() == 1;
    }

    public final int a() {
        if (!jkr.h()) {
            return awpi.a.a().a() ? 1 : 2;
        }
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(android.app.admin.DevicePolicyManager r5, int r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = defpackage.awpi.b()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0090
            android.content.ComponentName r0 = a     // Catch:{ all -> 0x009c }
            boolean r0 = r5.isAdminActive(r0)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r4.c()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x002d
            r0 = 0
            int r1 = r5.getPasswordQuality(r0)     // Catch:{ SecurityException -> 0x002f }
            if (r1 == r6) goto L_0x0021
            android.content.ComponentName r1 = a     // Catch:{ SecurityException -> 0x002f }
            r5.setPasswordQuality(r1, r6)     // Catch:{ SecurityException -> 0x002f }
        L_0x0021:
            int r6 = r5.getPasswordMinimumLength(r0)     // Catch:{ SecurityException -> 0x002f }
            if (r6 == r7) goto L_0x002d
            android.content.ComponentName r6 = a     // Catch:{ SecurityException -> 0x002f }
            r5.setPasswordMinimumLength(r6, r7)     // Catch:{ SecurityException -> 0x002f }
        L_0x002d:
            monitor-exit(r4)
            return
        L_0x002f:
            r6 = move-exception
            iwd r7 = b     // Catch:{ all -> 0x009c }
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x009c }
            android.content.ComponentName r1 = a     // Catch:{ all -> 0x009c }
            boolean r1 = r5.isAdminActive(r1)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x009c }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x009c }
            r1 = 1
            int r3 = r4.a()     // Catch:{ all -> 0x009c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x009c }
            r0[r1] = r3     // Catch:{ all -> 0x009c }
            r1 = 2
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x009c }
            r0[r1] = r6     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "SecurityException in isPasswordSufficient (isAdminActive: %b, isFeatureSupported: %d): %s"
            r7.e(r6, r0)     // Catch:{ all -> 0x009c }
            android.content.ComponentName r6 = a     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, SecurityException -> 0x0064 }
            r5.removeActiveAdmin(r6)     // Catch:{ IllegalArgumentException -> 0x0068, IllegalStateException -> 0x0066, SecurityException -> 0x0064 }
            monitor-exit(r4)
            return
        L_0x0064:
            r5 = move-exception
            goto L_0x0069
        L_0x0066:
            r5 = move-exception
            goto L_0x0069
        L_0x0068:
            r5 = move-exception
        L_0x0069:
            iwd r6 = b     // Catch:{ all -> 0x009c }
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = java.util.Arrays.toString(r5)     // Catch:{ all -> 0x009c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "Exception when deactivating admin: "
            int r0 = r5.length()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0085
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x009c }
            r5.<init>(r7)     // Catch:{ all -> 0x009c }
            goto L_0x0089
        L_0x0085:
            java.lang.String r5 = r7.concat(r5)     // Catch:{ all -> 0x009c }
        L_0x0089:
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            r6.e(r5, r7)     // Catch:{ all -> 0x009c }
            monitor-exit(r4)
            return
        L_0x0090:
            android.content.ComponentName r0 = a     // Catch:{ all -> 0x009c }
            r5.setPasswordQuality(r0, r6)     // Catch:{ all -> 0x009c }
            android.content.ComponentName r6 = a     // Catch:{ all -> 0x009c }
            r5.setPasswordMinimumLength(r6, r7)     // Catch:{ all -> 0x009c }
            monitor-exit(r4)
            return
        L_0x009c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjk.b(android.app.admin.DevicePolicyManager, int, int):void");
    }

    public final synchronized void a(DevicePolicyManager devicePolicyManager) {
        b(devicePolicyManager, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(android.app.admin.DevicePolicyManager r5, int r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = defpackage.awpi.b()     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            android.content.ComponentName r0 = a     // Catch:{ all -> 0x008e }
            boolean r0 = r5.isAdminActive(r0)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r4.c()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            monitor-exit(r4)
            return r1
        L_0x0019:
            r4.b(r5, r6, r7)     // Catch:{ all -> 0x008e }
            boolean r6 = defpackage.awpi.b()     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0085
            boolean r1 = r5.isActivePasswordSufficient()     // Catch:{ SecurityException -> 0x0027 }
            goto L_0x0089
        L_0x0027:
            r6 = move-exception
            iwd r7 = b     // Catch:{ all -> 0x008e }
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x008e }
            android.content.ComponentName r2 = a     // Catch:{ all -> 0x008e }
            boolean r2 = r5.isAdminActive(r2)     // Catch:{ all -> 0x008e }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x008e }
            r0[r1] = r2     // Catch:{ all -> 0x008e }
            r2 = 1
            int r3 = r4.a()     // Catch:{ all -> 0x008e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008e }
            r0[r2] = r3     // Catch:{ all -> 0x008e }
            r2 = 2
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x008e }
            r0[r2] = r6     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "SecurityException in isPasswordSufficient (isAdminActive: %b, isFeatureSupported: %d): %s"
            r7.e(r6, r0)     // Catch:{ all -> 0x008e }
            android.content.ComponentName r6 = a     // Catch:{ IllegalArgumentException -> 0x005e, IllegalStateException -> 0x005c, SecurityException -> 0x005a }
            r5.removeActiveAdmin(r6)     // Catch:{ IllegalArgumentException -> 0x005e, IllegalStateException -> 0x005c, SecurityException -> 0x005a }
            goto L_0x0089
        L_0x005a:
            r6 = move-exception
            goto L_0x005f
        L_0x005c:
            r6 = move-exception
            goto L_0x005f
        L_0x005e:
            r6 = move-exception
        L_0x005f:
            iwd r7 = b     // Catch:{ all -> 0x008e }
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "Exception when deactivating admin: "
            int r2 = r6.length()     // Catch:{ all -> 0x008e }
            if (r2 != 0) goto L_0x007b
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            goto L_0x007f
        L_0x007b:
            java.lang.String r6 = r0.concat(r6)     // Catch:{ all -> 0x008e }
        L_0x007f:
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x008e }
            r7.e(r6, r0)     // Catch:{ all -> 0x008e }
            goto L_0x0089
        L_0x0085:
            boolean r1 = r5.isActivePasswordSufficient()     // Catch:{ all -> 0x008e }
        L_0x0089:
            r4.a((android.app.admin.DevicePolicyManager) r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r1
        L_0x008e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjk.a(android.app.admin.DevicePolicyManager, int, int):boolean");
    }

    public final synchronized void b(Context context) {
        b.c("Updating password complexity components state.", new Object[0]);
        if (c()) {
            b(context, true);
            return;
        }
        a(context, false);
        b(context, false);
    }

    public final boolean a(Context context) {
        a(context, true);
        if (d(context).isAdminActive(a)) {
            return true;
        }
        Class<DevicePolicyManager> cls = DevicePolicyManager.class;
        try {
            Method method = cls.getMethod("setActiveAdmin", new Class[]{ComponentName.class, Boolean.TYPE});
            if (method != null) {
                method.invoke(d(context), new Object[]{a, true});
                b.b("Successfully enabled device admin.", new Object[0]);
                return d(context).isAdminActive(a);
            }
        } catch (NoSuchMethodException e) {
            b.b("Cannot find DevicePolicyManager.setActiveAdmin()", new Object[0]);
        } catch (Exception e2) {
            b.b("Unable to set as device admin silently.", new Object[0]);
        }
        return false;
    }
}
