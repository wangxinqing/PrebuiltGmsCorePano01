package defpackage;

import java.util.Arrays;

/* renamed from: aklm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklm {
    public final int a;
    public final float b;

    public aklm(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aklm) {
            aklm aklm = (aklm) obj;
            return this.a == aklm.a && this.b == aklm.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        StringBuilder sb = new StringBuilder(70);
        sb.append("DetectedActivity{activityType=");
        sb.append(i);
        sb.append(" probability=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
