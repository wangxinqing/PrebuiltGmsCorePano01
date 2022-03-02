package defpackage;

/* renamed from: qlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlo {
    private final aucd a = allr.b.o();

    public final void a(int i) {
        aucd o = alls.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        alls alls = (alls) o.b;
        alls.b = i - 1;
        alls.a |= 1;
        long currentTimeMillis = System.currentTimeMillis();
        if (o.c) {
            o.c();
            o.c = false;
        }
        alls alls2 = (alls) o.b;
        alls2.a |= 2;
        alls2.c = currentTimeMillis;
        alls alls3 = (alls) o.i();
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        allr allr = (allr) aucd.b;
        allr allr2 = allr.b;
        alls3.getClass();
        if (!allr.a.a()) {
            allr.a = aucj.a(allr.a);
        }
        allr.a.add(alls3);
    }

    public final byte[] a() {
        return ((allr) this.a.i()).k();
    }
}
