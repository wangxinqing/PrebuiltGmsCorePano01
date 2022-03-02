package defpackage;

/* renamed from: rbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rbn {
    private final anab a = new anab();
    private final anab b = new anab();
    private auco c;

    public rbn() {
    }

    public final rbo a() {
        try {
            anaf a2 = this.a.a();
            try {
                anaf a3 = this.b.a();
                auco auco = this.c;
                if (auco != null) {
                    iva.a(!a2.containsKey(auco), (Object) "unknownSyncId is associated with a task config");
                    return new rbo(a2, a3, auco);
                }
                throw new IllegalStateException("unknownSyncId is not set");
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("duplicate task tags", e);
            }
        } catch (IllegalArgumentException e2) {
            throw new IllegalStateException("duplicate sync ids", e2);
        }
    }

    public rbn(auco auco) {
        this.c = auco;
    }

    public final void a(auco auco, rav rav) {
        this.a.a(auco, rav);
        qyn qyn = (qyn) rav;
        this.b.a(qyn.b, afuk.a(auco, 2));
        this.b.a(qyn.a, afuk.a(auco, 3));
    }
}
