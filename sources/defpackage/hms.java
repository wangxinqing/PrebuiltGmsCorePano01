package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: hms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hms implements Response.ErrorListener {
    private final aosh a;

    public hms(aosh aosh) {
        this.a = aosh;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        aosh aosh = this.a;
        fzi fzi = hmv.a;
        aosh.a((Throwable) volleyError);
    }
}
