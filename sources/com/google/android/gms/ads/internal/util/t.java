package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class t implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ Context b;

    public t(Context context, Context context2) {
        this.a = context;
        this.b = context2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        Context context = this.a;
        boolean z = false;
        if (context == null) {
            sharedPreferences = this.b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        } else {
            sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            string = WebSettings.getDefaultUserAgent(this.b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                return string;
            }
        }
        return string;
    }
}
