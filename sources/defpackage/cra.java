package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.VolleyError;

/* renamed from: cra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cra extends DefaultRetryPolicy {
    private final cqz a;
    private boolean b;

    public cra(cqz cqz) {
        super(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 1, 1.0f);
        this.a = cqz;
    }

    public final void retry(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (!this.b) {
                crc.b("GoogleAuthProtoRequest", "Request failed due to auth failure, clearing token", new Object[0]);
                this.b = true;
                this.a.b();
            } else {
                crc.a("GoogleAuthProtoRequest", "Repeated auth failure, giving up", new Object[0]);
                throw volleyError;
            }
        }
        super.retry(volleyError);
    }
}
