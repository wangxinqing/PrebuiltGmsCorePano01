package defpackage;

import com.google.android.chimera.config.InvalidConfigException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: blj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class blj {
    public static final Comparator a = blh.a;
    public static final Comparator b = bli.a;
    public static final bpw c = bpw.a(a);
    public static final bpw d = bpw.a(b);

    public static bpw a(bpw bpw) {
        amzt b2 = amzy.b(bpw.size());
        int size = bpw.size();
        for (int i = 0; i < size; i++) {
            b2.c(((boc) bpw.get(i)).b);
        }
        return bpw.a((Iterable) b2.a());
    }

    public static bpw b(bpw bpw) {
        amzt b2 = amzy.b(bpw.size());
        int size = bpw.size();
        for (int i = 0; i < size; i++) {
            bob bob = (bob) bpw.get(i);
            if (!bob.d) {
                b2.c(bob.b);
            }
        }
        return bpw.a((Iterable) b2.a());
    }

    public static bpw c(List list) {
        bob bob;
        Map a2 = qug.a();
        Map a3 = qug.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (bob bob2 : (List) it.next()) {
                bob bob3 = (bob) a2.get(bob2.b);
                bob bob4 = (bob) a3.get(bob2.b);
                if (!bob2.d) {
                    if (bob4 != null && bob4.c <= bob2.c) {
                        a3.remove(bob2.b);
                    }
                    bob bob5 = (bob) a2.get(bob2.b);
                    if (bob5 == null || bob5.c < bob2.c) {
                        a2.put(bob2.b, bob2);
                    }
                } else if ((bob3 == null || bob3.c < bob2.c) && ((bob = (bob) a3.get(bob2.b)) == null || bob.c < bob2.c)) {
                    a3.put(bob2.b, bob2);
                }
            }
        }
        amzt b2 = amzy.b(a2.size() + a3.size());
        b2.b((Iterable) a2.values());
        b2.b((Iterable) a3.values());
        return bpw.b(b2.a(), a);
    }

    public static bpw a(List list) {
        try {
            return c(list);
        } catch (InvalidConfigException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String b(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            bob bob = (bob) list.get(i);
            sb.append(bob.b);
            sb.append(':');
            sb.append(bob.c);
        }
        return sb.toString();
    }

    public static bpw a(List list, List list2) {
        Map a2 = qug.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bob bob = (bob) it.next();
            if (!bob.d) {
                a2.put(bob.b, bob);
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            bob bob2 = (bob) it2.next();
            if (!bob2.d) {
                a2.put(bob2.b, bob2);
            }
        }
        return bpw.b(a2.values(), a);
    }

    public static List a(brl brl) {
        ArrayList arrayList = new ArrayList(brl.q.size());
        for (int i = 0; i < brl.q.size(); i++) {
            aucd o = bob.f.o();
            String str = ((boc) brl.q.get(i)).b;
            if (o.c) {
                o.c();
                o.c = false;
            }
            bob bob = (bob) o.b;
            str.getClass();
            bob.a |= 1;
            bob.b = str;
            long j = ((boc) brl.q.get(i)).c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            bob bob2 = (bob) o.b;
            bob2.a |= 2;
            bob2.c = j;
            arrayList.add((bob) o.i());
        }
        return arrayList;
    }
}
