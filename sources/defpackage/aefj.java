package defpackage;

import java.util.UUID;

/* renamed from: aefj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aefj {
    private static final UUID a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    public static UUID a(short s) {
        return new UUID(((((long) s) & 65535) << 32) | a.getMostSignificantBits(), a.getLeastSignificantBits());
    }

    public static boolean b(UUID uuid) {
        return uuid.getLeastSignificantBits() == a.getLeastSignificantBits() && (uuid.getMostSignificantBits() & -281470681743361L) == a.getMostSignificantBits();
    }

    public static short a(UUID uuid) {
        if (b(uuid)) {
            return (short) ((int) (uuid.getMostSignificantBits() >> 32));
        }
        String valueOf = String.valueOf(uuid);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Not a 16-bit Bluetooth UUID: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
