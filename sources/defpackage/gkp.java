package defpackage;

import java.io.IOException;

/* renamed from: gkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gkp implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ gkq b;

    public gkp(gkq gkq, byte[] bArr) {
        this.b = gkq;
        this.a = bArr;
    }

    public final void run() {
        if (this.b.d.get()) {
            gkq.a.d("Write failed because this connection is already disconnected.", new Object[0]);
            return;
        }
        try {
            this.b.c.writeInt(this.a.length);
            this.b.c.write(this.a);
            this.b.c.flush();
        } catch (IOException e) {
            gkq.a.a((Throwable) e);
            this.b.a();
        }
    }
}
