package defpackage;

import android.accounts.Account;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aevq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aevq implements aevl {
    private static final afde c;
    public final Map a = new HashMap();
    public final aoqd b = aoqd.a();
    private final awdn d;
    private final awdn e;
    private final afgs f;
    private final afgs g;
    private final afci h;
    private final awdn i;
    private final aeri j;

    static {
        afdd a2 = afde.a();
        a2.a(':');
        c = a2.a();
    }

    public aevq(awdn awdn, awdn awdn2, afgs afgs, afgs afgs2, afci afci, awdn awdn3, aeri aeri) {
        this.d = awdn;
        this.e = awdn2;
        this.f = afgs;
        this.g = afgs2;
        this.h = afci;
        this.i = awdn3;
        this.j = aeri;
    }

    public final aevm a(Account account, int i2, int i3) {
        aevm aevm;
        Account account2 = account;
        int i4 = i2;
        int i5 = i3;
        aerd a2 = aerd.a(account2, aeuz.a(i4, i5, auku.SYNC_FULL_SNAPSHOT));
        anmx a3 = anmx.a();
        synchronized (this.a) {
            try {
                aevm = (aevm) this.a.get(a2);
                if (aevm == null) {
                    String a4 = c.a(account2.type);
                    String a5 = c.a(account2.name);
                    StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 25 + String.valueOf(a5).length());
                    sb.append(a4);
                    sb.append(':');
                    sb.append(a5);
                    sb.append(':');
                    sb.append(i4);
                    sb.append(':');
                    sb.append(i5);
                    afci b2 = this.h.b(sb.toString());
                    a3.a((Closeable) b2);
                    awdn awdn = this.e;
                    afch a6 = b2.a("ts-data");
                    a3.a((Closeable) a6);
                    afce afce = new afce(this.d, ((Integer) this.f.a()).intValue(), (auef) aulg.f.c(7), b2.a("ts-changelog"), this.j);
                    a3.a((Closeable) afce);
                    afce afce2 = new afce(this.d, ((Integer) this.f.a()).intValue(), (auef) aulg.f.c(7), b2.a("ts-synclog"), this.j);
                    a3.a((Closeable) afce2);
                    afbw afbw = new afbw(new afcf(b2.a("ts-metadata")));
                    a3.a((Closeable) afbw);
                    aevr aevr = new aevr(awdn, a2, a6, afce, afce2, afbw, b2, this.i, this, ((Integer) this.g.a()).intValue());
                    this.a.put(a2, aevr);
                    aevm = aevr;
                }
                this.b.c(a2);
            } catch (IOException e2) {
                IOException iOException = e2;
                try {
                    a3.close();
                } catch (IOException e3) {
                    ((pia) this.e.a()).e("Failure cleaning up erroneous creation of accessor object", new Object[0]);
                }
                throw afdm.a(iOException);
            }
        }
        return aevm;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.a) {
            for (Map.Entry entry : this.a.entrySet()) {
                ((pia) this.e.a()).d("Channel %s was not closed. Closing it in finalizer.", entry.getKey());
                ((aevm) entry.getValue()).close();
            }
        }
        super.finalize();
    }

    public final void a() {
        synchronized (this.a) {
            while (!this.b.b()) {
                try {
                    this.a.wait();
                } catch (InterruptedException e2) {
                    ((pia) this.e.a()).e("resetAndDelete interrupted", e2, new Object[0]);
                }
            }
            this.h.a();
        }
    }
}
