package defpackage;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: hmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmu extends JsonObjectRequest {
    private final Map e;

    public hmu(String str, Map map, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener) {
        super(1, str, jSONObject, listener, errorListener);
        this.e = map;
    }

    public final Map getHeaders() {
        return this.e;
    }
}
