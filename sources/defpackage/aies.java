package defpackage;

import java.util.Arrays;

/* renamed from: aies  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aies {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final long e;

    public aies(String str, int i, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = true;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aies) {
            aies aies = (aies) obj;
            if (!amqx.a(this.a, aies.a) || !amqx.a(this.b, aies.b) || this.c != aies.c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public aies(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = 0;
        this.d = false;
        this.e = j;
    }
}
