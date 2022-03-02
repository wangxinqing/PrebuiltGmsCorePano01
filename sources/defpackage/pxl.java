package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* renamed from: pxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxl {
    public final Intent a;
    private final Context b;

    public pxl(Context context, Intent intent) {
        this.a = intent;
        this.b = context;
    }

    public final boolean a() {
        if ("android.intent.action.PACKAGE_REPLACED".equals(this.a.getAction())) {
            return true;
        }
        if (!"android.intent.action.PACKAGE_CHANGED".equals(this.a.getAction()) || !d()) {
            return "android.intent.action.PACKAGE_ADDED".equals(this.a.getAction());
        }
        return true;
    }

    public final boolean b() {
        return !axsj.c() ? "android.intent.action.PACKAGE_REMOVED".equals(this.a.getAction()) && this.a.getBooleanExtra("android.intent.extra.REPLACING", false) : "android.intent.action.PACKAGE_REMOVED".equals(this.a.getAction()) && this.a.getBooleanExtra("android.intent.extra.REPLACING", false) && !this.a.getBooleanExtra("android.intent.extra.DATA_REMOVED", false);
    }

    public final String c() {
        Uri data = this.a.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    public final boolean d() {
        String c = c();
        try {
            return this.b.getPackageManager().getApplicationInfo(c, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            oso.b((Throwable) e, "Could not get app info for %s", c);
            return false;
        }
    }
}
