package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: aazd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aazd implements Response.ErrorListener {
    final /* synthetic */ aazf a;

    public aazd(aazf aazf) {
        this.a = aazf;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        abaa.a("Error while uploading chunk: %s", volleyError.getMessage());
        this.a.e.add(0);
    }
}
