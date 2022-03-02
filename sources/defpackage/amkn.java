package defpackage;

import android.os.Build;
import com.google.android.cast.JGCastService;
import java.lang.ref.Reference;
import java.util.UUID;

/* renamed from: amkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amkn extends amkg {
    private final amlx a;
    private final amkm b;
    private final aekn c;
    private final int d;
    private final boolean e;
    private final boolean f;

    private amkn(amlx amlx, amkn amkn) {
        super(amlx.b, (amkw) amkn, amlx.d);
        this.a = amlx;
        this.b = amkn.b;
        this.c = amkn.c;
        this.d = amkn.d;
        this.f = amkn.f;
        this.e = amkn.e;
    }

    private final int d() {
        return ((int) (!this.e ? this.c.b() : this.c.c())) - this.d;
    }

    private final void f() {
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    public final amkw a(String str, amkv amkv) {
        amkm amkm = this.b;
        amlx amlx = new amlx(this.a, str, d(), amkv);
        while (true) {
            amlz amlz = (amlz) amkm;
            amlx amlx2 = (amlx) amlz.c.get();
            int i = amlx2.e + 1;
            if (i >= amlz.a.f) {
                amlx.a(-1, (amlx) null);
                synchronized (amkm) {
                    ((amlz) amkm).e++;
                    break;
                }
            }
            amlx.a(i, amlx2);
            if (amlz.c.compareAndSet(amlx2, amlx)) {
                break;
            }
        }
        return new amkn(amlx, this);
    }

    public final boolean e() {
        return this.f;
    }

    public amkn(amlx amlx, UUID uuid, amkm amkm, aekn aekn, long j, boolean z, boolean z2) {
        super(amlx.b, uuid, amlx.d);
        this.a = amlx;
        this.b = amkm;
        this.c = aekn;
        this.d = (int) j;
        this.f = z;
        this.e = z2;
    }

    public final void a(int i) {
        this.a.addAndGet(i);
        f();
    }

    public final void a(boolean z) {
        int i;
        int d2 = d();
        amlx amlx = this.a;
        int i2 = d2 - amlx.c;
        amrl.b(!amlx.a());
        if (!z) {
            i = 0;
        } else {
            i = JGCastService.FLAG_PRIVATE_DISPLAY;
        }
        amlx.g = i | Integer.MIN_VALUE | (i2 & 1073741823);
        f();
    }
}
