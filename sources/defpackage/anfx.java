package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: anfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anfx extends anfk implements Serializable {
    public static final anfx a = new anfx();
    private static final long serialVersionUID = 0;

    private anfx() {
    }

    private Object readResolve() {
        return a;
    }

    public final anfk a() {
        return anfh.a;
    }

    public final /* bridge */ /* synthetic */ Object b(Iterable iterable) {
        return (Comparable) anfh.a.a(iterable);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        amrl.a((Object) comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final /* bridge */ /* synthetic */ Object a(Iterable iterable) {
        return (Comparable) anfh.a.b(iterable);
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        return (Comparable) anfh.a.a((Object) (Comparable) obj, (Object) (Comparable) obj2);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return (Comparable) anfh.a.b((Comparable) obj, (Comparable) obj2);
    }

    public final /* bridge */ /* synthetic */ Object b(Iterator it) {
        return (Comparable) anfh.a.a(it);
    }

    public final /* bridge */ /* synthetic */ Object a(Iterator it) {
        return (Comparable) anfh.a.b(it);
    }
}
