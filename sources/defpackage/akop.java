package defpackage;

/* renamed from: akop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akop {
    public final aocj a;
    public final long b;
    public final aklr c;
    public final akli d;

    private akop(aocj aocj, long j, aklr aklr, akli akli) {
        this.a = aocj;
        this.b = j;
        this.c = aklr;
        this.d = akli;
    }

    public static akop a(long j) {
        return new akop(aocj.IN_TRANSIT, j, (aklr) null, (akli) null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("Segment {type=");
        sb.append(valueOf);
        sb.append(" beginTimeEpochMillis=");
        sb.append(j);
        sb.append(" centroid=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public static akop a(long j, aklr aklr, akli akli) {
        return new akop(aocj.AT_PLACE, j, aklr, akli);
    }
}
