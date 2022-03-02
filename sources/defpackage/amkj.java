package defpackage;

import java.util.UUID;

/* renamed from: amkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amkj extends amjz implements amkf {
    private final Exception a;

    public amkj(String str) {
        super(str, UUID.randomUUID());
        if (amkx.a()) {
            this.a = new amke();
        } else {
            this.a = amki.a;
        }
    }

    public final amks a(amkt amkt) {
        return amks.a(2);
    }

    public final void a(int i) {
    }

    public final void a(boolean z) {
    }

    public final Exception d() {
        return this.a;
    }

    public final boolean e() {
        return false;
    }

    public final amkw a(String str, amkv amkv) {
        return new amkj(str, this);
    }

    public amkj(String str, amkf amkf) {
        super(str, (amkw) amkf);
        this.a = amkf.d();
    }
}
