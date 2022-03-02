package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Collection;
import java.util.Map;

/* renamed from: nzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzq {
    public static int a(Context context, HelpConfig helpConfig, String str, int i) {
        return new nzr(context, helpConfig).a(str, i);
    }

    public static boolean b(Context context, HelpConfig helpConfig, String str) {
        return new nzr(context, helpConfig).a(str, false);
    }

    public static void c(Context context, HelpConfig helpConfig, String str) {
        nzp a = new nzr(context, helpConfig).a();
        a.a(str, true);
        a.a();
    }

    public static String a(Context context, HelpConfig helpConfig, String str, String str2) {
        return new nzr(context, helpConfig).a(str, str2);
    }

    public static Map a(Context context, HelpConfig helpConfig) {
        nzr nzr = new nzr(context, helpConfig);
        Collection<nzh> values = nzh.b().values();
        nz nzVar = new nz(values.size());
        for (nzh nzh : values) {
            String a = nzr.a(nzr.a(nzh), (String) null);
            if (a != null) {
                nzVar.put(nzh, a);
            }
        }
        return nzVar;
    }

    public static void a(Context context, HelpConfig helpConfig, String str) {
        nzp a = new nzr(context, helpConfig).a();
        a.a(str);
        a.a();
    }
}
