package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: afcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class afcq implements afcr {
    protected volatile boolean a;
    final Set b = Collections.newSetFromMap(new IdentityHashMap());
    final Set c = Collections.newSetFromMap(new IdentityHashMap());
    final Set d = Collections.newSetFromMap(new IdentityHashMap());
    final Set e = Collections.newSetFromMap(new IdentityHashMap());
    final /* synthetic */ afcv f;

    public afcq(afcv afcv) {
        this.f = afcv;
    }

    public final afcv a() {
        return this.f;
    }

    public final void a(afbw afbw) {
        amrl.b(!this.a, (Object) "Transaction is closed");
        synchronized (this.c) {
            this.c.add(afbw);
        }
    }

    public final void a(afdn afdn) {
        amrl.b(!this.a, (Object) "Transaction is closed");
        synchronized (this.d) {
            this.d.add(afdn);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Set set) {
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    ((afdn) it.next()).a();
                } catch (RuntimeException e2) {
                    ((pia) this.f.b.a()).e("Close listeners failed", new Object[0]);
                    ((pdg) this.f.e.a()).a("MDH LevelDb close listeners failed", e2);
                }
            }
        }
    }
}
