package defpackage;

/* renamed from: arhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class arhc extends argu {
    final /* synthetic */ arhd b;

    public arhc(arhd arhd) {
        this.b = arhd;
    }

    /* renamed from: b */
    public abstract arhb iterator();

    public final void clear() {
        this.b.clear();
    }

    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ argv e() {
        throw null;
    }

    public final int size() {
        return this.b.size();
    }
}
