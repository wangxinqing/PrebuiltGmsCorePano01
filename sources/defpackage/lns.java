package defpackage;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.drive.internal.model.ChangeList;
import com.google.android.gms.drive.internal.model.FileList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: lns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lns extends izb {
    private static final Request.Priority m = Request.Priority.HIGH;
    private static final Request.Priority n = Request.Priority.NORMAL;
    private static final Request.Priority o = Request.Priority.LOW;

    public lns(Context context, String str, String str2, boolean z, String str3, int i) {
        super(context, str, str2, false, z, str3, (String) null);
        this.g = i;
    }

    private final jag a(ClientContext clientContext, String str, Class cls, Request.Priority priority, leg leg) {
        ClientContext clientContext2 = clientContext;
        String d = d(clientContext);
        String c = c(clientContext);
        RequestFuture newFuture = RequestFuture.newFuture();
        HashMap a = a(this.i, clientContext2);
        int a2 = iyn.a(0, (Map) a);
        this.g = 2816;
        this.h = clientContext2.b;
        lnr lnr = r2;
        lnr lnr2 = new lnr(a2, a(this.d, str), cls, newFuture, newFuture, d, c, this.a, a, priority, leg, this.g, this.h);
        String str2 = d;
        a((Request) lnr, false, str2);
        try {
            return (jag) newFuture.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new izv();
        } catch (ExecutionException e2) {
            a(e2, str2);
            String valueOf = String.valueOf(str);
            throw new VolleyError(valueOf.length() == 0 ? new String("Error executing network request for ") : "Error executing network request for ".concat(valueOf), e2);
        }
    }

    /* access modifiers changed from: protected */
    public final iys a(ClientContext clientContext, int i, String str, Object obj, Class cls, FieldMappingDictionary fieldMappingDictionary, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener, HashMap hashMap) {
        return new lnr(i, str, obj, cls, fieldMappingDictionary, listener, errorListener, str2, str3, this.a, hashMap, m, this.g, this.h);
    }

    public final jag a(ClientContext clientContext, String str, Class cls, boolean z, leg leg) {
        Request.Priority priority;
        iva.a((Object) leg);
        boolean z2 = true;
        if (!cls.equals(FileList.class) && !cls.equals(ChangeList.class)) {
            z2 = false;
        }
        iva.b(z2);
        if (!z) {
            priority = o;
        } else {
            priority = n;
        }
        try {
            return a(clientContext, str, cls, priority, leg);
        } catch (VolleyError e) {
            if (iyn.a(e)) {
                return a(clientContext, str, cls, priority, leg);
            }
            throw e;
        }
    }

    public final HashMap a(Context context, ClientContext clientContext) {
        HashMap a = super.a(context, clientContext);
        a.put("X-Device-ID", Long.toHexString(jhg.a(context)));
        a.put("User-Agent", izu.a(context, "Drive Android SDK/1.0"));
        return a;
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        request.setRetryPolicy(new iym(this.i, str, ((Integer) jzq.ay.c()).intValue(), 5, 2.0f));
    }
}
