package defpackage;

import java.io.IOException;

/* renamed from: ampp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampp implements amoh {
    final /* synthetic */ ampq a;

    public ampp(ampq ampq) {
        this.a = ampq;
    }

    public final void a(amon amon) {
        synchronized (this.a) {
            if (!amon.b()) {
                this.a.a(new IOException("transmit of connection confirm failed"));
                return;
            }
            ampq ampq = this.a;
            if (ampq.f != 1) {
                ampq.b.a((IOException) new amom("unexpected transmit of connection confirm"));
            }
            ampq ampq2 = this.a;
            ampq2.f = 2;
            ampq2.a(ampq2.g);
        }
    }
}
