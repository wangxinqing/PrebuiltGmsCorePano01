package defpackage;

import com.android.volley.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hmr implements Response.Listener {
    private final aosh a;

    public hmr(aosh aosh) {
        this.a = aosh;
    }

    public final void onResponse(Object obj) {
        aosh aosh = this.a;
        JSONObject jSONObject = (JSONObject) obj;
        fzi fzi = hmv.a;
        try {
            aosh.b((Object) jSONObject.getString("privateTopicName"));
        } catch (JSONException e) {
            aosh.a((Throwable) e);
        }
    }
}
