package defpackage;

import com.android.volley.Response;
import org.json.JSONObject;

/* renamed from: dgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dgi implements Response.Listener {
    private final dgk a;

    public dgi(dgk dgk) {
        this.a = dgk;
    }

    public final void onResponse(Object obj) {
        dgk dgk = this.a;
        dgk.b.b(new csh(3, dgk.c, (JSONObject) obj));
    }
}
