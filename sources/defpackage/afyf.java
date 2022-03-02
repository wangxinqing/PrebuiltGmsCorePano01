package defpackage;

/* renamed from: afyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afyf implements amqy {
    private final long a;

    public afyf(long j) {
        this.a = j;
    }

    public final Object a(Object obj) {
        long j = this.a;
        afys afys = (afys) obj;
        aucd aucd = (aucd) afys.c(5);
        aucd.a((aucj) afys);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        afys afys2 = (afys) aucd.b;
        afys afys3 = afys.f;
        afys2.a |= 2;
        afys2.d = j;
        return (afys) aucd.i();
    }
}
