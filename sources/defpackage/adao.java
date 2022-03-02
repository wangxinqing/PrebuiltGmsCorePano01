package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: adao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adao {
    public final boolean a;
    public final adat b;
    private final adap c;
    private final Set d;

    public adao(Context context, Account account) {
        HashSet hashSet = new HashSet();
        this.c = new adap(context, account);
        boolean c2 = azrh.c();
        this.a = c2;
        if (c2) {
            adat adat = new adat(context, account);
            this.b = adat;
            hashSet.addAll(adat.a());
        } else {
            this.b = null;
        }
        hashSet.addAll(this.c.b());
        this.d = Collections.unmodifiableSet(hashSet);
    }

    static atyt a(int i) {
        aucd o = atyt.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atyt atyt = (atyt) o.b;
        atyt.c = 2;
        int i2 = 2 | atyt.a;
        atyt.a = i2;
        atyt.a = i2 | 1;
        atyt.b = i;
        return (atyt) o.i();
    }

    private final List c() {
        acwa acwa;
        long b2 = azrh.b();
        try {
            adat adat = this.b;
            if (!azrh.c()) {
                acwa = acws.a((Exception) new IllegalStateException("LocationSettings is not enabled"));
            } else {
                acwa = adat.b.a(adat.a).a(adar.a);
            }
            return (List) acws.a(acwa, b2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return amzy.h();
        }
    }

    public final atzu b() {
        aucd o = atzu.b.o();
        Set set = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atzu atzu = (atzu) o.b;
        if (!atzu.a.a()) {
            atzu.a = aucj.a(atzu.a);
        }
        auab.a((Iterable) set, (List) atzu.a);
        return (atzu) o.i();
    }

    private static List a(Set set, List list, Set set2) {
        ArrayList arrayList = new ArrayList();
        HashSet<Integer> hashSet = new HashSet<>(set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            atyt atyt = (atyt) it.next();
            if (set2.contains(Integer.valueOf(atyt.b)) && set.contains(Integer.valueOf(atyt.b))) {
                arrayList.add(atyt);
                hashSet.remove(Integer.valueOf(atyt.b));
            }
        }
        for (Integer num : hashSet) {
            if (set2.contains(num)) {
                arrayList.add(a(num.intValue()));
            }
        }
        return arrayList;
    }

    public final adan a() {
        return a(true, this.d);
    }

    public final adan a(boolean z, Set<Integer> set) {
        if (set == null || set.isEmpty()) {
            set = this.d;
        }
        ArrayList arrayList = new ArrayList();
        if (z && this.c.c() && set != null && (set.contains(10) || set.contains(9))) {
            arrayList.addAll(a(set, this.c.a(), this.c.b()));
        }
        if (this.a && this.b.a(set)) {
            arrayList.addAll(a(set, c(), this.b.a()));
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((atyt) arrayList.get(i)).b));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : set) {
            if (!hashSet.contains(num)) {
                arrayList2.add(a(num.intValue()));
            }
        }
        arrayList.addAll(arrayList2);
        return new adan(Status.a, arrayList);
    }

    public final Status a(atzg[] atzgArr, String str) {
        acwa acwa;
        long b2 = azrh.b();
        try {
            adat adat = this.b;
            if (!azrh.c()) {
                acwa = acws.a((Exception) new IllegalStateException("LocationSettings is not enabled"));
            } else {
                boolean z = false;
                boolean z2 = false;
                for (atzg atzg : atzgArr) {
                    if (atzg.b == 15) {
                        int a2 = atzq.a(atzg.c);
                        z = a2 != 0 && a2 == 3;
                    }
                    if (atzg.b == 2) {
                        int a3 = atzq.a(atzg.c);
                        z2 = a3 != 0 && a3 == 3;
                    }
                }
                if (!z) {
                    if (!z2) {
                        acwa = acws.a((Exception) new IllegalArgumentException("At least LR or LH must be requested"));
                    }
                }
                acwa = adat.b.a(adat.a).a((acvz) new adas(adat, str));
            }
            acws.a(acwa, b2, TimeUnit.MILLISECONDS);
            return Status.a;
        } catch (ExecutionException e) {
            return Status.c;
        } catch (InterruptedException e2) {
            return Status.b;
        } catch (TimeoutException e3) {
            return Status.d;
        }
    }

    public final void a(atzg[] atzgArr) {
        this.c.a(atzgArr);
    }
}
