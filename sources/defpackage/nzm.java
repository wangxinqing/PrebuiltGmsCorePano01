package defpackage;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: nzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nzm extends DefaultRetryPolicy {
    final /* synthetic */ nzn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nzm(nzn nzn, int i, int i2, float f) {
        super(i, i2, f);
        this.a = nzn;
    }

    public final void retry(VolleyError volleyError) {
        int i;
        String a2;
        int i2 = nzn.i;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (i = networkResponse.statusCode) < 400 || i >= 500 || (a2 = jad.a(volleyError)) == null || !"userRateLimitExceeded".equalsIgnoreCase(a2)) {
            NetworkResponse networkResponse2 = volleyError.networkResponse;
            if (networkResponse2 != null && networkResponse2.statusCode == 401) {
                this.a.a(true);
            }
            super.retry(volleyError);
            return;
        }
        throw volleyError;
    }
}
