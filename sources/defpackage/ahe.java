package defpackage;

/* renamed from: ahe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahe {
    public static aorr a(ahb ahb) {
        agz agz = new agz();
        ahd ahd = new ahd(agz);
        agz.b = ahd;
        agz.a = ahb.getClass();
        try {
            Object a = ahb.a(agz);
            if (a != null) {
                agz.a = a;
            }
        } catch (Exception e) {
            ahd.a(e);
        }
        return ahd;
    }
}
