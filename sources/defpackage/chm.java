package defpackage;

/* renamed from: chm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chm {
    public jya a;
    public long b;

    public chm(jya jya, long j) {
        this.a = jya;
        this.b = j;
    }

    public static chm a(juj juj) {
        if (juj.a() != 1) {
            return null;
        }
        try {
            return new chm((jya) aucj.a((aucj) jya.e, juj.c(), aubs.c()), juj.b().c());
        } catch (auda e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("chm", "a", 240, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RegistrationManager] Could not parse device registration.");
            return null;
        }
    }

    public final String toString() {
        jxz jxz;
        iur a2 = ius.a(this);
        a2.a("deviceId", this.a.b);
        a2.a("gcmId", this.a.c);
        jya jya = this.a;
        if ((jya.a & 4) != 0) {
            jxz = jxz.a(jya.d);
            if (jxz == null) {
                jxz = jxz.NOT_SYNCED_MISSING_GCM_ID;
            }
        } else {
            jxz = null;
        }
        a2.a("state", jxz);
        a2.a("time", cku.a(this.b));
        return a2.toString();
    }

    public final void a(jxz jxz) {
        jya jya = this.a;
        aucd aucd = (aucd) jya.c(5);
        aucd.a((aucj) jya);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        jya jya2 = (jya) aucd.b;
        jya jya3 = jya.e;
        jya2.d = jxz.d;
        jya2.a |= 4;
        this.a = (jya) aucd.i();
        this.b = cbi.i().a();
    }

    public final boolean a() {
        jxz jxz;
        jxz jxz2 = jxz.NOT_SYNCED_MISSING_GCM_ID;
        jxz a2 = jxz.a(this.a.d);
        if (a2 == null) {
            a2 = jxz.NOT_SYNCED_MISSING_GCM_ID;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal == 2) {
            return cbi.i().a() - this.b > awuz.a.a().x();
        }
        anih anih = (anih) ((anih) bxk.a.b()).a("chm", "a", 284, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        jya jya = this.a;
        if ((jya.a & 4) != 0) {
            jxz = jxz.a(jya.d);
            if (jxz == null) {
                jxz = jxz.NOT_SYNCED_MISSING_GCM_ID;
            }
        } else {
            jxz = null;
        }
        anih.a("[RegistrationManager] Unknown device registration state=%s", (Object) jxz);
        return false;
    }
}
