package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.Set;

/* renamed from: uxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxv {
    public static boolean a(Context context, String str) {
        if (aynf.f()) {
            return thh.b(context, str);
        }
        return aync.c() || a(context, str, aync.a.a().r());
    }

    private static Set b(String str) {
        return jir.a((Object[]) str.split(","));
    }

    public static boolean a(Context context, String str, String str2) {
        Set<thg> a = thh.a(str2);
        try {
            String e = jhg.e(context, str);
            for (thg thg : a) {
                if (thg.a.equals(str) && thg.b.equalsIgnoreCase(e)) {
                    jjg jjg = tgc.a;
                    return true;
                }
            }
            jjg jjg2 = tgc.a;
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uxv", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Package not found: %s", (Object) str);
            return false;
        }
    }

    private static boolean a(Context context, String str, Set set, String str2) {
        try {
            String e = jhg.e(context, str);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                thg thg = (thg) it.next();
                if (thg.a.equals(str) && thg.b.equalsIgnoreCase(e)) {
                    jjg jjg = tgc.a;
                    return true;
                }
            }
            jjg jjg2 = tgc.a;
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uxv", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Package not found: %s", (Object) str);
            return false;
        }
    }

    public static boolean a(String str) {
        if (str.startsWith("0p:")) {
            return !b(aync.a.a().W()).contains(str);
        }
        return b(aync.a.a().t()).contains(str);
    }
}
