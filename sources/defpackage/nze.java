package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;

/* renamed from: nze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nze extends nzr {
    private static final Map e = new nz();
    public String a;

    public nze(Context context, HelpConfig helpConfig) {
        super(context, helpConfig);
    }

    public static void a(aoru aoru, nzc nzc, Context context, HelpConfig helpConfig) {
        Account account = helpConfig.d;
        if (account != null) {
            nze nze = new nze(context, helpConfig);
            nze.a = c(account.name);
            if (nze.a("is_account_in_prefs", false)) {
                nzc.a(nze);
            } else {
                aoru.execute(new nzd(nzc, context, helpConfig));
            }
        } else {
            nzc.a(new nze(context, helpConfig));
        }
    }

    public static String c(String str) {
        return Integer.toString(str.hashCode());
    }

    public final boolean b(String str) {
        String a2 = a(str);
        ou a3 = nzy.a(this.d);
        if (!(a3.get(str) instanceof audx)) {
            return this.b.contains(a(str));
        }
        audx audx = (audx) a3.get(str);
        return (audx == null || a(a2, audx) == audx) ? false : true;
    }

    public final String a(String str) {
        String str2;
        synchronized (e) {
            Map map = (Map) e.get(this.a);
            if (map == null) {
                map = new nz();
                e.put(this.a, map);
            }
            Map map2 = (Map) map.get(this.c);
            if (map2 == null) {
                map2 = new nz();
                map.put(this.c, map2);
            }
            String str3 = (String) map2.get(str);
            if (str3 != null) {
                return str3;
            }
            if (!TextUtils.isEmpty(this.a)) {
                str2 = String.format("%s:%s", new Object[]{super.a(str), this.a});
            } else {
                str2 = super.a(str);
            }
            map2.put(str, str2);
            return str2;
        }
    }
}
