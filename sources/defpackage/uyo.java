package defpackage;

import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: uyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyo {
    public final Strategy a;
    public final MessageFilter b;
    public final uym c;
    public final boolean d;
    public final int e;

    static {
        new uyn().a();
    }

    public uyo(Strategy strategy, MessageFilter messageFilter, uym uym, boolean z, int i) {
        this.a = strategy;
        this.b = messageFilter;
        this.c = uym;
        this.d = z;
        this.e = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("SubscribeOptions{strategy=");
        sb.append(valueOf);
        sb.append(", filter=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
