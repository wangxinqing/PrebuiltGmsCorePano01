package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a extends Thread {
    final /* synthetic */ Map a;

    public a(Map map) {
        this.a = map;
    }

    public final void run() {
        Map map = this.a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        e.a(buildUpon.build().toString());
    }
}
