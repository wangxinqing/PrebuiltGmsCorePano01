package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class e extends f {
    public e(String str, String str2) {
        super(str, str2);
    }

    public final /* bridge */ /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, (String) this.c);
    }

    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.b, (String) this.c);
    }
}
