package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

/* renamed from: msd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msd implements Runnable {
    private final msl a;
    private final Account b;

    public msd(msl msl, Account account) {
        this.a = msl;
        this.b = account;
    }

    public final void run() {
        msl msl = this.a;
        boolean c = msl.a.c(this.b);
        if (msl.getActivity() != null) {
            msl.getActivity().runOnUiThread(new msf(msl, c));
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll((Collection) msl.a.a((Account) msl.b.get(msl.c.getSelectedItemPosition())).get());
        } catch (InterruptedException | ExecutionException e) {
            anih anih = (anih) mte.a.c();
            anih.a(e);
            ((anih) anih.a("msl", "d", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error getting devices from Footprints.");
        }
        if (msl.getActivity() != null) {
            msl.getActivity().runOnUiThread(new mse(msl, arrayList));
        }
    }
}
