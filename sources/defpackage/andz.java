package defpackage;

/* renamed from: andz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class andz implements andl {
    public static final andz a = new andz();

    public final /* bridge */ /* synthetic */ andk a(andp andp, andk andk, andk andk2) {
        aneb aneb = (aneb) andp;
        anea anea = (anea) andk;
        anea anea2 = (anea) andk2;
        if (anea.get() == null) {
            return null;
        }
        anea anea3 = new anea(aneb.h, anea.get(), anea.a, anea2);
        anea3.c = anea.c;
        return anea3;
    }

    public final andr b() {
        return andr.STRONG;
    }

    public final /* bridge */ /* synthetic */ andk a(andp andp, Object obj, int i, andk andk) {
        return new anea(((aneb) andp).h, obj, i, (anea) andk);
    }

    public final /* bridge */ /* synthetic */ andp a(anej anej, int i) {
        return new aneb(anej, i);
    }

    public final andr a() {
        return andr.WEAK;
    }

    public final /* bridge */ /* synthetic */ void a(andp andp, andk andk, Object obj) {
        aneb aneb = (aneb) andp;
        ((anea) andk).c = obj;
    }
}
