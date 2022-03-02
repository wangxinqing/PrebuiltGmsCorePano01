package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: anip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anip implements aniq {
    private static final Set a = new HashSet(Arrays.asList(new Class[]{Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class}));
    private final String b;
    private final String c;
    private final StringBuilder d;
    private boolean e = false;

    public anip(String str, String str2, StringBuilder sb) {
        this.b = str;
        this.c = str2;
        this.d = sb;
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void a() {
        if (this.e) {
            this.d.append(this.c);
        }
    }

    public final void a(String str, Object obj) {
        char c2 = ' ';
        if (this.e) {
            this.d.append(' ');
        } else {
            if (this.d.length() > 0) {
                StringBuilder sb = this.d;
                if (sb.length() > 1000 || this.d.indexOf("\n") != -1) {
                    c2 = 10;
                }
                sb.append(c2);
            }
            this.d.append(this.b);
            this.e = true;
        }
        StringBuilder sb2 = this.d;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            this.d.append(true);
        } else if (a.contains(obj.getClass())) {
            this.d.append(obj);
        } else {
            this.d.append('\"');
            StringBuilder sb3 = this.d;
            String obj2 = obj.toString();
            int i = 0;
            while (true) {
                int a2 = a(obj2, i);
                if (a2 != -1) {
                    sb3.append(obj2, i, a2);
                    i = a2 + 1;
                    char charAt = obj2.charAt(a2);
                    if (charAt == 9) {
                        charAt = 't';
                    } else if (charAt == 10) {
                        charAt = 'n';
                    } else if (charAt == 13) {
                        charAt = 'r';
                    } else if (!(charAt == '\"' || charAt == '\\')) {
                        sb3.append(65533);
                    }
                    sb3.append("\\");
                    sb3.append(charAt);
                } else {
                    sb3.append(obj2, i, obj2.length());
                    this.d.append('\"');
                    return;
                }
            }
        }
    }
}
