package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: ajml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajml {
    private static final anml i = anml.g.b();
    public final String a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final int e;
    public final String f;
    public final Long g;
    public boolean h = false;

    public ajml(String str, Long l, Integer num, Integer num2, int i2, Long l2, String str2) {
        this.a = str;
        this.b = l;
        this.c = num;
        this.d = num2;
        this.e = i2;
        this.g = l2;
        this.f = str2;
    }

    static long a(String str) {
        String valueOf = String.valueOf(str.replaceAll("\\:|-", ""));
        return Long.decode(valueOf.length() == 0 ? new String("0x") : "0x".concat(valueOf)).longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajml)) {
            return false;
        }
        ajml ajml = (ajml) obj;
        return atiu.a(ajml.a, this.a) && atiu.a(ajml.b, this.b) && atiu.a(ajml.c, this.c) && atiu.a(ajml.d, this.d) && atiu.a(Integer.valueOf(ajml.e), Integer.valueOf(this.e)) && atiu.a(ajml.g, this.g) && atiu.a(ajml.f, this.f) && atiu.a(Boolean.valueOf(ajml.h), Boolean.valueOf(this.h));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), this.g, this.f, Boolean.valueOf(this.h)});
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i2 = this.e;
        String valueOf4 = String.valueOf(this.g);
        String str2 = this.f;
        boolean z = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(valueOf3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(valueOf4);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    public static String a(ajml ajml) {
        String str;
        if (ajml == null || ajml.e != 2 || (str = ajml.a) == null) {
            return null;
        }
        try {
            return i.a(Arrays.copyOf(Base64.decode(str, 10), 10));
        } catch (IllegalArgumentException e2) {
            ajix.b("GCoreUlr", "Error when decoding beacon id ", (Throwable) e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x000b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(defpackage.gtu r17, java.util.List r18) {
        /*
            java.lang.String r1 = "GCoreUlr"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r18.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r3.next()
            com.google.android.gms.beacon.BleSighting r0 = (com.google.android.gms.beacon.BleSighting) r0
            gti r4 = r0.b
            if (r4 == 0) goto L_0x0131
            r6 = r17
            gtt r4 = r6.a(r4)     // Catch:{ RuntimeException -> 0x0127 }
            if (r4 != 0) goto L_0x0044
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0127 }
            int r4 = r4.length()     // Catch:{ RuntimeException -> 0x0127 }
            int r4 = r4 + 29
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0127 }
            r7.<init>(r4)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r4 = "Unable to decode BLE beacon: "
            r7.append(r4)     // Catch:{ RuntimeException -> 0x0127 }
            r7.append(r0)     // Catch:{ RuntimeException -> 0x0127 }
            r7.toString()     // Catch:{ RuntimeException -> 0x0127 }
            r5 = 0
            goto L_0x0132
        L_0x0044:
            boolean r7 = r4.c()     // Catch:{ RuntimeException -> 0x0127 }
            r8 = 10
            if (r7 == 0) goto L_0x00e5
            gti r7 = r0.b     // Catch:{ RuntimeException -> 0x0127 }
            int r14 = r4.a()     // Catch:{ RuntimeException -> 0x0127 }
            r9 = 1
            if (r14 == r9) goto L_0x0067
            r9 = 2
            if (r14 == r9) goto L_0x0062
            r9 = 3
            if (r14 == r9) goto L_0x005d
            goto L_0x00d1
        L_0x005d:
            boolean r9 = defpackage.aztb.y()     // Catch:{ RuntimeException -> 0x0127 }
            goto L_0x006b
        L_0x0062:
            boolean r9 = defpackage.aztb.x()     // Catch:{ RuntimeException -> 0x0127 }
            goto L_0x006b
        L_0x0067:
            boolean r9 = defpackage.aztb.w()     // Catch:{ RuntimeException -> 0x0127 }
        L_0x006b:
            if (r9 == 0) goto L_0x00d1
            byte[] r9 = r4.a((defpackage.gti) r7)     // Catch:{ RuntimeException -> 0x0127 }
            if (r9 == 0) goto L_0x00a7
            java.lang.String r10 = android.util.Base64.encodeToString(r9, r8)     // Catch:{ RuntimeException -> 0x0127 }
            android.bluetooth.BluetoothDevice r8 = r0.a     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r8 = r8.getAddress()     // Catch:{ RuntimeException -> 0x0127 }
            long r8 = a((java.lang.String) r8)     // Catch:{ RuntimeException -> 0x0127 }
            int r11 = r0.d     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.Integer r13 = r4.b(r7)     // Catch:{ RuntimeException -> 0x0127 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ RuntimeException -> 0x0127 }
            long r5 = r0.e     // Catch:{ RuntimeException -> 0x0127 }
            long r4 = r4.toMillis(r5)     // Catch:{ RuntimeException -> 0x0127 }
            ajml r0 = new ajml     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.Long r15 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x0127 }
            r16 = 0
            r9 = r0
            r11 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x0127 }
            r5 = r0
            goto L_0x0132
        L_0x00a7:
            java.lang.Class r0 = r4.getClass()     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0127 }
            int r4 = r4.length()     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0127 }
            int r4 = r4 + 39
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r4 = "Beacon decoder has returned a null ID: "
            r5.append(r4)     // Catch:{ RuntimeException -> 0x0127 }
            r5.append(r0)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r0 = r5.toString()     // Catch:{ RuntimeException -> 0x0127 }
            r4 = 13
            defpackage.ajix.c(r1, r4, r0)     // Catch:{ RuntimeException -> 0x0127 }
            r5 = 0
            goto L_0x0132
        L_0x00d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0127 }
            r4 = 54
            r0.<init>(r4)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r4 = "Unexpected beacon type not allowed in ULR: "
            r0.append(r4)     // Catch:{ RuntimeException -> 0x0127 }
            r0.append(r14)     // Catch:{ RuntimeException -> 0x0127 }
            r0.toString()     // Catch:{ RuntimeException -> 0x0127 }
            r5 = 0
            goto L_0x0132
        L_0x00e5:
            aztb r5 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x0127 }
            aztc r5 = r5.a()     // Catch:{ RuntimeException -> 0x0127 }
            boolean r5 = r5.aO()     // Catch:{ RuntimeException -> 0x0127 }
            if (r5 == 0) goto L_0x0131
            boolean r5 = r4 instanceof defpackage.gty     // Catch:{ RuntimeException -> 0x0127 }
            if (r5 == 0) goto L_0x0131
            gty r4 = (defpackage.gty) r4     // Catch:{ RuntimeException -> 0x0127 }
            android.bluetooth.BluetoothDevice r5 = r0.a     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r5 = r5.getAddress()     // Catch:{ RuntimeException -> 0x0127 }
            long r5 = a((java.lang.String) r5)     // Catch:{ RuntimeException -> 0x0127 }
            gti r7 = r0.b     // Catch:{ RuntimeException -> 0x0127 }
            byte[] r4 = r4.c(r7)     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.String r16 = android.util.Base64.encodeToString(r4, r8)     // Catch:{ RuntimeException -> 0x0127 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ RuntimeException -> 0x0127 }
            long r7 = r0.e     // Catch:{ RuntimeException -> 0x0127 }
            long r7 = r4.toMillis(r7)     // Catch:{ RuntimeException -> 0x0127 }
            ajml r0 = new ajml     // Catch:{ RuntimeException -> 0x0127 }
            r10 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ RuntimeException -> 0x0127 }
            r12 = 0
            r13 = 0
            r14 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r7)     // Catch:{ RuntimeException -> 0x0127 }
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ RuntimeException -> 0x0127 }
            r5 = r0
            goto L_0x0132
        L_0x0127:
            r0 = move-exception
            r4 = 11
            java.lang.String r5 = "Unexpected exception thrown when parsing a BLE scan record"
            defpackage.ajix.b(r1, r4, r5, r0)
            r5 = 0
            goto L_0x0132
        L_0x0131:
            r5 = 0
        L_0x0132:
            if (r5 == 0) goto L_0x000b
            r2.add(r5)
            goto L_0x000b
        L_0x0139:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajml.a(gtu, java.util.List):java.util.ArrayList");
    }
}
