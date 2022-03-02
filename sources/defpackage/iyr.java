package defpackage;

import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: iyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iyr extends iyw {
    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, (Cache.Entry) null);
    }

    public iyr(String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, HashMap hashMap, int i, int i2) {
        super(0, str, (String) null, listener, errorListener, str2, str3, true, hashMap, i, i2);
    }
}
