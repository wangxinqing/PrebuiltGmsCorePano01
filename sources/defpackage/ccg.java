package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ccg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccg extends cbe implements cao {
    public final ccf a = new ccf();
    public final HashMap b = new HashMap();
    private final Context c;

    public ccg(Context context) {
        this.c = context;
    }

    private static final bsz a(bsz bsz, ccj ccj) {
        return ccj.e ? bsz.a : bsz;
    }

    private final ccv c(bsz bsz, atjv atjv) {
        ccj a2 = this.a.a(atjv.bA);
        if (a2 == null) {
            Object[] objArr = {bsz, Integer.valueOf(atjv.bA)};
            return null;
        }
        ccl ccl = (ccl) this.b.get(a(bsz, a2));
        if (ccl != null) {
            cck cck = (cck) ccl.b.get(a2);
            if (cck != null) {
                return cck.a;
            }
            ((anih) ((anih) bxk.a.b()).a("ccg", "c", 224, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProducerManager] runningProducer for account=%s, contextName=%s is null.", (Object) bsz, atjv.bA);
            return null;
        }
        Object[] objArr2 = {bsz, Integer.valueOf(atjv.bA)};
        return null;
    }

    public final void b(bsz bsz, atjv atjv) {
        Object[] objArr = {Integer.toString(atjv.bA), bsz};
        HashSet b2 = this.a.b(atjv.bA);
        if (b2 != null) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                ccj ccj = (ccj) it.next();
                ccl ccl = (ccl) this.b.get(a(bsz, ccj));
                if (ccl != null) {
                    int i = atjv.bA;
                    cck cck = (cck) ccl.b.get(ccj);
                    if (cck != null) {
                        if (ccj.e) {
                            ccv ccv = cck.a;
                            iva.b(ccv.f.e);
                            Object[] objArr2 = {bsz, ccv.c, Integer.valueOf(ccv.h.size()), Boolean.valueOf(ccv.h.remove(bsz))};
                        }
                        if (!ccj.e || jir.a((Collection) cck.a.h)) {
                            cck.b.remove(Integer.valueOf(i));
                            if (cck.b.isEmpty()) {
                                cck.a.f();
                                ccl.b.remove(ccj);
                            }
                        }
                    }
                }
            }
        }
    }

    public final int a(int i) {
        ccj a2 = this.a.a(i);
        if (a2 != null) {
            return a2.a(i);
        }
        return 0;
    }

    public final void a(bsz bsz, atjv atjv) {
        bsz bsz2;
        HashSet b2 = this.a.b(atjv.bA);
        if (b2 != null) {
            Object[] objArr = {Integer.toString(atjv.bA), bsz};
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                ccj ccj = (ccj) it.next();
                ccl ccl = (ccl) this.b.get(a(bsz, ccj));
                if (ccl == null) {
                    ccl = new ccl(this.c);
                    this.b.put(a(bsz, ccj), ccl);
                }
                int i = atjv.bA;
                cck cck = (cck) ccl.b.get(ccj);
                if (cck == null) {
                    Context context = ccl.a;
                    cch cch = ccj.a;
                    if (ccj.e) {
                        bsz2 = bsz.a;
                    } else {
                        bsz2 = bsz;
                    }
                    cck = new cck(cch.a(context, bsz2));
                    ccl.b.put(ccj, cck);
                    cck.a.e();
                }
                if (ccj.e) {
                    ccv ccv = cck.a;
                    iva.b(ccv.f.e);
                    boolean add = ccv.h.add(bsz);
                    Object[] objArr2 = {bsz, ccv.c, Integer.valueOf(ccv.h.size()), Boolean.valueOf(add)};
                    WriteBatchImpl writeBatchImpl = ccv.i;
                    if (writeBatchImpl != null && add) {
                        new Object[1][0] = writeBatchImpl;
                        ccv.a(writeBatchImpl, grb.b(ccv.f.b, bsz.a()));
                    }
                }
                cck.b.add(Integer.valueOf(i));
            }
        }
    }

    public final void a(bsz bsz, cas cas) {
        ccv c2 = c(bsz, cas.b());
        if (c2 != null) {
            c2.a(cas);
        }
    }

    public final void a(bsz bsz, cas cas, cas cas2) {
        ccv c2 = c(bsz, cas.b());
        if (c2 == null) {
            return;
        }
        if (cas2 == null) {
            c2.a(cas, (cas) null);
        } else if (cas.b() == cas2.b()) {
            c2.a(cas, cas2);
        } else {
            ccv c3 = c(bsz, cas2.b());
            if (c3 != null) {
                c3.a(cas2);
            }
            c2.a(cas, (cas) null);
        }
    }

    public final void a(ccj ccj) {
        ccf ccf = this.a;
        int[] iArr = ccj.c;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            ccj ccj2 = (ccj) ccf.a.get(i2);
            if (ccj2 == null || TextUtils.equals(ccj2.b, ccj.b)) {
                ccf.a.put(i2, ccj);
                i++;
            } else {
                String str = ccj2.b;
                String num = Integer.toString(i2);
                String str2 = ccj.b;
                int length2 = String.valueOf(str).length();
                StringBuilder sb = new StringBuilder(length2 + 104 + String.valueOf(num).length() + String.valueOf(str2).length());
                sb.append("Module ");
                sb.append(str);
                sb.append(" already produces context name ");
                sb.append(num);
                sb.append(".  Cannot add  module ");
                sb.append(str2);
                sb.append(" because it also produces this context data.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
