package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfx {
    public final bpw a;
    public final List b;
    public final List c;
    public final List d;
    public final bpw e;
    public final Map f;
    public final Set g;
    public final anax h;

    public hfx(bpw bpw, bpw bpw2, List list, List list2, List list3, Map map, Set set, anax anax) {
        this.a = bpw;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = Collections.unmodifiableList(list3);
        this.e = bpw2;
        this.f = Collections.unmodifiableMap(map);
        this.g = Collections.unmodifiableSet(set);
        this.h = anax;
    }

    public static hfx a(List list) {
        return new hfx(bmy.c, blj.c, Collections.emptyList(), list, Collections.emptyList(), Collections.emptyMap(), Collections.emptySet(), anfv.a);
    }
}
