package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class cqz extends Request {
    protected final String d;
    protected String e;
    protected final String f;
    protected final Context g;
    private final Response.Listener h;
    private final Object i;
    private final auef j;

    /* access modifiers changed from: protected */
    public final void b() {
        try {
            eig.b(this.g, this.e);
            int i2 = crc.a;
        } catch (eif | IOException e2) {
            crc.a("GoogleAuthProtoRequest", e2, "Failed to clear the auth token.", new Object[0]);
        }
    }

    public final void deliverError(VolleyError volleyError) {
        Map map;
        if ((volleyError instanceof AuthFailureError) && this.e != null) {
            new Thread(new cqy(this)).start();
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (!(networkResponse == null || (map = networkResponse.headers) == null || !"application/octet-stream".equals(map.get("Content-Type")))) {
            Response parseNetworkResponse = parseNetworkResponse(networkResponse);
            if (parseNetworkResponse.isSuccess()) {
                audx audx = (audx) parseNetworkResponse.result;
                volleyError = new crb(volleyError);
            }
        }
        super.deliverError(volleyError);
    }

    public final void deliverResponse(Object obj) {
        Response.Listener listener = this.h;
        if (listener != null) {
            listener.onResponse(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [audx, java.lang.Object] */
    public final byte[] getBody() {
        return this.i.k();
    }

    public final String getBodyContentType() {
        return "application/x-protobuf";
    }

    public final Map getHeaders() {
        if (this.f == null) {
            return super.getHeaders();
        }
        try {
            String valueOf = String.valueOf(this.d);
            this.e = eig.a(this.g, this.f, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
            HashMap hashMap = new HashMap();
            String valueOf2 = String.valueOf(this.e);
            hashMap.put("Authorization", valueOf2.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf2));
            return hashMap;
        } catch (UserRecoverableAuthException e2) {
            throw new AuthFailureError(e2.a());
        } catch (eif | IOException e3) {
            throw new AuthFailureError(e3.getMessage(), e3);
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success((audx) this.j.a(networkResponse.data), (Cache.Entry) null);
        } catch (Exception e2) {
            return Response.error(new VolleyError(e2.getMessage(), e2));
        }
    }

    protected cqz(Context context, String str, Response.Listener listener, Response.ErrorListener errorListener, auef auef, audx audx, String str2, Account account) {
        super(1, str, errorListener);
        this.g = context.getApplicationContext();
        this.d = str2;
        setRetryPolicy(new cra(this));
        setShouldCache(false);
        setShouldRetryServerErrors(true);
        this.h = listener;
        this.i = audx;
        if (account != null) {
            String str3 = account.name;
            this.f = str3;
            new Object[1][0] = str3;
            int i2 = crc.a;
        } else {
            int i3 = crc.a;
            this.f = null;
        }
        this.j = auef;
    }
}
