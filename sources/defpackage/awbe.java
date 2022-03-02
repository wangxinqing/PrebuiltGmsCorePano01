package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: awbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbe extends bata {
    final /* synthetic */ awbf a;

    public awbe(awbf awbf) {
        this.a = awbf;
    }

    /* access modifiers changed from: protected */
    public final IOException a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void b() {
        if (d()) {
            throw a((IOException) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.b(awak.CANCEL);
    }
}
