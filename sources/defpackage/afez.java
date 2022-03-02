package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: afez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afez implements aoqb {
    private final affb a;
    private final long b;
    private final boolean c;
    private final affr d;
    private final Long e;
    private final boolean f;
    private final boolean g;

    public afez(affb affb, long j, boolean z, affr affr, Long l, boolean z2, boolean z3) {
        this.a = affb;
        this.b = j;
        this.c = z;
        this.d = affr;
        this.e = l;
        this.f = z2;
        this.g = z3;
    }

    public final aorr a(Object obj) {
        aomx aomx;
        affb affb = this.a;
        long j = this.b;
        boolean z = this.c;
        affr affr = this.d;
        Long l = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        Exception exc = (Exception) obj;
        synchronized (affb.k.j) {
            aucd o = aokp.o.o();
            if (!(exc instanceof affu)) {
                aomx = !(exc instanceof CancellationException) ? !(exc instanceof InterruptedException) ? aomx.EXECUTION_ERROR : aomx.INTERRUPTED : aomx.CANCELLED;
            } else {
                aomx = affb.a((affu) exc);
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokp aokp = (aokp) o.b;
            aokp.c = aomx.a();
            aokp.a |= 2;
            affb.a(j, z, affr, l, z2, z3, o);
        }
        throw exc;
    }
}
