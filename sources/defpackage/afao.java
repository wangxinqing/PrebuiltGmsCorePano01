package defpackage;

import java.io.IOException;

/* renamed from: afao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afao implements afea {
    private final afai a;
    private final awdn b;

    public afao(afai afai, awdn awdn) {
        this.a = afai;
        this.b = awdn;
    }

    public final void a(afdx afdx) {
        if (aukg.a(afdx.c().a) != aukg.REGISTRATION && afgu.a(afdx.d())) {
            try {
                this.a.a(afdx.b());
            } catch (IOException e) {
                ((pdg) this.b.a()).a("MDH Push policy changed failure", e);
            }
        }
    }

    public final void a(afdx afdx, afdx afdx2) {
        if (aukg.a(afdx2.c().a) == aukg.REGISTRATION) {
            return;
        }
        if (afdx != null || afgu.a(afdx2.d())) {
            if (afdx != null) {
                if (afdx.d().e == afdx2.d().e) {
                    return;
                }
            }
            try {
                this.a.a(afdx2.b());
            } catch (IOException e) {
                ((pdg) this.b.a()).a("Push policy changed failure", e);
            }
        }
    }
}
