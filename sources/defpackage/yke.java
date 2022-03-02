package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: yke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yke {
    private static yey a = null;
    private static yki b = null;
    private static final jjg c = jjg.a(iyc.PLATFORM_CONFIGURATOR);

    public static String a(String str) {
        return ykh.a(str.split(":", -1)[0]);
    }

    private static int b(String str, Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (!azdd.a.a().i()) {
                return packageManager.getPackageInfo(str, 128).versionCode;
            }
            return packageManager.getPackageInfo(str, 1073741952).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            ((anih) ((anih) c.c()).a("yke", "b", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Package %s name not found! Using module version.", (Object) str);
            return c(context);
        }
    }

    private static int c(Context context) {
        try {
            return ModuleManager.get(context).getCurrentModule().moduleVersion;
        } catch (Exception e) {
            anih anih = (anih) c.b();
            anih.a((Throwable) e);
            ((anih) anih.a("yke", "c", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Problem fetching module version!");
            return 1;
        }
    }

    public static yey a(Context context) {
        if (a == null) {
            a = yef.a(context);
        }
        return a;
    }

    public static boolean a(String str, Context context) {
        return a(str, (String) null, context);
    }

    public static boolean a(String str, String str2, Context context) {
        int i;
        if (amrk.a(str2) || Build.VERSION.SDK_INT < 29) {
            i = c(context);
        } else {
            PackageManager packageManager = context.getPackageManager();
            try {
                i = !azdd.a.a().i() ? packageManager.getPackageInfo(str2, 128).versionCode : packageManager.getPackageInfo(str2, 1073741952).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                ((anih) ((anih) c.c()).a("yke", "b", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Package %s name not found! Using module version.", (Object) str2);
                i = c(context);
            }
        }
        try {
            acws.a(a(context).a(str, i, new String[]{"PHENOTYPE"}, new int[0]), 2000, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            anih anih = (anih) c.c();
            anih.a(e2);
            ((anih) anih.a("yke", "a", 83, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Phenotype platform registration failed for %s", (Object) str);
            return false;
        }
    }

    public static String b(String str) {
        if (azdd.e()) {
            String[] split = str.split(":", -1);
            if (split.length >= 2) {
                return split[1];
            }
        }
        return null;
    }

    public static yki b(Context context) {
        if (b == null) {
            b = new yki(a(context), context, new ykl(context));
        }
        return b;
    }
}
