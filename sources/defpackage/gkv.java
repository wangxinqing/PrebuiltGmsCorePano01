package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: gkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkv {
    private static final iwd c = ehv.a("DeviceSignalsService", "LockScreenSignalsProvider");
    private static gkv d;
    public final SharedPreferences a;
    public final Object b = new Object();
    private final KeyguardManager e;

    public gkv(SharedPreferences sharedPreferences, KeyguardManager keyguardManager) {
        this.a = sharedPreferences;
        this.e = keyguardManager;
    }

    private static long a(long j, long j2) {
        if (j2 < Long.MAX_VALUE - j) {
            return j + j2;
        }
        return Long.MAX_VALUE;
    }

    private final long c() {
        long j;
        synchronized (this.b) {
            j = this.a.getLong("lockScreenSecureDuration", -1);
        }
        return j;
    }

    private final long d() {
        long j;
        synchronized (this.b) {
            j = this.a.getLong("lastLockScreenCheckTime", -1);
        }
        return j;
    }

    public final boolean b() {
        return a(false);
    }

    public static synchronized gkv a(Context context) {
        gkv gkv;
        synchronized (gkv.class) {
            if (d == null) {
                int i = jhg.a;
                Context applicationContext = context.getApplicationContext();
                d = new gkv(applicationContext.getSharedPreferences("com.google.android.gms.auth.devicesignals.DeviceSignalsStore", 0), (KeyguardManager) applicationContext.getSystemService("keyguard"));
            }
            gkv = d;
        }
        return gkv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
            android.app.KeyguardManager r1 = r8.e     // Catch:{ all -> 0x006a }
            boolean r1 = r1.isKeyguardSecure()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x006a }
            monitor-enter(r1)     // Catch:{ all -> 0x006a }
            android.content.SharedPreferences r2 = r8.a     // Catch:{ all -> 0x004e }
            java.lang.String r3 = "lastSecureUnlockTime"
            r4 = -1
            long r2 = r2.getLong(r3, r4)     // Catch:{ all -> 0x004e }
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x004c
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            java.lang.Object r3 = r8.b     // Catch:{ all -> 0x006a }
            monitor-enter(r3)     // Catch:{ all -> 0x006a }
            android.content.SharedPreferences r6 = r8.a     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = "lastSecureUnlockTime"
            android.content.SharedPreferences$Editor r4 = r6.putLong(r7, r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "lockScreenSecureDuration"
            long r6 = r8.c()     // Catch:{ all -> 0x0049 }
            long r6 = a(r6, r1)     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences$Editor r4 = r4.putLong(r5, r6)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "lastLockScreenCheckTime"
            android.content.SharedPreferences$Editor r1 = r4.putLong(r5, r1)     // Catch:{ all -> 0x0049 }
            r1.apply()     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            goto L_0x004c
        L_0x0049:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0049 }
            throw r1     // Catch:{ all -> 0x006a }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x004e:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004e }
            throw r2     // Catch:{ all -> 0x006a }
        L_0x0051:
            iwd r1 = c     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "Device does not have a secure lock screen."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x006a }
            r1.b(r2, r3)     // Catch:{ all -> 0x006a }
            android.content.SharedPreferences r1 = r8.a     // Catch:{ all -> 0x006a }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x006a }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x006a }
            r1.apply()     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkv.a():void");
    }

    public final boolean a(boolean z) {
        synchronized (this.b) {
            if (!this.e.isKeyguardSecure()) {
                c.b("Device does not have a secure lock screen.", new Object[0]);
                this.a.edit().clear().apply();
                return false;
            }
            c.b("Device has a secure lock screen.", new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < d()) {
                c.d("Missed a boot event?", new Object[0]);
                a();
            }
            long c2 = c();
            long d2 = d();
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("lastLockScreenCheckTime", elapsedRealtime);
            if (z) {
                edit.putLong("lastSecureUnlockTime", elapsedRealtime);
            }
            if (c2 != -1) {
                edit.putLong("lockScreenSecureDuration", a(c2, elapsedRealtime - d2));
            } else {
                edit.putLong("lockScreenSecureDuration", 0);
            }
            edit.apply();
            return true;
        }
    }
}
