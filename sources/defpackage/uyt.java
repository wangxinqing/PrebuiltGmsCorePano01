package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: uyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyt {
    public final thl a;
    public final Set b = new HashSet();
    public final aneu c = amzg.q();
    public final aneu d = amzg.q();
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public final arwg g;
    public uyq h;
    private final Context i;
    private final arwm j = new uyr(this, "SubscriptionManager.removeExpired");

    public uyt(Context context) {
        this.i = context;
        this.a = thl.a(context);
        this.g = (arwg) thl.a(context, arwg.class);
    }

    public final ClientAppIdentifier a(uyq uyq) {
        this.g.b();
        for (ClientAppIdentifier clientAppIdentifier : this.d.m()) {
            if (this.d.b(clientAppIdentifier, uyq)) {
                return clientAppIdentifier;
            }
        }
        return null;
    }

    public final Set b() {
        this.g.b();
        a();
        return new ob(this.e.values());
    }

    public final Set c() {
        this.g.b();
        HashSet hashSet = new HashSet(this.d.m());
        hashSet.addAll(this.c.m());
        return hashSet;
    }

    public final boolean d() {
        this.g.b();
        a();
        return this.e.isEmpty();
    }

    public final boolean e() {
        return this.h != null;
    }

    public final boolean f() {
        for (uyq a2 : this.f.values()) {
            if (!a2.a()) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        this.g.b();
        this.e.size();
    }

    public final Collection a(ClientAppIdentifier clientAppIdentifier) {
        this.g.b();
        iva.a((Object) clientAppIdentifier);
        a();
        return new HashSet(((amxb) this.d).c((Object) clientAppIdentifier));
    }

    public final void b(uyp uyp) {
        this.g.b();
        uyq uyq = (uyq) this.e.remove(uyp);
        if (uyq != null) {
            this.d.c(a(uyq), uyq);
            this.f.remove(uyq.a);
            for (uys b2 : this.b) {
                b2.b();
            }
            jjg jjg = tgc.a;
            g();
            if (uyq.equals(this.h)) {
                this.h = null;
                ((vgw) thl.a(this.i, vgw.class)).b();
                return;
            }
            return;
        }
        jjg jjg2 = tgc.a;
        g();
    }

    public final uyq a(PendingIntent pendingIntent) {
        return a(new uyp(pendingIntent));
    }

    public final uyq a(String str) {
        this.g.b();
        return (uyq) this.f.get(str);
    }

    public final uyq a(uyp uyp) {
        this.g.b();
        a();
        return (uyq) this.e.get(uyp);
    }

    public final uyq a(vcf vcf) {
        return a(new uyp(vcf));
    }

    public final void a() {
        this.g.b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        long j2 = Long.MAX_VALUE;
        for (uyq uyq : this.e.values()) {
            long j3 = uyq.e;
            if (j3 < elapsedRealtime) {
                arrayList.add(uyq);
            } else if (j3 < j2) {
                j2 = j3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            uyq uyq2 = (uyq) arrayList.get(i2);
            if (vds.a(uyq2.b())) {
                ((anih) ((anih) tgc.a.b()).a("uyt", "a", 192, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Skip renewing ephemeral infinite-TTL entry: %s", (Object) "SubscriptionManager: ", (Object) uyq2.b);
            } else {
                jjg jjg = tgc.a;
                uyp uyp = uyq2.b;
                b(uyq2);
            }
        }
        this.g.e(this.j);
        if (j2 != Long.MAX_VALUE) {
            jjg jjg2 = tgc.a;
            this.g.a(this.j, (j2 - elapsedRealtime) + 1);
        }
        if (!arrayList2.isEmpty()) {
            uwr uwr = (uwr) this.a.a(uwr.class);
            uwr.b.b();
            uwr.d.a(arrayList2, 0, 0);
            uwr.e.a();
        }
    }

    public final void b(uyq uyq) {
        this.g.b();
        if (uyq != null) {
            b(uyq.b);
        }
    }

    public final void a(Collection collection, int i2) {
        if (!vdo.a(i2)) {
            this.c.n().removeAll(collection);
        }
    }

    public final void a(Collection collection, int i2, int i3) {
        vdo vdo;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            uyq a2 = a((String) it.next());
            if (!(a2 == null || (vdo = a2.f) == null)) {
                vdo.a(i2, i3);
                if (vdo.f == 3) {
                    b(a2);
                }
            }
        }
    }

    public final void a(uys uys) {
        this.g.b();
        this.b.add(uys);
    }
}
