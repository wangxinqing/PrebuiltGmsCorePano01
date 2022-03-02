package defpackage;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: cin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cin extends cih {
    private final List b = new ArrayList();

    public cin(boolean z) {
        super(z);
    }

    public final Collection a() {
        return this.b;
    }

    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final void a(cij cij) {
        super.a(cij);
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cij cij2 = (cij) it.next();
            if (cij2.a.d().equals(cij.a.d())) {
                if (cij2.a.e().b() <= cij.a.e().b()) {
                    it.remove();
                } else {
                    return;
                }
            }
        }
        if (cij.a.j().b()) {
            this.b.add(cij);
        }
    }

    public final void a(ContextDataFilterImpl contextDataFilterImpl, boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            cij cij = (cij) it.next();
            if (!z || !this.a || it.hasNext()) {
                if (contextDataFilterImpl.a(cij.a)) {
                    it.remove();
                }
            } else {
                return;
            }
        }
    }
}
