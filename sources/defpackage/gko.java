package defpackage;

import java.io.IOException;

/* renamed from: gko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gko extends Thread {
    final /* synthetic */ gkq a;

    public gko(gkq gkq) {
        this.a = gkq;
    }

    public final void run() {
        while (true) {
            try {
                gkq gkq = this.a;
                iwd iwd = gkq.a;
                byte[] bArr = new byte[gkq.b.readInt()];
                this.a.b.readFully(bArr);
                this.a.e.a(bArr);
            } catch (IOException e) {
                gkq.a.a((Throwable) e);
                this.a.a();
                return;
            }
        }
    }
}
