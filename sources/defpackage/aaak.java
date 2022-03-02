package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: aaak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaak {
    private static final char[] a = "0123456789ABCDEF".toCharArray();
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final String f;
    private final String g;

    static {
        aaak.class.getSimpleName();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aaak(java.lang.String r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "UTF-8"
            r18.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            r3 = -1
            if (r0 != 0) goto L_0x01e7
            java.lang.String r0 = "^\\s+"
            java.lang.String r5 = ""
            r6 = r19
            java.lang.String r0 = r6.replaceAll(r0, r5)
            java.lang.String r6 = "\\s+$"
            java.lang.String r0 = r0.replaceAll(r6, r5)
            java.lang.String r6 = "[\\t\\n\\r]"
            java.lang.String r0 = r0.replaceAll(r6, r5)
            r6 = 35
            int r6 = r0.indexOf(r6)
            r7 = 0
            if (r6 == r3) goto L_0x0031
            java.lang.String r0 = r0.substring(r7, r6)
        L_0x0031:
            aaaj r6 = new aaaj
            r6.<init>(r0)
            boolean r8 = r6.b()
            if (r8 == 0) goto L_0x01d8
            java.lang.String r8 = r6.a()
            r1.c = r8
            java.lang.Integer r6 = r6.a
            int r6 = r6.intValue()
            r1.e = r6
            java.lang.String r6 = r1.c
            java.lang.String r8 = ":"
            if (r6 == 0) goto L_0x006e
            int r9 = r6.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 2
            r10.<init>(r9)
            java.lang.String r9 = "^"
            r10.append(r9)
            r10.append(r6)
            r10.append(r8)
            java.lang.String r6 = r10.toString()
            java.lang.String r0 = r0.replaceAll(r6, r5)
        L_0x006e:
            java.lang.String r6 = "^/+"
            java.lang.String r0 = r0.replaceAll(r6, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            r9 = 1
            if (r6 != 0) goto L_0x0122
            r6 = r0
            r0 = 0
            r10 = 0
        L_0x007f:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0087
            goto L_0x0123
        L_0x0087:
            r0 = 1024(0x400, float:1.435E-42)
            if (r10 >= r0) goto L_0x0123
            java.lang.String r0 = "\\x"
            java.lang.String r11 = "%"
            java.lang.String r0 = r6.replace(r0, r11)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream
            int r12 = r0.length
            r11.<init>(r12)
            r12 = 0
        L_0x009e:
            int r13 = r0.length
            if (r12 >= r13) goto L_0x010b
            byte r14 = r0[r12]
            r15 = r14 & 255(0xff, float:3.57E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r15 >= r4) goto L_0x0104
            int r4 = r12 + 2
            if (r4 >= r13) goto L_0x00f4
            r13 = 37
            if (r15 != r13) goto L_0x00f4
            int r13 = r12 + 1
            byte r13 = r0[r13]
            byte r15 = r0[r4]
            r13 = r13 & 255(0xff, float:3.57E-43)
            char r13 = (char) r13
            boolean r16 = a((char) r13)
            if (r16 == 0) goto L_0x00f4
            r15 = r15 & 255(0xff, float:3.57E-43)
            char r15 = (char) r15
            boolean r16 = a((char) r15)
            if (r16 == 0) goto L_0x00f4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            r13 = 16
            int r7 = java.lang.Integer.parseInt(r7, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            r3.append(r15)
            int r7 = r7 * 16
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3, r13)
            int r7 = r7 + r3
            byte r3 = (byte) r7
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            goto L_0x00f5
        L_0x00f4:
            r3 = 0
        L_0x00f5:
            if (r3 == 0) goto L_0x0100
            byte r3 = r3.byteValue()
            r11.write(r3)
            r12 = r4
            goto L_0x0107
        L_0x0100:
            r11.write(r14)
            goto L_0x0107
        L_0x0104:
            r11.write(r14)
        L_0x0107:
            int r12 = r12 + r9
            r3 = -1
            r7 = 0
            goto L_0x009e
        L_0x010b:
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            byte[] r3 = r11.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            r0.<init>(r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            goto L_0x0117
        L_0x0115:
            r0 = move-exception
            r0 = 0
        L_0x0117:
            int r10 = r10 + 1
            r3 = -1
            r7 = 0
            r17 = r6
            r6 = r0
            r0 = r17
            goto L_0x007f
        L_0x0122:
            r6 = 0
        L_0x0123:
            r0 = 63
            int r0 = r6.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x0140
            int r2 = r0 + 1
            int r3 = r6.length()
            if (r2 < r3) goto L_0x0136
            r2 = r5
            goto L_0x013a
        L_0x0136:
            java.lang.String r2 = r6.substring(r2)
        L_0x013a:
            r3 = 0
            java.lang.String r6 = r6.substring(r3, r0)
            goto L_0x0141
        L_0x0140:
            r2 = 0
        L_0x0141:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x01a8
            r0 = 47
            int r0 = r6.indexOf(r0)
            r3 = -1
            if (r0 == r3) goto L_0x0156
            r4 = 0
            java.lang.String r0 = r6.substring(r4, r0)
            goto L_0x0157
        L_0x0156:
            r0 = r6
        L_0x0157:
            r4 = 64
            int r4 = r0.indexOf(r4)
            if (r4 == r3) goto L_0x0164
            int r4 = r4 + r9
            java.lang.String r0 = r0.substring(r4)
        L_0x0164:
            int r4 = r1.e
            if (r4 == r3) goto L_0x0182
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r7 = 13
            r3.<init>(r7)
            r3.append(r8)
            r3.append(r4)
            java.lang.String r4 = "$"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.replaceAll(r3, r5)
        L_0x0182:
            java.lang.String r3 = "^\\.*"
            java.lang.String r0 = r0.replaceAll(r3, r5)
            java.lang.String r3 = "\\.*$"
            java.lang.String r0 = r0.replaceAll(r3, r5)
            java.lang.String r3 = "\\.+"
            java.lang.String r4 = "."
            java.lang.String r0 = r0.replaceAll(r3, r4)
            java.lang.String r3 = a((java.lang.String) r0)
            if (r3 != 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r0 = r3
        L_0x019f:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r3)
            goto L_0x01a9
        L_0x01a8:
            r0 = 0
        L_0x01a9:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01ce
            java.lang.String r3 = r1.c(r6)
            java.lang.String r0 = d(r0)
            r1.d = r0
            java.lang.String r0 = d(r3)
            r1.f = r0
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r2 = d(r2)
        L_0x01c9:
            r1.g = r2
            r1.b = r6
            return
        L_0x01ce:
            r2 = 0
            r1.b = r2
            r1.d = r2
            r1.f = r2
            r1.g = r2
            return
        L_0x01d8:
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r3 = -1
        L_0x01e0:
            r1.e = r3
            r1.f = r2
            r1.g = r2
            return
        L_0x01e7:
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            goto L_0x01e0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaak.<init>(java.lang.String):void");
    }

    private static String a(String str) {
        int i;
        String str2;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("^\\[", "").replaceAll("\\]$", "");
        if (aaaf.a(replaceAll) != null) {
            byte[] a2 = aaaf.a(replaceAll);
            if (a2 != null) {
                InetAddress a3 = aaaf.a(a2);
                if (a3 instanceof Inet4Address) {
                    str2 = a3.getHostAddress();
                } else {
                    byte[] address = a3.getAddress();
                    int[] iArr = new int[8];
                    for (int i2 = 0; i2 < 8; i2++) {
                        int i3 = i2 + i2;
                        iArr[i2] = (address[i3 + 1] & 255) | ((address[i3] & 255) << 8);
                    }
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = -1;
                    for (int i7 = 0; i7 < 9; i7++) {
                        if (i7 >= 8 || iArr[i7] != 0) {
                            if (i6 >= 0) {
                                int i8 = i7 - i6;
                                int i9 = i8 > i4 ? i8 : i4;
                                if (i8 > i4) {
                                    i5 = i6;
                                }
                                i4 = i9;
                                i6 = -1;
                            }
                        } else if (i6 < 0) {
                            i6 = i7;
                        }
                    }
                    if (i4 >= 2) {
                        Arrays.fill(iArr, i5, i4 + i5, -1);
                    }
                    StringBuilder sb = new StringBuilder(39);
                    int i10 = 0;
                    boolean z2 = false;
                    while (i10 < 8) {
                        if (iArr[i10] >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (z2) {
                                sb.append(':');
                            }
                            sb.append(Integer.toHexString(iArr[i10]));
                        } else if (i10 == 0 || z2) {
                            sb.append("::");
                        }
                        i10++;
                        z2 = z;
                    }
                    str2 = sb.toString();
                }
                if (!str2.contains(":")) {
                    return str2;
                }
                return String.format("[%s]", new Object[]{str2});
            }
            throw new IllegalArgumentException(String.format(Locale.ROOT, "'%s' is not an IP string literal.", new Object[]{replaceAll}));
        } else if (TextUtils.isDigitsOnly(str)) {
            String b2 = b(str);
            if (!TextUtils.isEmpty(b2)) {
                return b2;
            }
            return null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                for (String str3 : replaceAll.split("\\.")) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(".");
                    }
                    if (!str3.toLowerCase(Locale.getDefault()).startsWith("0x")) {
                        if (!str3.startsWith("0")) {
                            i = Integer.parseInt(str3);
                        } else {
                            i = str3.length() > 1 ? Integer.parseInt(str3, 8) : 0;
                        }
                    } else if (str3.length() <= 2) {
                        return null;
                    } else {
                        i = Integer.parseInt(str3.substring(2), 16);
                    }
                    stringBuffer.append(i);
                }
                return stringBuffer.toString();
            } catch (NumberFormatException e2) {
                return null;
            }
        }
    }

    private static boolean a(char c2) {
        return (c2 >= '0' && c2 <= '9') || (c2 >= 'A' && c2 <= 'F') || (c2 >= 'a' && c2 <= 'f');
    }

    private static String b(String str) {
        byte[] bArr;
        if (!TextUtils.isEmpty(str)) {
            try {
                BigInteger bigInteger = new BigInteger(str);
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length < 4) {
                    return null;
                }
                byte[] copyOfRange = Arrays.copyOfRange(byteArray, length - 4, length);
                if (bigInteger.equals(new BigInteger(new byte[]{0, copyOfRange[0], copyOfRange[1], copyOfRange[2], copyOfRange[3]}))) {
                    return Inet4Address.getByAddress(copyOfRange).getHostAddress();
                }
                if (length >= 16) {
                    bArr = Arrays.copyOfRange(byteArray, length - 16, length);
                } else {
                    byte[] bArr2 = new byte[16];
                    int i = 16 - length;
                    int i2 = 1;
                    int i3 = 0;
                    while (i2 <= i) {
                        bArr2[i3] = 0;
                        i2++;
                        i3++;
                    }
                    int i4 = 0;
                    while (i4 < byteArray.length) {
                        bArr2[i3] = byteArray[i4];
                        i4++;
                        i3++;
                    }
                    bArr = bArr2;
                }
                return String.format("[%s]", new Object[]{Inet6Address.getByAddress(bArr).getHostAddress()});
            } catch (NumberFormatException e2) {
            } catch (ArrayIndexOutOfBoundsException e3) {
                return null;
            } catch (UnknownHostException e4) {
                return null;
            }
        }
        return null;
    }

    private final String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(47);
        String replaceAll = (indexOf == -1 ? "/" : str.substring(indexOf)).replaceAll("/\\./", "/").replaceAll("/\\.$", "/");
        if (replaceAll.contains("..")) {
            try {
                replaceAll = new URI(this.c, "host", replaceAll, (String) null).normalize().getRawPath();
            } catch (URISyntaxException e2) {
            }
        }
        return replaceAll.replaceAll("/+", "/");
    }

    private static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bytes) {
                    byte b3 = b2 & 255;
                    if (b3 > 32 && b3 <= 126 && b3 != 35 && b3 != 37) {
                        sb.append((char) b3);
                    } else {
                        sb.append("%");
                        sb.append(a[b3 >>> 4]);
                        sb.append(a[b3 & 15]);
                    }
                }
                return sb.toString();
            } catch (UnsupportedEncodingException e2) {
            }
        }
        return null;
    }

    public final List a() {
        ArrayList arrayList;
        MessageDigest messageDigest;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        if (!TextUtils.isEmpty(this.b)) {
            String a2 = a(this.d);
            if (a2 != null) {
                arrayList2 = new ArrayList();
                arrayList2.add(a2);
            } else if (!TextUtils.isEmpty(this.d)) {
                arrayList2 = new ArrayList();
                char[] charArray = this.d.toCharArray();
                boolean z = false;
                for (int length = charArray.length - 2; length > 0 && arrayList2.size() < 4; length--) {
                    if (charArray[length] == '.') {
                        if (z) {
                            arrayList2.add(this.d.substring(length + 1));
                        } else {
                            z = true;
                        }
                    }
                }
                arrayList2.add(this.d);
            } else {
                arrayList2 = null;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(this.f)) {
                    arrayList3 = new ArrayList();
                    char[] charArray2 = this.f.toCharArray();
                    for (int i2 = 0; i2 < charArray2.length && arrayList3.size() < 4; i2++) {
                        if (charArray2[i2] == '/') {
                            arrayList3.add(this.f.substring(0, i2 + 1));
                        }
                    }
                    if (!arrayList3.isEmpty() && !((String) arrayList3.get(arrayList3.size() - 1)).equals(this.f)) {
                        arrayList3.add(this.f);
                    }
                    if (!TextUtils.isEmpty(this.g)) {
                        String str = this.f;
                        String str2 = this.g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                        sb.append(str);
                        sb.append('?');
                        sb.append(str2);
                        arrayList3.add(sb.toString());
                    }
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList = new ArrayList();
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str3 = (String) arrayList2.get(i3);
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (true) {
                            i = i3 + 1;
                            if (i4 >= size2) {
                                break;
                            }
                            String valueOf = String.valueOf(str3);
                            String valueOf2 = String.valueOf((String) arrayList3.get(i4));
                            arrayList.add(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
                            i4++;
                        }
                        i3 = i;
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e2) {
                messageDigest = null;
            }
            if (messageDigest != null) {
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    String str4 = (String) arrayList.get(i5);
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            arrayList4.add(new aaae(messageDigest.digest(str4.getBytes("UTF-8"))));
                        } catch (UnsupportedEncodingException e3) {
                        }
                        messageDigest.reset();
                    }
                }
                if (!arrayList4.isEmpty()) {
                    return arrayList4;
                }
            }
        }
        return null;
    }
}
