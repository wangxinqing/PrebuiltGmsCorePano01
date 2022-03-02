package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: alpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alpe implements alpl {
    private static final Map c = Collections.emptyMap();
    private static final alpi d = new alpb();
    public final alpf a;
    public alrg b = alrg.SUCCESS;
    private final alvk e;
    private final alwr f = new alwr();
    private final Queue g = new LinkedList();
    private final alqf h;
    private final alqf i;
    private boolean j = true;

    public alpe(alpf alpf, String str, String str2) {
        alwi alwi = new alwi();
        this.e = new alvk(false);
        new alwv(alwi, false);
        this.a = alpf;
        this.h = alpf.a(str, str2).a();
        this.i = alpf.a(str, (String) null).a();
    }

    private final synchronized void a() {
        if (!this.j) {
            while (!this.g.isEmpty()) {
                ((aloz) this.a).a.a(this.b, (Runnable) this.g.poll());
            }
        }
    }

    public final synchronized void b() {
        this.j = true;
        this.a.a("leave", this.h, c, (String) null, d, (alva) null);
    }

    public final synchronized void c() {
        this.j = false;
        a();
    }

    private final synchronized void a(String str, alqf alqf, Map map, String str2, alpi alpi, alva alva) {
        this.g.add(new alpd(this, str, alqf, map, str2, alpi, alva));
        a();
    }

    public final void a(int i2, int i3, alpi alpi) {
        HashMap hashMap = new HashMap();
        hashMap.put("startRev", Integer.toString(i2));
        hashMap.put("includeType", "false");
        if (i3 >= 0) {
            hashMap.put("endRev", Integer.toString(i3));
        }
        a("catchup", this.i, hashMap, (String) null, alpi, this.e);
    }

    public final void a(alru alru, alpi alpi) {
        StringBuilder sb = new StringBuilder();
        this.f.a(new alzd(sb), alru);
        a("save", this.h, c, sb.toString(), alpi, (alva) null);
    }
}
