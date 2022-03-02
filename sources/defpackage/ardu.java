package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: ardu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardu {
    public final LinkedList a = new LinkedList();
    public final ardi b = new ardi();

    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ards ards = (ards) list.get(i);
            long c = ards.c();
            if (!this.a.isEmpty() && c - ((ards) this.a.getFirst()).c() >= 900000) {
                this.a.remove();
            }
            this.a.add(ards);
        }
    }
}
