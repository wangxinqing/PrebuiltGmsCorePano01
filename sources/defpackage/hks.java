package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: hks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hks extends hkf {
    private final ifu b;
    private final String c;
    private final int d;
    private final String e;

    public hks(ifu ifu, String str, Account account, int i, String str2) {
        super("Unsubscribe", account);
        iva.a((Object) ifu);
        this.b = ifu;
        iva.c(str);
        this.c = str;
        this.d = i;
        iva.a((Object) str2);
        this.e = str2;
    }

    public final void a(Status status) {
        this.b.a(status);
    }

    public final void b(Context context) {
        try {
            Intent a = hkd.a(this.e);
            a.setPackage(this.c).putExtra("account_name", this.a.b).putExtra("account_type", this.a.c);
            hnj hnj = (hnj) hnj.b.b();
            pyv pyv = this.a;
            int i = this.d;
            String a2 = hkd.a(a);
            iva.a((Object) pyv);
            iva.c(a2);
            synchronized (hnj.i) {
                hlv d2 = hkx.d(i);
                ArrayList arrayList = new ArrayList((Collection) hnj.d.a(pyv, d2));
                if (arrayList.contains(a2)) {
                    arrayList.remove(a2);
                    hnj.d.a(pyv, d2, amzy.a((Collection) arrayList));
                    if (arrayList.size() == 0) {
                        hnj.c.a(pyv, i);
                    }
                }
            }
            this.b.a(Status.a);
        } catch (URISyntaxException e2) {
            throw new hjm(1793, "Unable to parse the intent.", e2);
        }
    }
}
