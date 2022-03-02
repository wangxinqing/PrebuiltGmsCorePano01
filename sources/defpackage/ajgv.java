package defpackage;

import android.os.Message;
import java.util.Random;

/* renamed from: ajgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgv extends ajgs {
    private final long a;
    private final long b;
    private final Random c;

    public ajgv(long j, long j2, Random random) {
        super("Delay");
        this.a = j;
        this.b = j2;
        this.c = random;
    }

    public final void a() {
        this.h.b.a(15, this.a + (this.c.nextLong() % (this.b - this.a)));
    }

    public final void b() {
        this.h.b.removeMessages(15);
    }

    public final boolean a(Message message) {
        if (message.what != 15) {
            return false;
        }
        e();
        return true;
    }
}
