package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ajcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajcp implements ajcl, ajqu {
    final ajbd a;
    final ahqq b;
    final ahqu c;
    final ahqg d;
    final ajbx e;
    public final airy f;
    public final boolean g;
    public final ahwp h;
    final ajph i;
    final ahxu j;
    final ahxb k;
    final ajcs l;
    final aiai m;
    private long n;
    private final airv o;
    private final ahqj p = ahqj.a;
    private final aisk q;

    public ajcp(ajbd ajbd, ahqp ahqp, aibb aibb, aizk aizk, File file, boolean z) {
        ajaa ajaa;
        arsn arsn;
        airo airo;
        ajbd ajbd2 = ajbd;
        boolean z2 = z;
        this.a = ajbd2;
        aizz g2 = ajbd.g();
        ajaa h2 = ajbd.h();
        ajbx ajbx = new ajbx(ajbd.f(), h2);
        this.b = new ahqq(g2, ajbd.f(), ahqp);
        this.c = new ahqu(ajbd.f(), h2, g2);
        aizy f2 = ajbd.f();
        ajbg k2 = ajbd.k();
        byte[] b2 = g2.b();
        ahqj.a.b = f2;
        ahqj.a.c = k2;
        ahqj.a.a();
        ahqj.a.a(h2, aiab.a(b2, (ajrh) null), "dsm");
        aita aita = (aita) ajbd2;
        this.d = new ahqg(aita.r(), ajbd.f(), ajbd.k(), this.b, ahqp, this.p);
        ahxu ahxu = new ahxu(ajbd.p().b());
        String valueOf = String.valueOf(ahxu.c());
        if (valueOf.length() == 0) {
            new String("Initial state: ");
        } else {
            "Initial state: ".concat(valueOf);
        }
        ahxu.b();
        this.j = ahxu;
        this.k = new ahxb(ajbd.h(), g2.a(), g2.b());
        this.i = new ajph(ajbd.e(), new ajco(ajbd.j()), this.b, this.c, this.k, ajbx);
        this.m = new aiai();
        ahqq ahqq = this.b;
        aizy f3 = ajbd.f();
        ajaa h3 = ajbd.h();
        ajbg k3 = ajbd.k();
        aita.r();
        aizz g3 = ajbd.g();
        byte[] b3 = g3.b();
        aybd d2 = aybc.a.a();
        boolean z3 = arsf.a.b;
        arsf arsf = arsf.a;
        arsf.j = 180000;
        arsf.k = 3000;
        arsf.l = false;
        arsf.m = false;
        arsf.n = 0;
        arsf.o = 0;
        arsf.p = 0;
        arsf.q = 0;
        arsf.r = null;
        arsf.s.a();
        arsf.t = null;
        arsf.v = arru.a;
        arsf.c = f3;
        arsf.d = h3;
        arsf.e = k3;
        arsf.f = aiab.a(b3, (ajrh) null);
        arsf.g = d2;
        if (arsf.g.useFrewleTileCacheManagerV2()) {
            arsq arsq = arsq.a;
            arsq.c = arsf;
            arsq.b = 0;
            ajaa = h3;
            arsq.q = (int) arsf.g.frewleDefaultMaxNumApEntriesForDownload();
            arsq.r = true;
            arsq.s = true;
            arsq.t = 0;
            long frewleMacEntryLruCacheMaxSize = arsf.g.frewleMacEntryLruCacheMaxSize();
            arqf arqf = new arqf();
            arsq.d = new arqb(arqf, arqj.a((int) frewleMacEntryLruCacheMaxSize, arqf.c)).a();
            arsq.e = arqj.a((int) arsf.g.frewleSeenMacAddressLruCacheMaxSize()).b();
            arrs arrs = new arrs();
            arsq.f = new arro(arrs, arri.a(arrs.c)).a();
            long frewleFloorModelsCacheMaxSize = arsf.g.frewleFloorModelsCacheMaxSize();
            arqv arqv = new arqv(arsf.g.throwIllegalArgExceptionOnUnsupportedEncoding());
            arsq.g = new arqr(arqv, arsc.a((int) frewleFloorModelsCacheMaxSize, arqv.c)).a();
            long frewleBuildingIdsCacheMaxSize = arsf.g.frewleBuildingIdsCacheMaxSize();
            arqo arqo = new arqo();
            arsq.n = new arqk(arqo, arsc.a((int) frewleBuildingIdsCacheMaxSize, arqo.c)).a();
            arsq.o = argb.f().b();
            arsq.p = argb.f().b();
            arsq.a(arsf.d, arsf.f, "ftc");
            arsn = arsq.a;
        } else {
            ajaa = h3;
            arsm arsm = arsm.a;
            arsm.c = arsf;
            arsm.b = 0;
            arsm.o = (int) arsf.g.frewleDefaultMaxNumApEntriesForDownload();
            arsm.p = true;
            arsm.q = true;
            arsm.r = 0;
            long frewleMacEntryLruCacheMaxSize2 = arsf.g.frewleMacEntryLruCacheMaxSize();
            arqa arqa = new arqa();
            arsm.d = new arpw(arqa, arqj.a((int) frewleMacEntryLruCacheMaxSize2, arqa.c)).a();
            arsm.e = arqj.a((int) arsf.g.frewleSeenMacAddressLruCacheMaxSize()).b();
            arrn arrn = new arrn();
            arsm.f = new arrj(arrn, arri.a(arrn.c)).a();
            arsm.g = argb.f().b();
            arsm.n = argb.f().b();
            arsm.a(arsf.d, arsf.f, "ftc");
            arsn = arsm.a;
        }
        arsf.i = arsn;
        arsj arsj = arsj.a;
        arsj.b = arsf;
        arsj.c.set(false);
        arsj.k = 0;
        arsj.d = null;
        arsj.e = false;
        arsf arsf2 = arsj.b;
        arsj.a(arsf2.d, arsf2.f, "fsdsc");
        arsf.h = arsj.a;
        arsf.u = new arqy(f3.b());
        arsf.b = true;
        airo airo2 = new airo(ahqq, f3, new airq(new arpl(arsf.a)), new airm(ahqq.f, f3, ajaa, k3, g3));
        this.o = new airv(aita.r(), ajbd.f(), this.i, airo2, this.p);
        this.f = new airy(ajbd, airo2, aibb, this.o, this.m, this.p, airz.a(ajbd.e()));
        this.g = z2;
        if (z2) {
            airo = airo2;
            this.h = new ahxn(ajbd, ajbd.f(), ajbd.k(), this.b, this.c, this.k, this.i, this.j, ajbx, this.m, aizk);
        } else {
            airo = airo2;
            this.h = new ahxo(ajbd, ajbd.f(), ajbd.k(), this.b, ajbx, this.c, this.i);
        }
        this.e = ajbx;
        this.l = new ajcs(ajbd2, this.k, file, this.j);
        this.q = new aisk(ajbd2, airo);
    }

    public final void a() {
        airy airy = this.f;
        airy.E = true;
        if (!airy.A) {
            airy.a(airy.a.f(), (aibr[]) null, false);
        } else {
            airy.a.n().b();
        }
    }

    public final void a(int i2) {
    }

    public final void a(int i2, ahzx ahzx, boolean z, boolean z2, aizx aizx, Map map) {
    }

    public final void a(int i2, Object obj, aizx aizx) {
    }

    public final void a(long j2) {
    }

    public final void a(ahyg ahyg) {
    }

    public final void a(aibl aibl) {
    }

    public final void a(aizo aizo, int i2) {
    }

    public final void a(ajbe ajbe, aiac aiac) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void d(boolean z) {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
        ahqq ahqq = this.b;
        ajaa h2 = this.a.h();
        aizy f2 = this.a.f();
        long c2 = f2.c();
        File b2 = h2.b();
        if (b2 == null) {
            ahqq.a(c2);
        } else {
            File file = new File(b2, "nlp_state");
            long d2 = f2.d();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                ahqq.a(bufferedInputStream, ahqq.e.b(), d2, c2);
                bufferedInputStream.close();
            } catch (FileNotFoundException e2) {
                ahqq.a(c2);
                Locale locale = Locale.ENGLISH;
                new Object[1][0] = new Date(d2 + ahqq.a);
            } catch (IOException | SecurityException e3) {
                ahqq.a(c2);
                String valueOf = String.valueOf(e3.getMessage());
                if (valueOf.length() == 0) {
                    new String("exception is ");
                } else {
                    "exception is ".concat(valueOf);
                }
            }
        }
        ahxu ahxu = this.j;
        synchronized (ahxu.b) {
            ahxu.a.add(this);
        }
        this.j.b(true);
        this.j.c(false);
        ahqu ahqu = this.c;
        if (ahqu != null) {
            try {
                aqek a2 = ahqu.c.a();
                int i2 = ahqu.c.b;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Actual file version: ");
                sb.append(i2);
                sb.toString();
                long c3 = a2.c(1);
                long b3 = ahqu.b.b();
                long c4 = ahqu.b.c();
                long j2 = b3 - c4;
                for (int i3 = 0; i3 < a2.j(3); i3++) {
                    aqek f3 = a2.f(3, i3);
                    if (f3 != null) {
                        if (f3.a() && f3.i(1)) {
                            ahqt ahqt = new ahqt(f3);
                            short s = ahqt.b;
                            if (s != Short.MAX_VALUE) {
                                ahqt.b = ahqt.a(Math.min(c4, ((((long) s) * 86400000) + c3) - j2));
                            }
                            ahqu.a.a(ahqt);
                        }
                    }
                }
                ahqu.b();
                Locale locale2 = Locale.ENGLISH;
                new Object[1][0] = Integer.valueOf(ahqu.a.a());
            } catch (IOException e4) {
                ahqu.a.a.clear();
                e4.toString();
            }
        }
        this.d.e();
        this.i.a(this.a.f().c());
        this.k.b();
    }

    public final void b(long j2) {
        this.h.g(j2);
    }

    public final void c(boolean z) {
        this.j.c(z);
        airy airy = this.f;
        if (z && airy.a()) {
            airy.a(airy.a.f().c());
        }
        airy.i = z;
        this.h.a(z);
    }

    public final void e(boolean z) {
        this.j.b(false);
        this.h.d();
        airy airy = this.f;
        airy.a.k().a(ajbe.LOCATOR);
        if (airy.a()) {
            airy.a(airy.a.f().c());
        }
        airo airo = airy.e;
        airo.e.a();
        airo.f.a.a.a();
        airy.l = true;
        ahqg ahqg = this.d;
        ahqg.b.a(ajbe.CACHE_UPDATER);
        ahqg.b();
        ahxu ahxu = this.j;
        synchronized (ahxu.b) {
            ahxu.a.remove(this);
        }
        if (!z) {
            File a2 = ahxb.a(this.a.h());
            if (a2 != null) {
                a2.delete();
                return;
            }
            return;
        }
        this.b.a(this.a.h());
    }

    public final void f(boolean z) {
        airy airy = this.f;
        aiat aiat = airy.d;
        if (aiat != null && aiat.a != Long.MAX_VALUE) {
            aizy f2 = airy.a.f();
            aiat aiat2 = airy.d;
            airy.a(f2, new aiat(aiat2.a, aiat2.c, aiat2.d, aiat2.b, aiat2.h, aiat2.e), false);
        }
    }

    public final void g(boolean z) {
        airy airy = this.f;
        airy.a(this.a.f(), !z, airy.w);
    }

    public final void h(Object obj) {
        this.h.a(obj);
    }

    public final void b(aqek aqek) {
        this.h.a(aqek);
    }

    public final void h(boolean z) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("Full collection mode changed: ");
        sb.append(z);
        sb.toString();
        this.h.e(z);
    }

    public final void b(boolean z) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("powerSave mode changed to ");
        sb.append(z);
        sb.toString();
        this.h.b(z);
    }

    public final void a(int i2, int i3, boolean z) {
        this.j.a(i2, i3, z);
        this.h.a(i2, i3, z);
    }

    public final void a(ahqp ahqp) {
        ajbx ajbx = this.e;
        long c2 = ajbx.f.c();
        ajcc ajcc = ajbx.b;
        if (ajcc != null) {
            ajcc.a(ahqp.o(), c2);
        }
        ajcc ajcc2 = ajbx.c;
        if (ajcc2 != null) {
            ajcc2.a(ahqp.p(), c2);
        }
        ajcc ajcc3 = ajbx.d;
        if (ajcc3 != null) {
            ajcc3.a(ahqp.q(), c2);
        }
        ajcc ajcc4 = ajbx.e;
        if (ajcc4 != null) {
            ajcc4.a(ahqp.n(), c2);
        }
        ahxu ahxu = this.j;
        ahxu.f = ahqp.e();
        ahxu.b();
        this.h.a(ahqp);
    }

    public final void a(aiaj aiaj) {
        long c2 = this.a.f().c();
        this.j.e();
        this.m.a(c2, aiaj);
        airy airy = this.f;
        aizy f2 = this.a.f();
        if (!airy.i) {
            if (aiaj != null) {
                aiam aiam = airy.s;
                if (aiam.b.size() > 0) {
                    long j2 = aiaj.g - aiam.c;
                    aiaj aiaj2 = (aiaj) aiam.b.get(0);
                    while (aiaj2 != null && aiaj2.g < j2) {
                        aiam.b.remove(0);
                        aiaj2 = aiam.b.size() > 0 ? (aiaj) aiam.b.get(0) : null;
                    }
                }
                aiaj aiaj3 = aiam.a;
                if (aiaj3 != null && aiaj3.e() && !aiaj3.b(aiaj)) {
                    if (aiam.b.size() >= 4) {
                        aiam.b.remove(0);
                    }
                    aiam.b.add(aiaj3);
                }
                aiam.a = aiaj;
                if (!aiaj.e()) {
                    airy.u++;
                } else {
                    airy.u = 0;
                }
            } else {
                airy.t = -1;
            }
            airy.a(f2, (aibr[]) null, false);
        }
        this.h.a(aiaj);
    }

    public final void a(aiat aiat, boolean z) {
        this.f.a(this.a.f(), aiat, z);
        if (aydu.c()) {
            aisk aisk = this.q;
            aisk.c = aiat;
            aise aise = aisk.b;
            if (aise != null) {
                if (aiat.b < 5000 && aydu.c()) {
                    long j2 = aiat.b;
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("setPeriod(): starting RTT locator with period ");
                    sb.append(j2);
                    sb.toString();
                    aise.a();
                    aise.a((int) aiat.b);
                } else {
                    long j3 = aiat.b;
                    StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("setPeriod(): can't start RTT locator with period ");
                    sb2.append(j3);
                    sb2.toString();
                    aise.a();
                    aisk.b = null;
                }
            }
        }
        this.d.i = aiat.e;
    }

    public final void a(aiwz aiwz) {
        int i2 = aiwz.c;
        if (i2 == -1 || i2 >= 3) {
            this.f.K = aiwz;
            this.h.a(aiwz);
        }
    }

    public final void a(ajbe ajbe) {
        ajbe ajbe2 = ajbe.LOCATOR;
        switch (ajbe.ordinal()) {
            case 0:
                airy airy = this.f;
                aizy f2 = this.a.f();
                airy.c.b = f2.c();
                airy.a(f2, (aibr[]) null, false);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 9:
            case 10:
                this.h.a(ajbe);
                break;
            case 4:
                ahqg ahqg = this.d;
                if (ajbe == ajbe.CACHE_UPDATER) {
                    int i2 = ahqg.j;
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        if (i3 == 0) {
                            if (ahqg.f.b()) {
                                aqek aqek = new aqek(ajck.al);
                                ahqg.e.a(aqek);
                                ahqg.c.a(aqek);
                                ahqg.c();
                                ahqg.b.a(ajbe.CACHE_UPDATER, ahqg.a.c() + 10000, ahqg.i);
                                ahqg.j = 2;
                                break;
                            } else {
                                ahqg.a(true);
                                break;
                            }
                        } else if (i3 != 1) {
                            if (i3 == 2) {
                                ahqg.d();
                                break;
                            }
                        } else {
                            ahqg.a();
                            break;
                        }
                    } else {
                        throw null;
                    }
                }
                break;
            case 7:
                ajcs ajcs = this.l;
                if (ajbe == ajbe.SENSOR_UPLOADER) {
                    ajcs.a = -1;
                    ajcs.a();
                    break;
                }
                break;
        }
        long c2 = this.a.f().c();
        if (c2 - this.n > 10800000) {
            this.b.a(this.a.h());
            ahqu ahqu = this.c;
            if (ahqu != null) {
                ahqu.b();
                ahqu ahqu2 = this.c;
                ahqu2.b();
                try {
                    aibh aibh = ahqu2.c;
                    aqek aqek2 = new aqek(ajck.bT);
                    Iterator c3 = ahqu2.c();
                    while (c3.hasNext()) {
                        ahqt ahqt = (ahqt) c3.next();
                        aqek aqek3 = new aqek(ajck.bU);
                        aqek3.b(1, ahqt.a);
                        short s = ahqt.b;
                        if (s != Short.MAX_VALUE) {
                            aqek3.g(3, s);
                        }
                        aqek2.a(3, (Object) aqek3);
                    }
                    aqek2.b(1, ahqu2.b.d());
                    aibh.a(aqek2);
                } catch (IOException e2) {
                }
            }
            this.k.c();
            this.n = c2;
            ahqq ahqq = this.b;
            long b2 = this.a.f().b();
            ahqz ahqz = ahqq.f;
            long l2 = b2 - ahqq.c.l();
            long j2 = b2 - 604800000;
            ahqy c4 = ahqz.c();
            while (c4.hasNext()) {
                c4.b();
                int g2 = c4.a.g();
                if (ahqz.c[g2] < l2 || ahqz.d[g2] < j2) {
                    ahqz.e.b();
                    c4.remove();
                }
            }
        }
    }

    public final void a(aqek aqek) {
        ahqg ahqg = this.d;
        int i2 = ahqg.j;
        if (i2 == 2) {
            ahqg.b.a(ajbe.CACHE_UPDATER);
            if (aqek == null || !ajqt.a(aqek) || !aqek.i(5)) {
                ahqg.a();
                return;
            }
            ahqg.f.a(aqek.e(5));
            ahqg.a(false);
        } else if (i2 == 3) {
            aiaq aiaq = new aiaq();
            if (ajqt.b(aqek)) {
                amrl.a((Object) aqek);
                int j2 = aqek.j(2);
                for (int i3 = 0; i3 < j2; i3++) {
                    aiaq.a(aqek.f(2, i3));
                }
                ahqg.d.a(aiaq, false, ahqg.a.b());
            }
            ahqg.b(false);
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        this.h.a(activityRecognitionResult);
    }

    public final void a(PrintWriter printWriter) {
        PrintWriter printWriter2 = printWriter;
        airy airy = this.f;
        boolean z = airy.w;
        StringBuilder sb = new StringBuilder(22);
        sb.append("NL: wifiEnabled: ");
        sb.append(z);
        printWriter2.println(sb.toString());
        int i2 = airy.B;
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("NL: software batch bins: ");
        sb2.append(i2);
        printWriter2.println(sb2.toString());
        int i3 = airy.C;
        StringBuilder sb3 = new StringBuilder(36);
        sb3.append("NL: hardware batch bins: ");
        sb3.append(i3);
        printWriter2.println(sb3.toString());
        int i4 = airy.D;
        StringBuilder sb4 = new StringBuilder(36);
        sb4.append("NL: batches delivered  : ");
        sb4.append(i4);
        printWriter2.println(sb4.toString());
        boolean z2 = airy.i;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append("NL: deepIdle : ");
        sb5.append(z2);
        printWriter2.println(sb5.toString());
        boolean z3 = airy.m;
        long j2 = airy.o;
        StringBuilder sb6 = new StringBuilder(44);
        sb6.append("NL: inGls : ");
        sb6.append(z3);
        sb6.append(", time ");
        sb6.append(j2);
        printWriter2.println(sb6.toString());
        aiat aiat = airy.d;
        if (aiat != null) {
            String valueOf = String.valueOf(aiat);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb7.append("NL: locatorParams: ");
            sb7.append(valueOf);
            printWriter2.println(sb7.toString());
        }
        airo airo = airy.e;
        airo.e.a();
        airq airq = airo.f;
        int i5 = aibs.j;
        StringBuilder sb8 = new StringBuilder(39);
        sb8.append("NL: RSSI calibration value: ");
        sb8.append(i5);
        printWriter2.println(sb8.toString());
        arpl arpl = airq.a;
        if (arpl.a()) {
            arsf arsf = arpl.a;
            arqy arqy = arsf.u;
            long b2 = arsf.c.b();
            long c2 = arsf.c.c();
            if (arqy.e) {
                printWriter2.println("----FrewleDebugBuffer-Start----");
                printWriter2.println("Buffer version: 16");
                printWriter2.print("Buffer exists since ");
                printWriter2.println(arqy.a(arqy.a));
                printWriter2.print("Now is ");
                printWriter2.println(arqy.a(b2));
                printWriter2.print("Now millis since boot (");
                printWriter2.print(c2);
                printWriter2.println(")");
                printWriter2.println("----FrewleDebugBuffer-OneShotDebugInfo----");
                List a2 = arqy.b.a();
                int size = a2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrc arrc = (arrc) a2.get(i6);
                    if (b2 - arrc.a() < 3600000) {
                        printWriter2.print(arqy.a(arrc.a()));
                        printWriter2.print(" ");
                        arrc.a(printWriter2);
                    }
                }
                printWriter2.println("----FrewleDebugBuffer-ExternalCacheRequestDebugInfo----");
                List a3 = arqy.c.a();
                int size2 = a3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    arrc arrc2 = (arrc) a3.get(i7);
                    if (b2 - arrc2.a() < 3600000) {
                        printWriter2.print(arqy.a(arrc2.a()));
                        printWriter2.print(" ");
                        arrc2.a(printWriter2);
                    }
                }
                printWriter2.println("----FrewleDebugBuffer-GlsRequestDebugInfo----");
                List a4 = arqy.d.a();
                int size3 = a4.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    arqz arqz = (arqz) a4.get(i8);
                    if (b2 - arqz.a() < 3600000) {
                        printWriter2.print(arqy.a(arqz.a()));
                        printWriter2.print(" ");
                        arqz.a(printWriter2);
                    }
                }
                printWriter2.println("----FrewleDebugBuffer-End----");
            }
            printWriter2.print("frewleDirector {lastDiscardMillis=");
            printWriter2.print(arsf.p);
            printWriter2.print("; lastSavedToDiskMillis=");
            printWriter2.print(arsf.q);
            printWriter2.print("; modelVersion=");
            aqek aqek = arsf.r;
            if (aqek == null) {
                printWriter2.print(-1);
            } else {
                printWriter2.print(aqek.b(1));
            }
            printWriter2.print("; downloadThresMillis=");
            printWriter2.print(arsf.k);
            printWriter2.print("; waitingForGlsResponse=");
            printWriter2.print(arsf.l);
            printWriter2.print("; lastGlsQueryFilledMillis=");
            printWriter2.print(arsf.n);
            printWriter2.print("; lastGlsQueryNotFilledMillis=");
            printWriter2.print(arsf.o);
            printWriter2.println("}");
            arsf.i.a(printWriter2);
        }
        arhu arhu = airo.a.b;
        if (arhu != null) {
            printWriter2.print("CellFingerprintLocalizer{");
            long j3 = arhu.c;
            StringBuilder sb9 = new StringBuilder(35);
            sb9.append("TriggerCount=");
            sb9.append(j3);
            sb9.append("; ");
            printWriter2.print(sb9.toString());
            long j4 = arhu.d;
            StringBuilder sb10 = new StringBuilder(45);
            sb10.append("GeneratedLocationCount=");
            sb10.append(j4);
            sb10.append("; ");
            printWriter2.print(sb10.toString());
            long j5 = arhu.b.b;
            StringBuilder sb11 = new StringBuilder(46);
            sb11.append("LocationFromPrimayCount=");
            sb11.append(j5);
            sb11.append("; ");
            printWriter2.print(sb11.toString());
            long j6 = arhu.b.c;
            StringBuilder sb12 = new StringBuilder(48);
            sb12.append("LocationWithNeighborsCount=");
            sb12.append(j6);
            sb12.append(";");
            printWriter2.print(sb12.toString());
            printWriter2.println("}");
            arhz arhz = arhu.a;
            printWriter2.print("CellFingerprintDirector{");
            arhy arhy = (arhy) arhz;
            long j7 = arhy.g;
            StringBuilder sb13 = new StringBuilder(50);
            sb13.append("LastEntriesDiscardTimeMillis=");
            sb13.append(j7);
            sb13.append(";");
            printWriter2.print(sb13.toString());
            printWriter2.println("}");
            aria aria = arhy.b;
            printWriter2.print("CellFingerprintGlsDownloadManager{");
            long j8 = aria.i;
            StringBuilder sb14 = new StringBuilder(45);
            sb14.append("TotalGlsRequestCounter=");
            sb14.append(j8);
            sb14.append("; ");
            printWriter2.print(sb14.toString());
            long j9 = aria.j;
            StringBuilder sb15 = new StringBuilder(48);
            sb15.append("ApprovedGlsRequestCounter=");
            sb15.append(j9);
            sb15.append("; ");
            printWriter2.print(sb15.toString());
            long j10 = aria.k;
            StringBuilder sb16 = new StringBuilder(45);
            sb16.append("TotalGlsReponseCounter=");
            sb16.append(j10);
            sb16.append("; ");
            printWriter2.print(sb16.toString());
            long j11 = aria.l;
            StringBuilder sb17 = new StringBuilder(51);
            sb17.append("InformativeGlsReponseCounter=");
            sb17.append(j11);
            sb17.append("; ");
            printWriter2.print(sb17.toString());
            long j12 = aria.c;
            StringBuilder sb18 = new StringBuilder(47);
            sb18.append("LastGlsQueryFilledMillis=");
            sb18.append(j12);
            sb18.append("; ");
            printWriter2.print(sb18.toString());
            long j13 = aria.d;
            StringBuilder sb19 = new StringBuilder(54);
            sb19.append("LastInformativeGlsReponseMillis=");
            sb19.append(j13);
            sb19.append("; ");
            printWriter2.print(sb19.toString());
            boolean z4 = aria.b;
            StringBuilder sb20 = new StringBuilder(29);
            sb20.append("WaitingForGlsResponse=");
            sb20.append(z4);
            sb20.append("; ");
            printWriter2.print(sb20.toString());
            int i9 = aria.h;
            StringBuilder sb21 = new StringBuilder(43);
            sb21.append("CurrentDownloadThresholdMillis=");
            sb21.append(i9);
            sb21.append(";");
            printWriter2.print(sb21.toString());
            printWriter2.println("}");
            arib arib = arhy.a;
            printWriter2.print("CellFingerprintTileCacheManager{");
            String str = arib.f;
            StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 19);
            sb22.append("MissingCellIdKey=");
            sb22.append(str);
            sb22.append("; ");
            printWriter2.print(sb22.toString());
            int size4 = arib.b.size();
            StringBuilder sb23 = new StringBuilder(34);
            sb23.append("CellIdKeyInCacheSize=");
            sb23.append(size4);
            sb23.append("; ");
            printWriter2.print(sb23.toString());
            int a5 = arib.a();
            StringBuilder sb24 = new StringBuilder(30);
            sb24.append("CellMapByteCount=");
            sb24.append(a5);
            sb24.append("; ");
            printWriter2.print(sb24.toString());
            printWriter2.print("CellIdKeysInCache=[");
            arsz a6 = arib.b.entrySet().iterator();
            while (a6.hasNext()) {
                a6.f();
                String valueOf2 = String.valueOf(a6.e());
                StringBuilder sb25 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb25.append(valueOf2);
                sb25.append(", ");
                printWriter2.print(sb25.toString());
            }
            printWriter2.println("]}");
        }
        ajcs ajcs = this.l;
        int i10 = ajcs.f;
        int i11 = ajcs.g;
        int i12 = ajcs.h;
        StringBuilder sb26 = new StringBuilder(39);
        sb26.append("SU: ");
        sb26.append(i10);
        sb26.append("/");
        sb26.append(i11);
        sb26.append("/");
        sb26.append(i12);
        printWriter2.println(sb26.toString());
        this.h.a(printWriter2);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ahxu ahxu = (ahxu) obj;
        this.h.e();
        this.l.a();
    }

    public final void a(List list, aipj aipj) {
        airy airy = this.f;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aibo a2 = airy.e.a((aibw) list.get(i2), (aibe) null);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        aipk.a(aipj.a, aipj.b, arrayList, 0);
    }

    public final void a(boolean z) {
        this.m.a(z, this.a.f().c());
        this.j.a(z);
        this.h.d(z);
        this.f.J.f = z;
    }

    public final void a(boolean z, boolean z2) {
        aise aise;
        airy airy = this.f;
        airy.a(this.a.f(), airy.v, z);
        this.h.c(z);
        ajcs ajcs = this.l;
        ajcs.b = z2;
        ajcs.a();
        aisk aisk = this.q;
        if (!z && (aise = aisk.b) != null) {
            aise.a();
            aisk.b = null;
        }
    }

    public final void a(boolean z, boolean z2, int i2) {
        boolean z3;
        this.e.a(z2);
        ajcs ajcs = this.l;
        ajcs.c = z;
        ajcs.d = ajcs.e.f().c();
        ajcs.a();
        airr airr = this.f.J;
        if ((airr.d && z) || (((z3 = airr.e) && z2) || (z3 && z && airr.g != i2))) {
            airr.a();
        }
        airr.e = z;
        airr.d = z2;
        if (z) {
            airr.g = i2;
        }
        airr.toString();
        airv airv = this.o;
        airv.d = z;
        airv.c = z2;
    }

    public final void a(long[] jArr, long[] jArr2, aipp aipp) {
        long[] jArr3 = jArr;
        long[] jArr4 = jArr2;
        aipp aipp2 = aipp;
        HashMap hashMap = new HashMap(jArr3.length);
        int length = jArr4.length;
        HashMap hashMap2 = new HashMap(length);
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = arrayList;
        boolean a2 = a(jArr, hashMap, jArr2, hashMap2, arrayList, this.a.f().b(), this.a.f().c());
        int i2 = 0;
        if (a2 || !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            StringBuilder sb = new StringBuilder(100);
            sb.append(" Gls query might bring more wifi models, consulting GLS : ");
            sb.append(a2);
            sb.append(" and cell request size is ");
            sb.append(size);
            sb.toString();
            aiaq aiaq = new aiaq();
            long c2 = this.a.f().c();
            int size2 = arrayList2.size();
            while (true) {
                aiaj aiaj = null;
                if (i2 >= size2) {
                    break;
                }
                ArrayList arrayList3 = arrayList2;
                try {
                    aiaj = aiak.a(c2, ((Long) arrayList3.get(i2)).longValue());
                } catch (IllegalArgumentException e2) {
                }
                if (aiaj != null) {
                    aiaq.a(aiaj.a(c2), 1);
                }
                i2++;
                arrayList2 = arrayList3;
            }
            this.o.a(aiaq, (aizx) null, new ajcn(this, jArr3, jArr4, aipp2));
            i2 = 1;
        } else {
            int size3 = hashMap.size();
            int size4 = hashMap2.size();
            StringBuilder sb2 = new StringBuilder(98);
            sb2.append("Able to satisfy cache request without GLS, wifi entry count is ");
            sb2.append(size3);
            sb2.append(" and cell is ");
            sb2.append(size4);
            sb2.toString();
            aipp2.a(true, hashMap, hashMap2);
        }
        ahqj ahqj = this.p;
        ahqj.a(27);
        if (i2 != 0) {
            ahqj.a(28);
        }
    }

    public final void a(aibt[] aibtArr, boolean z) {
        int length;
        aibt[] aibtArr2;
        int i2;
        int length2;
        aibt aibt;
        aibt[] aibtArr3 = aibtArr;
        int i3 = 0;
        while (true) {
            length = aibtArr3.length;
            if (i3 >= length) {
                break;
            }
            aibt aibt2 = aibtArr3[i3];
            int b2 = aibt2.b();
            long j2 = aibt2.a;
            for (int i4 = 0; i4 < b2; i4++) {
                long d2 = aibt2.d(i4);
                if (Math.abs(j2 - aibt2.d(i4)) >= 60000) {
                    StringBuilder sb = new StringBuilder(127);
                    sb.append("Stale scan: scanTimestamp is ");
                    sb.append(j2);
                    sb.append(" and device timestamp is ");
                    sb.append(d2);
                    sb.append(" and diff is ");
                    sb.append(j2 - d2);
                    sb.toString();
                }
            }
            i3++;
        }
        if (length > 0) {
            this.h.a(aibtArr3[0]);
            i2 = 0;
            aibtArr2 = null;
        } else {
            i2 = 0;
            aibtArr2 = null;
        }
        while (i2 < aibtArr3.length) {
            aibt aibt3 = aibtArr3[i2];
            if (aibt3 != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= aibt3.b()) {
                        aibt = aibt3;
                        break;
                    }
                    aibs c2 = aibt3.c(i5);
                    if (c2 == null || !agxx.a(c2.e, c2.f)) {
                        i5++;
                    } else {
                        ArrayList arrayList = new ArrayList(aibt3.b());
                        for (int i6 = 0; i6 < aibt3.b(); i6++) {
                            aibs c3 = aibt3.c(i6);
                            if (c3 != null && !agxx.a(c3.e, c3.f)) {
                                arrayList.add(c3);
                            }
                        }
                        aibt = new aibt(aibt3.a, arrayList, aibt3.c, false);
                    }
                }
            } else {
                aibt = null;
            }
            if (aibt != aibt3) {
                if (aibtArr2 == null) {
                    aibtArr2 = new aibt[aibtArr3.length];
                    for (int i7 = 0; i7 < aibtArr3.length; i7++) {
                        aibtArr2[i7] = aibtArr3[i7];
                    }
                }
                if (aibt != null) {
                    aibtArr2[i2] = aibt;
                }
            }
            i2++;
        }
        if (aibtArr2 != null) {
            aibtArr3 = aibtArr2;
        }
        if (aibtArr3 != null) {
            int length3 = aibtArr3.length;
            aibr[] aibrArr = new aibr[length3];
            for (int i8 = 0; i8 < aibtArr3.length; i8++) {
                aibt aibt4 = aibtArr3[i8];
                int b3 = aibt4.b();
                aibq aibq = new aibq(aibt4.a, b3);
                int i9 = 0;
                while (i9 < b3) {
                    aibq.a(aibt4.a(i9), aibt4.b(i9), aibt4.c(i9).h, aibt4.d(i9));
                    i9++;
                    aibq = aibq;
                }
                aibrArr[i8] = aibq.a(aibt4.c, aibt4.e);
            }
            for (int i10 = 0; i10 < length3; i10++) {
                this.a.i().a(aibrArr[i10]);
            }
            airy airy = this.f;
            aizy f2 = this.a.f();
            long c4 = f2.c();
            if (airy.b() || length3 != 1 || !aibrArr[0].b) {
                airy.h = c4;
                airy.a(f2, aibrArr, false);
            }
            if (aydu.c() && (length2 = aibtArr3.length) > 0) {
                int i11 = length2 - 1;
                if (aibtArr3[i11].f()) {
                    aisk aisk = this.q;
                    aibt aibt5 = aibtArr3[i11];
                    ArrayList arrayList2 = aibt5.b;
                    int size = arrayList2.size();
                    int i12 = 0;
                    for (int i13 = 0; i13 < size; i13++) {
                        aibs aibs = (aibs) arrayList2.get(i13);
                        if (aibs.a()) {
                            boolean z2 = ((aibp) aibs).b;
                            i12++;
                        }
                    }
                    aibp[] aibpArr = new aibp[i12];
                    if (i12 > 0) {
                        ArrayList arrayList3 = aibt5.b;
                        int size2 = arrayList3.size();
                        int i14 = i12;
                        for (int i15 = 0; i15 < size2; i15++) {
                            aibs aibs2 = (aibs) arrayList3.get(i15);
                            if (aibs2.a()) {
                                aibp aibp = (aibp) aibs2;
                                boolean z3 = aibp.b;
                                i14--;
                                aibpArr[i14] = aibp;
                            }
                        }
                    }
                    if (i12 == 0) {
                        aise aise = aisk.b;
                        if (aise != null) {
                            aise.a();
                            aisk.b = null;
                        }
                    } else if (aisk.c != null && aydu.c() && aisk.b == null) {
                        long j3 = aisk.c.b;
                        if (j3 < 5000) {
                            StringBuilder sb2 = new StringBuilder(104);
                            sb2.append("setScan(): Starting new RttNetworkLocator, scan length is ");
                            sb2.append(i12);
                            sb2.append(" and period is ");
                            sb2.append(j3);
                            sb2.toString();
                            aisk.b = new aise(aibpArr, aisk.e, new aisj(aisk), new aisg(aisk), new aish(aisk));
                            aisk.b.a((int) aisk.c.b);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long[] r23, java.util.Map r24, long[] r25, java.util.Map r26, java.util.ArrayList r27, long r28, long r30) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r25
            airy r4 = r1.f
            airo r4 = r4.e
            ahyt r5 = r4.e
            r5.a()
            airq r4 = r4.f
            arpl r4 = r4.a
            arsf r5 = r4.a
            arqy r5 = r5.u
            arrc r5 = r5.a()
            arsf r6 = r4.a
            aizy r6 = r6.c
            long r6 = r6.b()
            r5.a((long) r6)
            int r6 = r0.length
            r5.a((int) r6)
            arsy r6 = r4.i
            r6.a((long[]) r0)
            r4.i = r6
            arsf r6 = r4.a
            arsy r7 = r4.i
            java.util.Set r17 = r6.a(r7, r5)
            java.util.Iterator r18 = r17.iterator()
        L_0x003f:
            boolean r6 = r18.hasNext()
            if (r6 == 0) goto L_0x0063
            java.lang.Object r6 = r18.next()
            arpu r6 = (defpackage.arpu) r6
            long r7 = r6.a
            float r9 = r6.f
            int r9 = (int) r9
            r10 = 12
            long r11 = r6.b
            float r13 = r6.e
            int r14 = r6.g
            float r15 = r6.h
            arqq r6 = r6.l
            r16 = r6
            r6 = r5
            r6.a(r7, r9, r10, r11, r13, r14, r15, r16)
            goto L_0x003f
        L_0x0063:
            int r6 = r0.length
            r8 = 0
        L_0x0065:
            if (r8 >= r6) goto L_0x0103
            r9 = r0[r8]
            arsf r11 = r4.a
            long r11 = r11.a((long) r9)
            java.util.Iterator r13 = r17.iterator()
        L_0x0073:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00e6
            java.lang.Object r14 = r13.next()
            arpu r14 = (defpackage.arpu) r14
            arsf r15 = r4.a
            r18 = r8
            long r7 = r14.a
            long r7 = r15.a((long) r7)
            int r15 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x00df
            aibe r7 = new aibe
            double r11 = r14.j
            int r8 = defpackage.aell.a((double) r11)
            double r11 = r14.k
            int r11 = defpackage.aell.a((double) r11)
            float r12 = r14.c
            r13 = 1119748096(0x42be0000, float:95.0)
            float r12 = r12 + r13
            double r12 = (double) r12
            r19 = 0
            r15 = 1000(0x3e8, float:1.401E-42)
            int r21 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x00d3
            float r14 = r14.d
            r19 = 0
            int r19 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r19 <= 0) goto L_0x00d3
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            r15 = 1101004800(0x41a00000, float:20.0)
            float r14 = r14 * r15
            double r14 = (double) r14
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r14)
            double r12 = r12 / r14
            double r0 = java.lang.Math.pow(r0, r12)
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r12
            int r0 = (int) r0
            r1 = 500000(0x7a120, float:7.00649E-40)
            int r15 = java.lang.Math.min(r0, r1)
            goto L_0x00d4
        L_0x00d3:
        L_0x00d4:
            r7.<init>(r8, r11, r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r2.put(r0, r7)
            goto L_0x00fb
        L_0x00df:
            r1 = r22
            r0 = r23
            r8 = r18
            goto L_0x0073
        L_0x00e6:
            r18 = r8
            arsf r0 = r4.a
            arsn r0 = r0.i
            boolean r0 = r0.b((long) r11)
            if (r0 == 0) goto L_0x00fb
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            aibe r1 = defpackage.arpl.h
            r2.put(r0, r1)
        L_0x00fb:
            int r8 = r18 + 1
            r1 = r22
            r0 = r23
            goto L_0x0065
        L_0x0103:
            arsf r0 = r4.a
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x010d
            r0 = 1
            goto L_0x010e
        L_0x010d:
            r0 = 7
        L_0x010e:
            arsf r2 = r4.a
            aizy r2 = r2.c
            long r6 = r2.b()
            r5.a(r0, r6)
            int r2 = r3.length
            r7 = 0
        L_0x011b:
            if (r7 >= r2) goto L_0x01af
            r4 = r3[r7]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r5 = r4.longValue()     // Catch:{ IllegalArgumentException -> 0x0130 }
            r8 = r30
            aiaj r0 = defpackage.aiak.a(r8, r5)     // Catch:{ IllegalArgumentException -> 0x012e }
            goto L_0x0134
        L_0x012e:
            r0 = move-exception
            goto L_0x0133
        L_0x0130:
            r0 = move-exception
            r8 = r30
        L_0x0133:
            r0 = 0
        L_0x0134:
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = r0.a()
            r5 = r22
            ahqq r6 = r5.b
            ahqz r6 = r6.f
            r10 = r28
            aibe r6 = r6.a(r0, r10)
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r13 = java.lang.String.valueOf(r6)
            java.lang.String r14 = java.lang.String.valueOf(r12)
            int r14 = r14.length()
            java.lang.String r15 = java.lang.String.valueOf(r0)
            int r15 = r15.length()
            java.lang.String r16 = java.lang.String.valueOf(r13)
            int r16 = r16.length()
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r14 = r14 + 60
            int r14 = r14 + r15
            int r14 = r14 + r16
            r2.<init>(r14)
            java.lang.String r14 = "Incoming MobileCommKey "
            r2.append(r14)
            r2.append(r12)
            java.lang.String r12 = " translates to "
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " with cached position "
            r2.append(r0)
            r2.append(r13)
            r2.toString()
            if (r6 != 0) goto L_0x0197
            r2 = r27
            r2.add(r4)
            r12 = r26
            goto L_0x01a9
        L_0x0197:
            r2 = r27
            r12 = r26
            r12.put(r4, r6)
            goto L_0x01a9
        L_0x019f:
            r5 = r22
            r12 = r26
            r10 = r28
            r17 = r2
            r2 = r27
        L_0x01a9:
            int r7 = r7 + 1
            r2 = r17
            goto L_0x011b
        L_0x01af:
            r5 = r22
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajcp.a(long[], java.util.Map, long[], java.util.Map, java.util.ArrayList, long, long):boolean");
    }
}
