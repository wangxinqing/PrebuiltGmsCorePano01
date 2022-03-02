package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* renamed from: ltt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltt extends luj {
    private final String a;

    public ltt(String str) {
        amrl.a((Object) str);
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public final ApplicationInfo a(PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo(this.a, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public final String a() {
        return this.a;
    }

    public final ComponentName b(Context context) {
        return a(context, this.a);
    }

    public final int c() {
        return 1;
    }

    public final boolean d(Context context) {
        return c(context);
    }

    public final CharSequence a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo a2 = a(packageManager);
        if (a2 != null) {
            return packageManager.getApplicationLabel(a2);
        }
        return null;
    }

    public final Intent b() {
        return b(this.a);
    }

    public final boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo a2 = a(packageManager);
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.APPLICATION_PREFERENCES").setPackage(this.a), 0);
        if (!(a2 == null || resolveActivity == null)) {
            if (lxh.a(awqy.a.a().c(), this.a)) {
                return true;
            }
        }
        return false;
    }
}
