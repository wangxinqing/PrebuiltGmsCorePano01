package defpackage;

/* renamed from: aqcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcj implements aqay {
    private static final anil a = anil.a("xRPC");
    private aqcl b;
    private baai c;
    private final aqck d;

    public aqcj(amsv amsv, apyk apyk) {
        this.d = new aqck(amsv, apyk);
    }

    public final aqcb a(aqau aqau) {
        boolean z;
        this.c = aqau.c.a;
        azxh azxh = aqau.b;
        boolean z2 = true;
        if (azxh.a(aqcl.b) == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "Unexpected option %s already set.", (Object) aqcl.b);
        if (azxh.a(aqci.a) != null) {
            z2 = false;
        }
        amrl.a(z2, "Unexpected option %s already set.", (Object) aqci.a);
        this.b = new aqcl((apyg) azxh.a(apyg.a));
        return aqcb.a(azxh.a(aqcl.b, (Object) this.b).a(aqci.a, (Object) this.b));
    }

    public final aqcb b() {
        if (this.c.equals(baai.CLIENT_STREAMING) || this.c.equals(baai.BIDI_STREAMING)) {
            this.b.h.incrementAndGet();
        }
        return aqcb.a;
    }

    public final aqcc c() {
        if (this.c.equals(baai.SERVER_STREAMING) || this.c.equals(baai.BIDI_STREAMING)) {
            this.b.g.incrementAndGet();
        }
        return aqcc.a;
    }

    public final aqcb b(aqau aqau) {
        return aqcb.a;
    }

    public final aqcb a(aqav aqav) {
        return aqcb.a;
    }

    public final aqcc a(aqat aqat) {
        boolean z;
        try {
            aqcl aqcl = this.b;
            if (aqcl.m.getAndSet(aqat.a.r) == null) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z, (Object) "Already recorded result.");
            aqck aqck = this.d;
            aqcl aqcl2 = this.b;
            if (((Boolean) aqck.a.a()).booleanValue() && aqcl2.e.get()) {
                agfu a2 = agfu.a();
                agev agev = new agev(agfe.a(aqcl2.c.a()), true);
                boolean z2 = aqcl2.d.get();
                amrl.a(true);
                amrl.a(true);
                agev.q = 1;
                agev.r = z2 ? 1 : 0;
                a2.a(agev);
            }
            if (aqck.b == null) {
                return aqcc.a;
            }
            throw null;
        } catch (Throwable th) {
            anih anih = (anih) a.b();
            anih.a(th);
            ((anih) anih.a("aqcj", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to record RPC metrics");
        }
    }

    public final aqcc a(aqaw aqaw) {
        return aqcc.a;
    }
}
