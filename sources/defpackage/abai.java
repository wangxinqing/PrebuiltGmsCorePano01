package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: abai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abai implements ibj, ibl {
    public static final abai a = new abah().a();
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Long i;
    public final Long j;

    public abai(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.h = z4;
        this.f = str2;
        this.g = str3;
        this.i = l;
        this.j = l2;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", this.b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", this.c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", this.d);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", this.e);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", this.f);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", this.g);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", this.h);
        Long l = this.i;
        if (l != null) {
            bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
        }
        Long l2 = this.j;
        if (l2 != null) {
            bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abai) {
            abai abai = (abai) obj;
            return this.b == abai.b && this.c == abai.c && ius.a(this.d, abai.d) && this.e == abai.e && this.h == abai.h && ius.a(this.f, abai.f) && ius.a(this.g, abai.g) && ius.a(this.i, abai.i) && ius.a(this.j, abai.j);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.f, this.g, this.i, this.j});
    }
}
