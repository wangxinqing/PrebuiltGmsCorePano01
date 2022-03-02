package defpackage;

import java.util.Collection;
import java.util.Queue;

/* renamed from: amyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amyt extends amyn implements Queue {
    protected amyt() {
    }

    /* access modifiers changed from: protected */
    public abstract Queue a();

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    public final Object element() {
        return a().element();
    }

    public boolean offer(Object obj) {
        return a().offer(obj);
    }

    public final Object peek() {
        return a().peek();
    }

    public final Object poll() {
        return a().poll();
    }

    public final Object remove() {
        return a().remove();
    }
}
