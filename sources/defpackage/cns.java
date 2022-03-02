package defpackage;

import java.util.Map;

/* renamed from: cns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cns {
    public final long a(clp clp, long j, int i) {
        long a = a().a();
        cnq cnq = (cnq) b().get(clp);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i - 1))) * cnq.a(), j - a), cnq.b());
    }

    public abstract cpp a();

    public abstract Map b();
}
