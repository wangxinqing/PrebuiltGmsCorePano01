package defpackage;

/* renamed from: aers  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aers implements amqy {
    private final aeru a;
    private final aucd b;

    public aers(aeru aeru, aucd aucd) {
        this.a = aeru;
        this.b = aucd;
    }

    public final Object a(Object obj) {
        aeru aeru = this.a;
        aucd aucd = this.b;
        String str = (String) obj;
        aomr aomr = aomr.AUTHENTICATED;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aokd aokd = (aokd) aucd.b;
        aokd aokd2 = aokd.c;
        aokd.b = aomr.a();
        aokd.a |= 8;
        ((aetj) aeru.b.a()).a((aokd) aucd.i());
        return str;
    }
}
