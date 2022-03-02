package defpackage;

import android.util.SparseArray;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.cast.JGCastService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: amlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amlz implements Runnable, amkm {
    public final amlg a;
    public final long b;
    public final AtomicReference c;
    public aorr d;
    int e = 0;
    private final UUID f;
    private final boolean g;
    private final amln h;

    public amlz(amlg amlg, UUID uuid, amln amln, amlx amlx, long j, boolean z) {
        this.a = amlg;
        this.f = uuid;
        this.h = amln;
        this.b = j;
        this.g = z;
        this.c = new AtomicReference(amlx);
    }

    public final void run() {
        amly amly;
        int i;
        amlg amlg = this.a;
        aorr aorr = this.d;
        synchronized (this) {
            amlx amlx = (amlx) this.c.get();
            int i2 = amlx.e + 1;
            amlx[] amlxArr = new amlx[i2];
            while (amlx != null) {
                amlxArr[amlx.e] = amlx;
                amlx = amlx.f;
            }
            amln amln = this.h;
            aucd aucd = (aucd) amln.c(5);
            aucd.a((aucj) amln);
            SparseArray sparseArray = new SparseArray(i2);
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                amlx amlx2 = amlxArr[i3];
                boolean z2 = this.g;
                aucd o = amkp.i.o();
                String str = amlx2.b;
                if (o.c) {
                    o.c();
                    o.c = z;
                }
                amkp amkp = (amkp) o.b;
                str.getClass();
                int i5 = amkp.a | 1;
                amkp.a = i5;
                amkp.b = str;
                int i6 = amlx2.e;
                int i7 = i5 | 2;
                amkp.a = i7;
                amkp.c = i6;
                amlx amlx3 = amlx2.a;
                if (amlx3 != null) {
                    i = amlx3.e;
                } else {
                    i = -1;
                }
                int i8 = i7 | 4;
                amkp.a = i8;
                amkp.d = i;
                int i9 = i2;
                amkp.a = i8 | 8;
                amkp.e = (long) amlx2.c;
                int i10 = amlx2.g;
                if (i10 != 0) {
                    amrl.b(true);
                    long j = (long) (1073741823 & i10);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    amkp amkp2 = (amkp) o.b;
                    amkp2.a |= 16;
                    amkp2.f = j;
                    amrl.b(true);
                    boolean z3 = (i10 & JGCastService.FLAG_PRIVATE_DISPLAY) != 0;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    amkp amkp3 = (amkp) o.b;
                    amkp3.a |= 64;
                    amkp3.h = z3;
                }
                if (z2) {
                    int i11 = amlx2.get();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    amkp amkp4 = (amkp) o.b;
                    amkp4.a |= 32;
                    amkp4.g = i11;
                }
                amkp amkp5 = (amkp) o.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                amln amln2 = (amln) aucd.b;
                amln amln3 = amln.i;
                amkp5.getClass();
                if (!amln2.d.a()) {
                    amln2.d = aucj.a(amln2.d);
                }
                amln2.d.add(amkp5);
                sparseArray.append(amlx2.e, amlx2.d);
                if (!amlx2.a()) {
                    i4++;
                }
                i3++;
                i2 = i9;
                z = false;
            }
            if (this.e != 0) {
                aucd o2 = amkc.d.o();
                aucd o3 = amkb.c.o();
                int i12 = this.e;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                amkb amkb = (amkb) o3.b;
                amkb.a |= 1;
                amkb.b = i12;
                amkb amkb2 = (amkb) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                amkc amkc = (amkc) o2.b;
                amkb2.getClass();
                amkc.b = amkb2;
                amkc.a |= 1;
                amkc amkc2 = (amkc) o2.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                amln amln4 = (amln) aucd.b;
                amln amln5 = amln.i;
                amkc2.getClass();
                amln4.g = amkc2;
                amln4.a |= 16;
            }
            amly = new amly(amlxArr[0].b, this.f, this.b, (amln) aucd.i(), sparseArray, i4);
        }
        amrl.b(amlg.d.remove(amly.b) != null);
        if (!aorr.isCancelled()) {
            try {
                aorl.a((Future) aorr);
                long j2 = amly.c;
                while (true) {
                    long j3 = amlg.e.get();
                    if (j2 <= j3) {
                        break;
                    } else if (amlg.e.compareAndSet(j3, 300000 + j2)) {
                        long j4 = j2 - 2100000;
                        for (amlz amlz : amlg.d.values()) {
                            if (amlz.b < j4) {
                                aort a2 = amlg.c.a(amle.a, 10, TimeUnit.SECONDS);
                                amlz.getClass();
                                a2.a(new amlf(amlz), aoqm.a);
                            }
                        }
                    }
                }
                amlg.a(amly.d, amly.e, amly.a);
            } catch (ExecutionException e2) {
                anhn anhn = (anhn) amlg.a.b();
                anhn.a(e2.getCause());
                ((anhn) anhn.a("amlg", "a", 208, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Trace %s failed collection", (Object) amly.a);
            }
        } else {
            amkc amkc3 = amly.d.g;
            if (amkc3 == null) {
                amkc3 = amkc.d;
            }
            long b2 = amlg.b.b() - amly.c;
            amln amln6 = amly.d;
            aucd aucd2 = (aucd) amln6.c(5);
            aucd2.a((aucj) amln6);
            aucd aucd3 = (aucd) amkc3.c(5);
            aucd3.a((aucj) amkc3);
            aucd o4 = amka.d.o();
            int i13 = amly.f;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            amka amka = (amka) o4.b;
            int i14 = amka.a | 2;
            amka.a = i14;
            amka.c = i13;
            amka.a = 1 | i14;
            amka.b = b2;
            amka amka2 = (amka) o4.i();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            amkc amkc4 = (amkc) aucd3.b;
            amka2.getClass();
            amkc4.c = amka2;
            amkc4.a |= 2;
            amkc amkc5 = (amkc) aucd3.i();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            amln amln7 = (amln) aucd2.b;
            amln amln8 = amln.i;
            amkc5.getClass();
            amln7.g = amkc5;
            amln7.a |= 16;
            amln amln9 = (amln) aucd2.i();
            int size = amln9.d.size() - 1;
            Iterator it = anda.a((List) amln9.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                amkp amkp6 = (amkp) it.next();
                int i15 = amkp6.a;
                if ((i15 & 16) == 0 && (i15 & 4) != 0) {
                    size = amkp6.c;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i16 = 0;
            while (size >= 0) {
                amkp amkp7 = (amkp) amln9.d.get(size);
                int i17 = (int) amkp7.e;
                String valueOf = String.valueOf(amkp7.b);
                String str2 = (amkp7.a & 16) != 0 ? "" : " (Timed Out)";
                arrayList.add(new StackTraceElement("tk_trace", str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2), "Started After", (i17 - i16) / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
                size = ((amkp) amln9.d.get(size)).d;
                i16 = i17;
            }
            anhn anhn2 = (anhn) amlg.a.b();
            anhn2.a((Throwable) new amlr("", (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])));
            ((anhn) anhn2.a("amlg", "a", 264, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Trace %s timed out after %d ms. Complete trace: %s", (Object) amly.a, (Object) Long.valueOf(b2), (Object) amln9);
            amlg.a(amln9, amly.e, amly.a);
        }
    }
}
