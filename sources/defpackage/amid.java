package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: amid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amid {
    public List a = new ArrayList();
    public String b = "";
    public boolean c = false;

    public final int a() {
        return this.a.size();
    }

    public final amie b() {
        amie amie = new amie(this);
        this.a = new ArrayList();
        this.b = "";
        this.c = false;
        return amie;
    }

    public final void a(amiw amiw) {
        this.a.add(amiw);
    }

    public final void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.add((amiw) it.next());
        }
    }
}
