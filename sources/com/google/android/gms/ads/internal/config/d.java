package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class d extends f {
    public d(String str, Float f) {
        super(str, f);
    }

    public final /* bridge */ /* synthetic */ Object a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) this.c).floatValue()));
    }

    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.b, (double) ((Float) this.c).floatValue()));
    }
}
