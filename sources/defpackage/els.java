package defpackage;

import android.accounts.Account;
import android.os.Looper;
import android.os.Message;

/* renamed from: els  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class els extends qvr {
    public els(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        String string;
        int i = message.what;
        if (i == 1) {
            String string2 = message.getData().getString("mastercredential");
            Account account = (Account) message.getData().getParcelable("dataAccount");
            if (string2 != null) {
                elt.c.put(account, string2);
            }
        } else if (i == 1001 && (string = message.getData().getString("errorMsg")) != null) {
            elt.a.e("Error completing bootstrap: %s", string);
        }
        elt.b.release();
    }
}
