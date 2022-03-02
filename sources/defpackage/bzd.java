package defpackage;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: bzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzd extends bze {
    public final TreeSet a;

    private bzd(TreeSet treeSet) {
        super(604800000);
        this.a = treeSet;
    }

    private final int a(int i) {
        switch (i) {
            case 1:
                return 6;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            default:
                ((anih) ((anih) bxk.a.c()).a("bzd", "a", 796, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid day of week = %s", i);
                return -1;
        }
    }

    public final void b() {
        this.a.clear();
        this.a.add(bzc.a(0, 604800000));
    }

    static final long a(long j) {
        int i;
        Calendar a2 = bvl.a(j, bvl.a);
        int i2 = a2.get(7);
        switch (i2) {
            case 1:
                i = 6;
                break;
            case 2:
                i = 0;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 3;
                break;
            case 6:
                i = 4;
                break;
            case 7:
                i = 5;
                break;
            default:
                ((anih) ((anih) bxk.a.c()).a("bzd", "a", 796, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScheduledFenceTime] Invalid day of week = %s", i2);
                i = -1;
                break;
        }
        return (((long) i) * 86400000) + (((long) a2.get(11)) * 3600000) + (((long) a2.get(12)) * 60000) + (((long) a2.get(13)) * 1000) + ((long) a2.get(14));
    }

    public final void b(bzc bzc, int... iArr) {
        TreeSet<bzc> treeSet = new TreeSet<>();
        TreeSet treeSet2 = new TreeSet();
        for (int i : iArr) {
            long j = ((long) i) * 86400000;
            a(bzc.a(bzc.a + j, bzc.b + j), (Set) treeSet2);
        }
        Iterator it = treeSet2.iterator();
        long j2 = -1;
        while (it.hasNext()) {
            bzc bzc2 = (bzc) it.next();
            new Object[1][0] = bzc2;
            long j3 = bzc2.a;
            if (j3 > 0 && j2 == -1) {
                treeSet.add(bzc.a(0, j3));
            } else if (j2 != -1) {
                treeSet.add(bzc.a(j2, j3));
            }
            j2 = bzc2.b;
        }
        if (j2 < 604800000) {
            treeSet.add(bzc.a(j2, 604800000));
        }
        for (bzc a2 : treeSet) {
            a(a2, (Set) this.a);
        }
    }

    static bzd a() {
        return new bzd(new TreeSet());
    }

    public final void a(bzc bzc, int... iArr) {
        for (int i : iArr) {
            long j = ((long) i) * 86400000;
            a(bzc.a(bzc.a + j, bzc.b + j), (Set) this.a);
        }
    }
}
