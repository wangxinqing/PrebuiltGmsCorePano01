package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrx {
    public final String a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public Integer f;

    public lrx(String str) {
        iva.a((Object) str);
        this.a = str;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error").getJSONArray("errors").getJSONObject(0);
            this.b = jSONObject.optString("reason");
            this.c = jSONObject.optString("message");
            this.d = jSONObject.optString("location");
            String optString = jSONObject.optString("locationType");
            this.e = lfi.a(this.b);
            String str2 = this.d;
            if (str2 == null) {
                this.f = null;
                return;
            }
            if (optString != null) {
                StringBuilder sb = new StringBuilder(optString.length() + 1 + str2.length());
                sb.append(optString);
                sb.append(".");
                sb.append(str2);
                str2 = sb.toString();
            }
            this.f = lfh.a(str2);
        } catch (JSONException e2) {
            lry.a.c(String.format("Unable to parse response: %s", new Object[]{str}));
        }
    }

    public final boolean a(int i) {
        Integer num = this.e;
        return num != null && i == num.intValue();
    }

    public final boolean b(int i) {
        Integer num = this.f;
        return num != null && i == num.intValue();
    }
}
