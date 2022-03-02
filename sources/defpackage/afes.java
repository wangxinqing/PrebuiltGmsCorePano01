package defpackage;

import android.accounts.Account;

/* renamed from: afes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afes implements aerg {
    private final awdn a;
    private final affw b;
    private final awdn c;

    public afes(awdn awdn, affw affw, awdn awdn2) {
        this.a = awdn;
        this.b = affw;
        this.c = awdn2;
    }

    public final void a(String str, aukh aukh, Account account) {
        try {
            this.b.a(str, aukh, account);
        } catch (afdm e) {
            ((pia) this.a.a()).e("Read notify failed", new Object[0]);
            ((pdg) this.c.a()).a("MDH sync post local read failure", e);
        }
    }

    public final void b(aukh aukh, Account account) {
    }

    public final void b(String str, aukh aukh, Account account) {
        try {
            this.b.b(str, aukh, account);
        } catch (afdm e) {
            ((pia) this.a.a()).e("Write notify failed", new Object[0]);
            ((pdg) this.c.a()).a("MDH sync post local write failure", e);
        }
    }
}
