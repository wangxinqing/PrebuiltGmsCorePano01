package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: iyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iyz implements Response.ErrorListener {
    final /* synthetic */ String a;
    final /* synthetic */ Response.ErrorListener b;
    final /* synthetic */ izb c;

    public iyz(izb izb, String str, Response.ErrorListener errorListener) {
        this.c = izb;
        this.a = str;
        this.b = errorListener;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NetworkResponse networkResponse;
        if (volleyError == null || (networkResponse = volleyError.networkResponse) == null) {
            this.c.l.a(this.a, -1);
        } else {
            this.c.l.a(this.a, networkResponse.statusCode);
        }
        this.c.l.a();
        this.b.onErrorResponse(volleyError);
    }
}
