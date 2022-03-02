package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: obb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obb extends nzl {
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public obb(Context context, HelpConfig helpConfig, String str, String str2, String str3, String str4, String str5, String str6, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, str, listener, errorListener);
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.i = this.j;
        nzw.j = this.k;
        nzw.k = this.l;
        nzw.u = this.m;
        String str = this.n;
        if (str != null) {
            nzw.f = str;
        }
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        int i = networkResponse.statusCode;
        if (i == 202 || i == 200) {
            return Response.success((Object) null, (Cache.Entry) null);
        }
        return Response.error(new VolleyError(networkResponse));
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, String str, String str2, String str3, String str4, Response.Listener listener, Response.ErrorListener errorListener) {
        obb obb = new obb(context, helpConfig, Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().w()).appendQueryParameter("hl", oal.a()).build().toString(), str, str2, str3, str4, ohj.b(context), listener, errorListener);
        okc okc2 = okc;
        obb.a(17, okc);
        obb.e();
    }
}
