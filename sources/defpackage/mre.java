package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: mre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mre {
    public static boolean a(Context context) {
        if (!aymw.W() || !new arxg(context).b()) {
            return false;
        }
        if (hya.a(context).b("com.google.location.nearby.apps.fastpair.autotest")) {
            return true;
        }
        ((anih) ((anih) mte.a.c()).a("mre", "a", 28, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("AutoTestChecker: Auto test is not Google signed, check if it's local build");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.location.nearby.apps.fastpair.autotest", 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                ((anih) ((anih) mte.a.c()).a("mre", "a", 44, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("AutoTestChecker: Auto test should only have one signature!");
                return false;
            }
            boolean equals = aymt.a.a().d().equals(packageInfo.signatures[0].toCharsString());
            ((anih) ((anih) mte.a.c()).a("mre", "a", 50, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("AutoTestChecker: isNearByDevSigned=%b", (Object) Boolean.valueOf(equals));
            return equals;
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("mre", "a", 39, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("AutoTestChecker: Auto test package not found!");
            return false;
        }
    }
}
