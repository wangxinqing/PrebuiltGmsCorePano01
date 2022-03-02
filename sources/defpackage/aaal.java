package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* renamed from: aaal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaal {
    public final Context a;
    private volatile Boolean b = null;
    private volatile Boolean c = null;

    public aaal(Context context) {
        this.a = context;
    }

    public static boolean c(Context context) {
        return b(context, "upload_apk_enable", 0) == 1;
    }

    private static boolean d(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager != null && userManager.hasUserRestriction("ensure_verify_apps");
    }

    public final synchronized boolean e() {
        PackageInfo packageInfo;
        if (this.b == null) {
            boolean z = false;
            try {
                packageInfo = this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                if (packageInfo.versionCode < 80440000) {
                    this.b = Boolean.valueOf(z);
                }
            }
            z = true;
            this.b = Boolean.valueOf(z);
        }
        return this.b.booleanValue();
    }

    public final synchronized boolean f() {
        PackageInfo packageInfo;
        int i = Build.VERSION.SDK_INT;
        if (this.c == null) {
            boolean z = false;
            try {
                packageInfo = this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                if (packageInfo.versionCode < 80750000) {
                    this.c = Boolean.valueOf(z);
                }
            }
            z = true;
            this.c = Boolean.valueOf(z);
        }
        return this.c.booleanValue();
    }

    private static void a(Context context, String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Settings.Global.putInt(context.getContentResolver(), str, i);
    }

    private static int b(Context context, String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), str, i);
    }

    private final boolean g() {
        int i = Build.VERSION.SDK_INT;
        aaam aaam = new aaam(this.a);
        if (jkr.b()) {
            return aaam.a.isSystemUser();
        }
        if (aaam.d != null) {
            Iterator<UserHandle> it = aaam.a.getUserProfiles().iterator();
            if (!it.hasNext()) {
                return false;
            }
            try {
                return ((Boolean) aaam.d.invoke(it.next(), new Object[0])).booleanValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException e) {
            }
        }
        return true;
    }

    public final boolean c() {
        if (a(this.a)) {
            return false;
        }
        if (!f() || g()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (e() || f()) {
            return a();
        }
        return b(this.a);
    }

    public static void a(Context context, boolean z) {
        a(context, "upload_apk_enable", z ? 1 : 0);
    }

    private static void b(Context context, boolean z) {
        a(context, "package_verifier_enable", z ? 1 : 0);
    }

    public static boolean b(Context context) {
        return b(context, "package_verifier_enable", 1) == 1;
    }

    public final void a(boolean z) {
        int i = -1;
        if (f()) {
            if (g()) {
                b(this.a, true);
                if (z) {
                    i = 1;
                }
                Settings.Global.putInt(this.a.getContentResolver(), "package_verifier_user_consent", i);
            }
        } else if (e()) {
            b(this.a, true);
            ContentResolver contentResolver = this.a.getContentResolver();
            if (z) {
                i = 1;
            }
            Settings.Secure.putInt(contentResolver, "package_verifier_user_consent", i);
        } else {
            b(this.a, z);
        }
    }

    public final boolean b() {
        if (f()) {
            if (a(this.a)) {
                return true;
            }
            try {
                return Settings.Global.getInt(this.a.getContentResolver(), "package_verifier_user_consent") == 1;
            } catch (Settings.SettingNotFoundException e) {
            }
        }
        if (e()) {
            int i = Build.VERSION.SDK_INT;
            return a(this.a) || Settings.Secure.getInt(this.a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
        }
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Secure.getInt(this.a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
    }

    public final boolean a() {
        if (f()) {
            return b();
        }
        if (e()) {
            return b();
        }
        return b() && b(this.a);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r11) {
        /*
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r0 = r10.f()
            if (r0 == 0) goto L_0x00dc
            boolean r0 = d(r11)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x00da
            boolean r0 = defpackage.jkr.e()
            if (r0 != 0) goto L_0x00d8
            aaam r0 = new aaam
            r0.<init>(r11)
            boolean r11 = defpackage.jkr.c()
            r3 = 0
            if (r11 == 0) goto L_0x0054
            java.lang.reflect.Method r11 = r0.c
            if (r11 == 0) goto L_0x0053
            android.os.UserManager r4 = r0.a     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            r5[r2] = r6     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            java.lang.Object r11 = r11.invoke(r4, r5)     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            long[] r11 = (long[]) r11     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            if (r11 == 0) goto L_0x0053
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            int r5 = r11.length     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            r4.<init>(r5)     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            r6 = 0
        L_0x003f:
            if (r6 >= r5) goto L_0x004f
            r7 = r11[r6]     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            android.os.UserManager r9 = r0.a     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            android.os.UserHandle r7 = r9.getUserForSerialNumber(r7)     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            r4.add(r7)     // Catch:{ IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, SecurityException -> 0x00a7, ClassCastException -> 0x0051 }
            int r6 = r6 + 1
            goto L_0x003f
        L_0x004f:
            r3 = r4
            goto L_0x00b2
        L_0x0051:
            r11 = move-exception
            goto L_0x00b2
        L_0x0053:
            goto L_0x00b2
        L_0x0054:
            java.lang.reflect.Method r11 = r0.b
            if (r11 == 0) goto L_0x00b1
            android.os.UserManager r4 = r0.a     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.Object r11 = r11.invoke(r4, r5)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            if (r11 == 0) goto L_0x00b1
            boolean r4 = r11.isEmpty()     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            if (r4 != 0) goto L_0x00b1
            java.lang.Object r4 = r11.get(r2)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.String r5 = "getUserHandle"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.Class r5 = r4.getReturnType()     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.Class<android.os.UserHandle> r6 = android.os.UserHandle.class
            boolean r5 = r5.equals(r6)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            if (r5 == 0) goto L_0x00b1
            int r5 = r11.size()     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            r6.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            r7 = 0
        L_0x0090:
            if (r7 >= r5) goto L_0x00a5
            java.lang.Object r8 = r11.get(r7)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            r9 = r3
            java.lang.Object[] r9 = (java.lang.Object[]) r9     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            java.lang.Object r8 = r4.invoke(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            android.os.UserHandle r8 = (android.os.UserHandle) r8     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            r6.add(r8)     // Catch:{ IllegalArgumentException -> 0x00af, IllegalAccessException -> 0x00ad, InvocationTargetException -> 0x00ab, NoSuchMethodException -> 0x00a9, SecurityException -> 0x00a7 }
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00a5:
            r3 = r6
            goto L_0x00b2
        L_0x00a7:
            r11 = move-exception
            goto L_0x00b2
        L_0x00a9:
            r11 = move-exception
            goto L_0x00b2
        L_0x00ab:
            r11 = move-exception
            goto L_0x00b2
        L_0x00ad:
            r11 = move-exception
            goto L_0x00b2
        L_0x00af:
            r11 = move-exception
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            if (r3 == 0) goto L_0x00d6
            int r11 = r3.size()
            r4 = 0
        L_0x00b9:
            if (r4 >= r11) goto L_0x00d6
            java.lang.Object r5 = r3.get(r4)
            android.os.UserHandle r5 = (android.os.UserHandle) r5
            android.os.UserManager r6 = r0.a
            android.os.Bundle r5 = r6.getUserRestrictions(r5)
            if (r5 != 0) goto L_0x00ca
            goto L_0x00d3
        L_0x00ca:
            java.lang.String r6 = "ensure_verify_apps"
            boolean r5 = r5.getBoolean(r6, r2)
            if (r5 == 0) goto L_0x00d3
            goto L_0x00db
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x00b9
        L_0x00d6:
            r1 = 0
            goto L_0x00db
        L_0x00d8:
            r1 = 0
            goto L_0x00db
        L_0x00da:
        L_0x00db:
            return r1
        L_0x00dc:
            boolean r11 = d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaal.a(android.content.Context):boolean");
    }
}
