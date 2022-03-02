package defpackage;

import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ahkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahkd implements aiao {
    public int[][] a;
    public long b;
    public ahyg c;
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final aiap f;

    public ahkd(aiap aiap) {
        this.f = aiap;
        a();
    }

    public final void a() {
        int[] iArr = new int[2];
        iArr[1] = ahyg.a.length + 1;
        iArr[0] = 3;
        this.a = (int[][]) Array.newInstance(int.class, iArr);
        this.b = SystemClock.elapsedRealtime();
        this.e.clear();
        this.d.clear();
        this.c = null;
    }

    public final void a(boolean z, int i, aiaf aiaf) {
        ahyg ahyg = this.c;
        if (ahyg != null && ahyg.c && z && aiaf != null) {
            long j = aiaf.a;
            if (i == 1) {
                Set set = this.d;
                Long valueOf = Long.valueOf(j);
                set.add(valueOf);
                this.e.add(valueOf);
            } else if (i == 2) {
                this.e.add(Long.valueOf(j));
            }
        }
    }
}
