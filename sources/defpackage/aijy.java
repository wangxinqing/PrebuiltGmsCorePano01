package defpackage;

import java.util.Arrays;

/* renamed from: aijy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijy {
    public final String a;
    public final String b;

    public aijy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aijy)) {
            aijy aijy = (aijy) obj;
            if (!this.a.equals(aijy.a) || !this.b.equals(aijy.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        return sb.toString();
    }
}
