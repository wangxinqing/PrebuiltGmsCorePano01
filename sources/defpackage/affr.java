package defpackage;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: affr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class affr {
    public static boolean a(affr affr, affr affr2) {
        return affr.a() != affr2.a();
    }

    public static boolean b(affr affr, affr affr2) {
        return affr.b() != affr2.b();
    }

    public static boolean c(affr affr, affr affr2) {
        return a(affr, affr2) || b(affr, affr2);
    }

    public static affq e() {
        anab anab = new anab();
        Iterator it = EnumSet.complementOf(EnumSet.of(aomv.UNRECOGNIZED)).iterator();
        while (it.hasNext()) {
            anab.a((aomv) it.next(), 0L);
        }
        affq affq = new affq();
        affq.a(0);
        affq.b(0);
        affq.a(anab.a());
        return affq;
    }

    public abstract long a();

    public abstract long b();

    public abstract anaf c();

    public abstract affq d();

    public final long a(aomv aomv) {
        return ((Long) c().get(aomv)).longValue();
    }
}
