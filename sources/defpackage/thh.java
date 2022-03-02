package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: thh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class thh {
    public static final thh a;
    public static final thh b;
    private final String c;
    private anax d;

    static {
        thf a2 = a();
        a2.a = "first_party_whitelist";
        a = a2.a();
        thf a3 = a();
        a3.a = "second_party_whitelist";
        b = a3.a();
    }

    public thh(String str) {
        anax anax;
        amrl.a((Object) str);
        this.c = str;
        if ("first_party_whitelist".equals(str)) {
            anax = anax.a((Collection) a(aynf.c()));
        } else {
            anax = "second_party_whitelist".equals(str) ? anax.a((Collection) a(aynf.a.a().g())) : null;
        }
        this.d = anax;
    }

    public static synchronized Set a(String str) {
        synchronized (thh.class) {
            if ("".equals(str)) {
                Set emptySet = Collections.emptySet();
                return emptySet;
            }
            HashSet hashSet = new HashSet();
            for (String split : str.split(",")) {
                String[] split2 = split.split(":");
                if (split2.length == 2) {
                    hashSet.add(new thg(split2[0], split2[1]));
                }
            }
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            return unmodifiableSet;
        }
    }

    public static boolean b(Context context, String str) {
        return a.a(context, str) || b.a(context, str);
    }

    public static thf a() {
        return new thf();
    }

    public final boolean a(Context context, String str) {
        if (!aynf.a.a().e()) {
            if (this.d == null) {
                this.d = anax.a((Collection) a(aynf.c()));
            }
            anax anax = this.d;
            try {
                String e = jhg.e(context, str);
                anhj a2 = anax.iterator();
                while (a2.hasNext()) {
                    thg thg = (thg) a2.next();
                    if (thg.a.equals(str) && thg.b.equalsIgnoreCase(e)) {
                        jjg jjg = tgb.a;
                        return true;
                    }
                }
                jjg jjg2 = tgb.a;
                return false;
            } catch (PackageManager.NameNotFoundException e2) {
                jjg jjg3 = tgb.a;
                anih anih = (anih) tgb.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("thh", "a", 127, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Package not found: %s", (Object) str);
                return false;
            }
        } else {
            jjg jjg4 = tgb.a;
            return true;
        }
    }
}
