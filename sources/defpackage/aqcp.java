package defpackage;

/* renamed from: aqcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcp implements aqay {
    private static final anil a = anil.a("xRPC");
    private final aekn b;
    private baai c;
    private long d;
    private aqcl e;

    public aqcp(aekn aekn) {
        this.b = aekn;
    }

    public final aqcb a(aqau aqau) {
        this.c = aqau.c.a;
        aqcl aqcl = (aqcl) aqau.b.a(aqcl.b);
        amrl.a((Object) aqcl, "%s missing from CallOptions.", (Object) aqcl.b);
        this.e = aqcl;
        this.d = this.b.b();
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
        boolean z;
        boolean z2;
        try {
            if (aqat.a.a()) {
                long b2 = this.b.b() - this.d;
                boolean z3 = true;
                if (!this.c.equals(baai.UNARY)) {
                    aqcl aqcl = this.e;
                    if (b2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    amrl.a(z, (Object) "Cannot record negative stream duration.");
                    if (aqcl.l.getAndSet(b2) != -1) {
                        z3 = false;
                    }
                    amrl.b(z3, (Object) "Already recorded stream duration.");
                } else if (b2 > 2147483647L) {
                    ((anih) ((anih) a.b()).a("aqcp", "a", 50, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                } else {
                    aqcl aqcl2 = this.e;
                    int i = (int) b2;
                    if (i >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    amrl.a(z2, (Object) "Cannot record negative latency.");
                    if (aqcl2.i.getAndSet(i) != -1) {
                        z3 = false;
                    }
                    amrl.b(z3, (Object) "Already recorded latency.");
                }
            }
            this.e.f.incrementAndGet();
        } catch (Throwable th) {
            anih anih = (anih) a.b();
            anih.a(th);
            ((anih) anih.a("aqcp", "a", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to record network latency");
        }
        return aqcc.a;
    }

    public final aqcc a(aqaw aqaw) {
        return aqcc.a;
    }
}
