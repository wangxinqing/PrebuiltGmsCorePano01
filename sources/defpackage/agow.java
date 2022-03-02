package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agow implements agpc {
    private final agpc a;
    private final amsv b;
    private final Executor c;

    public agow(agpc agpc, amsv amsv, Executor executor) {
        this.a = agpc;
        this.b = amsv;
        this.c = executor;
    }

    private final aorr a(aorr aorr) {
        return agsv.a(aorr, this.b, this.c);
    }

    public final void close() {
        this.a.close();
    }

    public final aorr a() {
        return a(this.a.a());
    }

    public final aorr a(long j) {
        return a(this.a.a(j));
    }

    public final aorr a(agpb agpb, agoy agoy, Executor executor) {
        return a(this.a.a(agpb, agoy, executor));
    }

    public final aorr a(auay auay) {
        return a(this.a.a(auay));
    }
}
