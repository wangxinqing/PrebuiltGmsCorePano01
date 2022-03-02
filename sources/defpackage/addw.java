package defpackage;

/* renamed from: addw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class addw implements amqy {
    static final amqy a = new addw();

    private addw() {
    }

    public final Object a(Object obj) {
        aunm J = azrk.a.a().J();
        int i = ((aczd) obj).c;
        auop auop = auop.d;
        audr audr = J.a;
        Integer valueOf = Integer.valueOf(i);
        return audr.containsKey(valueOf) ? (auop) audr.get(valueOf) : auop;
    }
}
