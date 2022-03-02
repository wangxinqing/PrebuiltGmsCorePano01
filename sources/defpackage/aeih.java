package defpackage;

/* renamed from: aeih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeih implements AutoCloseable {
    private final aeij a;

    public aeih(aeij aeij, String str) {
        this.a = aeij;
        if (aeij.a.U()) {
            aeij.b.add(new aeii(str));
        }
    }

    public final void close() {
        aeij aeij = this.a;
        if (aeij.a.U()) {
            aeij.b.add(new aeii("END_LABEL"));
        }
    }
}
