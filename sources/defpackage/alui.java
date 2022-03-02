package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: alui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alui implements alsr {
    public final Map a = new HashMap();
    public final alun b;
    public aluh c;
    public Map d = new HashMap();
    public Map e;
    public int f;
    private final aluh g;
    private alsj h;

    public alui(alui alui, alul alul) {
        this.g = alul;
        this.b = new alun(alul);
        this.f = alui.f;
        this.e = alui.e;
        for (Map.Entry entry : alui.d.entrySet()) {
            this.d.put((String) entry.getKey(), ((altx) entry.getValue()).a((aluh) alul));
        }
        for (Map keySet : alui.a.values()) {
            for (String a2 : keySet.keySet()) {
                a((alug) a(a2));
            }
        }
    }

    private final altx a(String str, altx altx, altx altx2) {
        synchronized (this.e) {
            if (altx != null) {
                try {
                    aluh aluh = altx.b;
                    aluh aluh2 = this.g;
                    if (aluh != aluh2) {
                        if (altx2 == null) {
                            altx = altx.a(aluh2);
                            this.d.put(str, altx);
                        }
                    } else if (altx2 == null) {
                        this.d.put(str, altx);
                        this.e.put(str, altx.a(this.c));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            altx = altx2;
        }
        return altx;
    }

    public final String b() {
        String a2 = alyq.a();
        while (a(a2) != null) {
            a2 = alyq.a();
        }
        return a2;
    }

    public final alsj c() {
        alsj alsj = this.h;
        if (alsj != null) {
            return alsj;
        }
        alsj alsj2 = (alsj) a("root");
        this.h = alsj2;
        return alsj2;
    }

    public final void d() {
        synchronized (this.e) {
            for (Map.Entry entry : this.e.entrySet()) {
                String str = (String) entry.getKey();
                a(str, (altx) entry.getValue(), (altx) this.d.get(str));
            }
            this.e = Collections.emptyMap();
        }
    }

    public final Map b(String str) {
        Map map = (Map) this.a.get(str);
        return map == null ? Collections.emptyMap() : map;
    }

    public final altx a(String str) {
        return a(str, false);
    }

    public final altx a(String str, boolean z) {
        altx altx = (altx) this.d.get(str);
        if (z) {
            return a(str, (altx) this.e.get(str), altx);
        }
        if (altx != null) {
            return altx;
        }
        altx altx2 = (altx) this.e.get(str);
        return (altx2 != null && altx2.b == this.g) ? altx2 : a(str, (altx) this.e.get(str), (altx) null);
    }

    public alui(alun alun, aluh aluh) {
        this.g = aluh;
        this.b = alun;
        this.e = Collections.emptyMap();
    }

    public final Set a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.d.keySet());
        hashSet.addAll(this.e.keySet());
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    public final void a(alug alug) {
        Map map = (Map) this.a.get(alug.c);
        if (map == null) {
            map = new HashMap();
            this.a.put(alug.c, map);
        }
        map.put(alug.d(), alug);
    }
}
