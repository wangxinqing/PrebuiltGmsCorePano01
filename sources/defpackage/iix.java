package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.Future;

/* renamed from: iix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iix extends aopn implements Future, Response.Listener, Response.ErrorListener {
    public final void onErrorResponse(VolleyError volleyError) {
        a((Throwable) volleyError);
    }

    public final void onResponse(Object obj) {
        b(obj);
    }
}
