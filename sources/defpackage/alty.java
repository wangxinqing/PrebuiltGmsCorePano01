package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: alty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alty {
    public final boolean a;
    private final List b;
    private final Deque c;

    public alty(boolean z) {
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.push(Collections.emptyList());
        this.a = z;
        this.b = z ? new ArrayList() : null;
    }

    public final List a() {
        return this.a ? Collections.unmodifiableList(this.b) : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public final Collection b() {
        if (!this.a || this.b.isEmpty()) {
            return Collections.emptyList();
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            altj altj = (altj) list.get(i);
            altk altk = (altk) identityHashMap.get(altj.a);
            if (altk == null) {
                alsk alsk = altj.a;
                altk = new altk(alsk, altj.b, altj.c, alsk.h());
                identityHashMap.put(altj.a, altk);
            }
            altk.d.add(altj);
        }
        return Collections.unmodifiableCollection(identityHashMap.values());
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.c.pop();
    }

    public final List d() {
        return (List) this.c.peek();
    }

    public final void a(altj altj) {
        this.b.add(altj);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        List list = (List) this.c.peek();
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(str);
        this.c.push(Collections.unmodifiableList(arrayList));
    }
}
