package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: afmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class afmt {
    public static final afmt a;
    public static final afmt b;

    static {
        afmr c = c();
        c.a((Set) EnumSet.noneOf(afms.class));
        c.a(false);
        c.a();
        afmr c2 = c();
        c2.a((Set) EnumSet.of(afms.ANY));
        c2.a(true);
        a = c2.a();
        afmr c3 = c();
        c3.a((Set) EnumSet.of(afms.ANY));
        c3.a(false);
        b = c3.a();
    }

    public static afmr c() {
        afmr afmr = new afmr();
        afmr.a(false);
        return afmr;
    }

    public abstract boolean a();

    public abstract anax b();
}
