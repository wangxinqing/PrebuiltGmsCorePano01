package defpackage;

/* renamed from: xyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyh extends xyf {
    private static final anaf c;

    static {
        anab h = anaf.h();
        h.a(wvc.OK, 1);
        h.a(wvc.UNKNOWN, 2);
        h.a(wvc.INVALID_ARGUMENT, 3);
        h.a(wvc.NOT_FOUND, 4);
        h.a(wvc.ALREADY_EXISTS, 5);
        h.a(wvc.ABORTED, 6);
        h.a(wvc.INTERNAL, 7);
        c = h.a();
    }

    public xyh() {
        super(3);
    }

    /* access modifiers changed from: protected */
    public final byte[] a() {
        xip.a();
        return ayrj.a.a().as().k();
    }

    /* access modifiers changed from: protected */
    public final anaf b() {
        return c;
    }
}
