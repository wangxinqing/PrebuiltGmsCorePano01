package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: akjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akjj implements akje, akkf {
    private static final List e = Collections.emptyList();
    public final akjm a;
    public long b = -1;
    public long c = -1;
    public final akuv d;
    private final String f;
    private final akjc g;
    private final akkg h;
    private final Executor i;
    private final Executor j;
    private final akjo k;
    private final akma l;
    private final akoi m;
    private akjx n;
    private final akuo o;

    public akjj(akjc akjc, akol akol, akkg akkg, String str, List list, akoi akoi) {
        this.h = akkg;
        this.f = str;
        this.m = akoi;
        this.g = akjc;
        akuj akuj = (akuj) akjc;
        this.o = akuj.h;
        this.j = akuj.b;
        this.i = akuj.c;
        this.d = akuj.a;
        this.l = akuj.d;
        this.a = new akjm(str, new akjl(akuj.h, akol, azbz.a.a().o()), list);
        akuo akuo = akuj.h;
        if (!azbz.a.a().m()) {
            this.k = new akju(this.o);
        } else {
            this.k = new akjn();
        }
    }

    public static List a(akmq akmq) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new akmr());
        arrayList.add(new akmz());
        arrayList.add(new aknb());
        arrayList.add(new akna(akmq));
        arrayList.add(new akmp());
        arrayList.add(new akmw());
        arrayList.add(new akmv());
        arrayList.add(new akmx(akmq));
        return arrayList;
    }

    private final void c(akhy akhy) {
        akjx akjx = this.n;
        if (akjx == null) {
            aklz.a().c(a("Callback is missing, unable to deliver inferences"));
        } else {
            akjx.a(akhy);
        }
    }

    public final void b() {
        int i2;
        akma akma = this.l;
        if (this.f != null) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        akma.a(i2, 3, 4);
        aklz.a();
        a("PlaceInferenceEngine stop");
        this.h.a();
    }

    private final void a(akhy akhy, boolean z, int i2) {
        long j2;
        boolean z2;
        akhy akhy2 = akhy;
        List list = akhy2.b;
        int size = list != null ? list.size() : 0;
        int[] iArr = new int[3];
        Arrays.fill(iArr, 0);
        float[] fArr = new float[3];
        Arrays.fill(fArr, -1.0f);
        float f2 = 0.0f;
        if (akhy2.f == 0) {
            int i3 = 0;
            for (akhx akhx : akhy2.b) {
                if (akhx.f != -1.0f) {
                    i3++;
                    f2 = Math.max(f2, akhx.e);
                }
                int i4 = -akhx.h;
                if (i4 >= 0 && i4 < 3) {
                    iArr[i4] = iArr[i4] + 1;
                    fArr[i4] = Math.max(fArr[i4], akhx.f);
                }
            }
            size = i3;
        }
        long j3 = this.c;
        if (j3 >= 0) {
            j2 = j3 / 1000;
        } else {
            j2 = -1;
        }
        if (this.f != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i5 = akhy2.k;
        int i6 = i5 - 1;
        if (i5 != 0) {
            int a2 = aobp.a(i6);
            akma akma = this.l;
            int i7 = (int) j2;
            int i8 = akhy2.c;
            aucd o2 = aocd.k.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aocd aocd = (aocd) o2.b;
            int i9 = aocd.a | 1;
            aocd.a = i9;
            aocd.b = size;
            int i10 = i9 | 2;
            aocd.a = i10;
            double d2 = (double) f2;
            Double.isNaN(d2);
            aocd.c = (int) (d2 * 10000.0d);
            int i11 = i10 | 4;
            aocd.a = i11;
            aocd.d = i7;
            int i12 = i11 | 8;
            aocd.a = i12;
            aocd.e = z;
            int i13 = i12 | 16;
            aocd.a = i13;
            aocd.f = z2;
            int i14 = a2 - 1;
            if (a2 != 0) {
                aocd.i = i14;
                int i15 = i13 | 512;
                aocd.a = i15;
                int i16 = i15 | 1024;
                aocd.a = i16;
                aocd.j = i8;
                aocd.a = i16 | 64;
                aocd.g = i2;
                for (int i17 = 0; i17 < 3; i17++) {
                    if (iArr[i17] > 0) {
                        aucd o3 = aocc.e.o();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        aocc aocc = (aocc) o3.b;
                        int i18 = aocc.a | 1;
                        aocc.a = i18;
                        aocc.b = i17;
                        int i19 = iArr[i17];
                        int i20 = i18 | 2;
                        aocc.a = i20;
                        aocc.c = i19;
                        float f3 = fArr[i17];
                        aocc.a = i20 | 4;
                        double d3 = (double) f3;
                        Double.isNaN(d3);
                        aocc.d = (int) (d3 * 10000.0d);
                        aocc aocc2 = (aocc) o3.i();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aocd aocd2 = (aocd) o2.b;
                        aocc2.getClass();
                        if (!aocd2.h.a()) {
                            aocd2.h = aucj.a(aocd2.h);
                        }
                        aocd2.h.add(aocc2);
                    }
                }
                aocd aocd3 = (aocd) o2.i();
                akun akun = (akun) akma;
                aocf a3 = akun.a();
                aucd aucd = (aucd) a3.c(5);
                aucd.a((aucj) a3);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aocf aocf = (aocf) aucd.b;
                aocf aocf2 = aocf.s;
                aocf.c = 2;
                int i21 = aocf.a | 2;
                aocf.a = i21;
                if (aocd3 != null) {
                    aocd3.getClass();
                    aocf.i = aocd3;
                    aocf.a = i21 | 128;
                }
                akun.a((aocf) aucd.i());
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void b(akhy akhy) {
        this.k.a(akhy);
        if (this.k.a()) {
            c(akhy);
            a(akhy, true, akhy.f);
        } else if (this.k.c()) {
            int i2 = akhy.f;
            aklz.a();
            StringBuilder sb = new StringBuilder(54);
            sb.append("Force trigger a place update, status code: ");
            sb.append(i2);
            a(sb.toString());
            c(akhy);
            a(akhy, true, i2);
        } else {
            aklz.a();
            StringBuilder sb2 = new StringBuilder(71);
            sb2.append("Decided not to trigger a new inference result, status code: 2");
            a(sb2.toString());
            boolean z = akhy.g;
            boolean z2 = akhy.i;
            aklr aklr = akhy.j;
            if (this.n == null) {
                aklz.a().c(a("Callback is missing, unable to deliver no inferences"));
            } else {
                this.n.a(akhy.a(e, SystemClock.elapsedRealtime(), this.f, 2, z, z2, 1, 0, aklr));
            }
            a(akhy, false, akhy.f);
        }
        this.k.a(false);
    }

    public final void c() {
        int a2;
        int a3;
        akoi akoi = this.m;
        if (akoi != null) {
            akok akok = akoi.a;
            if (akok.a != null) {
                aklc aklc = akok.b;
                HashSet hashSet = new HashSet();
                int i2 = 0;
                while (true) {
                    ou ouVar = aklc.b;
                    if (i2 >= ouVar.h) {
                        akok.a.a((Collection) hashSet, (akle) new akoj(new HashSet(), akoi));
                        return;
                    }
                    astv astv = (astv) ouVar.c(i2);
                    if ((astv.a & 4) != 0) {
                        aucx aucx = astv.c;
                        int size = aucx.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            astu astu = (astu) aucx.get(i3);
                            int a4 = astr.a(astu.b);
                            if (a4 != 0 && a4 == 3 && (((a2 = astt.a(astu.a)) != 0 && a2 == 2) || ((a3 = astt.a(astu.a)) != 0 && a3 == 3))) {
                                hashSet.add(Long.valueOf(astv.b));
                            }
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public final void b(akln akln, List list) {
        if (!list.isEmpty()) {
            aklz.a();
            int size = list.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Scoring ");
            sb.append(size);
            sb.append(" candidates");
            a(sb.toString());
            this.i.execute(new akjg(this, akln, list, this.g.a().d()));
            return;
        }
        akhy a2 = akhy.a(e, SystemClock.elapsedRealtime(), this.f, 0, akln.f, false, 1, 0, (aklr) null);
        aklz.a();
        a("No candidates, generating empty PlaceInference list.");
        a(a2);
    }

    public final akhy a() {
        akhy b2 = this.k.b();
        long c2 = (long) ((int) azcf.a.a().c());
        if (b2 == null || c2 <= 0 || SystemClock.elapsedRealtime() - b2.d <= c2 * 1000) {
            return b2;
        }
        return null;
    }

    public final String a(String str) {
        String str2 = this.f;
        if (str2 == null) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("[anon] ") : "[anon] ".concat(valueOf);
        }
        int hashCode = str2.hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("[account#");
        sb.append(hashCode);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    public final void a(int i2) {
        this.k.a(true);
        if (i2 == 1 || i2 == 0) {
            akof a2 = aklz.a();
            StringBuilder sb = new StringBuilder(35);
            sb.append("Changed inference mode: ");
            sb.append(i2);
            a2.a(a(sb.toString()));
            return;
        }
        akof a3 = aklz.a();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Unexpected mode, ignored: -1");
        a3.b(a(sb2.toString()));
    }

    public final void a(long j2, String str, aklr aklr) {
        long j3 = j2;
        this.h.a(j3, str, aklr);
        if (azbz.a.a().q()) {
            long millis = TimeUnit.MICROSECONDS.toMillis(j3) - this.d.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            akhy b2 = this.k.b();
            if (millis > elapsedRealtime || (b2 != null && millis < b2.d)) {
                millis = elapsedRealtime;
            }
            akhx[] akhxArr = {new akhx(str, 0, (String) null, akhx.a, 0, 1.0f, 1.0f, (aklq) null, false)};
            a(akhy.a(Arrays.asList(akhxArr), millis, this.f, 0, false, true, 1, 0, aklr));
        }
    }

    public final void a(akhy akhy) {
        this.j.execute(new akjh(this, akhy));
    }

    public final void a(akjx akjx) {
        int i2;
        if (akjx != null) {
            akma akma = this.l;
            if (this.f == null) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            akma.a(i2, 2, 4);
            aklz.a();
            a("PlaceInferenceEngine start");
            this.n = akjx;
            this.h.a(this);
            return;
        }
        throw new NullPointerException("callback can not be null");
    }

    public final void a(akln akln, List list) {
        aklz.a();
        int size = list.size();
        StringBuilder sb = new StringBuilder(58);
        sb.append("New signals available and ");
        sb.append(size);
        sb.append(" anonymous candidates");
        a(sb.toString());
        this.h.a(akln, list);
    }

    public final void a(boolean z) {
        aklz.a();
        StringBuilder sb = new StringBuilder(50);
        sb.append("Failed to get candidates, status code: ");
        sb.append(18);
        a(sb.toString());
        b(akhy.a(e, SystemClock.elapsedRealtime(), this.f, 18, z, false, 1, 0, (aklr) null));
    }
}
