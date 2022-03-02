package defpackage;

/* renamed from: anat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anat extends amzn {
    private static final long serialVersionUID = 0;
    private final transient anau a;

    public anat(anau anau) {
        this.a = anau;
    }

    public final int a(Object[] objArr, int i) {
        anhj a2 = this.a.b.values().iterator();
        while (a2.hasNext()) {
            i = ((amzn) a2.next()).a(objArr, i);
        }
        return i;
    }

    public final boolean contains(Object obj) {
        return this.a.f(obj);
    }

    public final boolean f() {
        throw null;
    }

    public final int size() {
        return this.a.c;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new anap(this.a);
    }
}
