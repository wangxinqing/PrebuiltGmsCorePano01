package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: tvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvr {
    public final Context a;
    public final tww b;
    public final tub c = new tub(this.b, aymt.a.a().X());
    private final iby d;

    public tvr(Context context) {
        izd izd = new izd(context, aymt.a.a().Y(), (int) aymt.a.a().Z(), context.getApplicationInfo().uid, 9731);
        iby a2 = rmf.a(context);
        this.a = context;
        this.b = new tww(new tss(izd));
        this.d = a2;
    }

    public final boolean a(Context context) {
        int length;
        Account[] a2 = qub.a(context).a("com.google");
        if (a2 == null || (length = a2.length) == 0) {
            ((anih) tsp.a.d()).a("FastPair: No accounts on device.");
            return false;
        }
        int i = 0;
        while (i < length) {
            try {
                if (((ReportingState) acws.a(this.d.a(a2[i]), aymt.a.a().U(), TimeUnit.MILLISECONDS)).b) {
                    ((anih) tsp.a.d()).a("FastPair: Opted into location reporting.");
                    return true;
                }
                i++;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                anih anih = (anih) tsp.a.d();
                anih.a(e);
                anih.a("FastPair: Error getting opt in status");
                return false;
            }
        }
        ((anih) tsp.a.d()).a("FastPair: Not opted into location report, no upload will occur.");
        return false;
    }
}
