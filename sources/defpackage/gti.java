package defpackage;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: gti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gti {
    private static final ParcelUuid f = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    public final List a;
    public final Map b;
    public final int c;
    public final String d;
    public final byte[] e;
    private final int g;
    private final SparseArray h;

    private gti(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.a = list;
        this.h = sparseArray;
        this.b = map;
        this.d = str;
        this.g = i;
        this.c = i2;
        this.e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d A[Catch:{ Exception -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.gti a(byte[] r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x00c5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = -1
            r8 = r0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0019:
            int r3 = r13.length     // Catch:{ Exception -> 0x0096 }
            if (r2 >= r3) goto L_0x0085
            int r3 = r2 + 1
            byte r2 = r13[r2]     // Catch:{ Exception -> 0x0096 }
            r9 = 255(0xff, float:3.57E-43)
            r2 = r2 & r9
            if (r2 == 0) goto L_0x0085
            int r2 = r2 + -1
            int r10 = r3 + 1
            byte r3 = r13[r3]     // Catch:{ Exception -> 0x0096 }
            r3 = r3 & r9
            r11 = 22
            r12 = 2
            if (r3 == r11) goto L_0x0070
            if (r3 == r9) goto L_0x0059
            switch(r3) {
                case 1: goto L_0x0054;
                case 2: goto L_0x004f;
                case 3: goto L_0x004f;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x0044;
                case 7: goto L_0x0044;
                case 8: goto L_0x003a;
                case 9: goto L_0x003a;
                case 10: goto L_0x0037;
                default: goto L_0x0036;
            }     // Catch:{ Exception -> 0x0096 }
        L_0x0036:
            goto L_0x0083
        L_0x0037:
            byte r7 = r13[r10]     // Catch:{ Exception -> 0x0096 }
            goto L_0x0083
        L_0x003a:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x0096 }
            byte[] r3 = a(r13, r10, r2)     // Catch:{ Exception -> 0x0096 }
            r8.<init>(r3)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0083
        L_0x0044:
            r3 = 16
            a(r13, r10, r2, r3, r1)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0083
        L_0x004a:
            r3 = 4
            a(r13, r10, r2, r3, r1)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0083
        L_0x004f:
            a(r13, r10, r2, r12, r1)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0083
        L_0x0054:
            byte r3 = r13[r10]     // Catch:{ Exception -> 0x0096 }
            r6 = r3 & 255(0xff, float:3.57E-43)
            goto L_0x0083
        L_0x0059:
            int r3 = r10 + 1
            byte r3 = r13[r3]     // Catch:{ Exception -> 0x0096 }
            r3 = r3 & r9
            int r3 = r3 << 8
            byte r11 = r13[r10]     // Catch:{ Exception -> 0x0096 }
            r9 = r9 & r11
            int r3 = r3 + r9
            int r9 = r10 + 2
            int r11 = r2 + -2
            byte[] r9 = a(r13, r9, r11)     // Catch:{ Exception -> 0x0096 }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0083
        L_0x0070:
            byte[] r3 = a(r13, r10, r12)     // Catch:{ Exception -> 0x0096 }
            android.os.ParcelUuid r3 = b(r3)     // Catch:{ Exception -> 0x0096 }
            int r9 = r10 + 2
            int r11 = r2 + -2
            byte[] r9 = a(r13, r9, r11)     // Catch:{ Exception -> 0x0096 }
            r5.put(r3, r9)     // Catch:{ Exception -> 0x0096 }
        L_0x0083:
            int r2 = r2 + r10
            goto L_0x0019
        L_0x0085:
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0096 }
            if (r2 != 0) goto L_0x008d
            r3 = r1
            goto L_0x008e
        L_0x008d:
            r3 = r0
        L_0x008e:
            gti r0 = new gti     // Catch:{ Exception -> 0x0096 }
            r2 = r0
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0096 }
            return r0
        L_0x0096:
            r0 = move-exception
            java.lang.String r1 = java.util.Arrays.toString(r13)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unable to parse scan record: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x00ad
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r1 = r2.concat(r1)
        L_0x00b1:
            java.lang.String r2 = "BleRecord"
            android.util.Log.w(r2, r1, r0)
            gti r0 = new gti
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = -1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            r3 = r0
            r10 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gti.a(byte[]):gti");
    }

    private static ParcelUuid b(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("uuidBytes length invalid - ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length != 2) {
                j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16)) + ((long) ((bArr[3] & 255) << 24));
            } else {
                j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
            }
            return new ParcelUuid(new UUID(f.getUuid().getMostSignificantBits() + (j << 32), f.getUuid().getLeastSignificantBits()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gti) {
            return Arrays.equals(this.e, ((gti) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e);
    }

    public final String toString() {
        String str;
        int i = this.g;
        String valueOf = String.valueOf(this.a);
        SparseArray sparseArray = this.h;
        String str2 = "{}";
        if (sparseArray == null) {
            str = "null";
        } else if (sparseArray.size() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sb.append(sparseArray.keyAt(i2));
                sb.append("=");
                sb.append(Arrays.toString((byte[]) sparseArray.valueAt(i2)));
            }
            sb.append('}');
            str = sb.toString();
        } else {
            str = str2;
        }
        Map map = this.b;
        if (map == null) {
            str2 = "null";
        } else if (!map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('{');
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Object key = ((Map.Entry) it.next()).getKey();
                sb2.append(key);
                sb2.append("=");
                sb2.append(Arrays.toString((byte[]) map.get(key)));
                if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            str2 = sb2.toString();
        }
        int i3 = this.c;
        String str3 = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(length + 133 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb3.append("BleRecord [advertiseFlags=");
        sb3.append(i);
        sb3.append(", serviceUuids=");
        sb3.append(valueOf);
        sb3.append(", manufacturerSpecificData=");
        sb3.append(str);
        sb3.append(", serviceData=");
        sb3.append(str2);
        sb3.append(", txPowerLevel=");
        sb3.append(i3);
        sb3.append(", deviceName=");
        sb3.append(str3);
        sb3.append("]");
        return sb3.toString();
    }

    private static void a(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(b(a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final byte[] a(int i) {
        SparseArray sparseArray = this.h;
        if (sparseArray != null) {
            return (byte[]) sparseArray.get(i);
        }
        return null;
    }

    public final byte[] a(ParcelUuid parcelUuid) {
        Map map;
        if (parcelUuid == null || (map = this.b) == null) {
            return null;
        }
        return (byte[]) map.get(parcelUuid);
    }
}
