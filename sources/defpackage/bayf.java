package defpackage;

import java.util.List;
import org.webrtc.PeerConnection;

/* renamed from: bayf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bayf {
    public String a = "";
    public String b = "";
    private final List c;
    private final PeerConnection.TlsCertPolicy d = PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE;
    private final String e = "";

    public bayf(List list) {
        if (list == null || list.isEmpty()) {
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("urls == null || urls.isEmpty(): ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        this.c = list;
    }

    public final PeerConnection.IceServer a() {
        return new PeerConnection.IceServer((String) this.c.get(0), this.c, this.a, this.b, this.d, this.e);
    }
}
