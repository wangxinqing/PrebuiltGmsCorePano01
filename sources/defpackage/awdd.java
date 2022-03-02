package defpackage;

import java.net.ProtocolException;

/* renamed from: awdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdd {
    public final avzh a;
    public final int b;
    public final String c;

    public awdd(avzh avzh, int i, String str) {
        this.a = avzh;
        this.b = i;
        this.c = str;
    }

    public static awdd a(avzm avzm) {
        return new awdd(avzm.b, avzm.c, avzm.d);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.a != avzh.HTTP_1_0) {
            str = "HTTP/1.1";
        } else {
            str = "HTTP/1.0";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }

    public static awdd a(String str) {
        avzh avzh;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                String valueOf = String.valueOf(str);
                throw new ProtocolException(valueOf.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                avzh = avzh.HTTP_1_0;
            } else if (charAt != 1) {
                String valueOf2 = String.valueOf(str);
                throw new ProtocolException(valueOf2.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf2));
            } else {
                avzh = avzh.HTTP_1_1;
            }
        } else if (str.startsWith("ICY ")) {
            avzh = avzh.HTTP_1_0;
            i = 4;
        } else {
            String valueOf3 = String.valueOf(str);
            throw new ProtocolException(valueOf3.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf3));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            String valueOf4 = String.valueOf(str);
            throw new ProtocolException(valueOf4.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf4));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else if (str.charAt(i2) != ' ') {
                String valueOf5 = String.valueOf(str);
                throw new ProtocolException(valueOf5.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf5));
            } else {
                str2 = str.substring(i + 4);
            }
            return new awdd(avzh, parseInt, str2);
        } catch (NumberFormatException e) {
            String valueOf6 = String.valueOf(str);
            throw new ProtocolException(valueOf6.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf6));
        }
    }
}
