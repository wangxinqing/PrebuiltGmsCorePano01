package defpackage;

/* renamed from: yas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yas extends ybb {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final boolean e;
    public final int f;
    private final int g;

    public yas(String str, long j, long j2, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.f = i2;
        this.g = i3;
        this.e = z;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ybb) {
            ybb ybb = (ybb) obj;
            if (this.a.equals(ybb.a()) && this.b == ybb.b() && this.c == ybb.c() && this.d == ybb.d()) {
                int i = this.f;
                int g2 = ybb.g();
                if (i != 0) {
                    return i == g2 && this.g == ybb.e() && this.e == ybb.f();
                }
                throw null;
            }
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        int i = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003;
        int i2 = this.f;
        if (i2 != 0) {
            return ((((i ^ i2) * 1000003) ^ this.g) * 1000003) ^ (!this.e ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        int i = this.d;
        int i2 = this.f;
        String valueOf = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : "null");
        int i3 = this.g;
        boolean z = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 190 + String.valueOf(valueOf).length());
        sb.append("SyncStatsEvent{name=");
        sb.append(str);
        sb.append(", startTimeMicroSec=");
        sb.append(j);
        sb.append(", timeDurationMicroSec=");
        sb.append(j2);
        sb.append(", subEventCount=");
        sb.append(i);
        sb.append(", networkType=");
        sb.append(valueOf);
        sb.append(", payloadSize=");
        sb.append(i3);
        sb.append(", networkEvent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
