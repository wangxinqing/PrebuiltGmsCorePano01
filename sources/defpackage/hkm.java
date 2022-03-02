package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: hkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkm extends hkf {
    private final hju b;
    private final List c;
    private final hnc d;

    public hkm(hju hju, Account account, List list) {
        super("ListFacetGroups", account);
        this.b = hju;
        amzt j = amzy.j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            j.c(hiq.a((String) list.get(i)));
        }
        this.c = j.a();
        this.d = (hnc) hnc.b.b();
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        try {
            this.b.a(new hkc(status, amzy.h()).b());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        amzy a;
        hnc hnc = this.d;
        List list = this.c;
        synchronized (hnc.f) {
            hnc.a();
            Set<auuo> b2 = hnc.d.b(list);
            HashSet hashSet = new HashSet();
            for (auuo auuo : b2) {
                for (auun auun : auuo.a) {
                    if ((auun.a & 1) != 0 && !auun.b.isEmpty()) {
                        hashSet.add(auun.b);
                    }
                }
            }
            angk c2 = angm.c(anax.a((Collection) list), hashSet);
            if (!c2.isEmpty()) {
                auur a2 = hnc.e.a(amzy.a((Collection) c2));
                if (!a2.a.isEmpty()) {
                    hnc.c.a((List) amzy.a((Collection) a2.a));
                }
                if (!a2.b.isEmpty()) {
                    hnc.d.a(amzy.a((Collection) a2.b));
                    b2 = angm.a((Set) b2, (Set) anax.a((Collection) a2.b));
                }
            }
            a = amzy.a((Collection) b2);
        }
        try {
            this.b.a(new hkc(Status.a, a).b());
        } catch (IOException e) {
            throw new hjm(1025, "Error when constructing the result.", e);
        }
    }
}
