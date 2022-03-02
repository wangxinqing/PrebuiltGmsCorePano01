package defpackage;

import android.content.Context;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: ocy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocy extends nzl {
    public static final /* synthetic */ int j = 0;
    private final List k;

    public ocy(Context context, HelpConfig helpConfig, String str, List list, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, str, listener, errorListener);
        this.k = list;
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.e = this.k;
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode == 200) {
            return Response.success((Object) null, (Cache.Entry) null);
        }
        return Response.error(new VolleyError(networkResponse));
    }
}
