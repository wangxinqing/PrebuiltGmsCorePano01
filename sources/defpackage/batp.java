package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: batp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class batp extends bata {
    final /* synthetic */ Socket a;

    public batp(Socket socket) {
        this.a = socket;
    }

    /* access modifiers changed from: protected */
    public final IOException a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.a.close();
        } catch (Exception e) {
            Exception exc = e;
            Logger logger = batq.a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to close timed out socket ");
            sb.append(valueOf);
            logger.logp(level, "okio.Okio$4", "timedOut", sb.toString(), exc);
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (batq.a(assertionError)) {
                Logger logger2 = batq.a;
                Level level2 = Level.WARNING;
                String valueOf2 = String.valueOf(this.a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                sb2.append("Failed to close timed out socket ");
                sb2.append(valueOf2);
                logger2.logp(level2, "okio.Okio$4", "timedOut", sb2.toString(), assertionError);
                return;
            }
            throw assertionError;
        }
    }
}
