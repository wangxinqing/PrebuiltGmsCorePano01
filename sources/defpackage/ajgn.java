package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: ajgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgn implements ajgx {
    private final jiq a;
    private final ajgl b;
    private final List c;
    private int d;

    public ajgn(jiq jiq, List list, long[] jArr, ajgl ajgl) {
        this.a = jiq;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new ajgm((ajgi) list.get(i)));
        }
        Collections.sort(arrayList, ajgh.a);
        if (jArr != null) {
            Arrays.sort(jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((ajgm) arrayList.get(i3)).a(jArr[i2]);
                }
            }
        }
        this.c = arrayList;
        this.b = ajgl;
    }

    public static ajgn a(String str, jiq jiq, amzy amzy, Executor executor) {
        long[] jArr;
        ajgl ajgl = new ajgl(executor, str);
        try {
            airl airl = (airl) ajgl.b.a().get();
            jArr = new long[airl.a.size()];
            for (int i = 0; i < airl.a.size(); i++) {
                jArr[i] = airl.a.a(i);
            }
            Arrays.sort(jArr);
        } catch (InterruptedException | ExecutionException e) {
            jArr = null;
        }
        Arrays.toString(jArr);
        return new ajgn(jiq, amzy, jArr, ajgl);
    }

    public final long b(Runnable runnable) {
        long a2 = a();
        if (a2 > 0) {
            return a2;
        }
        a(runnable);
        return 0;
    }

    public static ajgn a(String str, jiq jiq, String str2, Executor executor) {
        ArrayList arrayList = new ArrayList();
        for (String c2 : amsk.a(',').c(str2)) {
            List c3 = amsk.a(':').c(c2);
            c3.get(0);
            c3.get(1);
            arrayList.add(new ajgi(Long.parseLong((String) c3.get(0)), Integer.parseInt((String) c3.get(1))));
        }
        return a(str, jiq, amzy.a((Collection) arrayList), executor);
    }

    public final long a() {
        long j;
        long a2 = this.a.a() / 1000;
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            ajgm ajgm = (ajgm) list.get(i);
            long j3 = a2 - ajgm.b[ajgm.c];
            long j4 = ajgm.a.a;
            if (j3 < j4) {
                j = j4 - j3;
            } else {
                j = 0;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final boolean a(Runnable runnable) {
        long a2 = this.a.a() / 1000;
        List list = this.c;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ajgm ajgm = (ajgm) list.get(i);
            i++;
            if (a2 - ajgm.b[ajgm.c] < ajgm.a.a) {
                this.d++;
                a();
                return false;
            }
        }
        List list2 = this.c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ajgm) list2.get(i2)).a(a2);
        }
        runnable.run();
        if (!this.c.isEmpty()) {
            ajgl ajgl = this.b;
            long[] jArr = ((ajgm) this.c.get(0)).b;
            Arrays.toString(jArr);
            aucd o = airl.b.o();
            for (long j : jArr) {
                if (j > 0) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    airl airl = (airl) o.b;
                    if (!airl.a.a()) {
                        airl.a = aucj.a(airl.a);
                    }
                    airl.a.a(j);
                }
            }
            aorr a3 = ajgl.b.a((aoqb) new ajgj((airl) o.i()), ajgl.a);
            a3.a(amll.a((Runnable) new ajgk(a3)), aoqm.a);
        }
        return true;
    }
}
