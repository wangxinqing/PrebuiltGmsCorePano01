package defpackage;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

/* renamed from: atiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atiq {
    public static Location a(Intent intent) {
        return (Location) intent.getParcelableExtra("location");
    }

    public static String a(Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras.getString("networkLocationType");
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.location.Location r14, boolean r15) {
        /*
            if (r14 == 0) goto L_0x009e
            android.os.Bundle r0 = r14.getExtras()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 1
            r15 = r15 ^ r2
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0015:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            java.lang.String r9 = "verticalAccuracy"
            java.lang.String r10 = "newWifiScan"
            java.lang.String r11 = "wifiScan"
            java.lang.String r12 = "networkLocationType"
            java.lang.String r13 = "locationSubtype"
            switch(r5) {
                case -1999896571: goto L_0x0056;
                case -1769498147: goto L_0x004e;
                case -1340647630: goto L_0x0046;
                case -83901198: goto L_0x003e;
                case 1924902543: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x005e
        L_0x0036:
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x005e
            r4 = 2
            goto L_0x005f
        L_0x003e:
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x005e
            r4 = 0
            goto L_0x005f
        L_0x0046:
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L_0x005e
            r4 = 1
            goto L_0x005f
        L_0x004e:
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x005e
            r4 = 3
            goto L_0x005f
        L_0x0056:
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x005e
            r4 = 4
            goto L_0x005f
        L_0x005e:
            r4 = -1
        L_0x005f:
            if (r4 == 0) goto L_0x0090
            if (r4 == r2) goto L_0x0086
            if (r4 == r8) goto L_0x007c
            if (r4 == r7) goto L_0x0074
            if (r4 == r6) goto L_0x006a
            goto L_0x0015
        L_0x006a:
            if (r15 == 0) goto L_0x0015
            int r4 = r0.getInt(r13)
            r1.putInt(r13, r4)
            goto L_0x0015
        L_0x0074:
            java.lang.String r4 = r0.getString(r12)
            r1.putString(r12, r4)
            goto L_0x0015
        L_0x007c:
            if (r15 == 0) goto L_0x0015
            float r4 = r0.getFloat(r9)
            r1.putFloat(r9, r4)
            goto L_0x0015
        L_0x0086:
            if (r15 == 0) goto L_0x0015
            byte[] r4 = r0.getByteArray(r11)
            r1.putByteArray(r11, r4)
            goto L_0x0015
        L_0x0090:
            if (r15 == 0) goto L_0x0015
            byte[] r4 = r0.getByteArray(r10)
            r1.putByteArray(r10, r4)
            goto L_0x0015
        L_0x009b:
            r14.setExtras(r1)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atiq.a(android.location.Location, boolean):void");
    }
}
