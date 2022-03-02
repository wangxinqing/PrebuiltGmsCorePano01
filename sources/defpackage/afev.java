package defpackage;

/* renamed from: afev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afev implements amqy {
    private final affb a;

    public afev(affb affb) {
        this.a = affb;
    }

    public final Object a(Object obj) {
        aokp aokp = (aokp) obj;
        if (!this.a.k.n.d()) {
            aucd o = aokp.o.o();
            aomx aomx = aomx.SUCCESS;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokp aokp2 = (aokp) o.b;
            aokp2.c = aomx.a();
            aokp2.a |= 2;
            return (aokp) o.i();
        }
        aucd aucd = (aucd) aokp.c(5);
        aucd.a((aucj) aokp);
        aomx aomx2 = aomx.SUCCESS;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aokp aokp3 = (aokp) aucd.b;
        aokp aokp4 = aokp.o;
        aokp3.c = aomx2.a();
        aokp3.a |= 2;
        return (aokp) aucd.i();
    }
}
