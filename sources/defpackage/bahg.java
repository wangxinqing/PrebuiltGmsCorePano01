package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bahg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahg implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bahv b;

    public bahg(bahv bahv, List list) {
        this.b = bahv;
        this.a = list;
    }

    public final void run() {
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(this.a));
        SocketAddress b2 = this.b.f.b();
        bahp bahp = this.b.f;
        bahp.a = unmodifiableList;
        bahp.a();
        this.b.g = unmodifiableList;
        bajo bajo = null;
        if (this.b.n.a == azxz.READY || this.b.n.a == azxz.CONNECTING) {
            bahp bahp2 = this.b.f;
            int i = 0;
            while (true) {
                if (i < bahp2.a.size()) {
                    int indexOf = ((azyj) bahp2.a.get(i)).b.indexOf(b2);
                    if (indexOf != -1) {
                        bahp2.b = i;
                        bahp2.c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.b.n.a == azxz.READY) {
                    bajo bajo2 = this.b.m;
                    this.b.m = null;
                    this.b.f.a();
                    this.b.a(azxz.IDLE);
                    bajo = bajo2;
                } else {
                    bahv bahv = this.b;
                    bajo = bahv.l;
                    bahv.l = null;
                    this.b.f.a();
                    this.b.c();
                }
            }
        }
        if (bajo != null) {
            bajo.a(babj.o.a("InternalSubchannel closed transport due to address change"));
        }
    }
}
