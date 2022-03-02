package defpackage;

import android.os.SystemClock;

/* renamed from: ajee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajee implements jiq {
    private final ajed a;

    public ajee(ajed ajed) {
        this.a = ajed;
    }

    public final long a() {
        arvl a2 = this.a.b().a();
        int i = a2.b;
        arvk arvk = a2.a;
        if (arvk == null) {
            arvk = arvk.c;
        }
        arvm arvm = arvk.a;
        if (arvm == null) {
            arvm = arvm.c;
        }
        long j = arvm.a;
        arvk arvk2 = a2.a;
        if (arvk2 == null) {
            arvk2 = arvk.c;
        }
        long j2 = (long) arvk2.b;
        arvk arvk3 = a2.a;
        if (arvk3 == null) {
            arvk3 = arvk.c;
        }
        arvm arvm2 = arvk3.a;
        if (arvm2 == null) {
            arvm2 = arvm.c;
        }
        return j + ((j2 - ((long) arvm2.b)) / 2) + ((long) i);
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        throw new UnsupportedOperationException();
    }
}
