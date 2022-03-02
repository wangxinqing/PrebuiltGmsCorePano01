package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: ahwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwt {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    long e = 0;
    public final int f;

    public ahwt(int i) {
        this.f = i;
    }

    public final aiwz a() {
        if (this.a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.a;
        return (aiwz) arrayList.get(arrayList.size() - 1);
    }

    public final void a(int i) {
        if (i >= 0 && i < this.a.size()) {
            aiwz aiwz = (aiwz) this.a.get(i);
            this.a.remove(i);
            this.b.remove(aiwz);
            this.c.remove(aiwz);
            this.d.remove(aiwz);
            Locale locale = Locale.ENGLISH;
            new Object[1][0] = Long.valueOf(aiwz.b);
        }
    }
}
