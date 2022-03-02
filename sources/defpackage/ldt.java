package defpackage;

import android.content.SyncResult;
import java.util.Locale;

/* renamed from: ldt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldt {
    public static final ith a = new ith("PreparedSearch", "");
    public final lsm b;
    public final kkz c;
    public final ldq d;
    public final lcu e;
    public final SyncResult f;

    public ldt(lsm lsm, kkz kkz, ldq ldq, ldz ldz, SyncResult syncResult) {
        this.b = lsm;
        this.c = kkz;
        this.d = ldq;
        this.e = new lcu(ldz);
        this.f = syncResult;
    }

    public final lds a(boolean z) {
        return new lds(z, this.e.a());
    }

    public final String toString() {
        return String.format(Locale.US, "PreparedSearch[%s]", new Object[]{this.c.a});
    }

    public final synchronized void a(kep kep, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.a((Object) kep);
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb.append("FTS ");
        sb.append(valueOf);
        new ldr(this, sb.toString(), i, kep).start();
    }
}
