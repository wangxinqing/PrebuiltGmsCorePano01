package defpackage;

/* renamed from: anin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anin {
    public static final anin a = new anin(0, -1, -1);
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        e = j;
    }

    public anin(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private static int a(char c2) {
        return ((int) ((e >>> ((c2 - ' ') * 3)) & 7)) - 1;
    }

    public final boolean a() {
        return this == a;
    }

    public final boolean b() {
        return (this.b & 128) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anin) {
            anin anin = (anin) obj;
            return anin.b == this.b && anin.c == this.c && anin.d == this.d;
        }
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    private static int a(String str, int i, int i2) {
        if (i != i2) {
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt < 10) {
                    i3 = (i3 * 10) + charAt;
                    if (i3 <= 999999) {
                        i4++;
                    } else {
                        throw ankn.a("precision too large", str, i, i2);
                    }
                } else {
                    throw ankn.a("invalid precision character", str, i4);
                }
            }
            if (i3 != 0 || i2 == i + 1) {
                return i3;
            }
            throw ankn.a("invalid precision", str, i, i2);
        }
        throw ankn.a("missing precision", str, i - 1);
    }

    static int a(String str, boolean z) {
        int i = 0;
        int i2 = !z ? 0 : 128;
        while (i < str.length()) {
            int a2 = a(str.charAt(i));
            if (a2 >= 0) {
                i2 |= 1 << a2;
                i++;
            } else {
                throw new IllegalArgumentException(str.length() == 0 ? new String("invalid flags: ") : "invalid flags: ".concat(str));
            }
        }
        return i2;
    }

    public static anin a(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return a;
        }
        int i3 = !z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt <= '0') {
                int a2 = a(charAt);
                if (a2 >= 0) {
                    int i5 = 1 << a2;
                    if ((i3 & i5) == 0) {
                        i3 |= i5;
                        i = i4;
                    } else {
                        throw ankn.a("repeated flag", str, i4 - 1);
                    }
                } else if (charAt == '.') {
                    return new anin(i3, -1, a(str, i4, i2));
                } else {
                    throw ankn.a("invalid flag", str, i4 - 1);
                }
            } else {
                int i6 = i4 - 1;
                if (charAt <= '9') {
                    int i7 = charAt - '0';
                    while (i4 != i2) {
                        int i8 = i4 + 1;
                        char charAt2 = str.charAt(i4);
                        if (charAt2 == '.') {
                            return new anin(i3, i7, a(str, i8, i2));
                        }
                        char c2 = (char) (charAt2 - '0');
                        if (c2 < 10) {
                            i7 = (i7 * 10) + c2;
                            if (i7 <= 999999) {
                                i4 = i8;
                            } else {
                                throw ankn.a("width too large", str, i6, i2);
                            }
                        } else {
                            throw ankn.a("invalid width character", str, i8 - 1);
                        }
                    }
                    return new anin(i3, i7, -1);
                }
                throw ankn.a("invalid flag", str, i6);
            }
        }
        return new anin(i3, -1, -1);
    }

    public final void a(StringBuilder sb) {
        if (!a()) {
            int i = this.b & -129;
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i4 = this.c;
            if (i4 != -1) {
                sb.append(i4);
            }
            if (this.d != -1) {
                sb.append('.');
                sb.append(this.d);
            }
        }
    }

    public final boolean a(int i, boolean z) {
        int i2;
        if (a()) {
            return true;
        }
        int i3 = this.b;
        if (((i ^ -1) & i3) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        int i4 = this.c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }
}
