package defpackage;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/* renamed from: ybi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybi {
    public static int a(Exception exc) {
        babj babj;
        if (exc instanceof VolleyError) {
            NetworkResponse networkResponse = ((VolleyError) exc).networkResponse;
            if (networkResponse != null) {
                return networkResponse.statusCode;
            }
            return 0;
        } else if (!(exc instanceof babk) || (babj = ((babk) exc).a) == null) {
            return 0;
        } else {
            return babj.r.r;
        }
    }
}
