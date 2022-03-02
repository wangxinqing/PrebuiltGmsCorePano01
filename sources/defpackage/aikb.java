package defpackage;

import android.app.PendingIntent;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: aikb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikb implements Iterable, jio {
    private static final Comparator d = new aika();
    public final aijv a;
    public final aijy b;
    public final ArrayList c;
    private final int e;

    public aikb(int i, aijy aijy, ArrayList arrayList, aijv aijv) {
        this.e = i;
        this.b = aijy;
        this.c = arrayList;
        this.a = aijv;
    }

    public final int a() {
        return this.c.size();
    }

    public final List b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.a.a(((aijt) arrayList.get(i)).j);
        }
        return new ArrayList(this.c);
    }

    public final String c() {
        return this.b.b;
    }

    public final Object clone() {
        int i = this.e;
        aijy aijy = this.b;
        return new aikb(i, new aijy(aijy.a, aijy.b), (ArrayList) this.c.clone(), this.a);
    }

    public final Iterator iterator() {
        return this.c.iterator();
    }

    public final int j() {
        return this.e;
    }

    public final String k() {
        return this.b.a;
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return aijx.a;
    }

    public final List a(PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            aijt aijt = (aijt) it.next();
            if (aijt.b.equals(pendingIntent)) {
                this.a.a(aijt.j);
                arrayList.add(aijt);
                it.remove();
            }
        }
        return arrayList;
    }

    public final List a(List list) {
        Iterator it = this.c.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            aijt aijt = (aijt) it.next();
            if (list.contains(aijt.a.a)) {
                this.a.a(aijt.j);
                arrayList.add(aijt);
                it.remove();
            }
        }
        return arrayList;
    }

    public final void a(aijt aijt) {
        int binarySearch = Collections.binarySearch(this.c, aijt, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.c.add(binarySearch, aijt);
        this.a.a(aijt.j, aijt);
    }

    public final void a(PrintWriter printWriter) {
        printWriter.print("Package: ");
        printWriter.print(this.b.a);
        String str = this.b.b;
        if (str != null && !str.isEmpty()) {
            String valueOf = String.valueOf(this.b.b);
            printWriter.print(valueOf.length() == 0 ? new String("  Tag: ") : "  Tag: ".concat(valueOf));
        }
        printWriter.print(", count: ");
        printWriter.print(a());
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            printWriter.print("\n    ");
            printWriter.print(((aijt) arrayList.get(i)).toString());
        }
    }
}
