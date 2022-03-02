package defpackage;

import java.io.IOException;
import java.net.Socket;

/* renamed from: balz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class balz implements Runnable {
    final /* synthetic */ bamb a;

    public balz(bamb bamb) {
        this.a = bamb;
    }

    public final void run() {
        try {
            batz batz = this.a.f;
            if (batz != null) {
                batz.close();
            }
        } catch (IOException e) {
            this.a.c.a(e);
        }
        try {
            Socket socket = this.a.g;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e2) {
            this.a.c.a(e2);
        }
    }
}
