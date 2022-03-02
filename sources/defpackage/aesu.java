package defpackage;

/* renamed from: aesu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aesu extends aete {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public aesu(int i, boolean z, boolean z2, long j) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aete) {
            aete aete = (aete) obj;
            return this.a == aete.a() && this.b == aete.b() && this.c == aete.c() && this.d == aete.d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((this.a ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
        if (this.c) {
            i = 1231;
        }
        long j = this.d;
        return ((i2 ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder(131);
        sb.append("CoreMdhFootprintsRecordingSetting{corpusGroup=");
        sb.append(i);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", unset=");
        sb.append(z2);
        sb.append(", lastModifiedTimeMicros=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
