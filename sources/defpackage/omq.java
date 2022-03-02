package defpackage;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.io.ByteArrayInputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: omq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omq extends nzn {
    public omq(Context context, HelpConfig helpConfig, String str, RequestFuture requestFuture) {
        super(context, helpConfig, 0, str, requestFuture, requestFuture);
    }

    public static WebResourceResponse a(Context context, HelpConfig helpConfig, String str, okc okc) {
        iva.b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        omq omq = new omq(context, helpConfig, str, newFuture);
        omq.a(184, okc);
        omq.e();
        try {
            return (WebResourceResponse) newFuture.get(axmj.a.a().ah(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_OAuthSCReq", "Fetching authenticated content failed.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode < 400) {
            return Response.success(new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(networkResponse.data)), (Cache.Entry) null);
        }
        return Response.error(new VolleyError(networkResponse));
    }
}
