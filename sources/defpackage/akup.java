package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.chimera.FragmentTransaction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: akup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akup implements akin, akyl {
    static final long a = TimeUnit.MINUTES.toMillis(2);
    public final akun b;
    public final akyn c;
    public final akio d;
    public final Set e;
    public boolean f = azbz.b();
    private final Context g;
    private int h = -1;
    private aklr i = null;
    private long j = -1;
    private aklk k = null;
    private long l = -1;
    private qwq m;

    public akup(Context context, akyn akyn, akio akio, akun akun) {
        this.g = context;
        this.c = akyn;
        this.d = akio;
        ((akjy) akio).f = this;
        this.b = akun;
        this.e = new HashSet();
    }

    private final void b() {
        qwq qwq = this.m;
        if (qwq != null) {
            qwq.a("Places.PlacesTaskChimeraService.PREFETCHING_TASK_TAG", "com.google.android.location.places.PlacesTaskService");
            this.m = null;
        }
    }

    /* JADX WARNING: type inference failed for: r7v26, types: [akjz, akio] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r20 = this;
            r0 = r20
            java.util.Set r1 = r0.e
            boolean r1 = r1.isEmpty()
            r2 = -1
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x001b
            akio r1 = r0.d
            r1.a()
            r0.h = r2
            r20.b()
            goto L_0x0342
        L_0x001b:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r7 = r0.e
            java.util.Iterator r7 = r7.iterator()
            r8 = -1
        L_0x0027:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0050
            java.lang.Object r9 = r7.next()
            allh r9 = (defpackage.allh) r9
            java.lang.String r10 = r9.c
            if (r10 != 0) goto L_0x0038
            goto L_0x0041
        L_0x0038:
            boolean r11 = defpackage.azbz.b()
            if (r11 == 0) goto L_0x0041
            r1.add(r10)
        L_0x0041:
            int r9 = r9.d
            if (r9 != r6) goto L_0x0047
        L_0x0045:
            r8 = 1
            goto L_0x0027
        L_0x0047:
            if (r9 != r5) goto L_0x004a
            goto L_0x0045
        L_0x004a:
            if (r9 != 0) goto L_0x0027
            if (r8 == r6) goto L_0x0027
            r8 = 0
            goto L_0x0027
        L_0x0050:
            azco r7 = defpackage.azco.a
            azcp r7 = r7.a()
            boolean r7 = r7.e()
            if (r7 == 0) goto L_0x00a7
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x00a4
            qwq r7 = r0.m
            if (r7 == 0) goto L_0x0067
            goto L_0x00a7
        L_0x0067:
            qxf r7 = new qxf
            r7.<init>()
            azco r9 = defpackage.azco.a
            azcp r9 = r9.a()
            long r9 = r9.c()
            azco r11 = defpackage.azco.a
            azcp r11 = r11.a()
            long r11 = r11.b()
            r7.a(r9, r11)
            java.lang.String r9 = "com.google.android.location.places.PlacesTaskService"
            r7.i = r9
            r7.a((int) r6)
            java.lang.String r9 = "Places.PlacesTaskChimeraService.PREFETCHING_TASK_TAG"
            r7.k = r9
            r7.a(r6, r6)
            r7.b((int) r6)
            android.content.Context r9 = r0.g
            qwq r9 = defpackage.qwq.a((android.content.Context) r9)
            r0.m = r9
            qxg r7 = r7.b()
            r9.a((defpackage.qxx) r7)
            goto L_0x00a7
        L_0x00a4:
            r20.b()
        L_0x00a7:
            akio r7 = r0.d
            defpackage.aklz.a()
            int r9 = r1.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 53
            r10.<init>(r11)
            java.lang.String r11 = "Start with mode: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = " and "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = " accounts"
            r10.append(r9)
            r10.toString()
            r9 = r7
            akjy r9 = (defpackage.akjy) r9
            r9.i = r8
            boolean r10 = r9.d
            if (r10 != 0) goto L_0x020e
            akma r10 = r9.b
            int r11 = defpackage.akjy.a((int) r8)
            r10.a((int) r5, (int) r5, (int) r11)
            r9.d = r6
            akum r10 = r9.o
            aklf r11 = r10.f
            if (r11 != 0) goto L_0x017c
            akuu r11 = new akuu
            java.io.File r12 = new java.io.File
            android.content.Context r13 = r10.a
            java.io.File r13 = r13.getFilesDir()
            java.lang.String r14 = "place_cache_keyfile"
            r12.<init>(r13, r14)
            r11.<init>(r12)
            javax.crypto.spec.SecretKeySpec r12 = new javax.crypto.spec.SecretKeySpec
            byte[] r11 = r11.a
            int r13 = r11.length
            byte[] r11 = java.util.Arrays.copyOf(r11, r13)
            java.lang.String r13 = "AES"
            r12.<init>(r11, r13)
            akkn r11 = new akkn
            r11.<init>(r12)
            java.io.File r12 = new java.io.File
            android.content.Context r13 = r10.a
            java.io.File r13 = r13.getCacheDir()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = java.io.File.separator
            java.lang.String r15 = java.lang.String.valueOf(r13)
            int r15 = r15.length()
            java.lang.String r16 = java.lang.String.valueOf(r14)
            int r16 = r16.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r15 = r15 + 26
            int r15 = r15 + r16
            r2.<init>(r15)
            r2.append(r13)
            r2.append(r14)
            java.lang.String r13 = "place_inference_data_index"
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r12.<init>(r2)
            boolean r2 = r12.exists()
            if (r2 == 0) goto L_0x015a
            boolean r2 = r12.isDirectory()
            if (r2 == 0) goto L_0x015a
            java.io.File r2 = r10.a()
            r12.renameTo(r2)
        L_0x015a:
            aklb r2 = new aklb
            java.io.File r15 = r10.a()
            akjc r12 = r10.b
            akuj r12 = (defpackage.akuj) r12
            akuv r13 = r12.a
            java.util.concurrent.ExecutorService r13 = r10.c
            java.util.concurrent.Executor r12 = r12.b
            akuo r14 = r10.g
            akma r14 = r10.d
            r19 = r14
            r14 = r2
            r16 = r11
            r17 = r13
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19)
            r10.f = r2
        L_0x017c:
            aklf r2 = r10.f
            akjc r11 = r10.b
            akuj r11 = (defpackage.akuj) r11
            akuv r12 = r11.a
            aknk r12 = new aknk
            akim r13 = r11.g
            akun r11 = r11.d
            r12.<init>(r13, r11)
            akke r11 = new akke
            akma r13 = r10.d
            akuo r14 = r10.g
            r11.<init>(r12, r2, r13, r14)
            akka r2 = new akka
            akjc r10 = r10.b
            akuj r10 = (defpackage.akuj) r10
            akuo r10 = r10.h
            r2.<init>(r11, r10)
            r9.p = r2
            akka r2 = r9.p
            aklo r10 = r9.j
            r2.a = r7
            akke r7 = r2.b
            long[] r11 = r7.g
            long r12 = defpackage.akuo.b()
            long r12 = -r12
            java.util.Arrays.fill(r11, r12)
            r7.j = r2
            aklf r2 = r7.b
            aklb r2 = (defpackage.aklb) r2
            r2.i = r10
            java.util.concurrent.Executor r11 = r2.g
            akks r12 = new akks
            r12.<init>(r2)
            r11.execute(r12)
            r7.h = r10
            aknk r2 = r7.a
            r2.c = r7
            r2.b = r10
            akjc r2 = r9.a
            akmf r2 = r2.a()
            r2.a()
            akol r2 = new akol
            akjc r7 = r9.a
            akuj r7 = (defpackage.akuj) r7
            akuo r7 = r7.h
            r2.<init>(r7)
            r9.h = r2
            akjf r2 = r9.m
            akol r12 = r9.h
            akjj r7 = new akjj
            akjc r11 = r2.a
            akji r13 = new akji
            r13.<init>()
            r2 = r11
            akuj r2 = (defpackage.akuj) r2
            akuv r10 = r2.a
            r14 = 0
            akmq r2 = r2.e
            java.util.List r15 = defpackage.akjj.a((defpackage.akmq) r2)
            r16 = 0
            r10 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r9.e = r7
            akje r2 = r9.e
            akjx r7 = r9.n
            r2.a((defpackage.akjx) r7)
        L_0x020e:
            akje r2 = r9.e
            int r7 = r9.i
            r2.a((int) r7)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Map r7 = r9.c
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0224:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x023a
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r1.contains(r10)
            if (r11 != 0) goto L_0x0224
            r2.add(r10)
            goto L_0x0224
        L_0x023a:
            java.util.Iterator r2 = r2.iterator()
        L_0x023e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0256
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r10 = r9.c
            java.lang.Object r7 = r10.remove(r7)
            akje r7 = (defpackage.akje) r7
            r7.b()
            goto L_0x023e
        L_0x0256:
            java.util.Iterator r2 = r1.iterator()
        L_0x025a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0301
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r10 = r9.c
            java.lang.Object r10 = r10.get(r7)
            akje r10 = (defpackage.akje) r10
            if (r10 == 0) goto L_0x0272
            goto L_0x02f8
        L_0x0272:
            akum r10 = r9.o
            aklc r11 = new aklc
            r11.<init>()
            akjd r12 = new akjd
            akjc r13 = r10.b
            akuj r13 = (defpackage.akuj) r13
            akun r13 = r13.d
            azbq r14 = defpackage.azbq.a
            azbr r14 = r14.a()
            boolean r14 = r14.e()
            if (r14 != 0) goto L_0x0297
            aknq r14 = new aknq
            android.content.Context r15 = r10.a
            android.os.Handler r5 = r10.e
            r14.<init>(r15, r5, r7, r13)
            goto L_0x02af
        L_0x0297:
            android.content.Context r5 = r10.a
            android.os.Handler r14 = r10.e
            akuo r15 = r10.g
            afif r5 = defpackage.afhy.a(r5, r14, r14)
            aknr r15 = new aknr
            r14.getClass()
            akul r6 = new akul
            r6.<init>(r14)
            r15.<init>(r5, r6, r7, r13)
            r14 = r15
        L_0x02af:
            akkj r5 = new akkj
            aklf r6 = r10.f
            akuo r13 = r10.g
            r5.<init>(r6, r14, r13, r11)
            akok r6 = new akok
            aklf r10 = r10.f
            r6.<init>(r10, r11)
            r12.<init>(r5, r6)
            akjf r5 = r9.m
            akol r6 = r9.h
            akkg r13 = r12.a
            akka r10 = r9.p
            akok r11 = r12.b
            akjj r15 = new akjj
            akjc r5 = r5.a
            r12 = r5
            akuj r12 = (defpackage.akuj) r12
            akuv r14 = r12.a
            akmq r12 = r12.e
            java.util.List r16 = defpackage.akjj.a((defpackage.akmq) r12)
            akoi r14 = new akoi
            r14.<init>(r10, r11)
            r10 = r15
            r11 = r5
            r12 = r6
            r5 = r14
            r14 = r7
            r6 = r15
            r15 = r16
            r16 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16)
            akjx r5 = r9.n
            r6.a((defpackage.akjx) r5)
            java.util.Map r5 = r9.c
            r5.put(r7, r6)
            r10 = r6
        L_0x02f8:
            int r5 = r9.i
            r10.a((int) r5)
            r5 = 2
            r6 = 1
            goto L_0x025a
        L_0x0301:
            aklo r2 = r9.j
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = r1.size()
            int r7 = r9.i
        L_0x030d:
            java.util.Queue r9 = r2.n
            int r9 = r9.size()
            r10 = 10
            if (r9 < r10) goto L_0x031d
            java.util.Queue r9 = r2.n
            r9.remove()
            goto L_0x030d
        L_0x031d:
            java.util.Queue r2 = r2.n
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r10[r4] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 1
            r10[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r5 = 2
            r10[r5] = r1
            java.lang.String r1 = "Centralized place inference engine was started at: %d with %d active accounts and in mode: %d"
            java.lang.String r1 = java.lang.String.format(r9, r1, r10)
            r2.add(r1)
            r0.h = r8
        L_0x0342:
            akun r1 = r0.b
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r5 = r0.e
            java.util.Iterator r5 = r5.iterator()
        L_0x034f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x03cd
            java.lang.Object r6 = r5.next()
            allh r6 = (defpackage.allh) r6
            java.lang.String r6 = r6.b
            int r7 = r6.hashCode()
            r8 = 5
            r9 = 4
            switch(r7) {
                case -1958346218: goto L_0x0399;
                case 40719148: goto L_0x038f;
                case 325967270: goto L_0x0385;
                case 348375004: goto L_0x037b;
                case 1246496707: goto L_0x0371;
                case 1940970770: goto L_0x0367;
                default: goto L_0x0366;
            }
        L_0x0366:
            goto L_0x03a3
        L_0x0367:
            java.lang.String r7 = "com.google.android.apps.gmm"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x03a3
            r7 = 4
            goto L_0x03a4
        L_0x0371:
            java.lang.String r7 = "com.google.android.settings.intelligence"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x03a3
            r7 = 5
            goto L_0x03a4
        L_0x037b:
            java.lang.String r7 = "com.google.android.apps.walletnfcrel"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x03a3
            r7 = 3
            goto L_0x03a4
        L_0x0385:
            java.lang.String r7 = "com.google.android.gms"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x03a3
            r7 = 0
            goto L_0x03a4
        L_0x038f:
            java.lang.String r7 = "com.google.android.apps.maps"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x03a3
            r7 = 1
            goto L_0x03a4
        L_0x0399:
            java.lang.String r7 = "com.google.android.googlequicksearchbox"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x03a3
            r7 = 2
            goto L_0x03a4
        L_0x03a3:
            r7 = -1
        L_0x03a4:
            if (r7 == 0) goto L_0x03c2
            r10 = 1
            if (r7 == r10) goto L_0x03bf
            r11 = 2
            if (r7 == r11) goto L_0x03bd
            if (r7 == r3) goto L_0x03bb
            if (r7 == r9) goto L_0x03b9
            if (r7 == r8) goto L_0x03b7
            int r6 = r6.hashCode()
            goto L_0x03c5
        L_0x03b7:
            r6 = 6
            goto L_0x03c5
        L_0x03b9:
            r6 = 5
            goto L_0x03c5
        L_0x03bb:
            r6 = 4
            goto L_0x03c5
        L_0x03bd:
            r6 = 3
            goto L_0x03c5
        L_0x03bf:
            r11 = 2
            r6 = 2
            goto L_0x03c5
        L_0x03c2:
            r10 = 1
            r11 = 2
            r6 = 1
        L_0x03c5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.add(r6)
            goto L_0x034f
        L_0x03cd:
            int r3 = r2.size()
            int[] r3 = new int[r3]
            java.util.Iterator r2 = r2.iterator()
        L_0x03d7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03ed
            int r5 = r4 + 1
            java.lang.Object r6 = r2.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3[r4] = r6
            r4 = r5
            goto L_0x03d7
        L_0x03ed:
            r1.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akup.a():void");
    }

    public final void a(rdu rdu) {
    }

    public final void a(akip akip) {
        if (akip.f != null) {
            for (allh allh : this.e) {
                String str = allh.c;
                if (str != null && str.equals(akip.f)) {
                    allh.a(akip);
                }
            }
        } else if (azbz.b()) {
            for (allh allh2 : this.e) {
                if (allh2.c == null) {
                    allh2.a(akip);
                }
            }
        } else {
            for (allh a2 : this.e) {
                a2.a(akip);
            }
        }
    }

    public final void a(aklk aklk) {
        int i2 = this.h;
        if (i2 != -1 && i2 != 0 && !azcu.c()) {
            List list = aklk.a;
            akun akun = this.b;
            int size = list.size();
            aucd o = aoaz.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoaz aoaz = (aoaz) o.b;
            aoaz.a |= 1;
            aoaz.b = size;
            aoaz aoaz2 = (aoaz) o.i();
            aocf a2 = akun.a();
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aocf aocf = (aocf) aucd.b;
            aocf aocf2 = aocf.s;
            aocf.c = 7;
            aocf.a |= 2;
            aucd o2 = aobd.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aobd aobd = (aobd) o2.b;
            aobd.b = 2;
            int i3 = aobd.a | 1;
            aobd.a = i3;
            if (aoaz2 != null) {
                aoaz2.getClass();
                aobd.d = aoaz2;
                aobd.a = i3 | 4;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aocf aocf3 = (aocf) aucd.b;
            aobd aobd2 = (aobd) o2.i();
            aobd2.getClass();
            aocf3.n = aobd2;
            aocf3.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            akun.a((aocf) aucd.i());
            this.k = aklk;
            this.l = SystemClock.elapsedRealtime();
        }
    }

    public final void a(Location location, akoh akoh, boolean z, aklh aklh) {
        float f2;
        String str;
        float f3;
        aklk aklk;
        aklk aklk2;
        boolean z2;
        long j2;
        float f4;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        akor akor;
        akjy akjy;
        akkl akkl;
        akjy akjy2;
        int i6;
        int i7 = this.h;
        if (i7 != -1 && i7 != 0 && !azcu.c()) {
            int i8 = Build.VERSION.SDK_INT;
            boolean isFromMockProvider = location.isFromMockProvider();
            long time = location.getTime();
            int latitude = (int) (location.getLatitude() * 1.0E7d);
            int longitude = (int) (location.getLongitude() * 1.0E7d);
            double accuracy = (double) location.getAccuracy();
            Double.isNaN(accuracy);
            int i9 = (int) (accuracy * 1000.0d);
            if (location.hasAltitude()) {
                f2 = (float) location.getAltitude();
            } else {
                f2 = Float.NaN;
            }
            Bundle extras = location.getExtras();
            if (extras == null) {
                str = "unknown";
            } else {
                int i10 = extras.getInt("locationType", 0);
                str = i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "wifi" : "cell" : "gps";
            }
            if (location.hasSpeed()) {
                f3 = location.getSpeed();
            } else {
                f3 = -1.0f;
            }
            aklr aklr = new aklr(latitude, longitude, i9, f2, str, time, f3);
            if (this.k == null || this.l + a <= SystemClock.elapsedRealtime()) {
                this.k = null;
                this.l = -1;
                aklk = null;
            } else {
                aklk = this.k;
            }
            float accuracy2 = location.getAccuracy();
            float speed = location.getSpeed();
            long time2 = location.getTime();
            aklr aklr2 = this.i;
            if (aklr2 != null) {
                aklk2 = aklk;
                z2 = isFromMockProvider;
                f4 = (float) aell.a(aklr2.a, aklr2.b, (int) (location.getLatitude() * 1.0E7d), (int) (location.getLongitude() * 1.0E7d));
                j2 = time2 - this.j;
            } else {
                aklk2 = aklk;
                z2 = isFromMockProvider;
                f4 = -1.0f;
                j2 = -1;
            }
            if (akoh != null) {
                i2 = akoh.a();
            } else {
                i2 = -1;
            }
            akun akun = this.b;
            aucd o = aobi.g.o();
            int i11 = (int) (accuracy2 * 10.0f);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aobi aobi = (aobi) o.b;
            int i12 = aobi.a | 1;
            aobi.a = i12;
            aobi.b = i11;
            if (f4 != -1.0f) {
                i3 = (int) (f4 * 10.0f);
            } else {
                i3 = -1;
            }
            int i13 = i12 | 2;
            aobi.a = i13;
            aobi.c = i3;
            int i14 = i13 | 4;
            aobi.a = i14;
            aobi.d = (int) j2;
            int i15 = i14 | 8;
            aobi.a = i15;
            aobi.e = (int) (speed * 10.0f);
            aobi.a = i15 | 16;
            aobi.f = i2;
            aobi aobi2 = (aobi) o.i();
            aocf a2 = akun.a();
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aocf aocf = (aocf) aucd.b;
            aocf aocf2 = aocf.s;
            aocf.c = 7;
            aocf.a |= 2;
            aucd o2 = aobd.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aobd aobd = (aobd) o2.b;
            aobd.b = 1;
            int i16 = aobd.a | 1;
            aobd.a = i16;
            if (aobi2 != null) {
                aobi2.getClass();
                aobd.c = aobi2;
                aobd.a = i16 | 2;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aocf aocf3 = (aocf) aucd.b;
            aobd aobd2 = (aobd) o2.i();
            aobd2.getClass();
            aocf3.n = aobd2;
            aocf3.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            akun.a((aocf) aucd.i());
            this.i = aklr;
            this.j = time;
            akln akln = new akln(aklr, akoh, aklk2, aklh, z, z2);
            akjy akjy3 = (akjy) this.d;
            if (akjy3.d) {
                int i17 = akjy3.i;
                if (i17 == -1 || i17 == 0) {
                    aklz.a();
                    return;
                }
                akoh akoh2 = akln.b;
                if (akoh2 != null) {
                    i4 = akoh2.a();
                } else {
                    i4 = 0;
                }
                if (akln.c != null) {
                    aklz.a();
                    Locale locale = Locale.US;
                    i5 = 3;
                    Object[] objArr = {"location", Integer.valueOf(i4), Integer.valueOf(akln.c.a.size())};
                } else {
                    i5 = 3;
                    aklz.a();
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {"location", Integer.valueOf(i4)};
                }
                akor b2 = akjy3.k.b(akln);
                aklz.a();
                int i18 = b2.a;
                String valueOf = String.valueOf(b2.b.a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                sb.append("SegmenterResult{action=");
                sb.append(i18);
                sb.append(",currentSegmentType=");
                sb.append(valueOf);
                sb.append("}");
                sb.toString();
                akjy3.g = b2.b;
                if (b2.b.a == aocj.IN_TRANSIT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                akkl akkl2 = new akkl(i5, z3);
                aklz.a();
                boolean z4 = akkl2.b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Transit decision inTransit=");
                sb2.append(z4);
                sb2.toString();
                akuo akuo = ((akuj) akjy3.a).h;
                if (azcf.a.a().J()) {
                    boolean z5 = akjy3.l.b(akln).b.a == aocj.IN_TRANSIT;
                    aklz.a();
                    Object[] objArr3 = {Boolean.valueOf(akkl2.b), Boolean.valueOf(z5)};
                    akkl2 = new akkl(4, z5);
                }
                akuo akuo2 = ((akuj) akjy3.a).h;
                if (!azbb.a.a().b()) {
                    akjy = akjy3;
                    akor = b2;
                    akkl = akkl2;
                } else if (b2.b.a == aocj.AT_PLACE) {
                    akli akli = b2.b.d;
                    aklr aklr3 = akli.b;
                    if (aklr3 != null) {
                        aklt aklt = akli.a;
                        if (aklt.d != null) {
                            akjy = akjy3;
                            akor = b2;
                            akkl = akkl2;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i19 = 0;
                            while (true) {
                                ou ouVar = aklt.a;
                                if (i19 >= ouVar.h) {
                                    break;
                                }
                                akog akog = (akog) ouVar.b(i19);
                                akog akog2 = r14;
                                akog akog3 = new akog(akog.b, (int) ((Float) aklt.a.c(i19)).floatValue(), akog.c, akog.e, akog.a);
                                arrayList.add(akog2);
                                i19++;
                                akjy3 = akjy3;
                                b2 = b2;
                                akkl2 = akkl2;
                            }
                            akjy = akjy3;
                            akor = b2;
                            akkl = akkl2;
                            aklt.d = new akoh(aklt.c, arrayList);
                        }
                        akln = new akln(aklr3, aklt.d, akli.c, (aklh) null, false, akli.d);
                    } else {
                        akjy = akjy3;
                        akor = b2;
                        akkl = akkl2;
                        akln = null;
                    }
                } else {
                    akjy = akjy3;
                    akor = b2;
                    akkl = akkl2;
                }
                akor akor2 = akor;
                if (akor2.a == 0) {
                    akjy2 = akjy;
                    for (akje a3 : akjy2.c.values()) {
                        a3.a(akjy2.i);
                    }
                    akjy2.e.a(akjy2.i);
                } else {
                    akjy2 = akjy;
                }
                if (akjy2.i == 1) {
                    akuo akuo3 = ((akuj) akjy2.a).h;
                    if (!azbz.a.a().k() || akor2.b.a == aocj.AT_PLACE) {
                        aklz.a();
                        akka akka = akjy2.p;
                        if (akka.a != null) {
                            aklr aklr4 = akln.a;
                            if (akka.c.a) {
                                i6 = (int) azcf.a.a().t();
                            } else {
                                i6 = (int) azcf.a.a().s();
                            }
                            List a4 = aklw.a(akln.a, i6);
                            akke akke = akka.b;
                            akke.e = akln;
                            akke.d = a4;
                            akke.f = 0;
                            akke.a(akln, a4, akkl);
                        } else {
                            aklz.a();
                        }
                        akjy2.a.a().c();
                        return;
                    }
                    aklz.a();
                    akjy2.a(akjy2.a((String) null));
                    for (String a5 : akjy2.c.keySet()) {
                        akjy2.a(akjy2.a(a5));
                    }
                    return;
                }
                return;
            }
            aklz.a();
        }
    }
}
