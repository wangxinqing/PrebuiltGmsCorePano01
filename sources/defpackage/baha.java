package defpackage;

import java.util.HashSet;

/* renamed from: baha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class baha {
    private final HashSet a = new HashSet();

    public final void a(Object obj, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(obj);
            if (size == 0) {
                b();
            }
        } else if (this.a.remove(obj) && size == 1) {
            c();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
