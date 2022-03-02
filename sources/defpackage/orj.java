package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: orj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class orj extends ppr {
    final /* synthetic */ pqz a;
    final /* synthetic */ osf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public orj(osf osf, aonk aonk, pqz pqz) {
        super(aonk);
        this.b = osf;
        this.a = pqz;
    }

    public final void b() {
        String str;
        boolean z;
        pqz pqz = this.a;
        if ((pqz.a & 1) != 0) {
            osf osf = this.b;
            pqx pqx = pqz.b;
            if (pqx == null) {
                pqx = pqx.e;
            }
            ozs a2 = osf.a();
            oso.a("handleGcmDeleteAppHistory.");
            synchronized (a2.a()) {
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(pqx.c);
                int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(pqx.d);
                if (pqx.a.isEmpty()) {
                    anhj a3 = a2.d().iterator();
                    while (a3.hasNext()) {
                        pao pao = (pao) a3.next();
                        osz d = a2.d(pao);
                        if (d != null) {
                            oyz d2 = osf.m.d(d.e);
                            osf.n.a(d.i, seconds, seconds2);
                            osf.a(pao, d2);
                        }
                    }
                } else {
                    oyz d3 = osf.m.d(pqx.a);
                    if (d3 != null) {
                        for (pao pao2 : d3.a()) {
                            ota b2 = a2.b(pao2);
                            otg otg = b2.c;
                            if (otg == null) {
                                otg = otg.h;
                            }
                            int a4 = otf.a(otg.c);
                            if (a4 != 0) {
                                if (a4 != 1) {
                                }
                            }
                            osz osz = b2.b;
                            if (osz == null) {
                                osz = osz.s;
                            }
                            if (ozq.f(osz)) {
                                if (!pqx.b.isEmpty()) {
                                    osz osz2 = b2.b;
                                    if (osz2 == null) {
                                        osz2 = osz.s;
                                    }
                                    if (!osf.a(osz2, pqx.b)) {
                                        oso.e("Failed to delete usage report and implicit document");
                                    }
                                } else {
                                    NativeIndex nativeIndex = osf.n;
                                    osz osz3 = b2.b;
                                    if (osz3 == null) {
                                        osz3 = osz.s;
                                    }
                                    nativeIndex.a(osz3.i, seconds, seconds2);
                                    osf.a(pao2, d3);
                                }
                            }
                        }
                    }
                }
            }
        }
        pqz pqz2 = this.a;
        if ((pqz2.a & 2) != 0) {
            osf osf2 = this.b;
            pqy pqy = pqz2.c;
            if (pqy == null) {
                pqy = pqy.c;
            }
            if (!pqy.a.isEmpty()) {
                String str2 = pqy.a;
                Context context = osf2.b;
                Iterator it = jgu.d(context, context.getPackageName()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        oso.a("Failed to find account name for ID %s", (Object) str2);
                        str = null;
                        break;
                    }
                    Account account = (Account) it.next();
                    try {
                        if (str2.equals(eig.c(osf2.b, account.name))) {
                            str = account.name;
                            break;
                        }
                    } catch (eif | IOException e) {
                        oso.e("Failed to get account ID. %s", (Object) e.getMessage());
                    }
                }
                if (str != null) {
                    osf2.a(str, pqy);
                    if (pxb.a()) {
                        z = ((Boolean) pba.W.c()).booleanValue();
                    } else {
                        z = ((Boolean) pba.V.c()).booleanValue();
                    }
                    if (z) {
                        pla.a();
                    }
                }
            }
        }
    }
}
