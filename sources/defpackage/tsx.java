package defpackage;

/* renamed from: tsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tsx implements amsv {
    private final ttf a;
    private final auay b;

    public tsx(ttf ttf, auay auay) {
        this.a = ttf;
        this.b = auay;
    }

    public final Object a() {
        ttf ttf = this.a;
        auay auay = this.b;
        for (tzi tzi : ttf.d.d()) {
            if (auay.equals(tzi.c)) {
                return tzi;
            }
        }
        return null;
    }
}
