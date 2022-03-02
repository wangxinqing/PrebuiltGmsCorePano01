package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: aonv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonv implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final int b;
    private final boolean c;

    private aonv(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public static aonv a(String str) {
        String str2;
        String str3;
        boolean z;
        String[] strArr;
        boolean z2;
        amrl.a((Object) str);
        int i = -1;
        boolean z3 = false;
        if (!str.startsWith("[")) {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    str3 = str.substring(0, indexOf);
                    str2 = str.substring(i2);
                }
            }
            if (indexOf >= 0) {
                z3 = true;
            }
            str2 = null;
            str3 = str;
        } else {
            if (str.charAt(0) == '[') {
                z = true;
            } else {
                z = false;
            }
            amrl.a(z, "Bracketed host-port string must start with a bracket: %s", (Object) str);
            int indexOf2 = str.indexOf(58);
            int lastIndexOf = str.lastIndexOf(93);
            amrl.a(indexOf2 < 0 ? false : lastIndexOf > indexOf2, "Invalid bracketed host/port: %s", (Object) str);
            String substring = str.substring(1, lastIndexOf);
            int i3 = lastIndexOf + 1;
            if (i3 == str.length()) {
                strArr = new String[]{substring, ""};
            } else {
                if (str.charAt(i3) == ':') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                amrl.a(z2, "Only a colon may follow a close bracket: %s", (Object) str);
                int i4 = lastIndexOf + 2;
                for (int i5 = i4; i5 < str.length(); i5++) {
                    amrl.a(Character.isDigit(str.charAt(i5)), "Port must be numeric: %s", (Object) str);
                }
                strArr = new String[]{substring, str.substring(i4)};
            }
            str3 = strArr[0];
            str2 = strArr[1];
        }
        if (!amrk.a(str2)) {
            amrl.a(!str2.startsWith("+"), "Unparseable port number: %s", (Object) str);
            try {
                i = Integer.parseInt(str2);
                amrl.a(a(i), "Port number out of range: %s", (Object) str);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unparseable port number: ") : "Unparseable port number: ".concat(valueOf));
            }
        }
        return new aonv(str3, i, z3);
    }

    private static boolean a(int i) {
        return i >= 0 && i <= 65535;
    }

    public final boolean a() {
        return this.b >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aonv) {
            aonv aonv = (aonv) obj;
            return amqx.a(this.a, aonv.a) && this.b == aonv.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.a);
            sb.append(']');
        } else {
            sb.append(this.a);
        }
        if (a()) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }

    public static aonv a(String str, int i) {
        amrl.a(a(i), "Port out of range: %s", i);
        aonv a2 = a(str);
        amrl.a(!a2.a(), "Host has a port: %s", (Object) str);
        return new aonv(a2.a, i, a2.c);
    }
}
