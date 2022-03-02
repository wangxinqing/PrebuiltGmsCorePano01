package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: bza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bza extends bze {
    public final TreeSet a;

    private bza(TreeSet treeSet) {
        super(Long.MAX_VALUE);
        this.a = treeSet;
    }

    public static bza a() {
        return new bza(new TreeSet());
    }

    public static bza b() {
        bza a2 = a();
        a2.c();
        return a2;
    }

    public final void c() {
        this.a.clear();
        this.a.add(bzc.a(0, Long.MAX_VALUE));
    }

    public final boolean d() {
        return jir.a((Collection) this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            bzc bzc = (bzc) it.next();
            sb.append("[");
            sb.append(bzc.a);
            sb.append(",");
            sb.append(bzc.b);
            sb.append("],");
        }
        return sb.toString();
    }

    public final void a(bza bza) {
        for (bzc b : bza.a) {
            b(b, this.a);
        }
    }

    public final void a(bzc bzc) {
        bzc a2 = bzc.a(0, bzc.a);
        bzc a3 = bzc.a(bzc.b, Long.MAX_VALUE);
        a(a2, (Set) this.a);
        a(a3, (Set) this.a);
    }
}
