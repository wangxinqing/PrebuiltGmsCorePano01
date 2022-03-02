package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import java.lang.ref.WeakReference;

/* renamed from: mfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfx {
    static WeakReference a;

    public static int a(Intent intent) {
        int a2 = a(false, intent);
        if (a2 == 0) {
            return 2132018423;
        }
        return a2;
    }

    public static int b(Intent intent) {
        String stringExtra = intent.getStringExtra("predefinedTheme");
        if (TextUtils.isEmpty(stringExtra)) {
            return 2132018422;
        }
        if (stringExtra.equals("play")) {
            return 2132018527;
        }
        if (stringExtra.equals("music")) {
            return 2132018530;
        }
        if (stringExtra.equals("youtube")) {
            return 2132018552;
        }
        if (stringExtra.equals("g1")) {
            return 2132018427;
        }
        if (stringExtra.equals("assistant")) {
            return 2132018409;
        }
        if (stringExtra.equals("playpass")) {
            return 2132018536;
        }
        return 2132018422;
    }

    static int a(boolean z, Intent intent) {
        String stringExtra = intent.getStringExtra("predefinedTheme");
        if (TextUtils.isEmpty(stringExtra)) {
            return 0;
        }
        if (z) {
            return stringExtra.equals("playpass") ? 2132018532 : 2132018419;
        }
        if (stringExtra.equals("play")) {
            return 2132018525;
        }
        if (stringExtra.equals("music")) {
            return 2132018528;
        }
        if (stringExtra.equals("youtube")) {
            return 2132018550;
        }
        if (stringExtra.equals("g1")) {
            return 2132018425;
        }
        if (stringExtra.equals("assistant")) {
            return 2132018407;
        }
        if (stringExtra.equals("playpass")) {
            return 2132018531;
        }
        return 0;
    }

    public static void a(Activity activity, Intent intent, String str) {
        boolean z;
        Context context;
        if (axfx.b()) {
            z = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        } else {
            z = false;
        }
        int a2 = a(z, intent);
        if (a2 == 0) {
            int intExtra = intent.getIntExtra("customTheme", 0);
            if (intExtra != 0) {
                int i = Build.VERSION.SDK_INT;
                WeakReference weakReference = a;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                if (context == null || !context.getPackageName().equals(str)) {
                    try {
                        context = activity.createPackageContext(str, 0);
                        a = new WeakReference(context);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new IllegalArgumentException("Calling package of families could not be found", e);
                    }
                }
                if (context != null) {
                    Resources.Theme newTheme = context.getResources().newTheme();
                    newTheme.applyStyle(intExtra, true);
                    activity.getTheme().setTo(newTheme);
                    activity.getTheme().applyStyle(2132018424, false);
                    return;
                }
                return;
            }
            return;
        }
        activity.getTheme().applyStyle(a2, true);
    }
}
