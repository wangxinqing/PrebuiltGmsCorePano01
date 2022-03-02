package defpackage;

import com.android.volley.VolleyError;

/* renamed from: crb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class crb extends VolleyError {
    private final VolleyError b;

    public crb(VolleyError volleyError) {
        this.b = volleyError;
    }

    /* renamed from: a */
    public final synchronized VolleyError getCause() {
        return this.b;
    }
}
