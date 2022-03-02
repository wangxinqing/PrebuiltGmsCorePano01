package defpackage;

/* renamed from: ahec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahec implements aoqb {
    private final ahgk a;

    public ahec(ahgk ahgk) {
        this.a = ahgk;
    }

    public final aorr a(Object obj) {
        ahgk ahgk = this.a;
        auil auil = (auil) ((audx) obj);
        if (!auil.b.isEmpty()) {
            return aorl.a((Object) auil);
        }
        long nextLong = ahgk.a.nextLong();
        aucd aucd = (aucd) auil.c(5);
        aucd.a((aucj) auil);
        String l = Long.toString(nextLong);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        auil auil2 = (auil) aucd.b;
        auil auil3 = auil.c;
        l.getClass();
        auil2.a |= 1;
        auil2.b = l;
        return aorl.a((Object) (auil) aucd.i());
    }
}
