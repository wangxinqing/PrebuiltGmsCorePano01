package defpackage;

/* renamed from: ydf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ydf extends ydj {
    private final long a;
    private final int b;
    private final long c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final long g;

    public ydf(long j, int i, long j2, boolean z, boolean z2, boolean z3, long j3) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = j3;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ydj) {
            ydj ydj = (ydj) obj;
            return this.a == ydj.a() && this.b == ydj.b() && this.c == ydj.c() && this.d == ydj.d() && this.e == ydj.e() && this.f == ydj.f() && this.g == ydj.g();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int hashCode() {
        long j = this.a;
        int i = this.b;
        long j2 = this.c;
        int i2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        int i3 = 1237;
        int i4 = (((i2 ^ (!this.d ? 1237 : 1231)) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003;
        if (this.f) {
            i3 = 1231;
        }
        long j3 = this.g;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((i4 ^ i3) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        long j2 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        long j3 = this.g;
        StringBuilder sb = new StringBuilder(223);
        sb.append("ContactMetadata{contactId=");
        sb.append(j);
        sb.append(", timesContacted=");
        sb.append(i);
        sb.append(", lastTimeContacted=");
        sb.append(j2);
        sb.append(", isStarred=");
        sb.append(z);
        sb.append(", hasCustomRingtone=");
        sb.append(z2);
        sb.append(", sendToVoicemail=");
        sb.append(z3);
        sb.append(", lastUpdatedTimestamp=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
