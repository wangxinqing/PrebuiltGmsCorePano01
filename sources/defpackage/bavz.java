package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* renamed from: bavz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bavz {
    final bawm a;
    final Executor b;
    final Executor c;
    final /* synthetic */ bawc d;

    public bavz(bawc bawc, UrlRequest.Callback callback, Executor executor) {
        this.d = bawc;
        this.a = new bawm(callback);
        if (!bawc.h) {
            this.b = new bawf(executor);
            this.c = executor;
            return;
        }
        this.b = executor;
        this.c = null;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a(new bavu(this));
    }

    /* access modifiers changed from: package-private */
    public final void a(bawd bawd) {
        try {
            this.b.execute(new bavr(this.d, bawd));
        } catch (RejectedExecutionException e) {
            this.d.a((CronetException) new baup("Exception posting task to executor", e));
        }
    }
}
