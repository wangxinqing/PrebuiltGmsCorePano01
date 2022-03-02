package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.util.r;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class l implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public Context g;
    public JSONObject h = new JSONObject();

    public final void a() {
        if (this.e != null) {
            try {
                this.h = new JSONObject((String) r.a(new j(this)));
            } catch (JSONException e2) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            a();
        }
    }
}
