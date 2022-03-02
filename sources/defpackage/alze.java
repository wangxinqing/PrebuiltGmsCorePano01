package defpackage;

/* renamed from: alze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alze {
    public boolean a = true;
    private final String b;
    private final int c;
    private int d;
    private final StringBuilder e = new StringBuilder();
    private int f;
    private int g;
    private char h = 0;

    public alze(String str) {
        this.b = str;
        this.c = str.length();
    }

    private final IllegalArgumentException a(String str) {
        int i = this.g - 1;
        int max = Math.max(i - 10, 0);
        int min = Math.min(i + 10, this.c);
        String substring = this.b.substring(max, min);
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 110 + String.valueOf(str).length());
        sb.append("JSON parsing error at character ");
        sb.append(i);
        sb.append(" {input chars ");
        sb.append(max);
        sb.append("-");
        sb.append(min);
        sb.append(" = \"");
        sb.append(substring);
        sb.append("\"; length = ");
        sb.append(i2);
        sb.append("}: ");
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    private static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean b(char c2) {
        return a(c2) || c2 == 'e' || c2 == 'E' || c2 == '+' || c2 == '-' || c2 == '.';
    }

    private final void c(char c2) {
        char p = p();
        this.g--;
        this.d++;
        if (p == c2) {
            r();
        }
    }

    private final void d(char c2) {
        char c3 = this.h;
        if (c3 == c2) {
            r();
            return;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Expected collection end character ");
        sb.append(c2);
        sb.append(" but was: ");
        sb.append(c3);
        throw a(sb.toString());
    }

    private final boolean e(char c2) {
        if (c2 == 't') {
            f('r');
            f('u');
            f('e');
            r();
            return true;
        } else if (c2 == 'f') {
            f('a');
            f('l');
            f('s');
            f('e');
            r();
            return false;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Invalid character in boolean: ");
            sb.append(c2);
            throw a(sb.toString());
        }
    }

    private final void f(char c2) {
        char p = p();
        if (c2 == p) {
            return;
        }
        if (p != 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("Expceted '");
            sb.append(c2);
            sb.append("' but was: ");
            sb.append(p);
            throw a(sb.toString());
        }
        throw a("Unexpected end of input.");
    }

    private final void h() {
        while (true) {
            char q = q();
            if (q == '\\') {
                o();
            } else if (q == '\"') {
                return;
            } else {
                if (q == 0) {
                    throw a("Unexpected end of string.");
                }
            }
        }
    }

    private final void i() {
        c(']');
    }

    private final void j() {
        c('}');
    }

    private final void k() {
        while (this.a) {
            f('\"');
            h();
            f(':');
            a();
        }
        d('}');
    }

    private final void l() {
        f('u');
        f('l');
        f('l');
        r();
    }

    private final String m() {
        char q;
        this.f = this.g;
        do {
            q = q();
            if (q == '\"') {
                return this.b.subSequence(this.f, this.g - 1).toString();
            }
            if (q == 0) {
                throw a("Input ended before end of string.");
            }
        } while (q != '\\');
        this.e.setLength(0);
        o();
        while (true) {
            String str = this.b;
            int i = this.g;
            this.g = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                n();
                return this.e.toString();
            } else if (charAt == '\\') {
                o();
            }
        }
    }

    private final void n() {
        this.e.append(this.b, this.f, this.g - 1);
    }

    private final void o() {
        n();
        String str = this.b;
        int i = this.g;
        this.g = i + 1;
        char charAt = str.charAt(i);
        if (charAt == '\"') {
            this.e.append('\"');
        } else if (charAt == '/') {
            this.e.append('/');
        } else if (charAt == '\\') {
            this.e.append('\\');
        } else if (charAt == 'b') {
            this.e.append(8);
        } else if (charAt == 'f') {
            this.e.append(12);
        } else if (charAt == 'n') {
            this.e.append(10);
        } else if (charAt == 'r') {
            this.e.append(13);
        } else if (charAt == 't') {
            this.e.append(9);
        } else if (charAt == 'u') {
            StringBuilder sb = this.e;
            int i2 = this.g;
            int i3 = i2 + 4;
            this.g = i3;
            char c2 = 0;
            while (i2 < i3) {
                c2 = (char) (((char) (c2 * 16)) + Character.digit(this.b.charAt(i2), 16));
                i2++;
            }
            sb.append(c2);
        } else {
            StringBuilder sb2 = new StringBuilder(17);
            sb2.append("Invalid escape: ");
            sb2.append(charAt);
            throw a(sb2.toString());
        }
        this.f = this.g;
    }

    private final char p() {
        char q;
        while (true) {
            q = q();
            if (q > ' ' || !(q == ' ' || q == 9 || q == 10 || q == 13)) {
                return q;
            }
        }
        return q;
    }

    private final char q() {
        int i = this.g;
        char charAt = i < this.c ? this.b.charAt(i) : 0;
        this.g++;
        return charAt;
    }

    private final void r() {
        if (this.d > 0) {
            char p = p();
            if (p == ',') {
                this.a = true;
            } else if (p == ']' || p == '}') {
                this.h = p;
                this.a = false;
                this.d--;
            } else if (p != 0) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unexpected character in array/object: ");
                sb.append(p);
                throw a(sb.toString());
            } else {
                throw a("Input ended before end of array/object.");
            }
        } else {
            char p2 = p();
            if (p2 != 0) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Unexpected character at end of input: ");
                sb2.append(p2);
                throw a(sb2.toString());
            }
        }
    }

    public final String g() {
        if (this.a) {
            char p = p();
            if (p == 'n') {
                l();
            } else if (p == '\"') {
                String m = m();
                r();
                return m;
            } else {
                StringBuilder sb = new StringBuilder(30);
                sb.append("Expected \" or null, but was: ");
                sb.append(p);
                throw a(sb.toString());
            }
        }
        return null;
    }

    public final int b() {
        int i = 0;
        if (this.a) {
            char p = p();
            if (p != '-') {
                i = p - '0';
            }
            char p2 = p();
            while (a(p2)) {
                i = (i * 10) + (p2 - '0');
                p2 = q();
            }
            this.g--;
            r();
            if (p == '-') {
                return -i;
            }
        }
        return i;
    }

    public final void c() {
        f('[');
        i();
    }

    public final void d() {
        while (this.a) {
            a();
        }
        d(']');
    }

    public final boolean e() {
        return this.a && e(p());
    }

    public final boolean f() {
        if (p() != 'n') {
            this.g--;
            return false;
        }
        l();
        return true;
    }

    public final Object a(alzf alzf) {
        if (!this.a) {
            return alzf.a();
        }
        char p = p();
        if (p == '\"') {
            Object a2 = alzf.a(m());
            r();
            return a2;
        } else if (p != '[') {
            if (p != 'f') {
                if (p == 'n') {
                    l();
                    return alzf.a();
                } else if (p != 't') {
                    if (p == '{') {
                        Object b2 = alzf.b();
                        j();
                        while (this.a) {
                            f('\"');
                            String m = m();
                            f(':');
                            alzf.a(m, a(alzf), b2);
                        }
                        k();
                        return alzf.a(b2);
                    } else if ((p < '0' || p > '9') && p != '-') {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("Invalid character: ");
                        sb.append(p);
                        throw a(sb.toString());
                    } else {
                        int i = p != '-' ? p - '0' : 0;
                        int i2 = this.g - 1;
                        char q = q();
                        while (a(q) && this.g - i2 < 10) {
                            i = (i * 10) + (q - '0');
                            q = q();
                        }
                        if (q != 0 && b(q)) {
                            while (b(q)) {
                                q = q();
                            }
                            int i3 = this.g - 1;
                            this.g = i3;
                            Object a3 = alzf.a(Double.parseDouble(this.b.subSequence(i2, i3).toString()));
                            r();
                            return a3;
                        }
                        this.g--;
                        r();
                        if (p == '-') {
                            i = -i;
                        }
                        return alzf.a(i);
                    }
                }
            }
            return alzf.a(e(p));
        } else {
            Object c2 = alzf.c();
            i();
            while (this.a) {
                alzf.a(a(alzf), c2);
            }
            d();
            return alzf.b(c2);
        }
    }

    public final void a() {
        if (this.a) {
            char p = p();
            if (p == '\"') {
                h();
                r();
            } else if (p != '[') {
                if (p != 'f') {
                    if (p == 'n') {
                        l();
                        return;
                    } else if (p != 't') {
                        if (p == '{') {
                            j();
                            k();
                            return;
                        } else if ((p < '0' || p > '9') && p != '-') {
                            StringBuilder sb = new StringBuilder(20);
                            sb.append("Invalid character: ");
                            sb.append(p);
                            throw a(sb.toString());
                        } else {
                            while (b(p)) {
                                p = q();
                            }
                            this.g--;
                            r();
                            return;
                        }
                    }
                }
                e(p);
            } else {
                i();
                d();
            }
        }
    }
}
