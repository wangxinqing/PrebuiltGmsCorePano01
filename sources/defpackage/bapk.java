package defpackage;

/* renamed from: bapk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bapk implements bapr, bapq, bapt {
    public long a() {
        throw null;
    }

    public void a(long j) {
        throw null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(((Long) obj).longValue());
    }

    public long b() {
        throw null;
    }

    public void b(long j) {
        throw null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        a(((Long) obj).longValue());
    }

    protected bapk() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object previous() {
        return Long.valueOf(b());
    }
}
