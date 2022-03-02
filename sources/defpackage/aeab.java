package defpackage;

/* renamed from: aeab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeab implements adym {
    private final String a;
    private final String b;

    public aeab(adym adym) {
        this.a = adym.a();
        this.b = adym.b();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }
}
