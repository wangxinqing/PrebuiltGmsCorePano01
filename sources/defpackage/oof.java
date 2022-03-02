package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: oof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oof implements Response.ErrorListener {
    final /* synthetic */ oog a;

    public oof(oog oog) {
        this.a = oog;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.a = volleyError;
    }
}
