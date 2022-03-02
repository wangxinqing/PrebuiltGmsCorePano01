package defpackage;

import java.util.Arrays;

/* renamed from: akqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akqm {
    public final String a;
    public final String b;
    public final long c;

    private akqm(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static akqm a(String str, String str2, Long l) {
        return new akqm(str, str2, l.longValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqm) {
            akqm akqm = (akqm) obj;
            return this.a.equals(akqm.a) && this.b.equals(akqm.b) && this.c == akqm.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("accountName: ");
        sb.append(str);
        sb.append("\nclientName: ");
        sb.append(str2);
        sb.append("\ncellId: ");
        sb.append(j);
        sb.append("\n");
        return sb.toString();
    }

    public final int a() {
        return this.a.length() + 8 + this.b.length() + 8;
    }
}
