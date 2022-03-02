package defpackage;

/* renamed from: afsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afsd implements amqy {
    private final aucd a;

    public afsd(aucd aucd) {
        this.a = aucd;
    }

    public final Object a(Object obj) {
        aucd aucd = this.a;
        afpe afpe = (afpe) obj;
        if (afpe == afpe.DOWNLOADED || afpe == afpe.PENDING) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aojx aojx = (aojx) aucd.b;
            aojx aojx2 = aojx.e;
            aojx.b = aomm.a(4);
            aojx.a |= 1;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aojx aojx3 = (aojx) aucd.b;
            aojx aojx4 = aojx.e;
            aojx3.b = aomm.a(5);
            aojx3.a |= 1;
        }
        return (aojx) aucd.i();
    }
}
