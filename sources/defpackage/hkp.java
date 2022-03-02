package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* renamed from: hkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkp extends hkf {
    private final ifu b;
    private final int c;

    public hkp(ifu ifu, Account account, int i) {
        super("MarkStale", account);
        iva.a((Object) ifu);
        this.b = ifu;
        this.c = i;
    }

    public final void a(Status status) {
        this.b.a(status);
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        hnj hnj = (hnj) hnj.b.b();
        if (hnj.a(this.a, this.c)) {
            pyv pyv = this.a;
            int i = this.c;
            iva.a((Object) pyv);
            synchronized (hnj.i) {
                hnj.d.a(pyv, hkx.b(i), true);
                hnu hnu = hnj.h;
                hnv hnv = new hnv();
                hnv.a = pyv;
                hnv.b = 401;
                hnv.c = false;
                hnu.b(hnv.a());
            }
            this.b.a(Status.a);
            return;
        }
        throw new hjm(1794, String.format(Locale.US, "Data of type %d is not subscribed.", new Object[]{Integer.valueOf(this.c)}));
    }
}
