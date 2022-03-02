package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.Activity;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: quj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class quj {
    private static final Object a = new Object();
    private static quj b;

    private quj() {
    }

    public static void a() {
        synchronized (a) {
            if (b == null) {
                b = new quj();
            }
        }
    }

    public static final boolean b(Context context) {
        Account[] accountArr;
        qub a2 = qub.a(context);
        int i = Build.VERSION.SDK_INT;
        if (context == null || context.getPackageName() == null) {
            accountArr = a2.a("com.google");
        } else {
            accountArr = a2.a("com.google", context.getPackageName());
        }
        return accountArr.length > 0;
    }

    public static final void c(Context context) {
        context.startActivity(new Intent().setClassName(context, "com.google.android.gms.app.settings.OpenSourceLicensesActivity"));
    }

    public static final void d(Context context) {
        context.startActivity(new Intent("com.google.android.gms.usagereporting.GOOGLE_SETTINGS").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT"));
    }

    public static final boolean e(Context context) {
        return !jix.e(context);
    }

    public static final void a(Uri uri, Activity activity) {
        GoogleHelp a2 = GoogleHelp.a("android_main");
        a2.a((Context) activity);
        a2.s = jbn.a(activity);
        a2.q = uri;
        mwc mwc = new mwc();
        mwc.a(iby.a(activity.getContainerActivity()));
        a2.a(mwc.a(), activity.getCacheDir());
        new nyw(activity).a(a2.a());
    }

    public static final boolean a(Context context) {
        return context.getSharedPreferences("googlesettings", 0).getBoolean("ShowDebug", false);
    }

    public static final boolean a(GoogleSettingsItem googleSettingsItem, Context context, boolean z) {
        boolean b2 = b(context);
        boolean b3 = jgu.b(context);
        if (googleSettingsItem.f && !b2 && !googleSettingsItem.h) {
            return false;
        }
        if (googleSettingsItem.g && !b3 && !googleSettingsItem.h) {
            return false;
        }
        int i = googleSettingsItem.c;
        if (i != 2) {
            if (i != 3) {
                return true;
            }
            ContentResolver contentResolver = context.getContentResolver();
            int i2 = Build.VERSION.SDK_INT;
            if (Settings.Global.getInt(contentResolver, "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } else if (!z || a(context)) {
            return true;
        } else {
            return false;
        }
    }
}
