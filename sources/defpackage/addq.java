package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: addq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addq {
    private final adap a;

    public addq(adap adap) {
        this.a = adap;
    }

    private static int a(boolean z) {
        return z ? 3 : 4;
    }

    private static boolean b(int i) {
        return i == 3;
    }

    private final boolean a(int i) {
        return this.a.b().contains(Integer.valueOf(i));
    }

    public final atvp b() {
        aucd o = atvp.d.o();
        List a2 = this.a.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            atyt atyt = (atyt) a2.get(i);
            if (a(atyt.b)) {
                int i2 = atyt.b;
                int i3 = 1;
                if (i2 == 9) {
                    int a3 = atzq.a(atyt.d);
                    if (a3 != 0) {
                        i3 = a3;
                    }
                    boolean b = b(i3);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atvp atvp = (atvp) o.b;
                    atvp.a |= 2;
                    atvp.c = b;
                } else if (i2 == 10) {
                    int a4 = atzq.a(atyt.d);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    boolean b2 = b(a4);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    atvp atvp2 = (atvp) o.b;
                    atvp2.a |= 1;
                    atvp2.b = b2;
                }
            }
        }
        return (atvp) o.i();
    }

    public final void a(atvp atvp) {
        ArrayList arrayList = new ArrayList();
        if (a(9)) {
            aucd o = atzg.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atzg atzg = (atzg) o.b;
            atzg.a |= 1;
            atzg.b = 9;
            int a2 = a(atvp.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atzg atzg2 = (atzg) o.b;
            atzg2.c = a2 - 1;
            atzg2.a |= 2;
            arrayList.add((atzg) o.i());
        }
        if (a(10)) {
            aucd o2 = atzg.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atzg atzg3 = (atzg) o2.b;
            atzg3.a |= 1;
            atzg3.b = 10;
            int a3 = a(atvp.b);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atzg atzg4 = (atzg) o2.b;
            atzg4.c = a3 - 1;
            atzg4.a |= 2;
            arrayList.add((atzg) o2.i());
        }
        this.a.a((atzg[]) arrayList.toArray(new atzg[0]));
    }

    public final boolean a() {
        return a(9) || a(10);
    }
}
