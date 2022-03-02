package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: zmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zmx {
    public final Bundle a;

    public zmx(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putString("com.google.android.apps.plus.CONTENT_URL", str);
        this.a.putString("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", str2);
        this.a.putBundle("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", bundle);
    }

    public static zmx a(Bundle bundle) {
        Bundle bundle2 = null;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("com.google.android.apps.plus.CONTENT_URL");
        String string2 = bundle.getString("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
        if (TextUtils.isEmpty(string)) {
            bundle2 = bundle.getBundle("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA");
        }
        return new zmx(string, string2, bundle2);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(a());
    }

    public final String c() {
        return this.a.getString("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
    }

    public final boolean d() {
        return !TextUtils.isEmpty(c());
    }

    public final Bundle e() {
        return this.a.getBundle("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA");
    }

    public final boolean f() {
        Bundle e = e();
        return e != null && !TextUtils.isEmpty(e.getString("title")) && !TextUtils.isEmpty(e.getString("description"));
    }

    public final String g() {
        return e().getString("title");
    }

    public final boolean h() {
        Bundle e = e();
        return e != null && !TextUtils.isEmpty(e.getString("title"));
    }

    public final String i() {
        return e().getString("description");
    }

    public final boolean j() {
        Bundle e = e();
        return e != null && !TextUtils.isEmpty(e.getString("description"));
    }

    public final String k() {
        return e().getString("thumbnailUrl");
    }

    public final boolean l() {
        Bundle e = e();
        return e != null && !TextUtils.isEmpty(e.getString("thumbnailUrl"));
    }

    public final String a() {
        return this.a.getString("com.google.android.apps.plus.CONTENT_URL");
    }
}
