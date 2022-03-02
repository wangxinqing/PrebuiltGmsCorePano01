package defpackage;

/* renamed from: agdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agdi extends aghw {
    private final boolean a;
    private final int b;
    private final aghu c;
    private final boolean d;

    public agdi(boolean z, int i, aghu aghu, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = aghu;
        this.d = z2;
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final aghu c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aghw) {
            aghw aghw = (aghw) obj;
            return this.a == aghw.a() && this.b == aghw.b() && this.c.equals(aghw.c()) && this.d == aghw.d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 123);
        sb.append("PrimesTikTokTraceConfigurations{enabled=");
        sb.append(z);
        sb.append(", sampleRatePerSecond=");
        sb.append(i);
        sb.append(", dynamicSampler=");
        sb.append(valueOf);
        sb.append(", recordTimerDuration=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
