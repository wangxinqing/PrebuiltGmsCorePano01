package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: trk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trk {
    public final toc a;
    public final boolean b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final Map d = new nz();

    public trk(toc toc, List list, boolean z) {
        this.a = toc;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            this.d.put(str, new trj(str));
        }
        this.b = z;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.a.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.c.get();
    }

    /* access modifiers changed from: package-private */
    public final synchronized List c() {
        return amzy.a(this.d.values());
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.a.c();
    }

    public final String toString() {
        return this.a.toString();
    }

    /* access modifiers changed from: package-private */
    public final synchronized trj a(String str) {
        return (trj) this.d.get(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, long j) {
        trj trj = (trj) this.d.get(str);
        if (trj != null) {
            trj.c = j;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, asam asam) {
        tri tri;
        trj trj = (trj) this.d.get(str);
        if (trj != null) {
            asal a2 = asal.a(asam.b);
            if (a2 == null) {
                a2 = asal.UNKNOWN_EVENT_TYPE;
            }
            tri tri2 = tri.UNKNOWN;
            asao asao = asao.UNKNOWN_PACKET_TYPE;
            asog asog = asog.UNKNOWN_PAYLOAD_STATUS;
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                tri = tri.ERROR;
            } else if (ordinal != 2) {
                ((anih) tky.a.d()).a("Unknown EndpointInfo.Status for ControlMessage.EventType %s!", (Object) a2);
                tri = tri.UNKNOWN;
            } else {
                tri = tri.CANCELED;
            }
            trj.b = tri;
            jjg jjg = tky.a;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(List list) {
        this.d.keySet().removeAll(list);
    }
}
