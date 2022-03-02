package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: amyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyu extends amyn implements Set {
    protected amyu() {
    }

    /* access modifiers changed from: protected */
    public abstract Set a();

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
