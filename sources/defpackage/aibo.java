package defpackage;

/* renamed from: aibo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibo extends aiav {
    public final int a;
    public final aibw b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aibo(int i, aibe aibe, aiau aiau, long j, aibw aibw, boolean z) {
        super(aibe, aiau, aibw != null ? aibw.d() : j, z);
        this.a = i;
        this.b = aibw;
    }

    public static aibo a(int i, aibe aibe, long j, aibw aibw) {
        return new aibo(i, aibe, aiau.OK, j, aibw, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        a(sb, this);
        return sb.toString();
    }

    public static aibo a(aiau aiau, long j, aibw aibw) {
        return new aibo(0, (aibe) null, aiau, j, aibw, false);
    }

    public static void a(StringBuilder sb, aibo aibo) {
        String str;
        String str2 = "null";
        if (aibo != null) {
            sb.append("WifiLocatorResult [type=");
            int i = aibo.a;
            if (i != 5) {
                str = i != 6 ? "UNKNOWN" : "RTT";
            } else {
                str = "Frewle";
            }
            sb.append(str);
            sb.append(",wifiScan=");
            aibw aibw = aibo.b;
            if (aibw != null) {
                str2 = aibw.toString();
            }
            sb.append(str2);
            aiav.a(sb, aibo);
            sb.append("]");
            return;
        }
        sb.append(str2);
    }
}
