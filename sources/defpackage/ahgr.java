package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ahgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahgr implements ahhd {
    private final hol a;
    private final String b;
    private CopyOnWriteArrayList c;
    private CopyOnWriteArrayList d;
    private String e;

    public ahgr(Context context, String str) {
        this(new hol(context, str, (String) null), str);
    }

    public final void a(ahhc ahhc) {
        ahhe ahhe = new ahhe(ahhc);
        if (ahhe.a.a.size() != 0) {
            hoi a2 = this.a.a((hok) ahhe);
            a2.d = this.b;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                a2.a((String) it.next());
            }
            if (!this.e.isEmpty()) {
                String str = this.e;
                aucf aucf = a2.i;
                if (aucf.c) {
                    aucf.c();
                    aucf.c = false;
                }
                avrm avrm = (avrm) aucf.b;
                avrm avrm2 = avrm.t;
                str.getClass();
                avrm.a |= 32;
                avrm.g = str;
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                a2 = ((ahgq) it2.next()).a();
            }
            a2.b();
        }
    }

    public ahgr(hol hol, String str) {
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = "";
        if (str.startsWith("STREAMZ_")) {
            this.a = hol;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }
}
