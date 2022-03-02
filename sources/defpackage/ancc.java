package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: ancc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancc extends anhj {
    final Queue a;

    public ancc(Iterable iterable, Comparator comparator) {
        ancd ancd;
        this.a = new PriorityQueue(2, new ancb(comparator));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterator it2 = (Iterator) it.next();
            if (it2.hasNext()) {
                Queue queue = this.a;
                if (it2 instanceof ancd) {
                    ancd = (ancd) it2;
                } else {
                    ancd = new ancd(it2);
                }
                queue.add(ancd);
            }
        }
    }

    public final boolean hasNext() {
        return !this.a.isEmpty();
    }

    public final Object next() {
        ancd ancd = (ancd) this.a.remove();
        Object next = ancd.next();
        if (ancd.hasNext()) {
            this.a.add(ancd);
        }
        return next;
    }
}
