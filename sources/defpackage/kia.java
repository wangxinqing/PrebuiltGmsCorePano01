package defpackage;

/* renamed from: kia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kia implements khy {
    private static final ith a = new ith("EntryPersistenceStrateg", "");
    private final khq b;
    private final kkf c;
    private final knc d;
    private final String e;

    public kia(kkf kkf, khq khq, knc knc, String str) {
        iva.a((Object) khq);
        this.b = khq;
        iva.a((Object) kkf);
        this.c = kkf;
        iva.a((Object) knc);
        this.d = knc;
        iva.a((Object) str);
        this.e = str;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        iva.a(this.c.b(), (Object) "Overwrite of entry metadata has to happen in a transaction");
        kmp kmp = null;
        boolean z = false;
        if (Thread.interrupted()) {
            a.a("Not persisting content to entry %s because download was canceled.", this.d);
        } else {
            try {
                kmp = this.c.a(this.b, this.d);
                if (!kmp.am()) {
                    kmp.c(str, lru.b(this.e));
                    kmp.aq();
                    z = true;
                }
                kmp.b(str, this.e);
                kmp.m(z);
            } catch (kcs e2) {
                a.b("Unable to persist content to entry %s because it could not be read.", this.d);
            }
        }
        return kmp;
    }
}
