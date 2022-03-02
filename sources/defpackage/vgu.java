package defpackage;

import java.util.Iterator;

/* renamed from: vgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgu {
    public static String a(avch avch) {
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 1) {
            return "audio (ultrasound)";
        }
        if (ordinal == 2) {
            return "bluetooth";
        }
        if (ordinal == 3) {
            return "ble";
        }
        if (ordinal == 4 || ordinal == 7) {
            return "wifi";
        }
        return ordinal != 8 ? "unknown" : "audio (audible)";
    }

    public static String a(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            avch avch = (avch) it.next();
            if (avch != null) {
                sb.append(a(avch));
                sb.append(",");
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
