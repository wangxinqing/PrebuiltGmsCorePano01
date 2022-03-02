package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: uik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uik {
    public final ExecutorService a = qvj.b.b(2);
    public volatile InputStream b = null;
    public volatile boolean c = false;

    public static final void a(OutputStream outputStream, boolean z, long j) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException e) {
            Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", new Object[]{Long.valueOf(j)}), e);
        } catch (Throwable th) {
            jjt.a((Closeable) outputStream);
            throw th;
        }
        jjt.a((Closeable) outputStream);
    }
}
