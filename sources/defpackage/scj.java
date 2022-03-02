package defpackage;

import android.content.Context;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: scj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class scj extends rxd implements niz {
    private final Context a;
    private final afqn b;
    private final sca c;
    private final sbw d;
    private final afsb e;
    private final nix f;
    private final String g;
    private final int h;
    private final scg i;
    private final aekn j;

    public scj(Context context, afqn afqn, sca sca, sbw sbw, afsb afsb, nix nix, String str, int i2, scg scg, aekn aekn) {
        this.a = context;
        this.b = afqn;
        this.c = sca;
        this.d = sbw;
        this.e = afsb;
        this.f = nix;
        this.g = str;
        this.h = i2;
        this.i = scg;
        this.j = aekn;
    }

    public final void a(ifu ifu) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new sci(this.c, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void b(ifu ifu) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new scy(this.b, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void c(ifu ifu) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new sdf(this.b, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void d(ifu ifu) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new scw(this.b, this.d, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void e(ifu ifu) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new scu(this.b, this.c, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void f(ifu ifu) {
        if (hxz.g(this.a)) {
            this.f.a(new scw(this.b, this.d, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void a(ifu ifu, FileGroupRequest fileGroupRequest) {
        this.f.a(new sdh(this.b, fileGroupRequest, this.g, this.h, this.i, this.e, ifu, true));
    }

    public final void b(ifu ifu, FileGroupRequest fileGroupRequest) {
        this.f.a(new sdh(this.b, fileGroupRequest, this.g, this.h, this.i, this.e, ifu, false));
    }

    public final void a(ifu ifu, OverrideFileGroupRequest overrideFileGroupRequest) {
        if (hxz.g(this.a)) {
            nix nix = this.f;
            afqn afqn = this.b;
            sbw sbw = this.d;
            iva.a((Object) sbw);
            nix.a(new scl(afqn, sbw, overrideFileGroupRequest, ifu));
            return;
        }
        afsh.a("%s : Cannot call Diagnostics API on a non-debug build", (Object) "Service");
        throw new SecurityException("Access denied");
    }

    public final void a(rwy rwy, FileGroupRequest fileGroupRequest) {
        this.f.a(new sdd(this.b, this.d, fileGroupRequest, this.g, this.h, this.i, this.e, rwy));
    }

    public final void a(rxb rxb) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new scq(this.b, rxb));
            return;
        }
        throw new SecurityException("Access denied");
    }

    public final void a(boolean z, ifu ifu) {
        if (this.i.equals(scg.ZERO_PARTY) || hxz.g(this.a)) {
            this.f.a(new scn(this.b, z, ifu));
            return;
        }
        throw new SecurityException("Access denied");
    }
}
