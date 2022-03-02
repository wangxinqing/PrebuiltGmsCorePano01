package defpackage;

/* renamed from: ahmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmc {
    public static final anax a = anax.a(1, 2, 7, 4, 8, 17, new Integer[0]);
    public final aiap b;
    public int c = 0;
    public int d = 0;
    public int e = 0;

    public ahmc(aiap aiap) {
        this.b = aiap;
    }

    public final void a() {
        this.c = 0;
        this.e = 0;
        this.d = 0;
    }

    public final boolean b() {
        aiap aiap = this.b;
        if (aiap == null) {
            return false;
        }
        for (ahmd ahmd : aiap.a().values()) {
            if (ahmd.b) {
                return Math.min(Math.max(ahmd.a, 50), 100) > 50;
            }
        }
        return false;
    }
}
