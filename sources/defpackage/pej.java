package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprint;
import java.io.IOException;
import java.util.List;

/* renamed from: pej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pej implements pjl {
    private final ifu a;
    private final Account b;
    private final int c;
    private final int d;
    private final List e;
    private final aevl f;

    public pej(ifu ifu, Account account, int i, int i2, List list, aevl aevl) {
        this.a = ifu;
        this.b = account;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = aevl;
    }

    public final void a() {
        afdp b2;
        try {
            aevm a2 = this.f.a(this.b, this.c, this.d);
            try {
                b2 = a2.c().b();
                for (MdhFootprint mdhFootprint : this.e) {
                    a2.a(b2, auay.a(mdhFootprint.a), mdhFootprint.c);
                }
                b2.b();
                b2.close();
                if (a2 != null) {
                    a2.close();
                }
                this.a.a(Status.a);
                return;
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th;
        } catch (IOException e2) {
            this.a.a(new Status(8, e2.getMessage()));
        } catch (Throwable th2) {
            apev.a(th, th2);
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
