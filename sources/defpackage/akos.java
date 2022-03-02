package defpackage;

import java.util.ArrayList;

/* renamed from: akos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akos {
    public final akls a;
    public final ArrayList b = new ArrayList();
    public akov c = new akov();
    public akov d = new akov();
    public akov e = new akov();
    public akov f = new akov();
    public final akuo g;

    public akos(akuo akuo, akls akls) {
        this.g = akuo;
        this.a = akls;
    }

    public final String a() {
        long c2 = this.c.c();
        int size = this.b.size();
        StringBuilder sb = new StringBuilder(64);
        sb.append(", last at place time ");
        sb.append(c2);
        sb.append(",  ");
        sb.append(size);
        sb.append(" clusters");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(akov akov) {
        if (this.b.size() == ((int) azbz.a.a().d())) {
            int i = -1;
            long j = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < this.b.size()) {
                long c2 = ((akov) this.b.get(i2)).c();
                long j2 = c2 < j ? c2 : j;
                if (c2 < j) {
                    i = i2;
                }
                i2++;
                j = j2;
            }
            if (i >= 0) {
                this.b.remove(i);
            }
        }
        this.b.add(akov);
    }
}
