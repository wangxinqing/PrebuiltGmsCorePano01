package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: trl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trl {
    private final Map a = new nz();

    /* access modifiers changed from: package-private */
    public final synchronized List a() {
        return amzy.a(this.a.values());
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(long j) {
        trk trk = (trk) this.a.remove(Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final synchronized trk a(long j) {
        return (trk) this.a.get(Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j, trk trk) {
        this.a.put(Long.valueOf(j), trk);
    }
}
