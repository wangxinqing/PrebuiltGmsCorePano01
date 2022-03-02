package defpackage;

import java.util.Iterator;

/* renamed from: anan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anan extends amzn {
    public final anaf a;

    public anan(anaf anaf) {
        this.a = anaf;
    }

    /* renamed from: a */
    public final anhj iterator() {
        return new anak(this);
    }

    public final boolean contains(Object obj) {
        return obj != null && ance.a((Iterator) iterator(), obj);
    }

    public final amzy e() {
        return new anal(this.a.entrySet().e());
    }

    public final boolean f() {
        throw null;
    }

    public final int size() {
        return this.a.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anam(this.a);
    }
}
