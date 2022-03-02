package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: aabr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabr {
    private final Set a = new ob();

    public final synchronized aabq a(qyl qyl) {
        for (aabq aabq : this.a) {
            if (qyl.a(aabq.r())) {
                return aabq;
            }
        }
        return null;
    }

    public final synchronized List b(qyl qyl) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (aabq aabq : this.a) {
            if (qyl.a(aabq.r())) {
                arrayList.add(aabq);
            }
        }
        return arrayList;
    }

    public final synchronized aabq c(qyl qyl) {
        Iterator it = this.a.iterator();
        if (qyl != null) {
            while (it.hasNext()) {
                aabq aabq = (aabq) it.next();
                if (qyl.a(aabq.r())) {
                    it.remove();
                    return aabq;
                }
            }
        }
        return null;
    }

    public final synchronized List d(qyl qyl) {
        ArrayList arrayList;
        arrayList = new ArrayList(((ob) this.a).b);
        if (qyl != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                aabq aabq = (aabq) it.next();
                if (qyl.a(aabq.r())) {
                    it.remove();
                    arrayList.add(aabq);
                }
            }
        }
        return arrayList;
    }

    public final synchronized Collection a() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final synchronized void a(aabq aabq, aabq aabq2) {
        if (aabq != null) {
            this.a.remove(aabq);
        }
        this.a.add(aabq2);
    }
}
