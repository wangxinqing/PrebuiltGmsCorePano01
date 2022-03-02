package defpackage;

import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* renamed from: aayt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayt {
    private static final String a = aayt.class.getCanonicalName();
    private final ContentResolver b;
    private final Context c;
    private final aays d = new aays();
    private final String e;
    private final aayr f;

    public aayt(Context context) {
        this.c = context;
        this.b = context.getContentResolver();
        if (azfv.v()) {
            int i = Build.VERSION.SDK_INT;
            this.e = "android.provider.Settings$Secure";
        } else {
            int i2 = Build.VERSION.SDK_INT;
            this.e = "android.provider.Settings$Global";
        }
        this.f = new aayr(context);
    }

    private final int a(String str, String str2) {
        try {
            return ((Integer) Class.forName(str).getMethod("getInt", new Class[]{ContentResolver.class, String.class, Integer.TYPE}).invoke((Object) null, new Object[]{this.b, str2, 0})).intValue();
        } catch (ClassNotFoundException e2) {
            a(e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            a(e3);
            return 0;
        } catch (IllegalAccessException e4) {
            a(e4);
            return 0;
        } catch (InvocationTargetException e5) {
            a(e5);
            return 0;
        }
    }

    private static void a(Exception exc) {
        if (Log.isLoggable(a, 6)) {
            Log.e(a, exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final aays a() {
        boolean z;
        boolean z2;
        FingerprintManager a2;
        FingerprintManager a3;
        int i;
        boolean z3 = false;
        this.d.a = a(this.e, "adb_enabled") != 0;
        aays aays = this.d;
        if (azfv.v()) {
            if (Build.VERSION.SDK_INT >= 26) {
                AppOpsManager appOpsManager = (AppOpsManager) this.c.getSystemService("appops");
                PackageManager packageManager = this.c.getPackageManager();
                Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    PackageInfo next = it.next();
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(next.packageName, 0);
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (appOpsManager.unsafeCheckOpNoThrow(AppOpsManager.permissionToOp("android.permission.REQUEST_INSTALL_PACKAGES"), applicationInfo.uid, next.packageName) == 0) {
                                z = true;
                                break;
                            }
                        } else if (Build.VERSION.SDK_INT < 28) {
                            try {
                                if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{66, Integer.valueOf(applicationInfo.uid), next.packageName})).intValue() == 0) {
                                    z = true;
                                    break;
                                }
                            } catch (NoSuchMethodException e2) {
                                a(e2);
                            } catch (IllegalAccessException e3) {
                                a(e3);
                            } catch (InvocationTargetException e4) {
                                a(e4);
                            }
                        } else if (appOpsManager.checkOpNoThrow(AppOpsManager.permissionToOp("android.permission.REQUEST_INSTALL_PACKAGES"), applicationInfo.uid, next.packageName) == 0) {
                            z = true;
                            break;
                        }
                    } catch (PackageManager.NameNotFoundException e5) {
                        String str = a;
                        String valueOf = String.valueOf(next.packageName);
                        Log.e(str, valueOf.length() == 0 ? new String("App not found for package name ") : "App not found for package name ".concat(valueOf), e5);
                    }
                }
            } else {
                z = a(this.e, "install_non_market_apps") != 0;
            }
        } else {
            z = a(this.e, "install_non_market_apps") != 0;
        }
        aays.b = z;
        aays aays2 = this.d;
        aayr aayr = this.f;
        int i2 = Build.VERSION.SDK_INT;
        if (Settings.Global.getInt(aayr.a.getContentResolver(), "upload_apk_enable", 0) == 1) {
            z3 = true;
        }
        aays2.e = z3;
        int i3 = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) this.c.getSystemService("keyguard");
        if (!azfv.a.a().Y()) {
            z2 = keyguardManager.isKeyguardSecure();
        } else if (Build.VERSION.SDK_INT >= 23) {
            z2 = keyguardManager.isDeviceSecure();
        } else {
            z2 = keyguardManager.isKeyguardSecure();
        }
        if (z2) {
            this.d.f = 2;
            int i4 = Build.VERSION.SDK_INT;
            aays aays3 = this.d;
            Notification build = new Notification.Builder(this.c).build();
            if (build != null) {
                int i5 = build.visibility;
                i = i5 != -1 ? i5 != 0 ? i5 != 1 ? 1 : 3 : 2 : 4;
            } else {
                i = 1;
            }
            aays3.g = i;
        } else {
            this.d.f = 1;
        }
        this.d.c = a(this.e, "lock_screen_lock_after_timeout");
        this.d.d = ((DevicePolicyManager) this.c.getSystemService("device_policy")).getStorageEncryptionStatus();
        if (this.c.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            mg mgVar = new mg(this.c);
            if (Build.VERSION.SDK_INT < 23 || (a2 = mg.a(mgVar.a)) == null || !a2.isHardwareDetected()) {
                this.d.h = 1;
            } else if (Build.VERSION.SDK_INT < 23 || (a3 = mg.a(mgVar.a)) == null || !a3.hasEnrolledFingerprints()) {
                this.d.h = 3;
            } else {
                this.d.h = 2;
            }
        }
        return this.d;
    }
}
