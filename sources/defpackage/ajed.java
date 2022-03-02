package defpackage;

/* renamed from: ajed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajed {
    public arvk a;
    public long b;
    private final amsv c;
    private final amsv d;

    static {
        jjg.a("QuakeTime", iyc.LOCATION);
    }

    public ajed(amsv amsv, amsv amsv2) {
        this.c = amsv;
        this.d = amsv2;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return ((Long) this.c.a()).longValue();
    }

    /* access modifiers changed from: package-private */
    public final ajec b() {
        return b(a());
    }

    /* access modifiers changed from: package-private */
    public final long a(long j) {
        return (j / 1000000) + (((Long) this.d.a()).longValue() - ((Long) this.c.a()).longValue());
    }

    /* access modifiers changed from: package-private */
    public final ajec b(long j) {
        return this.a != null ? new ajeb(this, j) : ajea.a;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, arvm arvm) {
        long a2 = a();
        aucd o = arvk.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arvk arvk = (arvk) o.b;
        arvk.b = i;
        arvm.getClass();
        arvk.a = arvm;
        arvk arvk2 = (arvk) o.i();
        arvk arvk3 = this.a;
        if (arvk3 != null) {
            arvm arvm2 = arvk3.a;
            if (arvm2 == null) {
                arvm2 = arvm.c;
            }
            long quakeTimeExpireAgeMs = arvm2.a + ayel.a.a().quakeTimeExpireAgeMs();
            arvm arvm3 = arvk2.a;
            if (arvm3 == null) {
                arvm3 = arvm.c;
            }
            if (quakeTimeExpireAgeMs > arvm3.a && this.a.b < arvk2.b) {
                return;
            }
        }
        this.a = arvk2;
        this.b = a2;
    }
}
