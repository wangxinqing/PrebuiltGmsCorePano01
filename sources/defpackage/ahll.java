package defpackage;

/* renamed from: ahll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahll {
    public final aibw a;
    public final aiax b;

    public ahll(aibw aibw, aiax aiax) {
        this.a = aibw;
        this.b = aiax;
    }

    public final String toString() {
        aiax aiax = this.b;
        String replaceAll = aiax != null ? aiax.toString().replaceAll("\n", "_") : null;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(replaceAll).length());
        sb.append("ClassificationSignals [wifiScan=");
        sb.append(valueOf);
        sb.append(", networkLocation=");
        sb.append(replaceAll);
        sb.append("]");
        return sb.toString();
    }
}
