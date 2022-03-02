package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: ezi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezi {
    public final Context a;

    public ezi(Context context) {
        this.a = context;
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).toUri(1);
        }
        return null;
    }

    public final aorr a(aoru aoru, String str) {
        izd izd = new izd(this.a, "clientauthconfig.googleapis.com", 443);
        izd.a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        izd.a("X-Android-Package", this.a.getPackageName());
        Context context = this.a;
        String h = jhg.h(context, context.getPackageName());
        if (h != null) {
            izd.a("X-Android-Cert", h);
        }
        return aoru.b(new ezh(this, new gfv(izd), str));
    }
}
