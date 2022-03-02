package defpackage;

import android.content.Context;
import java.util.HashSet;

/* renamed from: hke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hke {
    private static final amth a;
    private final Context b;
    private final hol c;

    static {
        amtm a2 = amtm.a();
        a2.b(amut.SOFT);
        a = a2.d();
    }

    private hke(Context context, String str) {
        this.b = context;
        this.c = new hol(this.b, "CHROMESYNC", str);
    }

    public static synchronized hke a(Context context, String str) {
        hke hke;
        synchronized (hke.class) {
            hke = (hke) a.b(str);
            if (hke == null) {
                hke = new hke(context, str);
                a.a(str, hke);
            }
        }
        return hke;
    }

    private final void a(aucd aucd) {
        HashSet hashSet = new HashSet();
        for (String parseInt : amsk.a(',').a().a((CharSequence) his.r.c())) {
            hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        int a2 = anso.a(((ansp) aucd.b).b);
        if (a2 == 0) {
            a2 = 1;
        }
        if (hashSet.contains(Integer.valueOf(a2 - 1))) {
            this.c.a(((ansp) aucd.i()).k()).b();
        }
    }

    public final void a(ansm ansm) {
        aucd o = ansp.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansp ansp = (ansp) o.b;
        ansp.b = 2;
        int i = ansp.a | 1;
        ansp.a = i;
        ansm.getClass();
        ansp.c = ansm;
        ansp.a = i | 2;
        a(o);
    }

    public final void a(anss anss) {
        aucd o = ansp.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansp ansp = (ansp) o.b;
        ansp.b = 1;
        int i = 1 | ansp.a;
        ansp.a = i;
        anss.getClass();
        ansp.d = anss;
        ansp.a = i | 4;
        a(o);
    }
}
