package defpackage;

/* renamed from: afnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnr implements amqy {
    private final afnt a;

    public afnr(afnt afnt) {
        this.a = afnt;
    }

    public final Object a(Object obj) {
        afnt afnt = this.a;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        afnt.e.b(1036);
        afsh.a("%s: Failed to remove expired groups!", (Object) "ExpirationHandler");
        return null;
    }
}
