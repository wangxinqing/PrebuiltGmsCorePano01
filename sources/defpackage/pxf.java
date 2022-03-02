package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: pxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxf {
    private static final amsk b = amsk.a(';').b().a();
    private static final amsk c = amsk.a('=').b().a();
    private static final amsk d = amsk.a(',').b().a();
    private static volatile Pair e;
    public final Context a;

    public pxf(Context context) {
        this.a = context;
    }

    public static Map b() {
        Pair pair;
        String str = (String) ozx.bB.c();
        oso.d("Checking AppIndexing type access whitelist: %s", (Object) str);
        if (str == null || str.isEmpty()) {
            return Collections.emptyMap();
        }
        Pair pair2 = e;
        if (pair2 == null || !((String) pair2.first).equals(str)) {
            synchronized (pxf.class) {
                if (e == null || !((String) e.first).equals(str)) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : b.a((CharSequence) str)) {
                        List c2 = c.c(str2);
                        if (c2.size() != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28);
                            sb.append("Invalid whitelist segment \"");
                            sb.append(str2);
                            sb.append("\"");
                            oso.b(sb.toString());
                        } else {
                            String str3 = (String) c2.get(0);
                            Set set = (Set) hashMap.get(str3);
                            if (set == null) {
                                set = new LinkedHashSet();
                                hashMap.put(str3, set);
                            }
                            for (String add : d.a((CharSequence) c2.get(1))) {
                                set.add(add);
                            }
                        }
                    }
                    e = new Pair(str, hashMap);
                }
                pair = e;
            }
            pair2 = pair;
        }
        return (Map) pair2.second;
    }

    private static oqh c() {
        aucd o = oqh.c.o();
        for (String str : TextUtils.split((String) ozx.N.c(), ",")) {
            aucd o2 = oqf.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            oqf oqf = (oqf) o2.b;
            str.getClass();
            oqf.a |= 1;
            oqf.b = str;
            oqf oqf2 = (oqf) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            oqh oqh = (oqh) o.b;
            oqf2.getClass();
            oqh.a();
            oqh.a.add(oqf2);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        oqh.a((oqh) o.b);
        return (oqh) o.i();
    }

    private static oql d() {
        aucd o = oql.f.o();
        o.i("internal.3p:Event");
        o.j("com.google.android.gms");
        if (o.c) {
            o.c();
            o.c = false;
        }
        oql oql = (oql) o.b;
        oql.e = 2;
        oql.a |= 1;
        return (oql) o.i();
    }

    private static oql e() {
        aucd o = oql.f.o();
        o.i("internal.3p:Message");
        o.j("com.google.android.gms");
        if (o.c) {
            o.c();
            o.c = false;
        }
        oql oql = (oql) o.b;
        oql.e = 2;
        oql.a |= 1;
        return (oql) o.i();
    }

    private static oql f() {
        aucd o = oql.f.o();
        o.i("sms");
        o.j("com.google.android.gms");
        if (o.c) {
            o.c();
            o.c = false;
        }
        oql oql = (oql) o.b;
        oql.e = 2;
        oql.a |= 1;
        return (oql) o.i();
    }

    public static String a(String str) {
        int i = Build.VERSION.SDK_INT;
        if (str.startsWith(poo.a.toString()) || str.startsWith(poo.b.toString())) {
            return "sms";
        }
        if (str.startsWith(CalendarContract.Events.CONTENT_URI.toString())) {
            return "internal.3p:Event";
        }
        return null;
    }

    public static oqe a() {
        aucd o = oqe.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oqe oqe = (oqe) o.b;
        oqe.a |= 1;
        oqe.c = 1;
        aucd o2 = oql.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        oql oql = (oql) o2.b;
        oql.e = 2;
        oql.a |= 1;
        aucd o3 = oqk.e.o();
        o3.a(c());
        o3.b((oql) o2.i());
        o3.a(d());
        o3.a(f());
        o3.a(e());
        o3.a(oqj.READ);
        o.a((oqk) o3.i());
        oqh c2 = c();
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        oqh oqh = oqh.c;
        ((oqh) aucd.b).b = aucj.s();
        aucd o4 = oqg.c.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        oqg oqg = (oqg) o4.b;
        "android.permission.READ_SMS".getClass();
        oqg.a |= 1;
        oqg.b = "android.permission.READ_SMS";
        aucd.a((oqg) o4.i());
        aucd o5 = oqk.e.o();
        o5.m(aucd);
        o5.b(f());
        o5.b(e());
        o5.a(oqj.READ);
        o.a((oqk) o5.i());
        if (axsd.c()) {
            oqh c3 = c();
            aucd aucd2 = (aucd) c3.c(5);
            aucd2.a((aucj) c3);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ((oqh) aucd2.b).b = aucj.s();
            aucd o6 = oqg.c.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            oqg oqg2 = (oqg) o6.b;
            "android.permission.READ_CALENDAR".getClass();
            oqg2.a |= 1;
            oqg2.b = "android.permission.READ_CALENDAR";
            aucd2.a((oqg) o6.i());
            aucd o7 = oqk.e.o();
            o7.m(aucd2);
            o7.b(d());
            o7.a(oqj.READ);
            o.a((oqk) o7.i());
        }
        if (((Boolean) ozx.F.c()).booleanValue()) {
            aucd o8 = oqh.c.o();
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            oqh.a((oqh) o8.b);
            for (String str : ozx.a()) {
                aucd o9 = oqf.c.o();
                if (o9.c) {
                    o9.c();
                    o9.c = false;
                }
                oqf oqf = (oqf) o9.b;
                str.getClass();
                oqf.a |= 1;
                oqf.b = str;
                o8.d(o9);
            }
            aucd o10 = oql.f.o();
            List asList = Arrays.asList(((String) ozx.I.c()).split(","));
            if (o10.c) {
                o10.c();
                o10.c = false;
            }
            oql oql2 = (oql) o10.b;
            oql2.a();
            auab.a((Iterable) asList, (List) oql2.b);
            if (o10.c) {
                o10.c();
                o10.c = false;
            }
            oql oql3 = (oql) o10.b;
            oql3.e = 2;
            oql3.a |= 1;
            aucd o11 = oqk.e.o();
            o11.m(o8);
            o11.b((oql) o10.i());
            o11.a(oqj.READ);
            o.a((oqk) o11.i());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : b().entrySet()) {
            aucd o12 = oqh.c.o();
            if (o12.c) {
                o12.c();
                o12.c = false;
            }
            oqh.a((oqh) o12.b);
            aucd o13 = oqf.c.o();
            String str2 = (String) entry.getKey();
            if (o13.c) {
                o13.c();
                o13.c = false;
            }
            oqf oqf2 = (oqf) o13.b;
            str2.getClass();
            oqf2.a |= 1;
            oqf2.b = str2;
            o12.d(o13);
            oqh oqh2 = (oqh) o12.i();
            aucd o14 = oql.f.o();
            if (o14.c) {
                o14.c();
                o14.c = false;
            }
            oql oql4 = (oql) o14.b;
            oql4.e = 2;
            oql4.a |= 1;
            for (String str3 : (Set) entry.getValue()) {
                if (o14.c) {
                    o14.c();
                    o14.c = false;
                }
                oql oql5 = (oql) o14.b;
                str3.getClass();
                if (!oql5.d.a()) {
                    oql5.d = aucj.a(oql5.d);
                }
                oql5.d.add(str3);
            }
            aucd o15 = oqk.e.o();
            o15.a(oqh2);
            if (o15.c) {
                o15.c();
                o15.c = false;
            }
            oqk oqk = (oqk) o15.b;
            oql oql6 = (oql) o14.i();
            oql6.getClass();
            oqk.b();
            oqk.b.add(oql6);
            o15.a(oqj.READ);
            arrayList.add((oqk) o15.i());
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        oqe oqe2 = (oqe) o.b;
        oqe2.a();
        auab.a((Iterable) arrayList, (List) oqe2.b);
        return (oqe) o.i();
    }

    public final void a(String str, String str2) {
        String str3;
        if (str2.equals("sms") || str2.equals("internal.3p:Message")) {
            str3 = "android.permission.READ_SMS";
        } else if (str2.equals("internal.3p:Event")) {
            str3 = "android.permission.READ_CALENDAR";
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 47);
            sb.append("Checking READ permission to: ");
            sb.append(str2);
            sb.append(" is not supported.");
            throw new pxe(sb.toString());
        }
        if (!hya.a(this.a).b(str) || this.a.getPackageManager().checkPermission(str3, str) != 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
            sb2.append(str);
            sb2.append(" doesn't have permission to report usage to: ");
            sb2.append(str2);
            throw new pxe(sb2.toString());
        }
    }
}
