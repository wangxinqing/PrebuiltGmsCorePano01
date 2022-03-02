package defpackage;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: nci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nci implements myv {
    private final String a;
    private final Integer b;
    private final JSONObject c;

    public nci(String str, Integer num, JSONObject jSONObject) {
        this.a = str;
        this.b = num;
        this.c = jSONObject;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.a;
            if (str != null) {
                jSONObject.put("type", str);
            }
            Integer num = this.b;
            if (num != null) {
                int intValue = num.intValue();
                long intValue2 = (long) this.b.intValue();
                if (intValue < 0) {
                    intValue2 = ((long) intValue) + 4294967296L;
                }
                jSONObject.put("requestId", intValue2);
            }
            JSONObject jSONObject2 = this.c;
            if (jSONObject2 != null) {
                jSONObject.put("responseData", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nci) {
            nci nci = (nci) obj;
            if (ius.a(this.a, nci.a) && ius.a(this.b, nci.b)) {
                JSONObject jSONObject = this.c;
                if (jSONObject == null) {
                    return nci.c == null;
                }
                if (nci.c != null) {
                    return jSONObject.toString().equals(nci.c.toString());
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return a().toString();
    }
}
