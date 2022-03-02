package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: hkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkl extends hkf {
    private static final iwd b = hir.a("ListAffiliationsOperation");
    private final hju c;
    private final List d;
    private final hnc e = ((hnc) hnc.b.b());

    public hkl(hju hju, Account account, List list) {
        super("ListAffiliations", account);
        this.c = hju;
        this.d = list;
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        try {
            this.c.a(new hkc(status, amzy.h()).b());
        } catch (IOException e2) {
            b.a((Throwable) e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        amzy a;
        try {
            hju hju = this.c;
            Status status = Status.a;
            hnc hnc = this.e;
            List<String> list = this.d;
            synchronized (hnc.f) {
                hnc.a();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (String str : list) {
                    amri a2 = hnc.c.a(str);
                    if (a2.a()) {
                        hashSet.add((auum) a2.b());
                    } else {
                        hashSet2.add(str);
                    }
                }
                if (!hashSet2.isEmpty()) {
                    auur a3 = hnc.e.a(amzy.a((Collection) hashSet2));
                    if (!a3.a.isEmpty()) {
                        hnc.c.a((List) amzy.a((Collection) a3.a));
                        hashSet.addAll(amzy.a((Collection) a3.a));
                    }
                    if (!a3.b.isEmpty()) {
                        hnc.d.a(amzy.a((Collection) a3.b));
                    }
                }
                a = amzy.a((Collection) hashSet);
            }
            hju.a(new hkc(status, a).b());
        } catch (IOException e2) {
            throw new hjm(1025, "Internal error.", e2);
        }
    }
}
