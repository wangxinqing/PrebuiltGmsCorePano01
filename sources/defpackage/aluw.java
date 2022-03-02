package defpackage;

/* renamed from: aluw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aluw {
    public static final amjf a;

    static {
        amjd c = amjf.c();
        c.a(alux.a);
        a = c.a();
    }

    public static final int a(amjf amjf) {
        if (b(amjf)) {
            return 24;
        }
        amje amje = amje.KIND_NOT_SET;
        int ordinal = amjf.b.ordinal();
        if (ordinal == 1) {
            return alux.a(amjf.a());
        }
        if (ordinal == 2) {
            return amjf.b().length() + 24;
        }
        throw new IllegalArgumentException();
    }

    public static final amjf b(amic amic) {
        amjd c = amjf.c();
        c.a(amic);
        return c.a();
    }

    public static final boolean b(amjf amjf) {
        return amjf.b == amje.JSON && amjf.a().b == amib.NULL_VALUE;
    }

    public static final amjf a(amic amic) {
        amjd c = amjf.c();
        c.a(amic);
        return c.a();
    }

    public static final amjf a(String str) {
        amjd c = amjf.c();
        c.a(str);
        return c.a();
    }

    public static final boolean a(amjf amjf, amjf amjf2) {
        amje amje = amjf.b;
        if (amje != amjf2.b) {
            return false;
        }
        amje amje2 = amje.KIND_NOT_SET;
        int ordinal = amje.ordinal();
        if (ordinal == 1) {
            return alyr.a(amjf.a(), amjf2.a());
        }
        if (ordinal == 2) {
            return amjf.b().equals(amjf2.b());
        }
        throw new IllegalArgumentException();
    }

    public static boolean a(String str, amjf amjf) {
        return amjf.b == amje.REFERENCED_ID && amjf.b().equals(str);
    }
}
