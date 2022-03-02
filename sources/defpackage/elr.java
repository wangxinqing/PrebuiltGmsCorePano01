package defpackage;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: elr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elr {
    public static final iwd a = new iwd("DroidGuard", "DroidGuardUtil");
    public static final Map b = new HashMap();
    public final Context c;
    private final lxz d;

    public elr(Context context) {
        this.c = context;
        this.d = new lxz(context);
    }

    public static final String a(Context context, String str, String str2) {
        if (!ent.N()) {
            a.a("DroidGuard is turned off", new Object[0]);
            return null;
        }
        elr elr = new elr(context);
        return elr.a(str, elr.a(str2));
    }

    public static String a(Context context, String str, Map map) {
        if (ent.N()) {
            return new elr(context).a(str, map);
        }
        a.a("DroidGuard is turned off", new Object[0]);
        return null;
    }

    public final String a(String str, Map map) {
        iva.a((Object) this.c, (Object) "context cannot be null!");
        iva.a((Object) str, (Object) "flowName cannot be null!");
        iva.a((Object) map, (Object) "args cannot be null!");
        if (!ent.N()) {
            a.a("DroidGuard is turned off", new Object[0]);
            return null;
        }
        try {
            String a2 = this.d.a(str, map, (DroidGuardResultsRequest) null);
            String format = String.format("DroidGuard results.length:%s, flow:%s", new Object[]{Integer.valueOf(a2.length()), str});
            if (!ent.l()) {
                a.a(format, new Object[0]);
            } else {
                a.d(format, new Object[0]);
            }
            return a2;
        } catch (RuntimeException e) {
            a.c("DroidGuard runtime exception: ", e, new Object[0]);
            return null;
        }
    }

    public final Map a(String str) {
        fyk fyk = new fyk(this.c);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("dg_email", str);
        }
        hashMap.put("dg_androidId", iqi.a(this.c));
        hashMap.put("dg_gmsCoreVersion", Integer.toString(fyk.e));
        hashMap.put("dg_package", fyk.d);
        return hashMap;
    }
}
