package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: amiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amiq {
    public int a = 0;
    public List b = new ArrayList();
    public String c = "";

    public amiq() {
    }

    public final amir a() {
        amir amir = new amir(this);
        this.a = 0;
        this.b = new ArrayList();
        this.c = "";
        return amir;
    }

    public amiq(amir amir) {
        this.a = amir.b;
        this.b = new ArrayList(amir.c);
        this.c = amir.d;
    }

    public final void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.b.add((amjf) it.next());
        }
    }
}
