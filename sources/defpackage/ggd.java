package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: ggd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggd {
    public final Bundle a;

    public ggd() {
        this(new Bundle());
    }

    public static ggd a(Intent intent) {
        return new ggd(intent.getExtras());
    }

    public final String b() {
        return this.a.getString("authorization_code");
    }

    public ggd(Bundle bundle) {
        iva.a((Object) bundle);
        this.a = bundle;
    }

    public final String a() {
        return this.a.getString("account_name");
    }
}
