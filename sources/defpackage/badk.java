package defpackage;

/* renamed from: badk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class badk {
    public final azzg a;
    public azzn b;
    public azzp c;
    final /* synthetic */ badp d;

    public badk(badp badp, azzg azzg) {
        this.d = badp;
        this.a = azzg;
        azzp a2 = badp.a.a(badp.b);
        this.c = a2;
        if (a2 != null) {
            this.b = a2.a(azzg);
            return;
        }
        String str = badp.b;
        StringBuilder sb = new StringBuilder(str.length() + 182);
        sb.append("Could not find policy '");
        sb.append(str);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb.toString());
    }
}
