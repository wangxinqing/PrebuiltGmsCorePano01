package defpackage;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: cim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class cim extends cih {
    private final int b;
    private final PriorityQueue c;
    private final HashMap d = new HashMap();

    public cim(int i, Comparator comparator, boolean z) {
        super(z);
        this.b = i;
        this.c = new PriorityQueue(i + 1, comparator);
    }

    public final Collection a() {
        return this.c;
    }

    public final Iterator iterator() {
        return this.c.iterator();
    }

    public void a(cij cij) {
        super.a(cij);
        if (this.d.containsKey(cij.a.d())) {
            if (((Integer) this.d.get(cij.a.d())).intValue() < cij.a.e().b()) {
                Iterator it = this.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((cij) it.next()).a.d().equals(cij.a.d())) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return;
            }
        }
        this.d.put(cij.a.d(), Integer.valueOf(cij.a.e().b()));
        this.c.add(cij);
        if (this.c.size() > this.b) {
            this.d.remove(((cij) this.c.remove()).a.d());
        }
    }

    public final void a(ContextDataFilterImpl contextDataFilterImpl, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            cij cij = (cij) it.next();
            if (!z || !this.a || it.hasNext()) {
                if (contextDataFilterImpl.a(cij.a)) {
                    this.d.remove(cij.a.d());
                    it.remove();
                }
            } else {
                return;
            }
        }
    }
}
