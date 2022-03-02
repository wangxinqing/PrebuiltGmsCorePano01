package defpackage;

import android.content.SyncResult;
import java.util.Locale;

/* renamed from: ldu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ldu implements lff {
    private final kkz a;
    private final lef b;
    private final int c;
    private final ldq d;

    public ldu(kkz kkz, ldz ldz, ldq ldq, int i) {
        boolean z;
        iva.a((Object) ldz);
        iva.a((Object) ldq);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        this.a = kkz;
        this.b = new lef(ldz);
        this.c = i;
        this.d = ldq;
    }

    public final void a(SyncResult syncResult) {
        String a2 = this.b.a();
        ldq ldq = this.d;
        lcq a3 = lcq.a(ldq.a, a2);
        iva.a((Object) a3);
        ldq.a = a3;
    }

    public final boolean a() {
        return true;
    }

    public final String b() {
        return String.format(Locale.US, "SearchAlgorithm[%s]", new Object[]{this.d});
    }

    public final String toString() {
        return String.format(Locale.US, "SearchAlgorithm[delegate=%s]", new Object[]{this.b});
    }

    public final void a(lea lea, lnk lnk, SyncResult syncResult) {
        if (!this.d.a.c()) {
            lea.a(this.d.a, (Long) null, this.a, this.c, this.b, lnk);
        }
    }
}
