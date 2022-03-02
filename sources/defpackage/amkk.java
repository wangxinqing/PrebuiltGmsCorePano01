package defpackage;

import java.util.UUID;

/* renamed from: amkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amkk extends amkg {
    private static final UUID a = UUID.randomUUID();

    private amkk(amkk amkk, String str, amkv amkv) {
        super(str, (amkw) amkk, amkv);
    }

    static amkw b(String str, amkv amkv) {
        return new amkk(str, a, amkv);
    }

    public final amkw a(String str, amkv amkv) {
        return new amkk(this, str, amkv);
    }

    public final void a(int i) {
    }

    public final void a(boolean z) {
    }

    public final boolean e() {
        return false;
    }

    private amkk(String str, UUID uuid, amkv amkv) {
        super(str, uuid, amkv);
    }
}
