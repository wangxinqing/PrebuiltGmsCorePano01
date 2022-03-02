package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: krl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class krl extends krj {
    public final lgq d;

    public krl(lgq lgq, klw klw) {
        super(lgq, klw);
        this.d = lgq;
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final String d() {
        return this.d.c;
    }

    public final String e() {
        return ((klw) a()).d;
    }

    public final String f() {
        return this.d.d;
    }

    public final kns g() {
        return ((klw) a()).e;
    }

    public final boolean h() {
        return f() == null;
    }

    public static Map a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            krl krl = (krl) it.next();
            hashMap.put(a(krl.d(), krl.f()), krl);
        }
        return hashMap;
    }

    public final void a(String str, Long l) {
        kns g = g();
        if (l != null) {
            if (g.a()) {
                g.a(l.longValue());
            } else {
                g.a((Object) e(), l.longValue());
            }
            ((klw) a()).a(str);
        } else if (g.a()) {
            g.a((Object) str);
        } else {
            ((klw) a()).a(str);
        }
    }
}
