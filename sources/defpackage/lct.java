package defpackage;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveSpace;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lct extends lcp {
    private static final ith e = new ith("QueryFeed", "");
    public final String a;
    public final String b;
    public final String d;

    public lct(String str, String str2, String str3) {
        super(lcr.QUERY);
        iva.a((Object) str);
        this.a = str;
        iva.a((Object) str2);
        this.b = str2;
        this.d = str3;
    }

    public static lct a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new lct(jSONObject.getString("query"), jSONObject.getString("spaces"), jSONObject.has("orderBy") ? jSONObject.getString("orderBy") : null);
        } catch (JSONException e2) {
            e.a("Could not parse JSON [%s]; assuming legacy feed", str);
            return new lct(str, DriveSpace.e, (String) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lct lct = (lct) obj;
            return ius.a(this.a, lct.a) && ius.a(this.b, lct.b) && ius.a(this.d, lct.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    public static lct a(lcl lcl) {
        return new lct(lcl.a.b, TextUtils.join(",", lcl.b), lcl.c);
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("query", this.a);
            jSONObject.put("spaces", this.b);
            jSONObject.put("orderBy", this.d);
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException("Could not encode JSON");
        }
    }
}
