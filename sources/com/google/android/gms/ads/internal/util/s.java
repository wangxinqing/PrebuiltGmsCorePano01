package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class s implements Callable {
    final /* synthetic */ Context a;

    public s(Context context) {
        this.a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.a);
        jle.a(this.a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
