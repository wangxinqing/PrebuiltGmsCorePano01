package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kki {
    public final krk a;
    public final kkk b = new kkk();
    public final Map c = new HashMap();

    public kki(krk krk) {
        iva.a((Object) krk);
        this.a = krk;
    }

    public final void a(kmh kmh) {
        String str = kmh.b;
        iva.a((Object) str);
        iva.a(this.c.get(str) == null);
        this.c.put(str, kmh);
    }

    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
