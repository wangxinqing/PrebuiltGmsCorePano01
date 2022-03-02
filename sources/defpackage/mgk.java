package defpackage;

import android.accounts.Account;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: mgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgk {
    private static mhp a;

    public static ClientContext a(String str) {
        ClientContext clientContext;
        if (axfo.d()) {
            clientContext = new ClientContext();
        } else {
            clientContext = new ClientContext(Process.myUid(), str, str, "com.google.android.gms", "com.google.android.gms");
        }
        if (axfo.d()) {
            clientContext.b = Process.myUid();
            if (!TextUtils.isEmpty(str)) {
                Account account = new Account(str, "com.google");
                clientContext.d = account;
                clientContext.c = account;
            }
            clientContext.e = "com.google.android.gms";
            clientContext.f = "com.google.android.gms";
        }
        clientContext.d(axgd.a.a().a());
        return clientContext;
    }

    public static mhp a() {
        if (a == null) {
            a = new mhp(new mgl(ihs.b().getApplicationContext(), axgd.a.a().b(), (int) axgd.a.a().c()));
        }
        return a;
    }
}
