package defpackage;

/* renamed from: agde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agde extends aghh {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final amri d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    public agde(boolean z, int i2, boolean z2, amri amri, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = z;
        this.b = i2;
        this.c = z2;
        this.d = amri;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final amri d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aghh) {
            aghh aghh = (aghh) obj;
            return this.a == aghh.a() && this.b == aghh.b() && this.c == aghh.c() && this.d.equals(aghh.d()) && this.e == aghh.e() && this.f == aghh.f() && this.g == aghh.g() && this.h == aghh.h() && this.i == aghh.i() && this.j == aghh.j() && this.k == aghh.k() && this.l == aghh.l();
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i2 = 1237;
        int i3 = ((((((((((((((((((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ (!this.f ? 1237 : 1231)) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ (!this.h ? 1237 : 1231)) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ (!this.k ? 1237 : 1231)) * 1000003;
        if (this.l) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final String toString() {
        boolean z = this.a;
        int i2 = this.b;
        boolean z2 = this.c;
        String valueOf = String.valueOf(this.d);
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        boolean z8 = this.j;
        boolean z9 = this.k;
        boolean z10 = this.l;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 321);
        sb.append("PrimesMemoryConfigurations{enabled=");
        sb.append(z);
        sb.append(", sampleRatePerSecond=");
        sb.append(i2);
        sb.append(", recordMetricPerProcess=");
        sb.append(z2);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append(", forceGcBeforeRecordMemory=");
        sb.append(z3);
        sb.append(", captureRssHwm=");
        sb.append(z4);
        sb.append(", captureTotalRss=");
        sb.append(z5);
        sb.append(", captureAnonRss=");
        sb.append(z6);
        sb.append(", captureSwap=");
        sb.append(z7);
        sb.append(", captureVmSize=");
        sb.append(z8);
        sb.append(", captureDebugMetrics=");
        sb.append(z9);
        sb.append(", captureMemoryInfo=");
        sb.append(z10);
        sb.append("}");
        return sb.toString();
    }
}
