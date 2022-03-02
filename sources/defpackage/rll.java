package defpackage;

import android.content.Intent;

/* renamed from: rll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rll {
    public final Intent a;

    public rll() {
        Intent intent = new Intent("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
        this.a = intent;
        intent.setPackage("com.google.android.gms");
        this.a.putExtra("gmscore_client_jar_version", hxj.b);
        this.a.putExtra("mode", 1);
        this.a.putExtra("origin", 2);
    }
}
