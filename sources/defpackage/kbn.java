package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.VolleyError;

/* renamed from: kbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbn {
    private static final anax a = anax.a((Object) 17, (Object) 28);

    public static kcn a(VolleyError volleyError) {
        if ((volleyError instanceof ParseError) || ((volleyError instanceof AuthFailureError) && volleyError.networkResponse == null)) {
            return new kcy("Unrecoverable volley error", volleyError, false);
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            int i = networkResponse.statusCode;
            if (lry.a(i)) {
                lrx a2 = lry.a(networkResponse);
                return new kcx(a(i, a2), i, a2);
            }
        }
        return new kcy("Recoverable volley error", volleyError, true);
    }

    public static boolean a(int i, lrx lrx) {
        if (i != 400) {
            return i != 403 ? i != 404 || lrx == null || !lrx.a(45) || !lrx.b(20) : lrx != null && a.contains(lrx.e);
        }
        return false;
    }
}
