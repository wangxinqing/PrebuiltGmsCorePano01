package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;

/* renamed from: fkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fkq implements Callable {
    private final fku a;
    private final pyv b;

    public fkq(fku fku, pyv pyv) {
        this.a = fku;
        this.b = pyv;
    }

    public final Object call() {
        Object a2;
        auuk auuk;
        fku fku = this.a;
        pyv pyv = this.b;
        flm flm = fku.b;
        flf flf = flm.d;
        iva.a((Object) flf);
        iva.a((Object) pyv);
        synchronized (flm.c) {
            a2 = flm.b.a(flk.a, new String[]{pyv.d, flf.a}, new fld(flf), flf.b);
            if (a2 == null) {
                a2 = flf.b;
            }
        }
        amri amri = (amri) a2;
        if (amri.a()) {
            auuk = (auuk) amri.b();
        } else {
            flq flq = fku.a;
            try {
                aucd o = auuj.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                auuj auuj = (auuj) o.b;
                auuj.a |= 2;
                auuj.c = true;
                auul a3 = flq.a((String) null);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                auuj auuj2 = (auuj) o.b;
                a3.getClass();
                auuj2.b = a3;
                auuj2.a |= 1;
                fxq a4 = flq.a();
                ClientContext a5 = flq.a(pyv);
                auuj auuj3 = (auuj) o.i();
                iyn iyn = a4.a;
                StringBuilder sb = new StringBuilder();
                sb.append("/phoneNumbers?alt=proto");
                if (!(auuj3 == null || (auuj3.a & 1) == 0)) {
                    auul auul = auuj3.b;
                    if (auul == null) {
                        auul = auul.e;
                    }
                    if ((auul.a & 1) != 0) {
                        sb.append("&header.playServicesVersion=");
                        auul auul2 = auuj3.b;
                        if (auul2 == null) {
                            auul2 = auul.e;
                        }
                        sb.append(iyv.a(auul2.b));
                    }
                }
                if (!(auuj3 == null || (auuj3.a & 1) == 0)) {
                    auul auul3 = auuj3.b;
                    if (auul3 == null) {
                        auul3 = auul.e;
                    }
                    if ((auul3.a & 2) != 0) {
                        sb.append("&header.certificateSha1=");
                        auul auul4 = auuj3.b;
                        if (auul4 == null) {
                            auul4 = auul.e;
                        }
                        sb.append(iyv.a(auul4.c));
                    }
                }
                if (!(auuj3 == null || (auuj3.a & 1) == 0)) {
                    auul auul5 = auuj3.b;
                    if (auul5 == null) {
                        auul5 = auul.e;
                    }
                    if ((auul5.a & 4) != 0) {
                        sb.append("&header.packageName=");
                        auul auul6 = auuj3.b;
                        if (auul6 == null) {
                            auul6 = auul.e;
                        }
                        sb.append(iyv.a(auul6.d));
                    }
                }
                if (!(auuj3 == null || (auuj3.a & 2) == 0)) {
                    sb.append("&isSyncRequest=");
                    sb.append(auuj3.c);
                }
                auuk auuk2 = (auuk) iyn.a(a5, 0, sb.toString(), (byte[]) null, (Object) auuk.b);
                flm flm2 = fku.b;
                flf flf2 = flm.d;
                amri b2 = amri.b(auuk2);
                iva.a((Object) flf2);
                iva.a((Object) pyv);
                synchronized (flm2.c) {
                    flm2.b.a((flb) new fle(flf2, pyv.d, b2));
                }
                auuk = auuk2;
            } catch (VolleyError e) {
                throw flq.a(e);
            } catch (eif e2) {
                throw qbf.a(e2);
            }
        }
        return amym.a((Iterable) auuk.a).a(fkr.a).a(fks.a).a(fkt.a).b();
    }
}
