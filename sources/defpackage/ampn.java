package defpackage;

import java.io.IOException;

/* renamed from: ampn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ampn implements amoh {
    final /* synthetic */ ampo a;

    public ampn(ampo ampo) {
        this.a = ampo;
    }

    public final void a(amon amon) {
        synchronized (this.a) {
            if (!amon.b()) {
                this.a.a(new IOException("transmit of connection request failed"));
                return;
            }
            ampo ampo = this.a;
            int i = ampo.f;
            if (i != 3) {
                if (i != 1) {
                    ampo.b.a((IOException) new amom("unexpected transmit of connection request"));
                }
                this.a.f = 2;
            }
        }
    }
}
