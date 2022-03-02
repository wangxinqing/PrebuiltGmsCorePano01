package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: audi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audi extends audk {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private static List a(Object obj, long j, int i) {
        List list;
        List c2 = c(obj, j);
        if (c2.isEmpty()) {
            if (c2 instanceof audh) {
                list = new audg(i);
            } else if (!(c2 instanceof aueg) || !(c2 instanceof aucx)) {
                list = new ArrayList(i);
            } else {
                list = ((aucx) c2).b(i);
            }
            aufp.a(obj, j, (Object) list);
            return list;
        } else if (c.isAssignableFrom(c2.getClass())) {
            ArrayList arrayList = new ArrayList(c2.size() + i);
            arrayList.addAll(c2);
            aufp.a(obj, j, (Object) arrayList);
            return arrayList;
        } else if (c2 instanceof aufj) {
            audg audg = new audg(c2.size() + i);
            audg.addAll((aufj) c2);
            aufp.a(obj, j, (Object) audg);
            return audg;
        } else if (!(c2 instanceof aueg) || !(c2 instanceof aucx)) {
            return c2;
        } else {
            aucx aucx = (aucx) c2;
            if (aucx.a()) {
                return c2;
            }
            aucx b = aucx.b(c2.size() + i);
            aufp.a(obj, j, (Object) b);
            return b;
        }
    }

    static List c(Object obj, long j) {
        return (List) aufp.f(obj, j);
    }

    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) aufp.f(obj, j);
        if (list instanceof audh) {
            obj2 = ((audh) list).e();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof aueg) || !(list instanceof aucx)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                aucx aucx = (aucx) list;
                if (aucx.a()) {
                    aucx.b();
                    return;
                }
                return;
            }
        }
        aufp.a(obj, j, obj2);
    }

    public final List a(Object obj, long j) {
        return a(obj, j, 10);
    }

    public final void a(Object obj, Object obj2, long j) {
        List c2 = c(obj2, j);
        List a = a(obj, j, c2.size());
        int size = a.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c2);
        }
        if (size > 0) {
            c2 = a;
        }
        aufp.a(obj, j, (Object) c2);
    }
}
