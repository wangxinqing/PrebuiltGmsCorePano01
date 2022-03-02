package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: anaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anaj extends anbk {
    private final anaf a;

    public anaj(anaf anaf) {
        this.a = anaf;
    }

    public final anhj a() {
        return this.a.bn();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean f() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.a.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anai(this.a);
    }

    public final Object a(int i) {
        return ((Map.Entry) this.a.entrySet().e().get(i)).getKey();
    }
}
