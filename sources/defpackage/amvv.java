package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: amvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amvv extends amwq implements ancq {
    private static final long serialVersionUID = 6588350623831699109L;

    protected amvv(Map map) {
        super(map);
    }

    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    public final Collection a(Object obj, Collection collection) {
        return a(obj, (List) collection, (amwk) null);
    }

    public final /* bridge */ /* synthetic */ Collection b() {
        return Collections.emptyList();
    }

    public final Collection a(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public final List b(Object obj) {
        return (List) super.e(obj);
    }

    /* renamed from: a */
    public final List c(Object obj) {
        return (List) super.c(obj);
    }
}
