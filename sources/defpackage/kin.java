package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kin implements kip {
    private int a = 0;
    private long b;
    private long c = -1;
    private final List d;

    public kin(kip kip) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        if (kip != null) {
            arrayList.add(kip);
        }
    }

    public final synchronized void a(int i) {
        if (i != this.a) {
            this.a = i;
            List list = this.d;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((kip) list.get(i2)).a(this.a);
            }
        }
    }

    public final synchronized void a(long j, long j2) {
        this.b = j;
        this.c = j2;
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((kip) list.get(i)).a(j, j2);
        }
    }

    public final synchronized void a(kip kip) {
        kip.a(this.b, this.c);
        kip.a(this.a);
        this.d.add(kip);
    }
}
