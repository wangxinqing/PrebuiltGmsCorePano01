package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: ysx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysx {
    public final Bundle a;

    public ysx(Bundle bundle) {
        this.a = bundle;
    }

    public final boolean a() {
        return this.a.getBoolean("has_plus_one", false);
    }

    public final String b() {
        return this.a.getString("token");
    }

    public final String c() {
        return this.a.getString("confirmation_message");
    }

    public ysx(String str, boolean z, String str2, String[] strArr, Uri[] uriArr, Intent intent, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("url", str);
        this.a.putBoolean("has_plus_one", z);
        this.a.putString("bubble_text", str2);
        this.a.putStringArray("inline_annotations", strArr);
        this.a.putParcelableArray("profile_photo_uris", uriArr);
        this.a.putParcelable("intent", intent);
        this.a.putString("token", str3);
        this.a.putString("confirmation_message", str4);
        this.a.putString("visibility", str5);
    }
}
