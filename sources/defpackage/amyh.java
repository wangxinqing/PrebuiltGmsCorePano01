package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: amyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amyh extends amyt implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;
    private final Queue b;

    private amyh(int i) {
        amrl.a(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    public static amyh a(int i) {
        return new amyh(i);
    }

    /* access modifiers changed from: protected */
    public final Queue a() {
        return this.b;
    }

    public final boolean add(Object obj) {
        amrl.a(obj);
        if (this.a != 0) {
            if (size() == this.a) {
                this.b.remove();
            }
            this.b.add(obj);
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.a) {
            return ance.a((Collection) this, collection.iterator());
        }
        clear();
        return anbs.a((Collection) this, anbs.b((Iterable) collection, size - this.a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Collection b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        return this.b;
    }

    public final boolean contains(Object obj) {
        Queue queue = this.b;
        amrl.a(obj);
        return queue.contains(obj);
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final boolean remove(Object obj) {
        Queue queue = this.b;
        amrl.a(obj);
        return queue.remove(obj);
    }
}
