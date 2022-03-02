package defpackage;

/* renamed from: sku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sku implements amqy {
    static final amqy a = new sku();

    private sku() {
    }

    public final Object a(Object obj) {
        aunm l = aygr.a.a().l();
        int i = ((slq) obj).d;
        auop auop = auop.d;
        audr audr = l.a;
        Integer valueOf = Integer.valueOf(i);
        return audr.containsKey(valueOf) ? (auop) audr.get(valueOf) : auop;
    }
}
