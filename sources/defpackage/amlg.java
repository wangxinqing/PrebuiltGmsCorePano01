package defpackage;

import android.os.Build;
import android.util.SparseArray;
import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: amlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amlg implements amld {
    public static final anhq a = anhq.a("amlg");
    public final aekn b;
    public final aorv c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e = new AtomicLong(2100000);
    public final int f;
    private final amjy g;
    private final bapu h;
    private final amlq i;
    private final amkh j;

    public amlg(amjy amjy, aekn aekn, aorv aorv, bapu bapu, amlq amlq, amkh amkh, amri amri) {
        this.g = amjy;
        this.b = aekn;
        this.c = aorv;
        this.h = bapu;
        this.i = amlq;
        this.j = amkh;
        this.f = (!amri.a() || ((Integer) amri.b()).intValue() <= 0) ? 500 : ((Integer) amri.b()).intValue();
    }

    private final void a(amly amly) {
        amkc amkc = amly.d.g;
        if (amkc == null) {
            amkc = amkc.d;
        }
        long b2 = this.b.b() - amly.c;
        amln amln = amly.d;
        aucd aucd = (aucd) amln.c(5);
        aucd.a((aucj) amln);
        aucd aucd2 = (aucd) amkc.c(5);
        aucd2.a((aucj) amkc);
        aucd o = amka.d.o();
        int i2 = amly.f;
        if (o.c) {
            o.c();
            o.c = false;
        }
        amka amka = (amka) o.b;
        int i3 = amka.a | 2;
        amka.a = i3;
        amka.c = i2;
        amka.a = i3 | 1;
        amka.b = b2;
        amka amka2 = (amka) o.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        amkc amkc2 = (amkc) aucd2.b;
        amka2.getClass();
        amkc2.c = amka2;
        amkc2.a |= 2;
        amkc amkc3 = (amkc) aucd2.i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        amln amln2 = (amln) aucd.b;
        amln amln3 = amln.i;
        amkc3.getClass();
        amln2.g = amkc3;
        amln2.a |= 16;
        amln amln4 = (amln) aucd.i();
        int size = amln4.d.size() - 1;
        Iterator it = anda.a((List) amln4.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            amkp amkp = (amkp) it.next();
            int i4 = amkp.a;
            if ((i4 & 16) == 0 && (i4 & 4) != 0) {
                size = amkp.c;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (true) {
            String str = "";
            if (size >= 0) {
                amkp amkp2 = (amkp) amln4.d.get(size);
                int i6 = (int) amkp2.e;
                String valueOf = String.valueOf(amkp2.b);
                if ((amkp2.a & 16) == 0) {
                    str = " (Timed Out)";
                }
                arrayList.add(new StackTraceElement("tk_trace", str.length() == 0 ? new String(valueOf) : valueOf.concat(str), "Started After", (i6 - i5) / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                size = ((amkp) amln4.d.get(size)).d;
                i5 = i6;
            } else {
                anhn anhn = (anhn) a.b();
                anhn.a((Throwable) new amlr(str, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                ((anhn) anhn.a("amlg", "a", 264, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Trace %s timed out after %d ms. Complete trace: %s", (Object) amly.a, (Object) Long.valueOf(b2), (Object) amln4);
                a(amln4, amly.e, amly.a);
                return;
            }
        }
    }

    public final amkw a(String str, amkv amkv, int i2, int i3) {
        long j2;
        String str2 = str;
        int i4 = i3;
        long a2 = this.b.a();
        long b2 = this.b.b();
        amkw b3 = amlv.b();
        if (b3 != null) {
            amlv.a(b3, str2);
        }
        amkh amkh = this.j;
        UUID uuid = new UUID((amkh.a() & -61441) ^ amkh.a.getMostSignificantBits(), (amkh.a() >>> 2) ^ amkh.a.getLeastSignificantBits());
        boolean a3 = amlp.a(uuid.getLeastSignificantBits(), this.i.a);
        aucd o = amln.i.o();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amln amln = (amln) o.b;
        amln.a |= 2;
        amln.c = leastSignificantBits;
        long mostSignificantBits = uuid.getMostSignificantBits();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amln amln2 = (amln) o.b;
        int i5 = amln2.a | 1;
        amln2.a = i5;
        amln2.b = mostSignificantBits;
        int i6 = i5 | 4;
        amln2.a = i6;
        amln2.e = a2;
        int i7 = i6 | 8;
        amln2.a = i7;
        amln2.f = b2;
        int i8 = i4 - 1;
        if (i4 != 0) {
            amln2.h = i8;
            amln2.a = i7 | 32;
            amln amln3 = (amln) o.i();
            if (i4 != 2) {
                j2 = this.b.c();
            } else {
                j2 = b2;
            }
            amlx amlx = new amlx(str2, amkv, i2);
            amlz amlz = new amlz(this, uuid, amln3, amlx, j2, a3);
            UUID uuid2 = uuid;
            amkn amkn = new amkn(amlx, uuid, amlz, this.b, j2, a3, i4 == 3);
            amjy amjy = this.g;
            amrl.a((Object) amkn);
            if (amjy.d.compareAndSet(false, true)) {
                amjy.c.execute(new amjv(amjy));
            }
            amjx amjx = new amjx(amkn, amjy.b);
            amjy.a.put(amjx, Boolean.TRUE);
            amjw amjw = amjx.a;
            aorv aorv = this.c;
            amlz.d = amjw;
            amjw.a(amlz, aorv);
            this.d.put(uuid2, amlz);
            amlv.b((amkw) amkn);
            return amkn;
        }
        throw null;
    }

    public void a(amln amln, SparseArray sparseArray, String str) {
        RuntimeException runtimeException;
        amkw b2 = amlv.b();
        amlv.b(amkk.b(str, amku.a));
        try {
            runtimeException = null;
            for (amlc a2 : (Set) this.h.a()) {
                a2.a(amln, sparseArray);
            }
            if (runtimeException == null) {
                amlv.b(b2);
                return;
            }
            throw runtimeException;
        } catch (RuntimeException e2) {
            if (runtimeException != null) {
                int i2 = Build.VERSION.SDK_INT;
                apev.a((Throwable) runtimeException, (Throwable) e2);
            } else {
                runtimeException = e2;
            }
        } catch (Throwable th) {
            amlv.b(b2);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(aorr aorr, amly amly) {
        amly amly2 = amly;
        amrl.b(this.d.remove(amly2.b) != null);
        if (!aorr.isCancelled()) {
            try {
                aorl.a((Future) aorr);
                long j2 = amly2.c;
                while (true) {
                    long j3 = this.e.get();
                    if (j2 <= j3) {
                        break;
                    } else if (this.e.compareAndSet(j3, 300000 + j2)) {
                        long j4 = j2 - 2100000;
                        for (amlz amlz : this.d.values()) {
                            if (amlz.b < j4) {
                                aort a2 = this.c.a(amle.a, 10, TimeUnit.SECONDS);
                                amlz.getClass();
                                a2.a(new amlf(amlz), aoqm.a);
                            }
                        }
                    }
                }
                a(amly2.d, amly2.e, amly2.a);
            } catch (ExecutionException e2) {
                anhn anhn = (anhn) a.b();
                anhn.a(e2.getCause());
                ((anhn) anhn.a("amlg", "a", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Trace %s failed collection", (Object) amly2.a);
            }
        } else {
            amkc amkc = amly2.d.g;
            if (amkc == null) {
                amkc = amkc.d;
            }
            long b2 = this.b.b() - amly2.c;
            amln amln = amly2.d;
            aucd aucd = (aucd) amln.c(5);
            aucd.a((aucj) amln);
            aucd aucd2 = (aucd) amkc.c(5);
            aucd2.a((aucj) amkc);
            aucd o = amka.d.o();
            int i2 = amly2.f;
            if (o.c) {
                o.c();
                o.c = false;
            }
            amka amka = (amka) o.b;
            int i3 = amka.a | 2;
            amka.a = i3;
            amka.c = i2;
            amka.a = 1 | i3;
            amka.b = b2;
            amka amka2 = (amka) o.i();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            amkc amkc2 = (amkc) aucd2.b;
            amka2.getClass();
            amkc2.c = amka2;
            amkc2.a |= 2;
            amkc amkc3 = (amkc) aucd2.i();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            amln amln2 = (amln) aucd.b;
            amln amln3 = amln.i;
            amkc3.getClass();
            amln2.g = amkc3;
            amln2.a |= 16;
            amln amln4 = (amln) aucd.i();
            int size = amln4.d.size() - 1;
            Iterator it = anda.a((List) amln4.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                amkp amkp = (amkp) it.next();
                int i4 = amkp.a;
                if ((i4 & 16) == 0 && (i4 & 4) != 0) {
                    size = amkp.c;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (true) {
                String str = "";
                if (size >= 0) {
                    amkp amkp2 = (amkp) amln4.d.get(size);
                    int i6 = (int) amkp2.e;
                    String valueOf = String.valueOf(amkp2.b);
                    if ((amkp2.a & 16) == 0) {
                        str = " (Timed Out)";
                    }
                    arrayList.add(new StackTraceElement("tk_trace", str.length() == 0 ? new String(valueOf) : valueOf.concat(str), "Started After", (i6 - i5) / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                    size = ((amkp) amln4.d.get(size)).d;
                    i5 = i6;
                } else {
                    anhn anhn2 = (anhn) a.b();
                    anhn2.a((Throwable) new amlr(str, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
                    ((anhn) anhn2.a("amlg", "a", 264, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Trace %s timed out after %d ms. Complete trace: %s", (Object) amly2.a, (Object) Long.valueOf(b2), (Object) amln4);
                    a(amln4, amly2.e, amly2.a);
                    return;
                }
            }
        }
    }
}
