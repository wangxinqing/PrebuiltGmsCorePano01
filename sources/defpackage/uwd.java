package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* renamed from: uwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwd extends ull {
    public final Socket c;

    public uwd(Socket socket) {
        super(socket.toString());
        this.c = socket;
    }

    public final InputStream a() {
        throw null;
    }

    public final OutputStream b() {
        throw null;
    }

    public final void c() {
        this.c.close();
    }
}
