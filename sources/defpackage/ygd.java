package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: ygd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygd {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private static final anax b = anax.a((Object) "com.google", (Object) "com.google.work");
    private static final anax c = anax.a((Object) "cn.google");
    private static volatile Boolean d;

    public static boolean a(String str, Context context) {
        for (String equals : a(context)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String[] a(Context context) {
        anax anax;
        try {
            if (d == null) {
                int i = Build.VERSION.SDK_INT;
                d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (!d.booleanValue()) {
                anax = b;
            } else {
                anax = c;
            }
            ArrayList arrayList = new ArrayList(r3);
            for (Account account : qub.a(context).b()) {
                if (anax.contains(account.type)) {
                    arrayList.add(account.name);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (SecurityException e) {
            anih anih = (anih) a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("ygd", "a", 38, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to get device user accounts");
            return new String[0];
        }
    }
}
