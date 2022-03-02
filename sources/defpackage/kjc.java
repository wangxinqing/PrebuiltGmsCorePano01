package defpackage;

import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: kjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjc {
    static final Pattern a = Pattern.compile("^bytes=(\\d+)-(\\d+)$");
    static final Pattern b = Pattern.compile("^\\s*bytes\\s+(\\d+)-(\\d+)/(\\d+)\\s*$");
    public final long c;
    public final long d;

    public kjc(long j, long j2) {
        boolean z = true;
        if ((j < 0 || j > j2) && j2 >= 0) {
            z = false;
        }
        iva.b(z);
        this.c = j;
        this.d = j2;
    }

    public static kjc a(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return new kjc(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)));
        }
        Matcher matcher2 = b.matcher(str);
        if (matcher2.matches()) {
            return new kjc(Long.parseLong(matcher2.group(1)), Long.parseLong(matcher2.group(2)));
        }
        throw new ParseException(str.length() == 0 ? new String("Invalid content-range format: ") : "Invalid content-range format: ".concat(str), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kjc kjc = (kjc) obj;
            return kjc.c == this.c && kjc.d == this.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new long[]{this.c, this.d});
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        long j = this.d;
        if (j >= 0) {
            long j2 = this.c;
            StringBuilder sb = new StringBuilder(47);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            sb.append(j);
            return sb.toString();
        }
        long j3 = this.c;
        if (j3 >= 0) {
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("bytes=");
            sb2.append(j3);
            sb2.append("-");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("bytes=");
        sb3.append(j3);
        return sb3.toString();
    }
}
