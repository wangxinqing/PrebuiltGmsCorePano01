package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.UploadDataProvider;

/* renamed from: bawx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class bawx extends OutputStream {
    private boolean a;
    public IOException d;
    public boolean e;

    public abstract void a();

    public abstract void b();

    public abstract UploadDataProvider c();

    public void close() {
        this.a = true;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.e) {
            e();
            throw new IOException("Writing after request completed.");
        } else if (this.a) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        IOException iOException = this.d;
        if (iOException != null) {
            throw iOException;
        }
    }
}
