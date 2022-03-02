package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: alse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alse {
    public static final alse a = new alse(Collections.emptyList(), Collections.emptyList(), Collections.emptySet(), (amiw) null, alsw.a, (amiw) null, (alsh) null);
    public final List b;
    public final Collection c;
    public final Set d;
    public final alsw e;
    public final amiw f;
    public final amiw g;
    public final alsh h;

    public alse(List list, Collection collection, Set set, amiw amiw, alsw alsw, amiw amiw2, alsh alsh) {
        this.b = list;
        this.c = collection;
        this.d = set;
        this.e = alsw;
        this.f = amiw;
        this.g = amiw2;
        this.h = alsh;
    }

    public static alse a(Set set, amiw amiw) {
        return new alse(Collections.emptyList(), Collections.emptyList(), set, (amiw) null, alsw.a, amiw, (alsh) null);
    }
}
