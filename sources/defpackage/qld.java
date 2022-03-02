package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* renamed from: qld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qld {
    private final Context a;

    private qld(Context context) {
        this.a = context.getApplicationContext();
    }

    public static qld a(Context context) {
        return new qld(context);
    }

    public final boolean a() {
        if (!aecx.a()) {
            return false;
        }
        Context context = this.a;
        int i = Build.VERSION.SDK_INT;
        if (qff.a == null) {
            qff.a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.software.leanback"));
        }
        if (qff.a.booleanValue() && !axuy.a.a().t()) {
            return false;
        }
        if (!jkr.e() || Settings.Secure.getInt(this.a.getContentResolver(), "instant_apps_enabled", 1) != 0) {
            return true;
        }
        return false;
    }
}
