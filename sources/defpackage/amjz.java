package defpackage;

import java.util.UUID;

/* renamed from: amjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amjz implements amkw {
    private final amkw a;
    private final UUID b;
    private final String c;

    public amjz(String str, amkw amkw) {
        this.c = str;
        this.a = amkw;
        this.b = amkw.b();
    }

    public final amkw a() {
        return this.a;
    }

    public final UUID b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final void close() {
        amlv.a((amkw) this);
    }

    public final String toString() {
        return amlv.c((amkw) this);
    }

    public amjz(String str, UUID uuid) {
        this.c = str;
        this.a = null;
        this.b = uuid;
    }
}
