package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: anez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anez extends amxb {
    private static final long serialVersionUID = 0;
    transient amsv c;

    public anez(Map map, amsv amsv) {
        super(map);
        amrl.a((Object) amsv);
        this.c = amsv;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (amsv) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.a);
    }

    public final /* bridge */ /* synthetic */ Collection a() {
        return (Set) this.c.a();
    }

    public final Set e() {
        Map map = this.a;
        if (map instanceof NavigableMap) {
            return new amwf(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new amwi(this, (SortedMap) map);
        }
        return new amwd(this, map);
    }

    public final Map j() {
        Map map = this.a;
        if (map instanceof NavigableMap) {
            return new amwe(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new amwh(this, (SortedMap) map);
        }
        return new amwa(this, map);
    }

    public final Collection a(Object obj, Collection collection) {
        if (collection instanceof NavigableSet) {
            return new amwn(this, obj, (NavigableSet) collection, (amwk) null);
        }
        if (collection instanceof SortedSet) {
            return new amwp(this, obj, (SortedSet) collection, (amwk) null);
        }
        return new amwo(this, obj, (Set) collection);
    }

    public final Collection a(Collection collection) {
        if (collection instanceof NavigableSet) {
            return angm.a((NavigableSet) collection);
        }
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        return Collections.unmodifiableSet((Set) collection);
    }
}
