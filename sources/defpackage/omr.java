package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: omr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class omr implements Response.ErrorListener {
    final /* synthetic */ Response.ErrorListener a;
    final /* synthetic */ Response.ErrorListener b;

    public omr(Response.ErrorListener errorListener, Response.ErrorListener errorListener2) {
        this.a = errorListener;
        this.b = errorListener2;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.onErrorResponse(volleyError);
        this.b.onErrorResponse(volleyError);
    }
}
