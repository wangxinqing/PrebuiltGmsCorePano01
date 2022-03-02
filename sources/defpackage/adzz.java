package defpackage;

/* renamed from: adzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adzz implements adyk {
    private final int a;
    private final adyl b;

    public adzz(adyk adyk) {
        this.a = adyk.b();
        this.b = (adyl) adyk.a().r();
    }

    public final adyl a() {
        throw null;
    }

    public final int b() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        int i = this.a;
        String str = i == 1 ? "changed" : i != 2 ? "unknown" : "deleted";
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(valueOf).length());
        sb.append("DataEventEntity{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
