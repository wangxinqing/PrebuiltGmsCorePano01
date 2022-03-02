package defpackage;

/* renamed from: agdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdc extends aggn {
    private final boolean a;
    private final aggl b;

    public agdc(boolean z, aggl aggl) {
        this.a = z;
        this.b = aggl;
    }

    public final boolean a() {
        return this.a;
    }

    public final aggl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aggn) {
            aggn aggn = (aggn) obj;
            return this.a == aggn.a() && this.b.equals(aggn.b());
        }
    }

    public final int hashCode() {
        return (((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("PrimesBatteryConfigurations{enabled=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
