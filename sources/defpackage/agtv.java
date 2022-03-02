package defpackage;

/* renamed from: agtv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agtv implements amqy {
    static final amqy a = new agtv();

    private agtv() {
    }

    public final Object a(Object obj) {
        agti agti = agti.UNKNOWN;
        int ordinal = ((agti) obj).ordinal();
        if (ordinal == 0) {
            return atxf.UNKNOWN_REQUEST_REASON;
        }
        if (ordinal == 1) {
            return atxf.FORCED_SYNC;
        }
        throw new AssertionError();
    }
}
