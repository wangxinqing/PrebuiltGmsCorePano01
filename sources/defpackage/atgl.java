package defpackage;

import com.android.volley.Cache;
import com.android.volley.ExecutorDelivery;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import java.util.concurrent.Executor;

/* renamed from: atgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgl extends RequestQueue {
    private static final Executor e = new atgi();
    private final oi c;
    private final ExecutorDelivery d = new ExecutorDelivery(e);

    public atgl(Cache cache, Network network, oi oiVar, ResponseDelivery responseDelivery) {
        super(cache, network, 4, new atgk(oiVar, responseDelivery));
        this.c = oiVar;
    }

    public final Request add(Request request) {
        Response response = (Response) this.c.a((Object) request.getUrl());
        if (response != null) {
            this.d.postResponse(request, response);
            return request;
        }
        super.add(request);
        return request;
    }
}
