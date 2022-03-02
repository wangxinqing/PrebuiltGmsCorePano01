package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* renamed from: bavb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bavb extends UploadDataSink {
    public final AtomicReference a = new AtomicReference(3);
    public final UploadDataProvider b;
    public ByteBuffer c;
    public long d;
    public long e;
    public final HttpURLConnection f;
    public WritableByteChannel g;
    public OutputStream h;
    final /* synthetic */ bawc i;
    private final Executor j;
    private final Executor k;
    private final AtomicBoolean l;

    public bavb(bawc bawc, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, bawl bawl) {
        this.i = bawc;
        this.j = new bauv(this, executor);
        this.k = executor2;
        this.b = bawl;
        this.l = new AtomicBoolean(false);
        this.f = httpURLConnection;
    }

    public final void a() {
        this.k.execute(b(new bauz(this)));
    }

    /* access modifiers changed from: protected */
    public final Runnable b(bawd bawd) {
        bawc bawc = this.i;
        String str = bawc.a;
        return bawc.a(bawd);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        b();
        bawc bawc = this.i;
        String str = bawc.a;
        bawc.a();
    }

    public final void onReadError(Exception exc) {
        a((Throwable) exc);
    }

    public final void onReadSucceeded(boolean z) {
        if (this.a.compareAndSet(0, 2)) {
            this.k.execute(b(new baux(this, z)));
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.a.get());
    }

    public final void onRewindError(Exception exc) {
        a((Throwable) exc);
    }

    public final void onRewindSucceeded() {
        if (this.a.compareAndSet(1, 2)) {
            a();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.a.get());
    }

    public final void a(bawd bawd) {
        try {
            Executor executor = this.j;
            bawc bawc = this.i;
            String str = bawc.a;
            executor.execute(bawc.b(bawd));
        } catch (RejectedExecutionException e2) {
            a((Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.g != null && this.l.compareAndSet(false, true)) {
            this.g.close();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        bawc bawc = this.i;
        String str = bawc.a;
        bawc.a(th);
    }
}
