package defpackage;

import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.nearby.messages.Message;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: uzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzx {
    private static final ParcelUuid d = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    public final List a;
    public final Map b;
    public final byte[] c;
    private final int e;
    private final SparseArray f;
    private final int g;
    private final String h;

    private uzx(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.a = list;
        this.f = sparseArray;
        this.b = map;
        this.h = str;
        this.e = i;
        this.g = i2;
        this.c = bArr;
    }

    public static uzx a(Message message) {
        boolean a2 = message.a("__ble_record");
        String str = message.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("Message type '");
        sb.append(str);
        sb.append("' is not Message.MESSAGE_TYPE_BLE_RECORD.");
        iva.b(a2, sb.toString());
        return a(message.b);
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
            return new ParcelUuid(new UUID(d.getUuid().getMostSignificantBits() + (j << 32), d.getUuid().getLeastSignificantBits()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzx) {
            return Arrays.equals(this.c, ((uzx) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.e;
        String valueOf = String.valueOf(this.a);
        SparseArray sparseArray = this.f;
        StringBuilder sb = new StringBuilder();
        String str4 = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            str = str4;
        } else {
            sb.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb.append(keyAt);
                sb.append('=');
                if (bArr != null) {
                    str3 = jjp.d(bArr);
                } else {
                    str3 = null;
                }
                sb.append(str3);
            }
            sb.append('}');
            str = sb.toString();
        }
        Map map = this.b;
        StringBuilder sb2 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb2.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                if (bArr2 != null) {
                    str2 = jjp.d(bArr2);
                } else {
                    str2 = null;
                }
                sb2.append(str2);
                i2++;
            }
            sb2.append('}');
            str4 = sb2.toString();
        }
        int i4 = this.g;
        String str5 = this.h;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb3 = new StringBuilder(length + 139 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb3.append("BleRecord [mAdvertiseFlags=");
        sb3.append(i);
        sb3.append(", mServiceUuids=");
        sb3.append(valueOf);
        sb3.append(", mManufacturerSpecificData=");
        sb3.append(str);
        sb3.append(", mServiceData=");
        sb3.append(str4);
        sb3.append(", mTxPowerLevel=");
        sb3.append(i4);
        sb3.append(", mDeviceName=");
        sb3.append(str5);
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ Exception -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d A[Catch:{ Exception -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.uzx a(byte[] r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x00b7
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
            uzx r1 = new uzx     // Catch:{ Exception -> 0x0096 }
            r2 = r1
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0096 }
            return r1
        L_0x0096:
            r1 = move-exception
            java.lang.String r13 = java.util.Arrays.toString(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r2 = "Unable to parse scan record: "
            int r3 = r13.length()
            if (r3 != 0) goto L_0x00ad
            java.lang.String r13 = new java.lang.String
            r13.<init>(r2)
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r13 = r2.concat(r13)
        L_0x00b1:
            java.lang.String r2 = "BleRecord"
            android.util.Log.w(r2, r13, r1)
            return r0
        L_0x00b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzx.a(byte[]):uzx");
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
        return (byte[]) this.f.get(i);
    }
}
