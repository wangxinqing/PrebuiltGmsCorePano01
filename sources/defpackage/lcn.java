package defpackage;

import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcn extends lcp {
    public final long a;
    public final Set b;

    public lcn(long j, Set set) {
        super(lcr.CHANGELOG);
        iva.b(j >= 0);
        this.a = j;
        this.b = set;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sortedAppIds", new JSONArray(this.b));
            jSONObject.put("changeStamp", this.a);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("JSON encoding failed", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lcn lcn = (lcn) obj;
            return this.a == lcn.a && this.b.equals(lcn.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b});
    }
}
