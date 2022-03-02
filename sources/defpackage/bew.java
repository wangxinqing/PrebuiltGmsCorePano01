package defpackage;

import com.android.volley.Request;
import com.android.volley.Response;

/* renamed from: bew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bew implements Runnable {
    private final Request a;
    private final Response b;
    private final Runnable c;

    public bew(Request request, Response response, Runnable runnable) {
        this.a = request;
        this.b = response;
        this.c = runnable;
    }

    public final void run() {
        if (this.a.isCanceled()) {
            this.a.a("canceled-at-delivery");
            return;
        }
        if (this.b.isSuccess()) {
            this.a.deliverResponse(this.b.result);
        } else {
            this.a.deliverError(this.b.error);
        }
        if (this.b.intermediate) {
            this.a.addMarker("intermediate-response");
        } else {
            this.a.a("done");
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
