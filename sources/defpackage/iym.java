package defpackage;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: iym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iym extends DefaultRetryPolicy {
    protected final Context a;
    protected final String b;

    protected iym(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public iym(Context context, String str, int i, int i2, float f) {
        super(i, i2, f);
        this.a = context;
        this.b = str;
    }

    public final void retry(VolleyError volleyError) {
        int i;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (i = networkResponse.statusCode) < 400 || i >= 500 || "userRateLimitExceeded".equalsIgnoreCase(jad.a(volleyError))) {
            super.retry(volleyError);
            return;
        }
        if (this.b != null && iyn.a(volleyError)) {
            eig.a(this.a, this.b);
        }
        throw volleyError;
    }

    public iym(vee vee, String str, int i) {
        this(vee.i, str, (int) aync.a.a().l(), i, 1.0f);
    }
}
