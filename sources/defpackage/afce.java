package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: afce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afce implements afcw {
    public static final auay a = auay.b;
    private static final AtomicLong e = new AtomicLong(0);
    public final awdn b;
    public final auef c;
    public final afch d;
    private final int f;
    private final aeri g;

    public afce(awdn awdn, int i, auef auef, afch afch, aeri aeri) {
        this.b = awdn;
        this.f = i;
        this.c = auef;
        this.d = afch;
        this.g = aeri;
    }

    static auay a(auay auay) {
        ByteBuffer allocate = ByteBuffer.allocate(auay.a() + 1);
        auay.a(allocate);
        allocate.put((byte) 0);
        allocate.flip();
        return auay.b(allocate);
    }

    public final afcd b(afdo afdo) {
        return a(afdo, Long.MAX_VALUE);
    }

    public final void close() {
        this.d.close();
    }

    public final afcd a(afdo afdo, long j) {
        afcd afcd;
        auay auay;
        if (this.g.C()) {
            afcc afcc = new afcc(this, j);
            this.d.a(afdo, a, (afcg) afcc);
            amzy a2 = afcc.a.a();
            auay auay2 = afcc.b;
            afcd = new afcd(this, a2, auay2 != null ? a(auay2) : a);
        } else {
            Collection b2 = this.d.b(afdo, a);
            amzt j2 = amzy.j();
            Iterator it = b2.iterator();
            auay auay3 = null;
            long j3 = j;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                try {
                    audx audx = (audx) this.c.a((auay) pair.second);
                    if (j3 < ((long) audx.p())) {
                        ((pia) this.b.a()).c("Size limit(%d) exceeded, stopping adding rest of changes.", Long.valueOf(j));
                        break;
                    }
                    j3 -= (long) audx.p();
                    auay3 = (auay) pair.first;
                    j2.c(audx);
                } catch (auda e2) {
                    ((pia) this.b.a()).e("Skipping unparsable Change proto:", new Object[0]);
                    auay3 = (auay) pair.first;
                }
            }
            amzy a3 = j2.a();
            if (auay3 != null) {
                auay = a(auay3);
            } else {
                auay = a;
            }
            afcd = new afcd(this, a3, auay);
        }
        return afcd;
    }

    public final void a(afdp afdp, audx audx) {
        amrl.a((Object) audx);
        int i = Build.VERSION.SDK_INT;
        this.d.a(afdp, auay.a(ByteBuffer.allocate(24).putLong((long) this.f).putLong(SystemClock.elapsedRealtimeNanos()).putLong(e.getAndIncrement()).array()), audx.au());
    }

    public final boolean a(afdo afdo) {
        return this.d.a(afdo);
    }
}
