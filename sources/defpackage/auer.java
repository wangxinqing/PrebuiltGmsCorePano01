package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: auer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auer {
    public static final auff a = a(false);
    public static final auff b = a(true);
    public static final auff c = new auff();
    private static final Class d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        d = cls;
    }

    static int a(int i, Object obj, aueq aueq) {
        if (obj instanceof audf) {
            return aubk.a(i, (audf) obj);
        }
        return aubk.i(i) + aubk.a((audx) obj, aueq);
    }

    static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = size * aubk.i(i);
        for (int i3 = 0; i3 < list.size(); i3++) {
            i2 += aubk.b((auay) list.get(i3));
        }
        return i2;
    }

    static int c(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * aubk.o(i);
        }
        return 0;
    }

    static int d(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return d(list) + (size * aubk.i(i));
        }
        return 0;
    }

    static int e(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * aubk.q(i);
        }
        return 0;
    }

    static int f(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * aubk.r(i);
        }
        return 0;
    }

    static int g(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return e(list) + (size * aubk.i(i));
        }
        return 0;
    }

    static int h(int i, List list) {
        if (list.size() != 0) {
            return a(list) + (list.size() * aubk.i(i));
        }
        return 0;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return g(list) + (size * aubk.i(i));
        }
        return 0;
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return c(list) + (size * aubk.i(i));
        }
        return 0;
    }

    static int k(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return f(list) + (size * aubk.i(i));
        }
        return 0;
    }

    static int l(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return b(list) + (size * aubk.i(i));
        }
        return 0;
    }

    public static void m(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.j(((Integer) list.get(i4)).intValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void n(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Boolean) list.get(i3)).booleanValue();
                    i4++;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.b(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    static int b(int i, List list, aueq aueq) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += aubk.b(i, (audx) list.get(i3), aueq);
        }
        return i2;
    }

    static int c(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof audl) {
            audl audl = (audl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.g(audl.a(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.j(aucl.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int f(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.k(aucl.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int a(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int i5 = aubk.i(i) * size;
        if (list instanceof audh) {
            audh audh = (audh) list;
            while (i4 < size) {
                Object c2 = audh.c(i4);
                if (c2 instanceof auay) {
                    i3 = aubk.b((auay) c2);
                } else {
                    i3 = aubk.b((String) c2);
                }
                i5 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof auay) {
                    i2 = aubk.b((auay) obj);
                } else {
                    i2 = aubk.b((String) obj);
                }
                i5 += i2;
                i4++;
            }
        }
        return i5;
    }

    static int d(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.j(aucl.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aucl) {
            aucl aucl = (aucl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.l(aucl.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(List list) {
        return list.size();
    }

    public static void k(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Integer) list.get(i3)).intValue();
                    i4 += 4;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void l(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Integer) list.get(i3)).intValue();
                    i4 += 4;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.e(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    static int b(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof audl) {
            audl audl = (audl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.f(audl.a(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void h(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.j(((Integer) list.get(i4)).intValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.c(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void i(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.k(((Integer) list.get(i4)).intValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.d(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.d(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.l(((Integer) list.get(i4)).intValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void c(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.f(((Long) list.get(i4)).longValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void e(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.g(((Long) list.get(i4)).longValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.c(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Long) list.get(i3)).longValue();
                    i4 += 8;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Long) list.get(i3)).longValue();
                    i4 += 8;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.b(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, aubl aubl) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aubl.a.a(i, (auay) list.get(i2));
            }
        }
    }

    static int a(int i, List list, aueq aueq) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = aubk.i(i) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof audf) {
                i2 = aubk.a((audf) obj);
            } else {
                i2 = aubk.a((audx) obj, aueq);
            }
            i3 += i2;
        }
        return i3;
    }

    public static void d(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += aubk.f(((Long) list.get(i4)).longValue());
                }
                aubl.a.d(i3);
                while (i2 < list.size()) {
                    aubl.a.c(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, aubl aubl, aueq aueq) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aubl.b(i, list.get(i2), aueq);
            }
        }
    }

    public static void b(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Float) list.get(i3)).floatValue();
                    i4 += 4;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    static int a(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof audl) {
            audl audl = (audl) list;
            i = 0;
            while (i2 < size) {
                i += aubk.f(audl.a(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aubk.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static void c(Object obj, Object obj2) {
        aufg a2 = auff.a(obj);
        aufg a3 = auff.a(obj2);
        if (!a3.equals(aufg.a)) {
            a2 = aufg.a(a2, a3);
        }
        auff.a(obj, a2);
    }

    static void b(Object obj, Object obj2) {
        aubx a2 = aubt.a(obj2);
        if (!a2.a()) {
            aubx b2 = aubt.b(obj);
            for (int i = 0; i < a2.a.a(); i++) {
                b2.a(a2.a.b(i));
            }
            for (Map.Entry a3 : a2.a.b()) {
                b2.a(a3);
            }
        }
    }

    private static auff a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (auff) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
            } catch (Throwable th2) {
            }
        }
        return null;
    }

    static Object a(int i, int i2, Object obj) {
        if (obj == null) {
            obj = aufg.a();
        }
        ((aufg) obj).a(aufy.a(i, 0), (Object) Long.valueOf((long) i2));
        return obj;
    }

    static Object a(int i, List list, aucq aucq, Object obj) {
        if (aucq == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (!aucq.a(intValue)) {
                    obj = a(i, intValue, obj);
                } else {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aucq.a(intValue2)) {
                    obj = a(i, intValue2, obj);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static void a(int i, List list, aubl aubl) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof audh) {
                audh audh = (audh) list;
                while (i2 < list.size()) {
                    Object c2 = audh.c(i2);
                    if (c2 instanceof String) {
                        aubl.a.a(i, (String) c2);
                    } else {
                        aubl.a.a(i, (auay) c2);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.a(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void a(int i, List list, aubl aubl, aueq aueq) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                aubl.a(i, list.get(i2), aueq);
            }
        }
    }

    public static void a(int i, List list, aubl aubl, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                aubl.a.b(i, 2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    ((Double) list.get(i3)).doubleValue();
                    i4 += 8;
                    i3++;
                    boolean z2 = aubk.e;
                }
                aubl.a.d(i4);
                while (i2 < list.size()) {
                    aubl.a.a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                aubl.a.a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void a(Class cls) {
        Class cls2;
        if (!aucj.class.isAssignableFrom(cls) && (cls2 = d) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static void a(Object obj, Object obj2, long j) {
        aufp.a(obj, j, auds.a(aufp.f(obj, j), aufp.f(obj2, j)));
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
