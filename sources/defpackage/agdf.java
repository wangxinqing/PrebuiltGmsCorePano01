package defpackage;

/* renamed from: agdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agdf extends aghj {
    private final boolean a;
    private final int b;
    private final boolean c;
    private final amri d;

    public agdf(boolean z, int i, boolean z2, amri amri) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = amri;
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final agiq c() {
        return null;
    }

    public final boolean d() {
        return this.c;
    }

    public final amri e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aghj) {
            aghj aghj = (aghj) obj;
            return this.a == aghj.a() && this.b == aghj.b() && aghj.c() == null && this.c == aghj.d() && this.d.equals(aghj.e());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * -721379959;
        if (this.c) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String valueOf = String.valueOf((Object) null);
        boolean z2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 139 + String.valueOf(valueOf2).length());
        sb.append("PrimesNetworkConfigurations{enabled=");
        sb.append(z);
        sb.append(", batchSize=");
        sb.append(i);
        sb.append(", urlSanitizer=");
        sb.append(valueOf);
        sb.append(", enableUrlAutoSanitization=");
        sb.append(z2);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
