package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class oez extends nzl {
    private final String j;
    private final Long k;
    private final boolean l;
    private final String m;

    public oez(Context context, HelpConfig helpConfig, String str, Long l2, boolean z, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        super(context, helpConfig, str, listener, errorListener);
        this.k = l2;
        this.l = z;
        this.j = str2;
        this.m = str3;
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, long j2, Response.Listener listener, Response.ErrorListener errorListener, aoru aoru) {
        aoru.execute(new oev(context, helpConfig, okc, j2, listener, errorListener));
    }

    public static String f() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().k()).build().toString();
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        if (networkResponse.statusCode == 200) {
            try {
                return Response.success((avnf) aucj.a((aucj) avnf.d, networkResponse.data, aubs.c()), (Cache.Entry) null);
            } catch (auda e) {
                Log.e("gH_ChatSupportRequest", "Parsing ChatRequestStatus failed!", e);
            }
        }
        return Response.error(new VolleyError(networkResponse));
    }

    public static void a(Context context, HelpConfig helpConfig, okc okc, long j2, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        Context context2 = context;
        HelpConfig helpConfig2 = helpConfig;
        oew oew = new oew(context2, helpConfig2, f(), Long.valueOf(j2), str, ohj.b(context), listener, errorListener);
        okc okc2 = okc;
        oew.a(15, okc);
        oew.e();
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.n = this.f.p();
        HelpConfig helpConfig = this.f;
        nzw.o = helpConfig.y;
        nzw.p = this.k;
        nzw.q = this.l;
        nzw.u = this.j;
        if (!TextUtils.isEmpty(helpConfig.c())) {
            nzw.m = this.f.c();
        }
        if (!TextUtils.isEmpty(this.m)) {
            nzw.f = this.m;
        }
    }
}
