package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: aazb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazb implements Response.ErrorListener {
    final /* synthetic */ aazf a;

    public aazb(aazf aazf) {
        this.a = aazf;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            abaa.a("Unknown error while starting apk upload: %s", volleyError.getMessage());
            this.a.e.add(0);
            return;
        }
        String str = (String) networkResponse.headers.get("X-Goog-Upload-Status");
        if (str == null || !str.equals("final")) {
            abaa.a("Unknown error while starting apk upload: %s", volleyError.getMessage());
            this.a.e.add(0);
            return;
        }
        this.a.e.add(1);
    }
}
