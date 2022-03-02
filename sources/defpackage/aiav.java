package defpackage;

/* renamed from: aiav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aiav {
    public final aibe c;
    public final aiau d;
    public final long e;
    public final boolean f;

    public aiav(aibe aibe, aiau aiau, long j, boolean z) {
        this.c = aibe;
        this.d = aiau;
        this.e = j;
        this.f = z;
        if ((aiau == aiau.OK) != (aibe != null)) {
            throw new RuntimeException("Invalid Args");
        }
    }

    public static void a(StringBuilder sb, aiav aiav) {
        sb.append("LocatorResult [position=");
        aibe.a(sb, aiav.c);
        sb.append(", status=");
        sb.append(aiav.d);
        sb.append(", reportTime=");
        sb.append(aiav.e);
        sb.append(", wantsGlsModels=");
        sb.append(aiav.f);
        sb.append("]");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, this);
        return sb.toString();
    }
}
