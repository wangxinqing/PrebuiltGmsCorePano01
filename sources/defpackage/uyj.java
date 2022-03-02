package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: uyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyj {
    public final Context a;
    public final Map b = new HashMap();
    public final Set c = new TreeSet(new uyh());
    public final arwg d;
    public final Set e = new HashSet();
    public uyg f;

    public uyj(Context context) {
        this.a = context;
        this.d = (arwg) thl.a(context, arwg.class);
    }

    public final Set a() {
        this.d.b();
        c();
        HashSet hashSet = new HashSet();
        for (uyg uyg : this.c) {
            hashSet.add(uyg.e);
        }
        for (vdo vdo : this.b.values()) {
            hashSet.add(vdo.c.b);
        }
        return hashSet;
    }

    public final void b(Collection collection, int i, int i2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            vdo vdo = (vdo) this.b.get(str);
            if (vdo != null) {
                vdo.a(i, i2);
                if (!vdo.a(i)) {
                    this.b.remove(str);
                }
            }
        }
    }

    public final boolean b() {
        return this.f != null;
    }

    public final void c() {
        this.d.b();
        a((String) null);
    }

    public final void d() {
        for (uyi a2 : this.e) {
            a2.a();
        }
    }

    public final Set a(ClientAppIdentifier clientAppIdentifier) {
        this.d.b();
        HashSet hashSet = new HashSet();
        for (uyg uyg : this.c) {
            if (clientAppIdentifier == null || clientAppIdentifier.equals(uyg.e)) {
                hashSet.add(uyg.a);
            }
        }
        return hashSet;
    }

    public final void a(String str) {
        this.d.b();
        if (str != null) {
            jjg jjg = tgc.a;
        }
        int size = this.c.size();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            uyg uyg = (uyg) it.next();
            if (uyg.a() < SystemClock.elapsedRealtime() || uyg.a.equals(str)) {
                it.remove();
                jjg jjg2 = tgc.a;
                this.c.size();
                if (uyg == this.f) {
                    this.f = null;
                }
            }
        }
        if (this.c.size() != size) {
            d();
        }
    }

    public final void a(Collection collection, int i, int i2) {
        uyg uyg;
        vdo vdo;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.d.b();
            Iterator it2 = this.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    uyg = null;
                    break;
                }
                uyg = (uyg) it2.next();
                if (uyg.a.equals(str)) {
                    break;
                }
            }
            if (!(uyg == null || (vdo = uyg.f) == null)) {
                vdo.a(i, i2);
                if (vdo.f == 3) {
                    a(str);
                }
            }
        }
    }
}
