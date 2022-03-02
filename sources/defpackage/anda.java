package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: anda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anda {
    public static ArrayList a() {
        return new ArrayList();
    }

    public static ArrayList a(int i) {
        amxg.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static ArrayList a(Iterable iterable) {
        amrl.a((Object) iterable);
        if (!(iterable instanceof Collection)) {
            return a(iterable.iterator());
        }
        return new ArrayList((Collection) iterable);
    }

    public static ArrayList a(Iterator it) {
        ArrayList a = a();
        ance.a((Collection) a, it);
        return a;
    }

    @SafeVarargs
    public static ArrayList a(Object... objArr) {
        amrl.a((Object) objArr);
        int length = objArr.length;
        amxg.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(aoog.b(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List a(List list) {
        if (list instanceof amzy) {
            return ((amzy) list).g();
        }
        if (list instanceof ancv) {
            return ((ancv) list).a;
        }
        if (list instanceof RandomAccess) {
            return new anct(list);
        }
        return new ancv(list);
    }

    public static List a(List list, int i) {
        amrl.a((Object) list);
        amrl.a(true);
        return list instanceof RandomAccess ? new ancs(list, i) : new ancr(list, i);
    }

    public static List a(List list, amqy amqy) {
        return list instanceof RandomAccess ? new ancx(list, amqy) : new ancz(list, amqy);
    }

    public static boolean a(List list, Object obj) {
        amrl.a((Object) list);
        if (obj == list) {
            return true;
        }
        if (obj instanceof List) {
            List list2 = (List) obj;
            int size = list.size();
            if (size == list2.size()) {
                if (!(list2 instanceof RandomAccess)) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it2.hasNext()) {
                                if (!amqx.a(it.next(), it2.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else if (!it2.hasNext()) {
                            return true;
                        }
                    }
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (!amqx.a(list.get(i), list2.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
