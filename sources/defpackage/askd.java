package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import java.util.Arrays;
import java.util.Set;

/* renamed from: askd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askd {
    public static void a(Context context) {
        if (context != null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null) {
                int length = packagesForUid.length;
                int i = 0;
                while (i < length) {
                    String str = packagesForUid[i];
                    if (Binder.getCallingUid() != Process.myUid() && !a(context, str)) {
                        if (aynf.f()) {
                            if (a(context, str)) {
                                return;
                            }
                        } else if (aymn.e() || a(context, str, aymn.a.a().g())) {
                            return;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
            String valueOf = String.valueOf(Arrays.toString(packagesForUid));
            throw new SecurityException(valueOf.length() == 0 ? new String("Illegal package ") : "Illegal package ".concat(valueOf));
        }
    }

    private static boolean a(Context context, String str) {
        if (!aynf.f()) {
            return aymn.e() || a(context, str, aymn.a.a().m());
        }
        return thh.b(context, str);
    }

    private static boolean a(Context context, String str, String str2) {
        Set<thg> a = thh.a(str2);
        try {
            String e = jhg.e(context, str);
            for (thg thg : a) {
                if (thg.a.equals(str) && thg.b.equalsIgnoreCase(e)) {
                    ((anih) ((anih) asil.a.d()).a("askd", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Allowing whitelisted package %s", (Object) str);
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            anih anih = (anih) asil.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("askd", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Package not found: %s", (Object) str);
            return false;
        }
    }
}
