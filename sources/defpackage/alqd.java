package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alqd {
    public String a;
    public final Map b = new HashMap();
    public final alqb c = new alqb(new alqa());
    public final List d = new ArrayList();
    public final Map e = new HashMap();

    public final alqf a() {
        return new alqf(this);
    }

    public final void a(alqe alqe) {
        this.d.add(alqe);
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }
}
