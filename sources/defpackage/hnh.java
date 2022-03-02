package defpackage;

import android.util.Base64;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: hnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnh {
    public static final fzi a = new hng();
    private static final iwd e = hir.c("CryptographerManager");
    public final hnn b = ((hnn) hnn.a.b());
    public final gel c;
    public final Object d;
    private final hkx f = ((hkx) hkx.i.b());

    public hnh() {
        ihs b2 = ihs.b();
        gem a2 = gen.a();
        a2.a = "chromesync";
        this.c = gek.a(b2, a2.a());
        this.d = new Object();
    }

    public final hiv a(pyv pyv) {
        hiv b2;
        synchronized (this.d) {
            b2 = b(pyv);
        }
        return b2;
    }

    public final hiv b(pyv pyv) {
        aqpb c2 = this.b.c(pyv);
        amri amri = (amri) this.f.a(pyv, hkx.a);
        if (!amri.a()) {
            aqpd aqpd = c2.c;
            if (aqpd == null) {
                aqpd = aqpd.g;
            }
            aqpc a2 = aqpc.a(aqpd.b);
            if (a2 == null) {
                a2 = aqpc.UNRECOGNIZED;
            }
            if (!a2.equals(aqpc.TRUSTED_VAULT_PASSPHRASE)) {
                aqpd aqpd2 = c2.c;
                if (aqpd2 == null) {
                    aqpd2 = aqpd.g;
                }
                if (hiv.a(aqpd2)) {
                    try {
                        amzy<byte[]> a3 = amzy.a(anbs.a((Iterable) c2.b, hnf.a));
                        aqpd aqpd3 = c2.c;
                        if (aqpd3 == null) {
                            aqpd3 = aqpd.g;
                        }
                        iva.a((Object) a3, (Object) "keystoreKeys cannot be null");
                        iva.a((Object) aqpd3, (Object) "nigoriSpecifics cannot be null");
                        iva.b(hiv.a(aqpd3));
                        if (a3.isEmpty()) {
                            throw new hix("Empty keystore keys.");
                        } else if (aqpd3.c == null) {
                            throw new hix("Empty keystore decryptor token in Nigori node.");
                        } else if (aqpd3.a != null) {
                            ArrayList arrayList = new ArrayList();
                            for (byte[] encodeToString : a3) {
                                arrayList.add(hiw.a(Base64.encodeToString(encodeToString, 2)));
                            }
                            hiw hiw = (hiw) anbs.d(arrayList);
                            hiv hiv = new hiv(arrayList, hiw.a);
                            hme hme = aqpd3.c;
                            if (hme == null) {
                                hme = hme.d;
                            }
                            byte[] a4 = hiv.a(hme);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(hiw.a((hmg) aucj.a((aucj) hmg.e, a4, aubs.c())));
                            arrayList2.add(hiw);
                            hiv hiv2 = new hiv(arrayList2, hiw.a);
                            hme hme2 = aqpd3.a;
                            if (hme2 == null) {
                                hme2 = hme.d;
                            }
                            arrayList2.addAll(hiv.a(hiv2, hme2));
                            hme hme3 = aqpd3.a;
                            if (hme3 == null) {
                                hme3 = hme.d;
                            }
                            hiv hiv3 = new hiv(arrayList2, hme3.b);
                            try {
                                this.f.a(pyv, hkx.a, amri.b(hiv3.a().a()));
                                return hiv3;
                            } catch (hix e2) {
                                throw new hjm(hjn.a((hiu) e2), "Failed to save the encryption key.", e2);
                            }
                        } else {
                            throw new hix("Empty key bag in Nigori node.");
                        }
                    } catch (auda e3) {
                        throw new hix("Unable to parse the keystore decryptor token.", e3);
                    } catch (hit | hix e4) {
                        this.b.a(pyv);
                        throw new hjm(hjn.a(e4), "Invalid metadata.", e4);
                    }
                } else {
                    throw new hjm(1537);
                }
            } else {
                aqpd aqpd4 = c2.c;
                if (aqpd4 == null) {
                    aqpd4 = aqpd.g;
                }
                try {
                    List list = (List) acws.a(this.c.c(pyv.b));
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            try {
                                return hiv.a(hiw.a(((SharedKey) list.get(size)).b), aqpd4);
                            } catch (hit | hix e5) {
                                e.d("SharedKey failed to decrypt key bag.", new Object[0]);
                            }
                        } else {
                            try {
                                gel gel = this.c;
                                String str = pyv.b;
                                iha b2 = ihb.b();
                                b2.a = new gex(str);
                                b2.b = new Feature[]{gqy.a};
                                acws.a(((iby) gel).a(b2.a()));
                                throw new hjm(1025, "Local keys not valid.");
                            } catch (InterruptedException | ExecutionException e6) {
                                if (e6.getCause() instanceof ibr) {
                                    throw hjm.a((ibr) e6.getCause());
                                }
                                throw new hjm(1025, (Throwable) e6);
                            }
                        }
                    }
                } catch (InterruptedException | ExecutionException e7) {
                    if (e7.getCause() instanceof ibr) {
                        throw hjm.a((ibr) e7.getCause());
                    }
                    throw new hjm(1025, (Throwable) e7);
                }
            }
        } else {
            try {
                hiw a5 = hiw.a((hmg) amri.b());
                aqpd aqpd5 = c2.c;
                if (aqpd5 == null) {
                    aqpd5 = aqpd.g;
                }
                return hiv.a(a5, aqpd5);
            } catch (hit | hix e8) {
                this.b.a(pyv);
                throw new hjm(hjn.a(e8), "Invalid metadata or passphrase.", e8);
            }
        }
    }

    public final amri c(pyv pyv) {
        amri b2 = this.b.b(pyv);
        if (!b2.a() || ((aqpb) b2.b()).c == null) {
            return ampu.a;
        }
        aqpd aqpd = ((aqpb) b2.b()).c;
        if (aqpd == null) {
            aqpd = aqpd.g;
        }
        aqpc a2 = aqpc.a(aqpd.b);
        if (a2 == null) {
            a2 = aqpc.UNRECOGNIZED;
        }
        return amri.b(a2);
    }

    public final boolean a(pyv pyv, hiw hiw) {
        aqpb c2 = this.b.c(pyv);
        aqpd aqpd = c2.c;
        if (aqpd == null) {
            aqpd = aqpd.g;
        }
        if (!hiv.a(aqpd)) {
            try {
                aqpd aqpd2 = c2.c;
                if (aqpd2 == null) {
                    aqpd2 = aqpd.g;
                }
                hiv.a(hiw, aqpd2);
                this.f.a(pyv, hkx.a, amri.b(hiw.a()));
                return true;
            } catch (hix e2) {
                return false;
            } catch (hit e3) {
                throw new hjm(hjn.a((hiu) e3), "Failed to create cryptographer.", e3);
            }
        } else {
            throw new hjm(769, "The cryptographer is supposed to be created using keystore keys.");
        }
    }
}
