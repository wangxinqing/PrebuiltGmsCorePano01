package defpackage;

import java.util.Arrays;

/* renamed from: ahos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahos {
    public final float[] a;
    public final boolean b;
    public final int c;

    public ahos(float[] fArr, boolean z, int i) {
        this.a = fArr;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahos) {
            return Arrays.equals(this.a, ((ahos) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 2);
        sb.append("{");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
