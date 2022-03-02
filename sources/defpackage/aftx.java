package defpackage;

/* renamed from: aftx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aftx {
    public static aftx a(auco auco) {
        return new aftt(auco, (Integer) null);
    }

    public abstract auco a();

    public abstract Integer b();

    public static aftx a(auco auco, babj babj) {
        if (babj != null) {
            return new aftt(auco, Integer.valueOf(babj.r.r));
        }
        return a(auco);
    }
}
