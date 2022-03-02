package defpackage;

/* renamed from: ades  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ades implements amsv {
    private final Object a = new Object();
    private final amqy b;
    private aonv c;
    private quk d;

    public ades(amqy amqy) {
        this.b = amqy;
        aonv b2 = adev.b();
        this.c = b2;
        this.d = (quk) amqy.a(b2);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        quk quk;
        synchronized (this.a) {
            aonv b2 = adev.b();
            if (!b2.equals(this.c)) {
                this.c = b2;
                this.d = (quk) this.b.a(b2);
            }
            quk = this.d;
        }
        return quk;
    }
}
