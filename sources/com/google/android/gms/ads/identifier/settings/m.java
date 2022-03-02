package com.google.android.gms.ads.identifier.settings;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class m implements Response.ErrorListener {
    private final aosh a;

    public m(aosh aosh) {
        this.a = aosh;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        this.a.a((Throwable) volleyError);
    }
}
