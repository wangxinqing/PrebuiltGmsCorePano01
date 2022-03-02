package defpackage;

/* renamed from: akmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmo {
    public final akui a;

    public akmo(akui akui) {
        this.a = akui;
    }

    public static akmb a(int i, Boolean bool) {
        return new akng(new akmc(), new akng(new aknc(0, bool), new aknc(1, bool), true, 10), false, i);
    }

    public static final akmd a(auac[] auacArr, int i) {
        akmd akmd = new akmd(((asve[]) auacArr)[0], 2, a(i, (Boolean) false));
        asve asve = akmd.b;
        if (asve != null && (asve.a & 1) != 0 && !akmd.a.isEmpty()) {
            return akmd;
        }
        aklz.a().c("Invalid model weights, returning null model weights container");
        return null;
    }
}
