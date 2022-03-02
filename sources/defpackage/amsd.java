package defpackage;

/* renamed from: amsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amsd extends ampv {
    final /* synthetic */ amqo g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amsd(amsk amsk, CharSequence charSequence, amqo amqo) {
        super(amsk, charSequence);
        this.g = amqo;
    }

    public final int a(int i) {
        if (this.g.a.find(i)) {
            return this.g.a.start();
        }
        return -1;
    }

    public final int b(int i) {
        return this.g.a.end();
    }
}
