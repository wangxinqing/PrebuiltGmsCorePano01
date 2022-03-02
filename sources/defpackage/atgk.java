package defpackage;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;

/* renamed from: atgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atgk extends atgz {
    private final oi a;
    private final ResponseDelivery b;

    public atgk(oi oiVar, ResponseDelivery responseDelivery) {
        this.a = oiVar;
        this.b = responseDelivery;
    }

    public final void postError(Request request, VolleyError volleyError) {
        super.postError(request, volleyError);
        this.b.postError(request, volleyError);
    }

    public final void postResponse(Request request, Response response) {
        super.postResponse(request, response);
        if (request.shouldCache() && response.isSuccess()) {
            this.a.a((Object) request.getUrl(), (Object) response);
        }
        this.b.postResponse(request, response);
    }

    public final void postResponse(Request request, Response response, Runnable runnable) {
        super.postResponse(request, response, runnable);
        if (request.shouldCache() && response.isSuccess()) {
            this.a.a((Object) request.getUrl(), (Object) response);
        }
        this.b.postResponse(request, response, runnable);
    }
}
