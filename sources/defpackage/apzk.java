package defpackage;

/* renamed from: apzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apzk implements aqay {
    static final baab a = baab.a("X-Goog-Api-Key", baaf.a);

    public final aqcb a(aqau aqau) {
        String str;
        boolean z;
        azxh azxh = aqau.b;
        apxu apxu = (apxu) azxh.a(apxu.a);
        boolean z2 = false;
        if (apxu != null) {
            if (azxh.a(apyq.a) == null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z, (Object) "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
        }
        apyg apyg = (apyg) azxh.a(apyg.a);
        String b = apyg.b().b();
        if (apxu != null) {
            str = apxu.a();
        } else {
            str = null;
        }
        if (apxu != null && apxu.a() == null) {
            if (b != null) {
                z2 = true;
            }
            amrl.b(z2, (Object) "ApiKeyOption defaultApiKey was used, but no default exists");
        }
        if (str != null) {
            b = str;
        }
        if (apyg.d() && b != null) {
            amrl.b(!aqau.a.a(a), (Object) "API key was already attached to the request");
            aqau.a.a(a, (Object) b);
        }
        return aqcb.a;
    }

    public final aqcc c() {
        return aqcc.a;
    }

    public final aqcb b() {
        return aqcb.a;
    }

    public final aqcb b(aqau aqau) {
        return aqcb.a;
    }

    public final aqcb a(aqav aqav) {
        return aqcb.a;
    }

    public final aqcc a(aqat aqat) {
        return aqcc.a;
    }

    public final aqcc a(aqaw aqaw) {
        return aqcc.a;
    }
}
