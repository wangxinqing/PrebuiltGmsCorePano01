package defpackage;

import java.util.logging.Level;

/* renamed from: aryq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryq extends anij {
    public static final aryq a = new aryq(aniy.a("NearbyShared"));

    public aryq(anis anis) {
        super(anis);
    }

    public static String a(uaj uaj) {
        if (uaj == null) {
            return "StoredDiscoveryItem{}";
        }
        String str = uaj.g;
        String str2 = uaj.h;
        String str3 = uaj.e;
        int i = uaj.p;
        long j = uaj.l;
        long j2 = uaj.k;
        long j3 = uaj.D;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 156 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("StoredDiscoveryItem{");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", address=");
        sb.append(str3);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", first found=");
        sb.append(j);
        sb.append(", last found=");
        sb.append(j2);
        sb.append(", last lost=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final anih b(Level level) {
        return c(level) ? new aryp(this, level) : anij.c;
    }
}
