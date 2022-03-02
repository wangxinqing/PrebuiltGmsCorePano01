package defpackage;

/* renamed from: rnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnk implements rnr {
    private final rnn a;

    public rnk(rnn rnn) {
        this.a = rnn;
    }

    public final void a(Object obj) {
        rnn rnn = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        synchronized (rnn.a) {
            rnn.a(rnn.f, booleanValue);
        }
    }
}
