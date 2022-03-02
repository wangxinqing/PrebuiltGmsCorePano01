package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: apuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuo {
    public static long a(String str) {
        iva.c(str);
        List c = amsk.a('.').c(str);
        if (c.size() < 2) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() == 0 ? new String("Invalid idToken ") : "Invalid idToken ".concat(valueOf));
        }
        try {
            String str2 = new String(jhy.c((String) c.get(1)), "UTF-8");
            apup apup = new apup();
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            apup.a = Long.valueOf(jSONObject.optLong("iat"));
            apup.b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return apup.b.longValue() - apup.a.longValue();
        } catch (JSONException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb.append("Failed to read JwtToken from JSONObject. ");
            sb.append(valueOf2);
            throw new UnsupportedEncodingException(sb.toString());
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Unable to decode token", e2);
        }
    }
}
