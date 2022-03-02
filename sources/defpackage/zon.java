package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.service.PseudonymousIdChimeraService;

/* renamed from: zon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zon extends zof implements niz {
    private final PseudonymousIdChimeraService a;
    private final nix b;

    public zon(PseudonymousIdChimeraService pseudonymousIdChimeraService, nix nix) {
        this.a = pseudonymousIdChimeraService;
        this.b = nix;
    }

    public final void a(zod zod) {
        synchronized ("PseudonymousIdService") {
            if (zom.b != null) {
                zod.a(Status.a, zom.b);
            } else {
                this.b.a(this.a, new zok(zod));
            }
        }
    }

    public final void b(zod zod) {
        this.b.a(this.a, new zoj(zod));
    }

    public final void a(zod zod, PseudonymousIdToken pseudonymousIdToken) {
        this.b.a(this.a, new zol(zod, pseudonymousIdToken));
    }
}
