package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: okk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okk extends nzl {
    private final List j;

    public okk(Context context, HelpConfig helpConfig, Account account, String str, List list, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, account, str, listener, errorListener);
        this.j = list;
    }

    public static Future a(Context context, HelpConfig helpConfig, Account account, List list, Response.Listener listener) {
        oka oka = new oka(listener);
        new okk(context, helpConfig, account, Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.x()).build().toString(), list, oka, oka).e();
        return oka;
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.v = this.j;
    }

    public final void onPreNetworkDispatch() {
        izj.b(3841);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        if (i == 202 || i == 200) {
            return Response.success(Integer.valueOf(i), (Cache.Entry) null);
        }
        return Response.error(new VolleyError(networkResponse));
    }
}
