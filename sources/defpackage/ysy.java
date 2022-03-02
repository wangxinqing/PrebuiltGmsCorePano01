package defpackage;

import android.os.Bundle;

/* renamed from: ysy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysy {
    public final Bundle a;

    public ysy(Bundle bundle) {
        this.a = bundle;
    }

    public final String a() {
        return this.a.getString("display_name");
    }

    public final String b() {
        return this.a.getString("profile_image_url");
    }

    public ysy(String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("display_name", str);
        this.a.putString("profile_image_url", str2);
        this.a.putBoolean("is_signed_up", z);
    }
}
