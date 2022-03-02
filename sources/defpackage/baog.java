package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: baog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baog {
    private static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] b = new String[64];
    private static final String[] c = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = String.valueOf(strArr2[i3]).concat("|PADDED");
        String[] strArr3 = b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr4 = b;
            String str = strArr4[i6];
            String str2 = strArr4[i5];
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            int i7 = i6 | i5;
            sb.append(str);
            sb.append('|');
            sb.append(str2);
            strArr4[i7] = sb.toString();
            String[] strArr5 = b;
            String str3 = strArr5[i6];
            String str4 = strArr5[i5];
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 8 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append('|');
            sb2.append(str4);
            sb2.append("|PADDED");
            strArr5[i7 | 8] = sb2.toString();
        }
        while (true) {
            String[] strArr6 = b;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    baog() {
    }

    static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String str2;
        String[] strArr = a;
        String format = b2 >= strArr.length ? String.format("0x%02x", new Object[]{Byte.valueOf(b2)}) : strArr[b2];
        if (b3 == 0) {
            str = "";
        } else {
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 != 1 ? c[b3] : "ACK";
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr2 = b;
                    String str3 = b3 >= strArr2.length ? c[b3] : strArr2[b3];
                    if (b2 == 5) {
                        if ((b3 & 4) != 0) {
                            str = str3.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (b2 == 0 && (b3 & 32) != 0) {
                        str = str3.replace("PRIORITY", "COMPRESSED");
                    }
                    str = str3;
                }
            }
            str = c[b3];
        }
        Object[] objArr = new Object[5];
        if (!z) {
            str2 = ">>";
        } else {
            str2 = "<<";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = str;
        return String.format("%s 0x%08x %5d %-13s %s", objArr);
    }
}
