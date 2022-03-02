package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: svq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svq extends FutureTask implements Comparable {
    final boolean a;
    final /* synthetic */ svs b;
    private final long c;
    private final String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public svq(svs svs, Runnable runnable, String str) {
        super(runnable, (Object) null);
        this.b = svs;
        iva.a((Object) str);
        long andIncrement = svs.f.getAndIncrement();
        this.c = andIncrement;
        this.d = str;
        this.a = false;
        if (andIncrement == Long.MAX_VALUE) {
            svs.E().c.a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        svq svq = (svq) obj;
        boolean z = this.a;
        if (z != svq.a) {
            return !z ? 1 : -1;
        }
        long j = this.c;
        long j2 = svq.c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.b.E().d.a("Two tasks share the same index. index", Long.valueOf(this.c));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.b.E().c.a(this.d, th);
        if (th instanceof svo) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public svq(svs svs, Callable callable, boolean z, String str) {
        super(callable);
        this.b = svs;
        iva.a((Object) str);
        long andIncrement = svs.f.getAndIncrement();
        this.c = andIncrement;
        this.d = str;
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            svs.E().c.a("Tasks index overflow");
        }
    }
}
