package defpackage;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lco extends lcp {
    public final boolean a;

    public lco(boolean z) {
        super(lcr.DRIVE);
        this.a = z;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("foldersOnly", this.a);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("JSON encoding failed", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass() == getClass() && this.a == ((lco) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }
}
