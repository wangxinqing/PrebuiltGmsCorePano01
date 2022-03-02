package defpackage;

import java.util.UUID;

/* renamed from: amkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amkg extends amjz {
    private final amkv a;

    public amkg(String str, amkw amkw, amkv amkv) {
        super(str, amkw);
        amrl.a(amkv.c);
        this.a = amkv;
    }

    public final amks a(amkt amkt) {
        return amkv.a(amkt, this.a, amlw.a);
    }

    public amkg(String str, UUID uuid, amkv amkv) {
        super(str, uuid);
        amrl.a(amkv.c);
        this.a = amkv;
    }
}
