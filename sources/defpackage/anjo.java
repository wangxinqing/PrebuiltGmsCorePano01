package defpackage;

import java.util.logging.Level;

/* renamed from: anjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjo {
    public static int a(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue < Level.INFO.intValue()) {
            return intValue < Level.CONFIG.intValue() ? 2 : 3;
        }
        return 4;
    }
}
