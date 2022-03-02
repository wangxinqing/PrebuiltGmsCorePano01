package defpackage;

import java.util.Set;

/* renamed from: aney  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aney extends anes {
    public final aneu a;

    public aney(aneu aneu) {
        amrl.a((Object) aneu);
        this.a = aneu;
    }

    public final Set a() {
        return new anex(this);
    }

    public final void clear() {
        this.a.d();
    }

    public final boolean containsKey(Object obj) {
        return this.a.d(obj);
    }

    public final boolean isEmpty() {
        return ((ancp) this.a).a == null;
    }

    public final Set keySet() {
        return this.a.m();
    }

    public final int size() {
        return this.a.m().size();
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return ((ancp) this.a).c(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (containsKey(obj)) {
            return ((ancp) this.a).b(obj);
        }
        return null;
    }
}
