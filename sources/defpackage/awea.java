package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: awea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awea implements awdt {
    public static final awdt a = awdu.a(Collections.emptySet());
    private final List b;
    private final List c;

    public awea(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public static awdz a(int i, int i2) {
        return new awdz(i, i2);
    }

    /* renamed from: b */
    public final Set a() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((bapu) this.c.get(i)).a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(awdq.c(size));
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object a2 = ((bapu) this.b.get(i2)).a();
            awdx.a(a2);
            hashSet.add(a2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                awdx.a(next);
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
