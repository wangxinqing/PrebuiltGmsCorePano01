package defpackage;

import java.util.ArrayList;

/* renamed from: gxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxz {
    private final ArrayList a = new ArrayList();

    public final gxy a() {
        return new gxy(this);
    }

    public final synchronized void b(gxy gxy) {
        this.a.remove(gxy);
    }

    public final synchronized void a(gxy gxy) {
        this.a.add(gxy);
    }

    public final synchronized void a(boolean z, long j) {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gxy) arrayList.get(i)).a(z, j);
        }
    }
}
