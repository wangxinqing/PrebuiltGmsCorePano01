package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoe {
    public int a;
    public int b;
    public int c;
    public long d = -1;
    float[][] e;
    public boolean f;
    public long g;
    public aibh h;
    public final List i = new ArrayList();
    public final List j = new ArrayList();

    public ahoe(aibh aibh) {
        this.h = aibh;
        try {
            aqek a2 = aibh.a();
            if (a2.h(3)) {
                boolean z = true;
                this.g = a2.c(1);
                int b2 = a2.b(2);
                this.b = b2;
                int i2 = (b2 + 1) % 240;
                this.a = i2;
                if (i2 != 0 && !a2.a(3)) {
                    z = false;
                }
                this.f = z;
                int b3 = a2.b(4);
                int j2 = a2.j(5) / b3;
                this.e = new float[240][];
                for (int i3 = 0; i3 < j2; i3++) {
                    this.e[i3] = new float[b3];
                    for (int i4 = 0; i4 < b3; i4++) {
                        this.e[i3][i4] = a2.e(5, (i3 * b3) + i4);
                    }
                }
                if (a2.h(6)) {
                    int j3 = a2.j(6) / 2;
                    for (int i5 = 0; i5 < j3; i5++) {
                        int i6 = i5 + i5;
                        this.i.add(new aiba(Long.valueOf(a2.d(6, i6)), Long.valueOf(a2.d(6, i6 + 1))));
                    }
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("Loaded ");
                    sb.append(j3);
                    sb.append(" missingDataWindows from disk.");
                    sb.toString();
                }
                if (a2.h(7)) {
                    int j4 = a2.j(7) / 2;
                    for (int i7 = 0; i7 < j4; i7++) {
                        int i8 = i7 + i7;
                        this.j.add(new aiba(Long.valueOf(a2.d(7, i8)), Long.valueOf(a2.d(7, i8 + 1))));
                    }
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("Loaded ");
                    sb2.append(j4);
                    sb2.append(" previouslyDetectedSleep from disk.");
                    sb2.toString();
                }
                this.c = 0;
                StringBuilder sb3 = new StringBuilder(38);
                sb3.append("Loaded ");
                sb3.append(j2);
                sb3.append(" features from disk.");
                sb3.toString();
                return;
            }
            d();
        } catch (IOException e2) {
            d();
        }
    }

    public static final int a(ahok[] ahokArr) {
        int i2 = 0;
        for (ahok ahok : ahokArr) {
            int i3 = ahok.b;
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    private final void d() {
        this.a = 0;
        this.b = 0;
        this.f = false;
        this.e = new float[240][];
        this.g = -1;
        this.c = 0;
    }

    public final int a() {
        if (!this.f) {
            return this.a;
        }
        return 239;
    }

    public final List b() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            aiba aiba = (aiba) it.next();
            String valueOf = String.valueOf(aiba.a);
            String valueOf2 = String.valueOf(aiba.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
            sb.append("Missing data: ");
            sb.append(valueOf);
            sb.append(" - ");
            sb.append(valueOf2);
            sb.toString();
            if (((Long) aiba.b).longValue() < System.currentTimeMillis() - 86400000) {
                it.remove();
            }
        }
        return this.i;
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((Long) ((aiba) it.next()).b).longValue() < currentTimeMillis) {
                it.remove();
            }
        }
    }

    public final void a(long j2) {
        int i2;
        aqek aqek = new aqek(ajck.cd);
        aqek.b(1, j2);
        aqek.g(2, this.b);
        aqek.b(3, this.f);
        int length = this.e[0].length;
        aqek.g(4, length);
        this.c = 0;
        if (!this.f) {
            i2 = this.a + 1;
        } else {
            i2 = this.e.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                aqek.a(5, this.e[i3][i4]);
            }
        }
        if (!b().isEmpty()) {
            List list = this.i;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                aiba aiba = (aiba) list.get(i5);
                aqek.a(6, ((Long) aiba.a).longValue());
                aqek.a(6, ((Long) aiba.b).longValue());
            }
        }
        c();
        if (!this.j.isEmpty()) {
            List list2 = this.j;
            int size2 = list2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                aiba aiba2 = (aiba) list2.get(i6);
                aqek.a(7, ((Long) aiba2.a).longValue());
                aqek.a(7, ((Long) aiba2.b).longValue());
            }
        }
        int size3 = this.i.size();
        int size4 = this.j.size();
        StringBuilder sb = new StringBuilder(102);
        sb.append("Saving ");
        sb.append(i2);
        sb.append(" features, ");
        sb.append(size3);
        sb.append(" missing windows, ");
        sb.append(size4);
        sb.append(" previous sleep segments to disk.");
        sb.toString();
        try {
            this.h.a(aqek);
        } catch (IOException e2) {
        }
    }
}
