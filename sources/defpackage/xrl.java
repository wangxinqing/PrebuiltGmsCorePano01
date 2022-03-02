package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import java.util.List;

/* renamed from: xrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xrl implements Runnable {
    private final xrp a;

    public xrl(xrp xrp) {
        this.a = xrp;
    }

    public final void run() {
        xrp xrp = this.a;
        Bundle c = xrp.c();
        c.putString("feed", "plusfeed");
        List a2 = xrp.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            xrp.a((Account) a2.get(i), c);
        }
    }
}
