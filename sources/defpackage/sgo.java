package defpackage;

/* renamed from: sgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sgo implements amqy {
    static final amqy a = new sgo();

    private sgo() {
    }

    public final Object a(Object obj) {
        anij anij = sgp.a;
        if (((Boolean) obj).booleanValue()) {
            sgp.a.d().a("sgp", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Profile sync successfully scheduled.");
            return null;
        }
        sgp.a.d().a("sgp", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Profile sync disabled.");
        return null;
    }
}
