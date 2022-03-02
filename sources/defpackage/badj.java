package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: badj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badj implements baie {
    private final AtomicLong a = new AtomicLong();

    public final void a() {
        this.a.getAndAdd(1);
    }
}
