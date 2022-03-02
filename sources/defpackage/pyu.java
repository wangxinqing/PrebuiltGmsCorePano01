package defpackage;

import android.os.Bundle;

/* renamed from: pyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pyu {
    public final Bundle a;

    public pyu(Bundle bundle) {
        this.a = bundle;
    }

    public static pyt a() {
        return new pyt(Bundle.EMPTY);
    }

    public final amri b() {
        return amri.c(this.a.getString("title"));
    }

    public final boolean c() {
        return this.a.getBoolean("should_show_consent", false);
    }

    public final amri d() {
        return amri.c(this.a.getString("privacy_policy_url"));
    }

    public final amri e() {
        return amri.c(this.a.getString("terms_of_service_url"));
    }

    public final amri f() {
        return this.a.containsKey("theme") ? amri.b(Integer.valueOf(this.a.getInt("theme", 0))) : ampu.a;
    }

    public static pyt a(Bundle bundle) {
        return new pyt(bundle);
    }
}
