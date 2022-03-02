package defpackage;

import java.util.Map;

/* renamed from: anfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfr extends anax {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient anaf d;

    public anfr(anaf anaf, Object[] objArr, int i, int i2) {
        this.d = anaf;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    public final int a(Object[] objArr, int i) {
        return e().a(objArr, i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.d.get(key));
        }
    }

    public final boolean f() {
        return true;
    }

    public final amzy i() {
        return new anfq(this);
    }

    public final int size() {
        return this.c;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return e().listIterator();
    }
}
