package defpackage;

/* renamed from: aufe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aufe extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public aufe() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final auda a() {
        return new auda(getMessage());
    }
}
