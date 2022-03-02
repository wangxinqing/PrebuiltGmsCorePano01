package defpackage;

import com.google.android.gms.auth.uncertifieddevice.UncertifiedDeviceChimeraService;

/* renamed from: gqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqr extends gqo implements niz {
    private final UncertifiedDeviceChimeraService a;
    private final nix b;

    public gqr(UncertifiedDeviceChimeraService uncertifiedDeviceChimeraService, nix nix) {
        this.a = uncertifiedDeviceChimeraService;
        this.b = nix;
    }

    public final void a(gqq gqq) {
        this.b.a(this.a, new gqt(gqq));
    }
}
