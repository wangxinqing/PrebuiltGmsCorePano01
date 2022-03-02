package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: omv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omv {
    private static final anax f = anax.a(0, 1, 2);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public omv(int i, String str, String str2, String str3, String str4) {
        this.a = !f.contains(Integer.valueOf(i)) ? -1 : i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    private static final boolean a(JSONArray jSONArray, String str) {
        if (jSONArray.getInt(1) != 79 || !jSONArray.getJSONObject(3).getString("t").equals(str)) {
            return false;
        }
        return true;
    }

    public omv(String str) {
        this.a = 0;
        this.b = str;
        String obj = !TextUtils.isEmpty(str) ? Html.fromHtml(str).toString() : "";
        this.c = obj;
        this.d = obj;
        this.e = null;
    }

    public omv(JSONArray jSONArray, Context context, HelpConfig helpConfig) {
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.getInt(1) == 0) {
            this.a = 0;
            String string = jSONArray2.getString(0);
            this.b = string;
            String obj = Html.fromHtml(string).toString();
            this.c = obj;
            this.d = obj;
            this.e = null;
        } else if (a(jSONArray2, "HELP_ARTICLE")) {
            JSONObject jSONObject = jSONArray2.getJSONObject(3);
            this.a = 1;
            this.b = jSONArray2.getString(0);
            JSONObject jSONObject2 = jSONObject.getJSONObject("p");
            this.d = jSONObject2.getString("url");
            this.e = null;
            this.c = jSONObject2.has("query") ? jSONObject2.getString("query") : jSONObject.getString("l");
        } else if (helpConfig != null && a(jSONArray2, "HELP_ACTION")) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(3).getJSONObject("p");
            String string2 = jSONObject3.getString("result");
            Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(jSONObject3.getString("experimental")));
            oab b2 = oab.b(string2, "");
            if (b2 != null && (!valueOf.booleanValue() || axmp.a.a().a())) {
                String[] split = TextUtils.split(jSONObject3.getString("clients"), "\\|");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!TextUtils.equals(split[i], "ANDROID_GMH")) {
                        Context context2 = context;
                        i++;
                    } else if (new oaf(context).a(b2) && (b2.o() || b2.n() || b2.m())) {
                        this.a = 2;
                        this.b = jSONArray2.getString(0);
                        this.c = jSONArray2.getJSONObject(3).getString("l");
                        this.d = jSONObject3.getString("url");
                        this.e = string2;
                        return;
                    }
                }
            }
            this.a = -1;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        } else {
            this.a = -1;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }
}
