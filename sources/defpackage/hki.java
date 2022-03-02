package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.chromesync.operation.SaveTrustedVaultIntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: hki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hki extends hkf {
    private final ifu b;
    private final amsv c;
    private final hnn d = ((hnn) hnn.a.b());
    private final hnh e = ((hnh) hnh.a.b());

    public hki(Context context, ifu ifu, Account account) {
        super("EnrollTrustedVaultPassphrase", account);
        iva.a((Object) ifu);
        this.b = ifu;
        this.c = amta.a((amsv) new hkh(context));
    }

    public final void a(Status status) {
        this.b.a(status);
    }

    public final void b(Context context) {
        Context context2 = context;
        amri b2 = this.d.b(this.a);
        if (b2.a()) {
            aqpd aqpd = ((aqpb) b2.b()).c;
            if (aqpd == null) {
                aqpd = aqpd.g;
            }
            aqpc a = aqpc.a(aqpd.b);
            if (a == null) {
                a = aqpc.UNRECOGNIZED;
            }
            if (a == aqpc.KEYSTORE_PASSPHRASE) {
                try {
                    acws.a(((gel) this.c.a()).d(this.a.b));
                    hnh hnh = this.e;
                    pyv pyv = this.a;
                    synchronized (hnh.d) {
                        amri b3 = hnh.b.b(pyv);
                        try {
                            List list = (List) acws.a(hnh.c.c(pyv.b));
                            if (!list.isEmpty()) {
                                hiw a2 = hiw.a(((SharedKey) anbs.d(list)).b);
                                hiv b4 = hnh.b(pyv);
                                iva.a((Object) a2, (Object) "cryptographerKey cannot be null");
                                ArrayList arrayList = new ArrayList(b4.a.size());
                                arrayList.addAll(b4.a.values());
                                arrayList.add(a2);
                                hiv hiv = new hiv(arrayList, a2.a);
                                aucd o = hmh.b.o();
                                anhj a3 = hiv.a.values().iterator();
                                while (a3.hasNext()) {
                                    hmg a4 = ((hiw) a3.next()).a();
                                    if (o.c) {
                                        o.c();
                                        o.c = false;
                                    }
                                    hmh hmh = (hmh) o.b;
                                    a4.getClass();
                                    if (!hmh.a.a()) {
                                        hmh.a = aucj.a(hmh.a);
                                    }
                                    hmh.a.add(a4);
                                }
                                hme a5 = hiv.a(((hmh) o.i()).k());
                                hnn hnn = hnh.b;
                                String str = ((aqpb) b3.b()).a;
                                aqpd aqpd2 = ((aqpb) b3.b()).c;
                                if (aqpd2 == null) {
                                    aqpd2 = aqpd.g;
                                }
                                long j = aqpd2.f;
                                synchronized (hnn.d) {
                                    hmx hmx = hnn.c;
                                    iva.a((Object) pyv);
                                    iva.c(str);
                                    iva.a((Object) a5);
                                    aucd o2 = aqov.d.o();
                                    if (o2.c) {
                                        o2.c();
                                        o2.c = false;
                                    }
                                    aqov aqov = (aqov) o2.b;
                                    str.getClass();
                                    aqov.a = str;
                                    a5.getClass();
                                    aqov.b = a5;
                                    aqov.c = j;
                                    aqov aqov2 = (aqov) o2.i();
                                    try {
                                        hjo hjo = hmx.a;
                                        ClientContext a6 = hmx.a(pyv);
                                        if (hjo.k == null) {
                                            hjo.k = baaj.a(baai.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/EnableTrustedVaultPassphrase", baoq.a(aqov.d), baoq.a(aqpb.d));
                                        }
                                        hnn.a(pyv, amri.b((aqpb) hjo.a.a(hjo.k, a6, aqov2, 10000, TimeUnit.MILLISECONDS)));
                                    } catch (babk e2) {
                                        hmy.a(e2);
                                        throw new hjm(257, hmy.b(e2), e2);
                                    } catch (eif e3) {
                                        throw new hjm(hjn.a(e3), (Throwable) e3);
                                    }
                                }
                            } else {
                                throw new hjm(257, "Failed to retrieve key material.");
                            }
                        } catch (InterruptedException | ExecutionException e4) {
                            if (!(e4.getCause() instanceof ibr)) {
                                throw new hjm(257, "Failed to retrieve key material.", e4);
                            }
                            throw hjm.a((ibr) e4.getCause());
                        } catch (hit | hix e5) {
                            throw new hjm(1025, "Failed to create key bag.", e5);
                        }
                    }
                    context2.startService(SaveTrustedVaultIntentOperation.a(context2, this.a));
                    this.b.a(Status.a);
                    return;
                } catch (InterruptedException | ExecutionException e6) {
                    if (e6.getCause() instanceof ibr) {
                        ibr ibr = (ibr) e6.getCause();
                        throw new hjm(hjn.a(ibr.a()), (Throwable) ibr);
                    }
                    throw new hjm(1025, (Throwable) e6);
                }
            }
        }
        throw new hjm(1793, "Must be a keystore passphrase user to enroll in trusted vault passphrase.");
    }
}
