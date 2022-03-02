package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: dgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dgj implements Response.ErrorListener {
    private final dgk a;

    public dgj(dgk dgk) {
        this.a = dgk;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.b();
    }
}
