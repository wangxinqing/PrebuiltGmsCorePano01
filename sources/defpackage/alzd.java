package defpackage;

/* renamed from: alzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alzd {
    public final StringBuilder a;
    private boolean b;

    public alzd(StringBuilder sb) {
        this.a = sb;
    }

    private final void c(String str) {
        this.a.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                this.a.append("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            this.a.append("\\b");
                            break;
                        case 9:
                            this.a.append("\\t");
                            break;
                        case 10:
                            this.a.append("\\n");
                            break;
                        default:
                            if (charAt > 31) {
                                this.a.append(charAt);
                                break;
                            } else {
                                this.a.append("\\u");
                                this.a.append(Character.forDigit(0, 16));
                                this.a.append(Character.forDigit(0, 16));
                                this.a.append(Character.forDigit((charAt & 240) >> 4, 16));
                                this.a.append(Character.forDigit(charAt & 15, 16));
                                break;
                            }
                    }
                } else {
                    this.a.append('\\');
                    this.a.append(charAt);
                }
            } else {
                this.a.append("\\r");
            }
        }
        this.a.append('\"');
    }

    public final void a() {
        f();
        this.a.append('[');
        this.b = false;
    }

    public final void b() {
        this.a.append(']');
        this.b = true;
    }

    public final void d() {
        this.a.append('}');
        this.b = true;
    }

    public final void e() {
        f();
        this.a.append("null");
    }

    public final void f() {
        if (this.b) {
            this.a.append(',');
        }
        this.b = true;
    }

    public final void a(int i) {
        f();
        this.a.append(i);
    }

    public final void b(String str) {
        if (str != null) {
            f();
            c(str);
            return;
        }
        e();
    }

    public final void a(String str) {
        f();
        c(str);
        this.a.append(':');
        this.b = false;
    }

    public final void a(boolean z) {
        f();
        this.a.append(z);
    }

    public final void c() {
        f();
        this.a.append('{');
        this.b = false;
    }
}
