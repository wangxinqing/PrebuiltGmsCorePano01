package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: annu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class annu implements aoqb {
    final /* synthetic */ long a;
    final /* synthetic */ TimeUnit b;
    final /* synthetic */ anoa c;

    public annu(anoa anoa, long j, TimeUnit timeUnit) {
        this.c = anoa;
        this.a = j;
        this.b = timeUnit;
    }

    public final aorr a(Object obj) {
        return this.c.g.a((Callable) new annt(), this.a, this.b);
    }
}
