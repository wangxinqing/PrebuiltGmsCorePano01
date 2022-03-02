package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: amxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amxb extends amwq implements aneu {
    private static final long serialVersionUID = 7431625294878419160L;

    protected amxb(Map map) {
        super(map);
    }

    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    /* renamed from: p */
    public final Set l() {
        return (Set) super.l();
    }

    public Collection a(Object obj, Collection collection) {
        return new amwo(this, obj, (Set) collection);
    }

    public final /* bridge */ /* synthetic */ Collection b() {
        return Collections.emptySet();
    }

    public Collection a(Collection collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* renamed from: b */
    public final Set e(Object obj) {
        return (Set) super.e(obj);
    }

    /* renamed from: a */
    public final Set c(Object obj) {
        return (Set) super.c(obj);
    }

    public final void b(Object obj, Iterable iterable) {
        Collection collection;
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            collection = e(obj);
        } else {
            Collection collection2 = (Collection) this.a.get(obj);
            if (collection2 == null) {
                collection2 = a();
                this.a.put(obj, collection2);
            }
            Collection a = a();
            a.addAll(collection2);
            this.b -= collection2.size();
            collection2.clear();
            while (it.hasNext()) {
                if (collection2.add(it.next())) {
                    this.b++;
                }
            }
            collection = a(a);
        }
        Set set = (Set) collection;
    }
}
