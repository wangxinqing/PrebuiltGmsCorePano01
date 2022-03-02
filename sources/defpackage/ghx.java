package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.managed.services.EmmChimeraService;

/* renamed from: ghx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghx extends ghs implements niz {
    private final EmmChimeraService a;
    private final nix b;

    public ghx(EmmChimeraService emmChimeraService, nix nix) {
        this.a = emmChimeraService;
        this.b = nix;
    }

    public final void a(ghq ghq, String str, Bundle bundle) {
        this.b.a(this.a, new gib(ghq, str, bundle));
    }

    public final void a(ghq ghq, String str, String str2) {
        this.b.a(this.a, new ghz(ghq, str, str2));
    }
}
