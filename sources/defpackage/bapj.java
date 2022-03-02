package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: bapj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bapj extends AbstractCollection implements Collection, Iterable {
    protected bapj() {
    }

    /* renamed from: a */
    public abstract bapr iterator();

    public boolean a(long j) {
        throw null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return a(((Long) obj).longValue());
    }

    public boolean b(long j) {
        throw null;
    }

    public boolean c(long j) {
        throw null;
    }

    @Deprecated
    public final boolean contains(Object obj) {
        if (obj != null) {
            return b(((Long) obj).longValue());
        }
        return false;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        if (obj != null) {
            return c(((Long) obj).longValue());
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        bapr a = iterator();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(a.a()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
