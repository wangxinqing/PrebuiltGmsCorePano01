package defpackage;

import java.util.Arrays;

/* renamed from: alss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alss {
    public static final alss c = new alss((String) null, 0);
    public static final alss d = new alss((String) null, 33);
    public static final alss e = new alss((String) null, 37);
    public static final alss f = new alss((String) null, 41);
    public static final alss g = new alss((String) null, 16);
    public final String a;
    public final int b;

    static {
        new alss((String) null, 48);
    }

    private alss(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static alss a(String str) {
        alys.a((Object) str, "A sessionId must be specified, or OperationMetadata#anonymousRemote should be used.");
        return new alss(str, 0);
    }

    public final boolean a() {
        return (this.b & 1) != 0;
    }

    public final boolean b() {
        return (this.b & 32) != 0;
    }

    public final boolean c() {
        return (this.b & 16) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        alss alss = (alss) obj;
        return alyr.a(this.a, alss.a, Integer.valueOf(this.b), Integer.valueOf(alss.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        String binaryString = Integer.toBinaryString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(binaryString).length());
        sb.append("OperationMetadata [sessionId=");
        sb.append(str);
        sb.append(", flags=");
        sb.append(binaryString);
        sb.append("]");
        return sb.toString();
    }
}
