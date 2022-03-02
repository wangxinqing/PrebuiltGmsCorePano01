package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import java.util.concurrent.TimeUnit;

/* renamed from: oms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oms extends nzl {
    private final olw[] j;

    public static avnx a(Context context, olw[] olwArr, Response.ErrorListener errorListener, okc okc) {
        String str;
        iva.b("Must be called from a worker thread.");
        RequestFuture newFuture = RequestFuture.newFuture();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(45);
        sb.append("prefetch_offline_content-");
        sb.append(currentTimeMillis);
        String sb2 = sb.toString();
        HelpConfig helpConfig = new HelpConfig();
        helpConfig.b = "com.google.android.gms";
        helpConfig.d = null;
        helpConfig.e = sb2;
        oms oms = new oms(context, olwArr, helpConfig, newFuture, new omr(newFuture, errorListener));
        oms.a(185, okc);
        super.e();
        try {
            return (avnx) newFuture.get(axmj.a.a().aj(), TimeUnit.SECONDS);
        } finally {
            oms.cancel();
            str = "com.google.android.gms";
            MetricsIntentOperation.a(context, sb2, str, 156, 22, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.h = this.j;
    }

    public final Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        byte[] bArr;
        if (networkResponse != null) {
            try {
                bArr = networkResponse.data;
            } catch (auda e) {
                return Response.error(new ParseError(networkResponse));
            }
        } else {
            bArr = null;
        }
        return Response.success((avnx) aucj.a((aucj) avnx.b, bArr, aubs.c()), (Cache.Entry) null);
    }

    public oms(Context context, olw[] olwArr, HelpConfig helpConfig, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().al()).build().toString(), listener, errorListener);
        this.j = olwArr;
    }
}
