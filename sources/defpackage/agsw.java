package defpackage;

/* renamed from: agsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsw {
    public static boolean a(babg babg) {
        int ordinal = babg.ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 14 || ordinal == 16;
    }

    public static boolean a(Exception exc) {
        babj babj;
        babg babg;
        babg babg2;
        if (exc instanceof babk) {
            babj babj2 = ((babk) exc).a;
            if (babj2 == null || (babg2 = babj2.r) == null) {
                return false;
            }
            return a(babg2);
        } else if (!(exc instanceof babl) || (babj = ((babl) exc).a) == null || (babg = babj.r) == null) {
            return false;
        } else {
            return a(babg);
        }
    }
}
