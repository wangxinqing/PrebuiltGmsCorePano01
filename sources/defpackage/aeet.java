package defpackage;

import java.util.UUID;

/* renamed from: aeet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeet {
    public static final UUID a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    public static UUID a(short s) {
        return new UUID(((((long) s) << 32) & 281470681743360L) | a.getMostSignificantBits(), a.getLeastSignificantBits());
    }
}
