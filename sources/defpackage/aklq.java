package defpackage;

import java.util.Arrays;

/* renamed from: aklq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklq {
    public final aklu a;
    public final float b;

    public aklq(aklu aklu, float f) {
        this.a = aklu;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aklq) {
            aklq aklq = (aklq) obj;
            return this.b == aklq.b && akoy.a(this.a, aklq.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("PlaceInferenceDebugData{featureValues=");
        sb.append(valueOf);
        sb.append(",rawScore=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
