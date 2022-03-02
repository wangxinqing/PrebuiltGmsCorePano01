package defpackage;

import java.util.LinkedList;

/* renamed from: ahku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahku {
    protected final LinkedList a = new LinkedList();
    public final LinkedList b = new LinkedList();
    public long c = -1;
    public final ahnf d = new ahnf();
    public final ahks e = new ahks();
    public final ahkt f = new ahkt();

    public final boolean a(long j) {
        this.b.addLast(Long.valueOf(j));
        boolean z = false;
        if (this.b.size() >= 2 && j - ((Long) this.b.getFirst()).longValue() >= 110000) {
            z = true;
        }
        while (((Long) this.b.getFirst()).longValue() + 200000 < j) {
            this.b.removeFirst();
        }
        return z;
    }
}
