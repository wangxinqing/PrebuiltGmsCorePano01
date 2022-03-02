package defpackage;

import android.os.Bundle;

/* renamed from: abah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abah {
    public boolean a;
    public boolean b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public Long h;
    public Long i;

    public static abah a(Bundle bundle) {
        abah abah = new abah();
        abah.a = bundle.getBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        abah.b = bundle.getBoolean("com.google.android.gms.signin.internal.idTokenRequested");
        abah.c = bundle.getString("com.google.android.gms.signin.internal.serverClientId");
        abah.d = bundle.getBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        abah.e = bundle.getString("com.google.android.gms.signin.internal.hostedDomain");
        abah.f = bundle.getString("com.google.android.gms.signin.internal.logSessionId");
        abah.g = bundle.getBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        abah.h = Long.valueOf(bundle.getLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion"));
        abah.i = Long.valueOf(bundle.getLong("com.google.android.gms.signin.internal.realClientLibraryVersion"));
        return abah;
    }

    public final abai a() {
        return new abai(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final void a(String str) {
        iva.a((Object) str);
        String str2 = this.c;
        boolean z = true;
        if (str2 != null && !str2.equals(str)) {
            z = false;
        }
        iva.b(z, "two different server client ids provided");
    }
}
