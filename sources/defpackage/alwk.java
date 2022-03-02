package defpackage;

/* renamed from: alwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alwk implements alvb {
    private final alwj a = new alwj();
    private final alwh b = new alwh();

    public final void a(alzd alzd, amjf amjf) {
        amje amje = amje.KIND_NOT_SET;
        int ordinal = amjf.b.ordinal();
        if (ordinal == 1) {
            this.a.a(alzd, amjf);
        } else if (ordinal == 2) {
            this.b.a(alzd, amjf);
        } else {
            throw new IllegalArgumentException(amjf.toString());
        }
    }
}
