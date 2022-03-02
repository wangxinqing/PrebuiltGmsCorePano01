package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: azyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyj {
    public static final azwz a = azwz.a("io.grpc.EquivalentAddressGroup.authorityOverride");
    public final List b;
    public final azxa c;
    private final int d = this.b.hashCode();

    public azyj(SocketAddress socketAddress) {
        azxa azxa = azxa.b;
        List singletonList = Collections.singletonList(socketAddress);
        amrl.a(!singletonList.isEmpty(), (Object) "addrs is empty");
        this.b = Collections.unmodifiableList(new ArrayList(singletonList));
        amrl.a((Object) azxa, (Object) "attrs");
        this.c = azxa;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azyj) {
            azyj azyj = (azyj) obj;
            if (this.b.size() == azyj.b.size()) {
                for (int i = 0; i < this.b.size(); i++) {
                    if (!((SocketAddress) this.b.get(i)).equals(azyj.b.get(i))) {
                        return false;
                    }
                }
                if (this.c.equals(azyj.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
