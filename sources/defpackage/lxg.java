package defpackage;

import android.util.Log;

/* renamed from: lxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum lxg {
    ACTIVITY_RECOGNITION,
    BLUETOOTH,
    ANDROID_AUTO,
    DOCK,
    MANUAL,
    FORCE;
    
    private static final lxg[] g = null;

    static {
        g = values();
    }

    public static lxg a(int i) {
        if (i == 1) {
            return ANDROID_AUTO;
        }
        if (i == 2) {
            return DOCK;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("TriggerReason given (");
        sb.append(i);
        sb.append(") cannot be converted to TriggerSource");
        throw new IllegalArgumentException(sb.toString());
    }

    public static lxg b(int i) {
        try {
            return g[i];
        } catch (IndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid ordinal TriggerSource: ");
            sb.append(i);
            Log.e("CAR.DRIVINGMODE", sb.toString());
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Invalid ordinal TriggerSource: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString(), e);
        }
    }

    public final boolean a() {
        return this == ACTIVITY_RECOGNITION || this == BLUETOOTH;
    }
}
