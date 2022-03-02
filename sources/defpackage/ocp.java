package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ocp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocp extends nzl {
    public ocp(Context context, HelpConfig helpConfig, String str, RequestFuture requestFuture) {
        super(context, helpConfig, str, requestFuture, requestFuture);
    }

    public static avob a(Context context, HelpConfig helpConfig, okc okc) {
        iva.b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        ocp ocp = new ocp(context, helpConfig, Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().ay()).build().toString(), newFuture);
        ocp.a(23, okc);
        ocp.e();
        try {
            return (avob) newFuture.get(axmj.q(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gH_RealtimeSuprtStatRq", "Fetching RealtimeSupportStatus failed.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success((avob) aucj.a((aucj) avob.c, networkResponse.data, aubs.c()), (Cache.Entry) null);
        } catch (auda e) {
            Log.e("gH_RealtimeSuprtStatRq", "Parsing RealtimeSupportStatus failed!", e);
            return Response.error(new VolleyError(networkResponse));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.n = this.f.p();
    }
}
