package defpackage;

import java.util.Map;

/* renamed from: anar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anar extends amzn {
    private static final long serialVersionUID = 0;
    final anau a;

    public anar(anau anau) {
        this.a = anau;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new anao(this.a);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.b(entry.getKey(), entry.getValue());
    }

    public final boolean f() {
        throw null;
    }

    public final int size() {
        return this.a.c;
    }
}
