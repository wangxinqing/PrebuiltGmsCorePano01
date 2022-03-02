package defpackage;

/* renamed from: aipu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aipu extends aipi {
    private final boolean a;
    private final boolean b;

    public aipu(ajrb ajrb, String str, boolean z, boolean z2) {
        super(ajrb, str);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aipu) || !super.equals(obj) || this.a != ((aipu) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((super.hashCode() * 31) + (this.a ? 1 : 0)) * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        String aipi = super.toString();
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(aipi).length() + 47);
        sb.append(aipi);
        sb.append(" LowPower: ");
        sb.append(z);
        sb.append(" LocationSettingsIgnored: ");
        sb.append(z2);
        return sb.toString();
    }
}
