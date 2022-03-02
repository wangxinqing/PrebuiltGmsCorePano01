package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: uij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uij implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ OutputStream b;
    final /* synthetic */ long c;
    final /* synthetic */ OutputStream d;
    final /* synthetic */ uik e;

    public uij(uik uik, InputStream inputStream, OutputStream outputStream, long j, OutputStream outputStream2) {
        this.e = uik;
        this.a = inputStream;
        this.b = outputStream;
        this.c = j;
        this.d = outputStream2;
    }

    public final void run() {
        this.e.b = this.a;
        boolean z = true;
        try {
            jjt.a(this.a, this.b, false, 65536);
            jjt.a((Closeable) this.a);
            uik.a(this.d, false, this.c);
        } catch (IOException e2) {
            if (!this.e.c) {
                Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", new Object[]{Long.valueOf(this.c)}), e2);
            } else {
                new Object[1][0] = Long.valueOf(this.c);
            }
            jjt.a((Closeable) this.a);
            uik.a(this.d, true, this.c);
        } catch (Throwable th) {
            th = th;
            jjt.a((Closeable) this.a);
            uik.a(this.d, z, this.c);
            jjt.a((Closeable) this.b);
            this.e.b = null;
            throw th;
        }
        jjt.a((Closeable) this.b);
        this.e.b = null;
    }
}
