package defpackage;

/* renamed from: amks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amks {
    private static final amks d = new amks(3, (Object) null, true);
    private static final amks e = new amks(2, (Object) null, true);
    public boolean a;
    public final int b;
    private final Object c;

    public amks(int i, Object obj, boolean z) {
        this.b = i;
        this.c = obj;
        this.a = z;
    }

    static amks a(int i) {
        return i + -1 != 1 ? d : e;
    }

    public final boolean b() {
        this.a = true;
        return this.b == 1;
    }

    public final Object a() {
        if (this.a && this.b == 1) {
            return this.c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }
}
