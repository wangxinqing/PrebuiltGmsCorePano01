package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;

/* renamed from: jnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jnh {
    protected final Context a;

    public jnh(Context context) {
        this.a = context;
    }

    public int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public ComponentName b(Activity activity) {
        return activity.getCallingActivity();
    }

    public oq c(String str) {
        ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(str, 0);
        return oq.a(this.a.getPackageManager().getApplicationLabel(applicationInfo), this.a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public boolean c(String str, int i) {
        return true;
    }

    public PackageInfo d(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, 64);
    }

    public int a(String str, int i, int i2) {
        return this.a.checkPermission(str, i, i2);
    }

    public PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final boolean d(String str) {
        return this.a.getPackageManager().hasSystemFeature(str);
    }

    public int a(String str, int i, int i2, String str2) {
        return kr.a(this.a, str, i, i2, str2);
    }

    public CharSequence b(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public int a(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public String a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        String valueOf = String.valueOf(callingActivity);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("getCallingPackage(): Couldn't get a package name from ");
        sb.append(valueOf);
        Log.e("PackageManagerWrapper", sb.toString());
        return null;
    }

    public boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return jng.a(this.a);
        }
        if (!jkr.e() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    public boolean a(int i, String str) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            ((AppOpsManager) this.a.getSystemService("appops")).checkPackage(i, str);
            return true;
        } catch (SecurityException e) {
            return false;
        }
    }

    public String[] a(int i) {
        return this.a.getPackageManager().getPackagesForUid(i);
    }
}
