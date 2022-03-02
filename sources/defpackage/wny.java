package defpackage;

import android.util.Log;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/* renamed from: wny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wny implements Response.ErrorListener {
    public final void onErrorResponse(VolleyError volleyError) {
        Log.w("BasePeopleOperation", "Failed to get result");
    }
}
