package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: msp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msp implements Runnable {
    private final mta a;

    public msp(mta mta) {
        this.a = mta;
    }

    public final void run() {
        uaj uaj;
        tzj tzj;
        mta mta = this.a;
        mru mru = mta.j;
        byte[] bArr = mta.b;
        arxt arxt = mru.a;
        List a2 = arxt.a(arxt.b);
        int size = a2.size();
        int i = 0;
        while (true) {
            uaj = null;
            if (i >= size) {
                tzj = null;
                break;
            }
            Account account = (Account) a2.get(i);
            try {
                tzj = arxt.a((List) arxt.a(account).get(), bArr);
                if (tzj != null) {
                    break;
                }
                i++;
            } catch (InterruptedException | ExecutionException e) {
                anih anih = (anih) aryq.a.c();
                anih.a(e);
                ((anih) anih.a("arxt", "d", 661, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: fail to read footprints from %s.", (Object) account);
            }
        }
        if (tzj != null) {
            try {
                auay auay = tzj.c;
                aubs c = aubs.c();
                uaj uaj2 = uaj.K;
                try {
                    aubc h = auay.h();
                    aucj aucj = (aucj) uaj2.c(4);
                    aueq a3 = aueh.a.a((Object) aucj);
                    a3.a(aucj, aubd.a(h), c);
                    a3.d(aucj);
                    h.a(0);
                    aucj.b(aucj);
                    uaj = (uaj) aucj;
                } catch (IOException e2) {
                    if (!(e2.getCause() instanceof auda)) {
                        throw new auda(e2.getMessage());
                    }
                    throw ((auda) e2.getCause());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof auda) {
                        throw ((auda) e3.getCause());
                    }
                    throw e3;
                } catch (auda e4) {
                    throw e4;
                } catch (auda e5) {
                    throw e5;
                }
            } catch (auda e6) {
                anih anih2 = (anih) mte.a.c();
                anih2.a((Throwable) e6);
                ((anih) anih2.a("mru", "a", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FindDevice: Failed to read device from Footprints based on cached item.");
            }
        }
        if (mta.getActivity() != null && uaj != null) {
            mta.getActivity().runOnUiThread(new msn(mta, uaj));
        }
    }
}
