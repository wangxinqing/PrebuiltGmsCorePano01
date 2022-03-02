package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.chimera.FragmentTransaction;
import java.util.List;

/* renamed from: nyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyi {
    public final Context a;
    public final nua b;
    private final ntv c;

    public nyi(Context context, ntv ntv, nua nua) {
        this.a = context;
        this.c = ntv;
        this.b = nua;
    }

    public final void a(nyn nyn) {
        if (!axkn.c() || !aekv.a(this.a)) {
            nyn.a((Runnable) new nyg(this, nyn));
        }
    }

    public final boolean b(ntx ntx) {
        List<ResolveInfo> list;
        try {
            if (!ntx.a(this.c, (int) FragmentTransaction.TRANSIT_EXIT_MASK).enabled) {
                return false;
            }
            Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
            intent.setPackage(ntx.a);
            int i = ntx.b;
            if (i == 0) {
                list = this.a.getPackageManager().queryBroadcastReceivers(intent, FragmentTransaction.TRANSIT_EXIT_MASK);
            } else {
                nqw.a(this.a);
                list = nqw.a(intent, i, FragmentTransaction.TRANSIT_EXIT_MASK);
            }
            if (list == null || list.isEmpty()) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public final void a(nyn nyn, ntx ntx) {
        if (axkn.c() && aekv.a(this.a)) {
            return;
        }
        if (b(ntx)) {
            this.b.a(ntx, 1);
        } else if (nyn.b(nyq.a(ntx, 1))) {
            this.b.c(ntx);
        }
    }

    public final boolean a(ntx ntx) {
        int e = this.b.e(ntx);
        int i = e - 1;
        if (e == 0) {
            throw null;
        } else if (i == 0) {
            this.b.c(ntx);
            return false;
        } else if (i != 1) {
            return false;
        } else {
            this.b.a(ntx, 3);
            return true;
        }
    }
}
