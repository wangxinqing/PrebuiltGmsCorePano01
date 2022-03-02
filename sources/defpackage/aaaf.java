package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;

/* renamed from: aaaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaaf {
    private static final Pattern a = Pattern.compile("[.]");

    public static InetAddress a(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    private static byte[] b(String str) {
        byte[] bArr = new byte[4];
        try {
            String[] split = a.split(str, 4);
            int length = split.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str2 = split[i];
                int i3 = i2 + 1;
                int parseInt = Integer.parseInt(str2);
                if (parseInt > 255 || (str2.startsWith("0") && str2.length() > 1)) {
                    throw new NumberFormatException();
                }
                bArr[i2] = (byte) parseInt;
                i++;
                i2 = i3;
            }
            if (i2 == 4) {
                return bArr;
            }
            return null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static short c(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt <= 65535) {
            return (short) parseInt;
        }
        throw new NumberFormatException();
    }

    public static byte[] a(String str) {
        int i;
        int i2;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i4 = 1;
            if (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if (charAt == '.') {
                    z2 = true;
                } else if (charAt != ':') {
                    if (Character.digit(charAt, 16) == -1) {
                        return null;
                    }
                } else if (z2) {
                    return null;
                } else {
                    z = true;
                }
                i3++;
            } else if (z) {
                if (z2) {
                    int lastIndexOf = str.lastIndexOf(58) + 1;
                    String substring = str.substring(0, lastIndexOf);
                    byte[] b = b(str.substring(lastIndexOf));
                    if (b != null) {
                        String hexString = Integer.toHexString(((b[0] & 255) << 8) | (b[1] & 255));
                        String hexString2 = Integer.toHexString((b[3] & 255) | ((b[2] & 255) << 8));
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(hexString).length() + String.valueOf(hexString2).length());
                        sb.append(substring);
                        sb.append(hexString);
                        sb.append(":");
                        sb.append(hexString2);
                        str = sb.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        return null;
                    }
                }
                String[] split = str.split(":", 10);
                int length = split.length;
                if (length < 3 || length > 9) {
                    return null;
                }
                int i5 = -1;
                while (true) {
                    int length2 = split.length;
                    int i6 = length2 - 1;
                    if (i4 < i6) {
                        if (split[i4].length() == 0) {
                            if (i5 >= 0) {
                                return null;
                            }
                            i5 = i4;
                        }
                        i4++;
                    } else {
                        if (i5 >= 0) {
                            int i7 = (length2 - i5) - 1;
                            if (split[0].length() == 0) {
                                i2 = i5 - 1;
                                if (i2 != 0) {
                                    return null;
                                }
                            } else {
                                i2 = i5;
                            }
                            if (split[i6].length() == 0) {
                                int i8 = i7 - 1;
                                if (i8 != 0) {
                                    return null;
                                }
                                i = i8;
                                length2 = i2;
                            } else {
                                i = i7;
                                length2 = i2;
                            }
                        } else {
                            i = 0;
                        }
                        int i9 = 8 - (length2 + i);
                        if (i5 < 0) {
                            if (i9 != 0) {
                                return null;
                            }
                        } else if (i9 <= 0) {
                            return null;
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        int i10 = 0;
                        while (i10 < length2) {
                            try {
                                allocate.putShort(c(split[i10]));
                                i10++;
                            } catch (NumberFormatException e) {
                                return null;
                            }
                        }
                        for (int i11 = 0; i11 < i9; i11++) {
                            allocate.putShort(0);
                        }
                        while (i > 0) {
                            allocate.putShort(c(split[split.length - i]));
                            i--;
                        }
                        return allocate.array();
                    }
                }
            } else if (z2) {
                return b(str);
            } else {
                return null;
            }
        }
    }
}
