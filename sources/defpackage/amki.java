package defpackage;

import java.util.UUID;

/* renamed from: amki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amki extends amjz implements amkf {
    static final amke a = new amke();
    private final amke b;

    public amki() {
        super("", UUID.randomUUID());
        this.b = amkx.a() ? new amke() : a;
    }

    public final amks a(amkt amkt) {
        return amks.a(2);
    }

    public final void a(int i) {
    }

    public final void a(boolean z) {
    }

    public final /* bridge */ /* synthetic */ Exception d() {
        return this.b;
    }

    public final boolean e() {
        return false;
    }

    public final amkw a(String str, amkv amkv) {
        amlv.d();
        return new amkj(str, this);
    }
}
