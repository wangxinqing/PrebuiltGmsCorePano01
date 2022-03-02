package defpackage;

/* renamed from: orq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class orq extends ppr {
    final /* synthetic */ long a;
    final /* synthetic */ osf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public orq(osf osf, aonk aonk, long j) {
        super(aonk);
        this.b = osf;
        this.a = j;
    }

    public final void b() {
        if (this.b.d()) {
            paj paj = this.b.o;
            long j = this.a;
            anhj a2 = paj.d.b.a(oze.a).a.iterator();
            while (a2.hasNext()) {
                paj.a((pao) a2.next(), j + j);
            }
            return;
        }
        oso.b("Indexing retry skipped because init failed");
    }
}
