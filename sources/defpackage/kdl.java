package defpackage;

import org.json.JSONObject;

/* renamed from: kdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdl {
    public static kah a(kkz kkz, JSONObject jSONObject) {
        String string = jSONObject.getString("operationType");
        kaj a = kaj.a(string);
        if (a != null) {
            return a.z.a(kkz, jSONObject);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 31);
        sb.append("Action type ");
        sb.append(string);
        sb.append(" is not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final kao a(kkf kkf, kof kof) {
        boolean z;
        kkz c = kkf.c(kof.a);
        if (c != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        JSONObject jSONObject = new JSONObject(kof.b);
        return new kao(a(c, jSONObject.getJSONObject("forward")), a(c, jSONObject.getJSONObject("reverse")));
    }
}
