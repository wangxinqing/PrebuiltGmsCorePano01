package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qae {
    public static amri a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        amrl.a((Object) str);
        List c = amsk.a('.').c(str);
        if (c.size() < 3) {
            Log.w("IdTokenParser", "Malformed id token - incorrect number of parts");
            return ampu.a;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(anml.f.a().b((CharSequence) c.get(1)), amqn.c));
                String string = jSONObject.getString("sub");
                Long l = null;
                if (jSONObject.has("name")) {
                    str2 = jSONObject.getString("name");
                } else {
                    str2 = null;
                }
                if (jSONObject.has("given_name")) {
                    str3 = jSONObject.getString("given_name");
                } else {
                    str3 = null;
                }
                if (jSONObject.has("family_name")) {
                    str4 = jSONObject.getString("family_name");
                } else {
                    str4 = null;
                }
                if (jSONObject.has("email")) {
                    str5 = jSONObject.getString("email");
                } else {
                    str5 = null;
                }
                if (jSONObject.has("picture")) {
                    uri = Uri.parse(jSONObject.getString("picture"));
                } else {
                    uri = null;
                }
                if (jSONObject.has("exp")) {
                    l = Long.valueOf(Long.parseLong(jSONObject.getString("exp")));
                }
                return amri.b(new qad(string, amri.c(str2), amri.c(str3), amri.c(str4), amri.c(str5), amri.c(uri), amri.c(l)));
            } catch (JSONException e) {
                Log.e("IdTokenParser", "Malformed id token - could not decode payload from JSON");
                return ampu.a;
            }
        } catch (IllegalArgumentException e2) {
            Log.e("IdTokenParser", "Malformed id token - Base64URL decoding failed");
            return ampu.a;
        }
    }
}
