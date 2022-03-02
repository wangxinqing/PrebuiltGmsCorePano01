package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: edn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edn {
    public eeq[] a = new eeq[2];
    public Queue[] b = new LinkedList[2];

    public edn() {
        for (int i = 0; i < 2; i++) {
            this.b[i] = new LinkedList();
        }
    }

    public final int a(int i, eeq eeq) {
        if (this.b[i].remove(eeq)) {
            return 3;
        }
        eeq eeq2 = this.a[i];
        if (eeq2 == null || !eeq2.equals(eeq)) {
            return 2;
        }
        if (this.b[i].isEmpty()) {
            this.a[i] = null;
            return 0;
        }
        this.a[i] = (eeq) this.b[i].remove();
        return 1;
    }

    public final eeq a(int i) {
        return this.a[i];
    }
}
