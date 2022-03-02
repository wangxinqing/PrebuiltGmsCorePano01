package defpackage;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: krq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class krq {
    private static final ith b = new ith("CallbackSet", "");
    public final Object a = new Object();
    private final Set c = new HashSet();

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.c) {
            this.c.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        boolean isEmpty;
        synchronized (this.c) {
            isEmpty = this.c.isEmpty();
        }
        return isEmpty;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(krp krp) {
        amzy a2;
        boolean removeAll;
        synchronized (this.c) {
            amzt b2 = amzy.b(this.c.size());
            b2.b((Iterable) this.c);
            a2 = b2.a();
        }
        amzt j = amzy.j();
        anhk i = a2.listIterator();
        while (i.hasNext()) {
            kta kta = (kta) i.next();
            try {
                if (!krp.a(kta)) {
                    b.b("CallbackSet", "Callback is no longer needed; removing");
                    j.c(kta);
                }
            } catch (RemoteException e) {
                b.b("CallbackSet", "Callback caused RemoteException; removing", (Throwable) e);
                j.c(kta);
            }
        }
        synchronized (this.c) {
            removeAll = this.c.removeAll(j.a());
        }
        return removeAll;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(kta kta) {
        boolean remove;
        synchronized (this.c) {
            remove = this.c.remove(kta);
        }
        return remove;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(kta kta) {
        boolean add;
        synchronized (this.a) {
            synchronized (this.c) {
                add = this.c.add(kta);
            }
        }
        return add;
    }
}
