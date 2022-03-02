package defpackage;

import android.content.Intent;

/* renamed from: abgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgm {
    public final Intent a;

    public abgm() {
        Intent intent = new Intent();
        this.a = intent;
        intent.setPackage("com.google.android.gms");
        this.a.setAction("com.google.android.gms.people.smart_profile.ACTION_SHOW_PROFILE");
    }

    public final void a(int i) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", i);
    }

    public final void b(String str) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", str);
    }

    public final void a(String str) {
        this.a.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", str);
    }
}
