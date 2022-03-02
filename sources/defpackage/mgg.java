package defpackage;

import android.content.Context;

/* renamed from: mgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgg {
    public static apgv a(Context context, mfr mfr, mfp mfp) {
        String valueOf = String.valueOf(axgd.b());
        mfv.c("RpcUtil", valueOf.length() == 0 ? new String("Experiment overrides:") : "Experiment overrides:".concat(valueOf), new Object[0]);
        aucd o = aphp.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphp aphp = (aphp) o.b;
        aphp.c = 7;
        int i = 2;
        aphp.a |= 2;
        aucd o2 = apie.c.o();
        int i2 = context.getResources().getDisplayMetrics().densityDpi;
        if (i2 != 160) {
            i = i2 != 240 ? i2 != 320 ? i2 != 480 ? i2 != 640 ? 1 : 6 : 5 : 4 : 3;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        apie apie = (apie) o2.b;
        apie.b = i - 1;
        apie.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphp aphp2 = (aphp) o.b;
        apie apie2 = (apie) o2.i();
        apie2.getClass();
        aphp2.e = apie2;
        aphp2.a |= 8;
        aucd o3 = apgv.e.o();
        String a = mfr.a();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apgv apgv = (apgv) o3.b;
        a.getClass();
        if (!apgv.d.a()) {
            apgv.d = aucj.a(apgv.d);
        }
        apgv.d.add(a);
        String b = axgd.b();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apgv apgv2 = (apgv) o3.b;
        b.getClass();
        apgv2.a |= 1;
        apgv2.b = b;
        aucd o4 = apho.c.o();
        String str = mfp.a;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        apho apho = (apho) o4.b;
        str.getClass();
        apho.a |= 1;
        apho.b = str;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphp aphp3 = (aphp) o.b;
        apho apho2 = (apho) o4.i();
        apho2.getClass();
        aphp3.d = apho2;
        aphp3.a |= 4;
        String str2 = mfp.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aphp aphp4 = (aphp) o.b;
        str2.getClass();
        aphp4.a |= 1;
        aphp4.b = str2;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apgv apgv3 = (apgv) o3.b;
        aphp aphp5 = (aphp) o.i();
        aphp5.getClass();
        apgv3.c = aphp5;
        apgv3.a |= 4;
        return (apgv) o3.i();
    }

    public static void a(mfr mfr, apgw apgw) {
        if (apgw != null && (apgw.a & 1) != 0) {
            amdp amdp = apgw.b;
            if (amdp == null) {
                amdp = amdp.d;
            }
            String str = amdp.b;
            amdp amdp2 = apgw.b;
            if (amdp2 == null) {
                amdp2 = amdp.d;
            }
            mfr.a(str, (long) amdp2.c);
        }
    }
}
