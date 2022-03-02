package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: dis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dis {
    public static final amzy a = amzy.a((Object) Integer.valueOf((int) awgs.a.a().m()), (Object) Integer.valueOf((int) awgs.a.a().l()));
    public final qvr b = new qvr();
    public final List c = Collections.synchronizedList(new ArrayList());
    private final hol d;
    private final dje e;

    private dis(Context context, dje dje) {
        this.d = hol.a(context, "IDENTITY_FRONTEND");
        this.e = dje;
    }

    public static dis a(Context context, dih dih) {
        dje dje = new dje(ModuleManager.get(context));
        if (dio.a(dih)) {
            return new dis(context, dih.a, dje);
        }
        return a(context, dje);
    }

    public final void b() {
        if (!this.c.isEmpty()) {
            for (Runnable removeCallbacks : this.c) {
                this.b.removeCallbacks(removeCallbacks);
            }
            this.c.clear();
        }
    }

    public final int c() {
        return qud.h() ? 3 : 2;
    }

    public dis(Context context, String str, dje dje) {
        this.d = new hol(context, "IDENTITY_FRONTEND", str);
        this.e = dje;
    }

    public static dis a(Context context, dje dje) {
        return new dis(context, dje);
    }

    public final aqlq a() {
        aqqq b2 = this.e.b();
        aqqr a2 = this.e.a();
        aucd o = aqls.c.o();
        aucx aucx = b2.c;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            aucd o2 = aqmo.c.o();
            int i2 = ((aqtl) aucx.get(i)).b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqmo aqmo = (aqmo) o2.b;
            aqmo.a |= 1;
            aqmo.b = i2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqls aqls = (aqls) o.b;
            aqmo aqmo2 = (aqmo) o2.i();
            aqmo2.getClass();
            if (!aqls.b.a()) {
                aqls.b = aucj.a(aqls.b);
            }
            aqls.b.add(aqmo2);
        }
        aucx aucx2 = b2.b;
        int size2 = aucx2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            aucd o3 = aqmp.c.o();
            int i4 = ((aqtm) aucx2.get(i3)).b;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aqmp aqmp = (aqmp) o3.b;
            aqmp.a |= 1;
            aqmp.b = i4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqls aqls2 = (aqls) o.b;
            aqmp aqmp2 = (aqmp) o3.i();
            aqmp2.getClass();
            if (!aqls2.a.a()) {
                aqls2.a = aucj.a(aqls2.a);
            }
            aqls2.a.add(aqmp2);
        }
        aucd o4 = aqlt.f.o();
        String str = a2.b;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqlt aqlt = (aqlt) o4.b;
        str.getClass();
        int i5 = aqlt.a | 1;
        aqlt.a = i5;
        aqlt.b = str;
        if ((a2.a & 32) != 0) {
            String str2 = a2.g;
            str2.getClass();
            i5 |= 4;
            aqlt.a = i5;
            aqlt.d = str2;
        }
        if ((a2.a & 16) != 0) {
            String str3 = a2.f;
            str3.getClass();
            i5 |= 2;
            aqlt.a = i5;
            aqlt.c = str3;
        }
        if ((a2.a & 4) != 0) {
            String str4 = a2.d;
            str4.getClass();
            aqlt.a = i5 | 64;
            aqlt.e = str4;
        }
        aucd o5 = aqlq.e.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqlq aqlq = (aqlq) o5.b;
        aqls aqls3 = (aqls) o.i();
        aqls3.getClass();
        aqlq.b = aqls3;
        aqlq.a |= 1;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqlq aqlq2 = (aqlq) o5.b;
        aqlt aqlt2 = (aqlt) o4.i();
        aqlt2.getClass();
        aqlq2.c = aqlt2;
        aqlq2.a |= 2;
        this.e.c();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        aqlq aqlq3 = (aqlq) o5.b;
        aqlq3.a |= 4;
        aqlq3.d = false;
        return (aqlq) o5.i();
    }

    public final aqmh a(String str, long j, String str2) {
        aucd o = aqmh.g.o();
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = split[length - 1];
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqmh aqmh = (aqmh) o.b;
        str3.getClass();
        int i = aqmh.a | 1;
        aqmh.a = i;
        aqmh.b = str3;
        String str4 = split[length - 2];
        str4.getClass();
        aqmh.a = i | 2;
        aqmh.c = str4;
        String g = awgs.g();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqmh aqmh2 = (aqmh) o.b;
        g.getClass();
        int i2 = aqmh2.a | 4;
        aqmh2.a = i2;
        aqmh2.d = g;
        int i3 = i2 | 8;
        aqmh2.a = i3;
        aqmh2.e = (int) j;
        if (str2 != null) {
            str2.getClass();
            aqmh2.a = i3 | 16;
            aqmh2.f = str2;
        }
        return (aqmh) o.i();
    }

    public final void a(int i, int i2, int i3) {
        aucd o = aqna.d.o();
        aucd o2 = aqmx.c.o();
        aucd o3 = aqmv.f.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmv aqmv = (aqmv) o3.b;
        aqmv.b = 3;
        aqmv.a |= 1;
        aucd o4 = aqmw.f.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqmw aqmw = (aqmw) o4.b;
        int i4 = aqmw.a | 4;
        aqmw.a = i4;
        aqmw.e = i;
        int i5 = i4 | 1;
        aqmw.a = i5;
        aqmw.b = i2;
        aqmw.a = i5 | 2;
        aqmw.c = i3;
        amzy amzy = a;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        aqmw aqmw2 = (aqmw) o4.b;
        if (!aqmw2.d.a()) {
            aqmw2.d = aucj.a(aqmw2.d);
        }
        auab.a((Iterable) amzy, (List) aqmw2.d);
        aqmw aqmw3 = (aqmw) o4.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqmv aqmv2 = (aqmv) o3.b;
        aqmw3.getClass();
        aqmv2.e = aqmw3;
        aqmv2.a |= 16;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqmx aqmx = (aqmx) o2.b;
        aqmv aqmv3 = (aqmv) o3.i();
        aqmv3.getClass();
        aqmx.b = aqmv3;
        aqmx.a |= 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmx aqmx2 = (aqmx) o2.i();
        aqmx2.getClass();
        aqna.c = aqmx2;
        aqna.a |= 8;
        a((aqna) o.i());
    }

    public final void a(int i, int i2, String str) {
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 5;
        int i3 = aqmz.a | 1;
        aqmz.a = i3;
        aqmz.c = i2 - 1;
        int i4 = i3 | 2;
        aqmz.a = i4;
        int i5 = i4 | 8;
        aqmz.a = i5;
        aqmz.e = i;
        aqmz.a = i5 | 16;
        aqmz.f = true;
        aqlq a2 = a();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz2 = (aqmz) aucf.b;
        a2.getClass();
        aqmz2.h = a2;
        int i6 = aqmz2.a | 64;
        aqmz2.a = i6;
        if (str != null) {
            str.getClass();
            aqmz2.a = i6 | 4;
            aqmz2.d = str;
        }
        aucd o = aqna.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz aqmz3 = (aqmz) aucf.i();
        aqmz3.getClass();
        aqna.b = aqmz3;
        aqna.a |= 1;
        a((aqna) o.i());
    }

    public final void a(aqna aqna) {
        this.d.a(aqna.k()).b();
    }
}
