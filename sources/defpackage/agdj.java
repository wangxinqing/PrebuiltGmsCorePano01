package defpackage;

/* renamed from: agdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdj extends aghy {
    public final int a;
    private final boolean b;
    private final agng c;
    private final amri d;

    public agdj(boolean z, agng agng, int i, amri amri) {
        this.b = z;
        this.c = agng;
        this.a = i;
        this.d = amri;
    }

    public final boolean a() {
        return this.b;
    }

    public final agng b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final amri d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aghy) {
            aghy aghy = (aghy) obj;
            return this.b == aghy.a() && this.c.equals(aghy.b()) && this.a == aghy.c() && this.d.equals(aghy.d());
        }
    }

    public final int hashCode() {
        return (((((((!this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        int i = this.a;
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 116 + String.valueOf(valueOf2).length());
        sb.append("PrimesTimerConfigurations{enabled=");
        sb.append(z);
        sb.append(", probabilitySampler=");
        sb.append(valueOf);
        sb.append(", sampleRatePerSecond=");
        sb.append(i);
        sb.append(", perEventConfigFlags=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
