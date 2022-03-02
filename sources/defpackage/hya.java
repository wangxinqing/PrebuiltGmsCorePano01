package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: hya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hya {
    private static hya a;
    private final Context b;
    private volatile String c;

    public hya(Context context) {
        this.b = context.getApplicationContext();
    }

    static final hxm a(PackageInfo packageInfo, hxm... hxmArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            hxn hxn = new hxn(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < hxmArr.length; i++) {
                if (hxmArr[i].equals(hxn)) {
                    return hxmArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean b(PackageInfo packageInfo, boolean z) {
        hxm hxm;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (!z) {
                hxm = a(packageInfo, hxr.a[0]);
            } else {
                hxm = a(packageInfo, hxr.a);
            }
            if (hxm != null) {
                return true;
            }
        }
        return false;
    }

    private final hxv c(PackageInfo packageInfo, boolean z) {
        boolean g = hxz.g(this.b);
        if (packageInfo == null) {
            return hxv.a("null pkg");
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return hxv.a("single cert required");
        }
        hxn hxn = new hxn(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        hxv a2 = hxs.a(str, hxn, g, z);
        return (!a2.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !hxs.a(str, hxn, false, true).b) ? a2 : hxv.a("debuggable release cert app rejected");
    }

    private final hxv d(PackageInfo packageInfo) {
        return c(packageInfo, false);
    }

    public final hxv b(int i) {
        String[] a2 = jni.b(this.b).a(i);
        if (a2 == null || (r1 = a2.length) == 0) {
            return hxv.a("no pkgs");
        }
        hxv hxv = null;
        for (String str : a2) {
            try {
                hxv = d(jni.b(this.b).d(str, i));
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(str);
                hxv = hxv.a(valueOf.length() == 0 ? new String("no pkg ") : "no pkg ".concat(valueOf));
            }
            if (hxv.b) {
                break;
            }
        }
        return hxv;
    }

    public static hya a(Context context) {
        iva.a((Object) context);
        synchronized (hya.class) {
            if (a == null) {
                hxs.a(context);
                a = new hya(context);
            }
        }
        return a;
    }

    private final hxv c(String str) {
        if (str == null) {
            return hxv.a("null pkg");
        }
        if (str.equals(this.c)) {
            return hxv.a;
        }
        try {
            hxv d = d(jni.b(this.b).b(str, 64));
            if (d.b) {
                this.c = str;
            }
            return d;
        } catch (PackageManager.NameNotFoundException e) {
            return hxv.a(str.length() == 0 ? new String("no pkg ") : "no pkg ".concat(str));
        }
    }

    public final void a(String str) {
        try {
            c(str).b();
        } catch (SecurityException e) {
            c(str).b();
            Log.e("GoogleSignatureVerifier", "flaky result", e);
        }
    }

    public final boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (b(packageInfo, false)) {
            return true;
        }
        if (b(packageInfo, true)) {
            if (hxz.g(this.b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public final boolean a(int i) {
        return b(i).b;
    }

    public final boolean a(PackageInfo packageInfo) {
        return a(packageInfo, false);
    }

    public final boolean a(PackageInfo packageInfo, boolean z) {
        return c(packageInfo, z).b;
    }

    public final boolean b(String str) {
        return c(str).b;
    }

    public final boolean c(PackageInfo packageInfo) {
        String str = packageInfo.packageName;
        packageInfo.packageName = "com.google.android.gms.chimera";
        hxv c2 = c(packageInfo, true);
        packageInfo.packageName = str;
        return c2.b;
    }
}
