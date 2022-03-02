package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: vfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vfg {
    static final Map a = Collections.emptyMap();
    private final String b;
    private final uws c;
    private volatile long d = 0;
    private asnj e;

    public vfg(Context context, String str) {
        this.b = str;
        this.c = (uws) thl.a(context, uws.class);
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            aucd o = asni.d.o();
            String str = (String) entry.getKey();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asni asni = (asni) o.b;
            str.getClass();
            asni.a |= 1;
            asni.b = str;
            String str2 = (String) entry.getValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asni asni2 = (asni) o.b;
            str2.getClass();
            asni2.a |= 2;
            asni2.c = str2;
            arrayList.add((asni) o.i());
        }
        return arrayList;
    }

    public final void a(audx audx, int i, Map map) {
        SystemClock.elapsedRealtime();
        jjg jjg = tgc.a;
        if (this.c.b() && this.e != null) {
            aucd o = asnl.f.o();
            long currentTimeMillis = System.currentTimeMillis();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asnl asnl = (asnl) o.b;
            int i2 = asnl.a | 1;
            asnl.a = i2;
            asnl.b = currentTimeMillis;
            asnl.a = i2 | 2;
            asnl.c = i;
            List a2 = a(map);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asnl asnl2 = (asnl) o.b;
            if (!asnl2.d.a()) {
                asnl2.d = aucj.a(asnl2.d);
            }
            auab.a((Iterable) a2, (List) asnl2.d);
            if (audx != null) {
                auay au = audx.au();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asnl asnl3 = (asnl) o.b;
                au.getClass();
                asnl3.a |= 4;
                asnl3.e = au;
            }
            uws uws = this.c;
            asnj asnj = this.e;
            aucd aucd = (aucd) asnj.c(5);
            aucd.a((aucj) asnj);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            asnj asnj2 = (asnj) aucd.b;
            asnl asnl4 = (asnl) o.i();
            asnj asnj3 = asnj.d;
            asnl4.getClass();
            asnj2.c = asnl4;
            asnj2.a |= 2;
            uws.a((asnj) aucd.i());
        }
    }

    public final void a(String str, audx audx, Map map) {
        this.d = SystemClock.elapsedRealtime();
        if (this.c.b()) {
            aucd o = asnk.g.o();
            long currentTimeMillis = System.currentTimeMillis();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asnk asnk = (asnk) o.b;
            int i = asnk.a | 1;
            asnk.a = i;
            asnk.b = currentTimeMillis;
            String str2 = this.b;
            str2.getClass();
            asnk.a = i | 4;
            asnk.d = str2;
            List a2 = a(map);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asnk asnk2 = (asnk) o.b;
            if (!asnk2.e.a()) {
                asnk2.e = aucj.a(asnk2.e);
            }
            auab.a((Iterable) a2, (List) asnk2.e);
            if (str != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asnk asnk3 = (asnk) o.b;
                str.getClass();
                asnk3.a |= 2;
                asnk3.c = str;
            }
            if (audx != null) {
                auay au = audx.au();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asnk asnk4 = (asnk) o.b;
                au.getClass();
                asnk4.a |= 16;
                asnk4.f = au;
            }
            aucd o2 = asnj.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asnj asnj = (asnj) o2.b;
            asnk asnk5 = (asnk) o.i();
            asnk5.getClass();
            asnj.b = asnk5;
            asnj.a |= 1;
            this.e = (asnj) o2.i();
        }
    }
}
