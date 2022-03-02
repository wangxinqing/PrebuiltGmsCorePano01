package defpackage;

import android.accounts.Account;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: msb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msb implements Runnable {
    private final msl a;
    private final boolean b;
    private final Account c;

    public msb(msl msl, boolean z, Account account) {
        this.a = msl;
        this.b = z;
        this.c = account;
    }

    public final void run() {
        msl msl = this.a;
        boolean z = this.b;
        Account account = this.c;
        if (!z) {
            arxt arxt = msl.a;
            try {
                for (tzj tzj : (List) arxt.a(account).get()) {
                    try {
                        arxt.d(account).a(arxt.b(tzj.b.k()), (audx) tzk.c).get();
                    } catch (InterruptedException | ExecutionException e) {
                        anih anih = (anih) aryq.a.c();
                        anih.a(e);
                        ((anih) anih.a("arxt", "a", 420, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error removing footprint.");
                    }
                }
                aryq aryq = aryq.a;
            } catch (InterruptedException | ExecutionException e2) {
                anih anih2 = (anih) aryq.a.c();
                anih2.a(e2);
                ((anih) anih2.a("arxt", "b", 346, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Error removing footprints.");
            }
        }
        msl.a.a(account, z);
        if (msl.getActivity() != null) {
            mtd.a(msl.getActivity(), z ? asom.FAST_PAIR_ACCOUNT_SETTINGS_SAVE_ENABLED : asom.FAST_PAIR_ACCOUNT_SETTINGS_SAVE_DISABLED);
            msl.getActivity().runOnUiThread(new msg(msl));
        }
    }
}
