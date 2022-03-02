package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: hkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkg extends hkf {
    private static final anax b = anax.a((Object) 2);
    private final ifu c;
    private final int d;
    private final Bundle e;

    public hkg(ifu ifu, Account account, int i, Bundle bundle) {
        super("Delete", account);
        iva.a((Object) ifu);
        this.c = ifu;
        this.d = i;
        iva.a((Object) bundle);
        this.e = bundle;
    }

    public final void a(Status status) {
        this.c.a(status);
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        if (b.contains(Integer.valueOf(this.d))) {
            hnj hnj = (hnj) hnj.b.b();
            if (hnj.a(this.a, this.d)) {
                try {
                    pyv pyv = this.a;
                    int i = this.d;
                    byte[] byteArray = this.e.getByteArray("entity");
                    iva.a((Object) pyv);
                    iva.a((Object) byteArray);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (hnj.i) {
                        hnj.a(pyv);
                        aqpc aqpc = (aqpc) hnj.f.c(pyv).a((Object) aqpc.KEYSTORE_PASSPHRASE);
                        hjg a = hjh.a(i);
                        hjc a2 = a.a(byteArray);
                        ArrayList arrayList = new ArrayList();
                        for (hln hlm : hnj.e.a(pyv, i, (List) a.a(a2).e())) {
                            hlm hlm2 = new hlm(hlm);
                            hlm2.d = true;
                            hlm2.e = true;
                            arrayList.add(hlm2.a());
                        }
                        if (!arrayList.isEmpty()) {
                            hnj.e.a(pyv, (hln[]) arrayList.toArray(new hln[0]));
                            hnu hnu = hnj.h;
                            hnv hnv = new hnv();
                            hnv.a = pyv;
                            hnv.b = 401;
                            hnu.a(hnv.a());
                        }
                    }
                    hnj.a.b("delete() [Latency: %dms]", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    this.c.a(Status.a);
                } catch (hji e2) {
                    throw new hjm(1793, e2.getMessage(), e2);
                }
            } else {
                throw new hjm(1794, String.format(Locale.US, "Data of type %d is not subscribed.", new Object[]{Integer.valueOf(this.d)}));
            }
        } else {
            throw new hjm(1793, String.format(Locale.US, "Not allowed to delete data of type %d.", new Object[]{Integer.valueOf(this.d)}));
        }
    }
}
