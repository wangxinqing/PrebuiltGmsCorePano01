package defpackage;

/* renamed from: hmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hmp implements amqy {
    static final amqy a = new hmp();

    private hmp() {
    }

    public final Object a(Object obj) {
        String str = (String) obj;
        return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
    }
}
