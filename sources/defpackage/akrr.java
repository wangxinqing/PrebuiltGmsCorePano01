package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Collection;
import java.util.Set;

/* renamed from: akrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrr {
    final boolean a;
    public final Collection b;
    public final Collection c;
    public Status d = null;
    int e = 0;
    public Set f;
    Collection g;
    Collection h;

    public akrr(boolean z, Collection collection, Collection collection2) {
        this.a = z;
        this.b = collection;
        this.c = collection2;
    }

    public static akrr a(Collection collection, Collection collection2) {
        return new akrr(false, collection, collection2);
    }
}
