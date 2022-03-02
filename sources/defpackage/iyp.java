package defpackage;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;

/* renamed from: iyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iyp implements Response.ErrorListener {
    private final ArrayList a;

    public iyp(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        for (int i = 0; i < this.a.size(); i++) {
            ((iyw) this.a.get(i)).deliverError(volleyError);
        }
    }
}
