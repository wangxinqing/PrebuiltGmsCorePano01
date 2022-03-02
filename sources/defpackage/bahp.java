package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* renamed from: bahp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahp {
    public List a;
    public int b;
    public int c;

    public bahp(List list) {
        this.a = list;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((azyj) this.a.get(this.b)).b.get(this.c);
    }
}
