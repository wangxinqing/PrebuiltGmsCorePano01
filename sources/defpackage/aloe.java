package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aloe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aloe {
    public final Map a = new HashMap();
    public kem b;

    public aloe(alov alov, Iterable iterable) {
        if (alov != null) {
            alov.a(alxi.class, new aloc(this));
            alov.a(alxj.class, new alod(this));
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            alxk alxk = (alxk) it.next();
            this.a.put(alxk.a, alxk);
        }
    }

    public final Collection a() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.a.values());
        }
        return arrayList;
    }
}
