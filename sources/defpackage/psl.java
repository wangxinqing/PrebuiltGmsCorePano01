package defpackage;

/* renamed from: psl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psl {
    public final ozb a;
    public final prp b;
    public Long c;
    private final pas d;
    private String e;
    private Boolean f;

    public psl(ozb ozb, pas pas, prp prp) {
        this.a = ozb;
        this.d = pas;
        this.b = prp;
    }

    public static boolean a(String str, prp prp) {
        boolean z;
        pro d2 = prp.d();
        synchronized (d2.a.g) {
            if (!axsj.e() || !d2.a.e.isEmpty()) {
                pqq pqq = (pqq) d2.a.e.get(str);
                z = pqq != null && pqq.d;
            } else {
                z = !prp.b(d2.a.a, str);
            }
        }
        if (!z) {
            return false;
        }
        oso.d("Package %s is blacklisted for upload", (Object) str);
        return true;
    }

    public final boolean b() {
        Boolean bool = this.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(this.d.a(a()));
        this.f = valueOf;
        if (!valueOf.booleanValue()) {
            oso.d("swaa is not enabled for the current account.");
        }
        return this.f.booleanValue();
    }

    public final String a() {
        long j;
        if (this.e == null) {
            this.e = this.d.a();
            ick c2 = ((pat) this.d).c();
            if (c2 == null) {
                oso.e("getSignedInTimestampMs: Falling back to default value");
                j = 0;
            } else {
                j = ((rpy) c2.a).c();
            }
            this.c = Long.valueOf(j);
        }
        return this.e;
    }
}
