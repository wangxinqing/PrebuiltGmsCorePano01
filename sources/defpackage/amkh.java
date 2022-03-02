package defpackage;

import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: amkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amkh {
    public final UUID a;
    private final AtomicLong b;

    public amkh() {
        UUID randomUUID = UUID.randomUUID();
        long nextLong = new SecureRandom().nextLong();
        this.a = randomUUID;
        this.b = new AtomicLong((nextLong ^ 25214903917L) & 281474976710655L);
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        long j;
        long j2;
        long j3;
        do {
            j = this.b.get();
            long j4 = ((j * 25214903917L) + 11) & 281474976710655L;
            j2 = ((25214903917L * j4) + 11) & 281474976710655L;
            j3 = (((long) ((int) (j4 >>> 16))) << 32) + ((long) ((int) (j2 >>> 16)));
        } while (!this.b.compareAndSet(j, j2));
        return j3;
    }
}
