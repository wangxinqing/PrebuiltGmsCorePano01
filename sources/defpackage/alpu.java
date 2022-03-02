package defpackage;

/* renamed from: alpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpu {
    public final alpx a;

    public alpu(alpx alpx) {
        this.a = alpx;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("BindCompleteEvent [continutationToken=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
