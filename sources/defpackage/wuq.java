package defpackage;

import java.util.Arrays;

/* renamed from: wuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wuq {
    public final String a;
    public final String b;
    public final byte[] c;

    private wuq(String str, byte[] bArr, String str2) {
        if (str2 == null || bArr == null) {
            this.a = str;
            this.b = str2;
            this.c = bArr;
            return;
        }
        throw new IllegalArgumentException("Cannot set both stringData and binaryData");
    }

    public static wuq a(String str, String str2) {
        return new wuq(str, (byte[]) null, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wuq wuq = (wuq) obj;
            return amqx.a(this.a, wuq.a) && amqx.a(this.b, wuq.b) && Arrays.equals(this.c, wuq.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a();
        a2.a("name", (Object) this.a);
        a2.a("stringData", (Object) this.b);
        a2.a("binaryData", (Object) this.c);
        return a2.toString();
    }

    public static wuq a(String str, byte[] bArr) {
        return new wuq(str, bArr, (String) null);
    }
}
