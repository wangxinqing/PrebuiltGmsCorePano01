package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: anau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anau extends amxd implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient anaf b;
    final transient int c;

    public anau(anaf anaf, int i) {
        this.b = anaf;
        this.c = i;
    }

    public static anaq a() {
        return new anaq();
    }

    @Deprecated
    public final void a(Object obj, Iterable iterable) {
        throw null;
    }

    public final anax b() {
        return this.b.keySet();
    }

    public final int c() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ Collection c(Object obj) {
        throw null;
    }

    @Deprecated
    public final boolean c(Object obj, Object obj2) {
        throw null;
    }

    @Deprecated
    public final void d() {
        throw null;
    }

    public final boolean d(Object obj) {
        throw null;
    }

    public final Set e() {
        throw new AssertionError("unreachable");
    }

    public final /* bridge */ /* synthetic */ Collection f() {
        return new anat(this);
    }

    public abstract amzn g(Object obj);

    public final /* bridge */ /* synthetic */ Collection h() {
        return new anar(this);
    }

    public final /* bridge */ /* synthetic */ Iterator i() {
        throw null;
    }

    public final Map j() {
        throw new AssertionError("should never be called");
    }

    public final /* bridge */ /* synthetic */ Collection l() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Set m() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Collection n() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Map o() {
        return this.b;
    }

    @Deprecated
    public final boolean a(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final boolean f(Object obj) {
        return obj != null && super.f(obj);
    }
}
