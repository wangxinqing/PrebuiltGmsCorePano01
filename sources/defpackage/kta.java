package defpackage;

/* renamed from: kta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class kta {
    protected final int a;
    protected final kwj b;

    public kta(int i, kwj kwj) {
        iva.a((Object) kwj);
        this.a = i;
        this.b = kwj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kta) {
            kta kta = (kta) obj;
            return this.a == kta.a && this.b.asBinder().equals(kta.b.asBinder());
        }
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b.asBinder().hashCode();
    }
}
