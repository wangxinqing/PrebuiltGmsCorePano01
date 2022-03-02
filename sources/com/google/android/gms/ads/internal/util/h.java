package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.ads.internal.util.future.d;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class h {
    public static final qvr a = new d(Looper.getMainLooper());
    public final Object b = new Object();
    public String c;

    public h() {
        new AtomicReference((Object) null);
        new AtomicReference((Object) null);
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            return a();
        }
    }

    public final void a(Context context, String str, String str2, Bundle bundle) {
        b.a();
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        if (!str4.startsWith(str3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            str4 = sb.toString();
        }
        bundle.putString("device", str4);
        bundle.putString("eids", TextUtils.join(",", n.a()));
        c.d();
        g gVar = new g(context, str);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int i = hxk.c;
            int j = hxz.j(context);
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(j);
            sb2.append(".201216000");
            str = sb2.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str5 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str5, bundle.getString(str5));
        }
        String builder = appendQueryParameter.toString();
        b.a();
        Context context2 = gVar.a;
        String str6 = gVar.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(builder);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d.a.a(new b(context2, str6, (String) arrayList.get(i2)).a);
        }
    }
}
