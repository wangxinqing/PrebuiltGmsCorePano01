package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.io.File;
import java.util.Random;

/* renamed from: ixw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ixw {
    public static final /* synthetic */ int a = 0;
    private static final aghw b;

    static {
        aght e = aghw.e();
        e.a(false);
        b = e.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r0.nextInt(r5) != 0) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.aggo a(boolean r24, android.content.Context r25, boolean r26, java.util.Random r27) {
        /*
            r0 = r27
            aggo r1 = new aggo
            r2 = 0
            r1.<init>(r2)
            boolean r3 = defpackage.axav.b()
            if (r3 == 0) goto L_0x0435
            r3 = 1
            if (r26 == 0) goto L_0x0012
            goto L_0x001d
        L_0x0012:
            r4 = r25
            boolean r4 = defpackage.jij.a((android.content.Context) r4, (boolean) r3)
            if (r4 != 0) goto L_0x001d
            goto L_0x0435
        L_0x001d:
            axda r4 = defpackage.axda.a
            axdb r4 = r4.a()
            long r4 = r4.Q()
            int r5 = (int) r4
            axav r4 = defpackage.axav.a
            axaw r4 = r4.a()
            boolean r4 = r4.g()
            r6 = 0
            if (r4 != 0) goto L_0x0036
            goto L_0x009d
        L_0x0036:
            if (r26 == 0) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            if (r5 <= r3) goto L_0x0045
            r27.nextLong()
            int r4 = r0.nextInt(r5)
            if (r4 == 0) goto L_0x0045
            goto L_0x009d
        L_0x0045:
            aght r4 = defpackage.aghw.e()
            r4.a((boolean) r3)
            axav r7 = defpackage.axav.a
            axaw r7 = r7.a()
            long r7 = r7.r()
            int r8 = (int) r7
            r4.a((int) r8)
            r4.b(r6)
            if (r26 == 0) goto L_0x0068
            aghv r0 = new aghv
            r0.<init>()
            r4.a((defpackage.aghu) r0)
            goto L_0x0091
        L_0x0068:
            njr r7 = new njr
            axav r8 = defpackage.axav.a
            axaw r8 = r8.a()
            double r8 = r8.s()
            r10 = 1036831949(0x3dcccccd, float:0.1)
            float r8 = (float) r8
            float r8 = java.lang.Math.min(r10, r8)
            njh r9 = new njh
            axav r10 = defpackage.axav.a
            axaw r10 = r10.a()
            long r10 = r10.q()
            r9.<init>(r0, r10)
            r7.<init>(r8, r9, r5)
            r4.a((defpackage.aghu) r7)
        L_0x0091:
            aghw r0 = r4.a()
            amri r0 = defpackage.amri.c(r0)
            if (r0 == 0) goto L_0x042d
            r1.e = r0
        L_0x009d:
            aghk r0 = new aghk
            r0.<init>(r2)
            r0.a(r6)
            r0.b(r6)
            ampu r4 = defpackage.ampu.a
            r0.c = r4
            boolean r4 = defpackage.axav.c()
            r0.a(r4)
            r0.b(r3)
            java.lang.Boolean r4 = r0.a
            java.lang.String r5 = " enabled"
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x00c0
            r4 = r5
            goto L_0x00c1
        L_0x00c0:
            r4 = r7
        L_0x00c1:
            java.lang.Boolean r8 = r0.b
            if (r8 != 0) goto L_0x00cb
            java.lang.String r8 = " manualCapture"
            java.lang.String r4 = r4.concat(r8)
        L_0x00cb:
            boolean r8 = r4.isEmpty()
            java.lang.String r9 = "Missing required properties:"
            if (r8 != 0) goto L_0x00ed
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00e5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            goto L_0x00e9
        L_0x00e5:
            java.lang.String r1 = r9.concat(r1)
        L_0x00e9:
            r0.<init>(r1)
            throw r0
        L_0x00ed:
            agdg r4 = new agdg
            java.lang.Boolean r8 = r0.a
            boolean r8 = r8.booleanValue()
            java.lang.Boolean r10 = r0.b
            boolean r10 = r10.booleanValue()
            amri r0 = r0.c
            r4.<init>(r8, r10, r0)
            amri r0 = defpackage.amri.c(r4)
            if (r0 == 0) goto L_0x0425
            r1.d = r0
            aghx r0 = new aghx
            r0.<init>(r2)
            r0.a((boolean) r6)
            r4 = 10
            r0.a((int) r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.a((float) r4)
            ampu r4 = defpackage.ampu.a
            r0.d = r4
            axav r4 = defpackage.axav.a
            axaw r4 = r4.a()
            boolean r4 = r4.f()
            r0.a((boolean) r4)
            axav r4 = defpackage.axav.a
            axaw r4 = r4.a()
            long r10 = r4.p()
            int r4 = (int) r10
            r0.a((int) r4)
            axav r4 = defpackage.axav.a
            axaw r4 = r4.a()
            double r10 = r4.o()
            float r4 = (float) r10
            r0.a((float) r4)
            java.lang.Boolean r4 = r0.a
            if (r4 != 0) goto L_0x014d
            r4 = r5
            goto L_0x014e
        L_0x014d:
            r4 = r7
        L_0x014e:
            agng r8 = r0.b
            if (r8 != 0) goto L_0x0158
            java.lang.String r8 = " probabilitySampler"
            java.lang.String r4 = r4.concat(r8)
        L_0x0158:
            java.lang.Integer r8 = r0.c
            java.lang.String r10 = " sampleRatePerSecond"
            if (r8 != 0) goto L_0x0166
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r4.concat(r10)
        L_0x0166:
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L_0x0186
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x017e
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            goto L_0x0182
        L_0x017e:
            java.lang.String r1 = r9.concat(r1)
        L_0x0182:
            r0.<init>(r1)
            throw r0
        L_0x0186:
            agdj r4 = new agdj
            java.lang.Boolean r8 = r0.a
            boolean r8 = r8.booleanValue()
            agng r11 = r0.b
            java.lang.Integer r12 = r0.c
            int r12 = r12.intValue()
            amri r0 = r0.d
            r4.<init>(r8, r11, r12, r0)
            int r0 = r4.a
            if (r0 < 0) goto L_0x01a1
            r0 = 1
            goto L_0x01a2
        L_0x01a1:
            r0 = 0
        L_0x01a2:
            java.lang.String r8 = "Samples rate per second shall be >= 0"
            defpackage.amrl.b((boolean) r0, (java.lang.Object) r8)
            amri r0 = defpackage.amri.c(r4)
            if (r0 == 0) goto L_0x041d
            r1.b = r0
            if (r24 == 0) goto L_0x041c
            java.lang.String r0 = defpackage.jkt.a()
            awyp r4 = defpackage.awyp.a
            awyq r4 = r4.a()
            acve r4 = r4.b()
            awyp r8 = defpackage.awyp.a
            awyq r8 = r8.a()
            acvd r8 = r8.a()
            aucx r4 = r4.a
            int r11 = r4.size()
            r12 = 0
        L_0x01d1:
            if (r12 >= r11) goto L_0x01e5
            java.lang.Object r13 = r4.get(r12)
            acvd r13 = (defpackage.acvd) r13
            int r12 = r12 + 1
            java.lang.String r14 = r13.a
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x01d1
            r8 = r13
            goto L_0x01e6
        L_0x01e5:
        L_0x01e6:
            aghg r0 = new aghg
            r0.<init>(r2)
            r0.a((boolean) r6)
            r4 = 3
            r0.a((int) r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r0.c = r4
            ampu r11 = defpackage.ampu.a
            r0.d = r11
            r0.e = r4
            r0.f = r4
            r0.g = r4
            r0.h = r4
            r0.i = r4
            r0.j = r4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r0.k = r11
            r0.l = r11
            axav r11 = defpackage.axav.a
            axaw r11 = r11.a()
            boolean r11 = r11.b()
            r0.a((boolean) r11)
            axav r11 = defpackage.axav.a
            axaw r11 = r11.a()
            long r11 = r11.j()
            int r12 = (int) r11
            r0.a((int) r12)
            java.lang.Boolean r11 = r0.a
            if (r11 != 0) goto L_0x0231
            r11 = r5
            goto L_0x0232
        L_0x0231:
            r11 = r7
        L_0x0232:
            java.lang.Integer r12 = r0.b
            if (r12 != 0) goto L_0x023a
            java.lang.String r11 = r11.concat(r10)
        L_0x023a:
            java.lang.Boolean r10 = r0.c
            if (r10 != 0) goto L_0x0248
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " recordMetricPerProcess"
            java.lang.String r11 = r10.concat(r11)
        L_0x0248:
            java.lang.Boolean r10 = r0.e
            if (r10 != 0) goto L_0x0256
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " forceGcBeforeRecordMemory"
            java.lang.String r11 = r10.concat(r11)
        L_0x0256:
            java.lang.Boolean r10 = r0.f
            if (r10 != 0) goto L_0x0264
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureRssHwm"
            java.lang.String r11 = r10.concat(r11)
        L_0x0264:
            java.lang.Boolean r10 = r0.g
            if (r10 != 0) goto L_0x0272
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureTotalRss"
            java.lang.String r11 = r10.concat(r11)
        L_0x0272:
            java.lang.Boolean r10 = r0.h
            if (r10 != 0) goto L_0x0280
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureAnonRss"
            java.lang.String r11 = r10.concat(r11)
        L_0x0280:
            java.lang.Boolean r10 = r0.i
            if (r10 != 0) goto L_0x028e
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureSwap"
            java.lang.String r11 = r10.concat(r11)
        L_0x028e:
            java.lang.Boolean r10 = r0.j
            if (r10 != 0) goto L_0x029c
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureVmSize"
            java.lang.String r11 = r10.concat(r11)
        L_0x029c:
            java.lang.Boolean r10 = r0.k
            if (r10 != 0) goto L_0x02aa
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureDebugMetrics"
            java.lang.String r11 = r10.concat(r11)
        L_0x02aa:
            java.lang.Boolean r10 = r0.l
            if (r10 != 0) goto L_0x02b8
            java.lang.String r10 = java.lang.String.valueOf(r11)
            java.lang.String r11 = " captureMemoryInfo"
            java.lang.String r11 = r10.concat(r11)
        L_0x02b8:
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto L_0x02d8
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r11)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x02d0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            goto L_0x02d4
        L_0x02d0:
            java.lang.String r1 = r9.concat(r1)
        L_0x02d4:
            r0.<init>(r1)
            throw r0
        L_0x02d8:
            agde r23 = new agde
            java.lang.Boolean r10 = r0.a
            boolean r11 = r10.booleanValue()
            java.lang.Integer r10 = r0.b
            int r12 = r10.intValue()
            java.lang.Boolean r10 = r0.c
            boolean r13 = r10.booleanValue()
            amri r14 = r0.d
            java.lang.Boolean r10 = r0.e
            boolean r15 = r10.booleanValue()
            java.lang.Boolean r10 = r0.f
            boolean r16 = r10.booleanValue()
            java.lang.Boolean r10 = r0.g
            boolean r17 = r10.booleanValue()
            java.lang.Boolean r10 = r0.h
            boolean r18 = r10.booleanValue()
            java.lang.Boolean r10 = r0.i
            boolean r19 = r10.booleanValue()
            java.lang.Boolean r10 = r0.j
            boolean r20 = r10.booleanValue()
            java.lang.Boolean r10 = r0.k
            boolean r21 = r10.booleanValue()
            java.lang.Boolean r0 = r0.l
            boolean r22 = r0.booleanValue()
            r10 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            amri r0 = defpackage.amri.c(r23)
            if (r0 == 0) goto L_0x0414
            r1.a = r0
            aghi r0 = new aghi
            r0.<init>(r2)
            r0.a(r6)
            r0.c = r4
            r2 = 50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b = r2
            ampu r2 = defpackage.ampu.a
            r0.d = r2
            axav r2 = defpackage.axav.a
            axaw r2 = r2.a()
            boolean r2 = r2.c()
            r0.a(r2)
            java.lang.Boolean r2 = r0.a
            if (r2 != 0) goto L_0x0353
            goto L_0x0354
        L_0x0353:
            r5 = r7
        L_0x0354:
            java.lang.Integer r2 = r0.b
            if (r2 != 0) goto L_0x035e
            java.lang.String r2 = " batchSize"
            java.lang.String r5 = r5.concat(r2)
        L_0x035e:
            java.lang.Boolean r2 = r0.c
            if (r2 != 0) goto L_0x036c
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r4 = " enableUrlAutoSanitization"
            java.lang.String r5 = r2.concat(r4)
        L_0x036c:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x038c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0384
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            goto L_0x0388
        L_0x0384:
            java.lang.String r1 = r9.concat(r1)
        L_0x0388:
            r0.<init>(r1)
            throw r0
        L_0x038c:
            agdf r2 = new agdf
            java.lang.Boolean r4 = r0.a
            boolean r4 = r4.booleanValue()
            java.lang.Integer r5 = r0.b
            int r5 = r5.intValue()
            java.lang.Boolean r6 = r0.c
            boolean r6 = r6.booleanValue()
            amri r0 = r0.d
            r2.<init>(r4, r5, r6, r0)
            java.lang.String r0 = "only one of auto url auto sanitization and custom url sanitizer can be enabled."
            defpackage.amrl.a((boolean) r3, (java.lang.Object) r0)
            amri r0 = defpackage.amri.c(r2)
            if (r0 == 0) goto L_0x040c
            r1.c = r0
            aggz r0 = new aggz
            r0.<init>()
            aghn r2 = new aghn
            axav r3 = defpackage.axav.a
            axaw r3 = r3.a()
            boolean r10 = r3.e()
            int r11 = r8.e
            int r12 = r8.b
            int r13 = r8.f
            int r14 = r8.c
            int r3 = r8.d
            double r3 = (double) r3
            r9 = r2
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            int r3 = r2.b
            if (r3 > 0) goto L_0x03d8
            goto L_0x03f2
        L_0x03d8:
            r4 = 3145728(0x300000, float:4.408104E-39)
            if (r3 > r4) goto L_0x03f2
            int r3 = r2.c
            if (r3 <= 0) goto L_0x03f2
            int r3 = r2.e
            if (r3 <= 0) goto L_0x03f2
            double r3 = r2.f
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x03f2
            amri r2 = defpackage.amri.b(r2)
            r0.a = r2
        L_0x03f2:
            agha r2 = new agha
            amri r3 = r0.a
            amri r0 = r0.b
            r2.<init>(r3, r0)
            amri r0 = defpackage.amri.c(r2)
            if (r0 == 0) goto L_0x0404
            r1.f = r0
            goto L_0x041c
        L_0x0404:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null experimentalConfigurations"
            r0.<init>(r1)
            throw r0
        L_0x040c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null networkConfigurations"
            r0.<init>(r1)
            throw r0
        L_0x0414:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null memoryConfigurations"
            r0.<init>(r1)
            throw r0
        L_0x041c:
            return r1
        L_0x041d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null timerConfigurations"
            r0.<init>(r1)
            throw r0
        L_0x0425:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null packageConfigurations"
            r0.<init>(r1)
            throw r0
        L_0x042d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null tikTokTraceConfigurations"
            r0.<init>(r1)
            throw r0
        L_0x0435:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixw.a(boolean, android.content.Context, boolean, java.util.Random):aggo");
    }

    private static aghs a() {
        aghr i = aghs.i();
        i.a = jfm.a(2, 10);
        return i.a();
    }

    public static agno a(Context context, boolean z) {
        if (!z) {
            int i = aekp.a;
            return new agnu(context, new ixy((int) axav.a.a().m(), (int) axav.a.a().l(), (int) axav.a.a().n()), (int) axav.a.a().i(), new ixu(context));
        }
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append(valueOf);
        sb.append("/googletest/test_outputfiles/");
        return new agnw(new File(sb.toString(), "GMSCORE_ANDROID_PRIMES"));
    }

    public static SharedPreferences a(Context context) {
        if (aekv.a()) {
            context = aekv.c(context);
        }
        return context.getSharedPreferences("primes", 4);
    }

    public static void a(Application application) {
        boolean z = false;
        if (a(Build.HARDWARE, Build.TYPE) && axav.d()) {
            z = true;
        }
        aggo a2 = a(true, application, z, new Random());
        a2.a(new ixo(application, z));
        aggp a3 = a2.a();
        if (a(a3)) {
            aggk a4 = aggg.a(application);
            a4.a((bapu) new ixp(a3));
            a4.a(a());
            a4.a((amsv) new ixq(application));
            agfu.a(a4.a());
            agdd agdd = (agdd) a3;
            if (agdd.a.a() && ((aghh) agdd.a.b()).a()) {
                agfu.a().a.d();
                jfp jfp = new jfp("PrimesHelper", 10);
                jfp.start();
                new ixv(jfp).sendEmptyMessageDelayed(1, axav.a.a().k());
            }
            nky.a((aghw) agdd.e.a((Object) b), z);
            return;
        }
        nky.a(b, z);
    }

    public static void a(BaseApplicationContext baseApplicationContext) {
        boolean z;
        if (!a(Build.HARDWARE, Build.TYPE) || !axav.d()) {
            z = false;
        } else {
            z = true;
        }
        aggo a2 = a(false, baseApplicationContext, z, new Random());
        a2.a(new ixr(baseApplicationContext, z));
        aggp a3 = a2.a();
        if (a(a3)) {
            Context baseContext = baseApplicationContext.getBaseContext();
            if (baseContext instanceof Application) {
                aggk a4 = aggg.a((Application) baseContext);
                a4.a((bapu) new ixs(a3));
                a4.a(a());
                a4.a((amsv) new ixt(baseContext));
                agfu.a(a4.a());
            } else {
                Log.e("PrimesHelper", "The base Context of BaseApplicationContext should be an Application.");
            }
            nky.a((aghw) ((agdd) a3).e.a((Object) b), z);
            return;
        }
        nky.a(b, z);
    }

    static boolean a(aggp aggp) {
        agdd agdd = (agdd) aggp;
        return (agdd.d.a() && ((aghl) agdd.d.b()).a()) || (agdd.b.a() && ((aghy) agdd.b.b()).a()) || ((agdd.e.a() && ((aghw) agdd.e.b()).a()) || ((agdd.a.a() && ((aghh) agdd.a.b()).a()) || (agdd.c.a() && ((aghj) agdd.c.b()).a())));
    }

    static boolean a(String str, String str2) {
        if (str.equals("goldfish") || str.equals("ranchu")) {
            return str2.equals("eng") || str2.equals("userdebug");
        }
        return false;
    }
}
