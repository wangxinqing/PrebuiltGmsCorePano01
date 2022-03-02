package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: ilc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilc {
    static final String[] a = {"GMS_CORE", "GMSCORE_ANDROID_PRIMES", "GMSCORE_SCHEDULER_EVENT"};
    private static final String[] b = new String[0];

    public static List a(Context context, nim nim, int i) {
        String[] strArr;
        Set set;
        nim nim2 = nim;
        if (nim2 == null || nim2.a.size() == 0) {
            return amzy.h();
        }
        List a2 = jir.a(nim2.a.size());
        aucx aucx = nim2.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            nil nil = (nil) aucx.get(i2);
            String str = nil.b;
            aucx aucx2 = nil.c;
            int i3 = 1;
            if (str.startsWith("alt.")) {
                strArr = b;
            } else if (!aucx2.isEmpty()) {
                int length = a.length + aucx2.size();
                String[] strArr2 = a;
                int length2 = strArr2.length;
                int max = Math.max(length, length2);
                if (max == 0) {
                    set = jir.b();
                } else if (length2 == 0) {
                    set = jir.b(length);
                } else {
                    set = jir.a(max, true, (Object[]) strArr2);
                }
                set.addAll(aucx2);
                strArr = (String[]) set.toArray(new String[set.size()]);
            } else {
                strArr = a;
            }
            RegistrationInfo registrationInfo = new RegistrationInfo(str, i, strArr, nil.e.k(), nil.f, aoog.a((Collection) nil.d), "com.google.android.gms");
            if ("com.google.android.gms".equals(nil.b)) {
                aucd o = apgf.g.o();
                String i4 = jlo.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                apgf apgf = (apgf) o.b;
                i4.getClass();
                apgf.a |= 2;
                apgf.d = i4;
                aucd o2 = haa.y.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                haa haa = (haa) o2.b;
                haa.b = 0;
                int i5 = haa.a | 1;
                haa.a = i5;
                haa.c = 0;
                int i6 = i5 | 2;
                haa.a = i6;
                haa.d = 0;
                int i7 = i6 | 4;
                haa.a = i7;
                haa.e = 0;
                int i8 = i7 | 8;
                haa.a = i8;
                int i9 = i8 | 32;
                haa.a = i9;
                haa.g = false;
                int i10 = i9 | 64;
                haa.a = i10;
                haa.h = false;
                int i11 = i10 | 128;
                haa.a = i11;
                haa.i = 0;
                haa.a = i11 | 1024;
                haa.l = 0;
                jiw.a(context, o2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((haa) o2.b).m = aucj.s();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((haa) o2.b).o = aucj.s();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ((haa) o2.b).r = aucj.s();
                haa haa2 = (haa) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                apgf apgf2 = (apgf) o.b;
                haa2.getClass();
                apgf2.b = haa2;
                apgf2.a |= 1;
                for (ModuleManager.ModuleSetInfo moduleSetInfo : ModuleManager.get(context).getCurrentConfig().moduleSets) {
                    String str2 = moduleSetInfo.moduleSetId;
                    long j = (long) moduleSetInfo.moduleSetVariant;
                    str2.getClass();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    apgf apgf3 = (apgf) o.b;
                    audr audr = apgf3.c;
                    if (!audr.a) {
                        apgf3.c = audr.a();
                    }
                    apgf3.c.put(str2, Long.valueOf(j));
                }
                if (axao.a.a().c()) {
                    int i12 = Build.VERSION.SDK_INT;
                    int i13 = Settings.Global.getInt(context.getContentResolver(), "device_provisioned", -1);
                    int i14 = 3;
                    if (i13 > 0) {
                        i3 = 3;
                    } else if (i13 == 0) {
                        i3 = 2;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    apgf apgf4 = (apgf) o.b;
                    apgf4.e = i3 - 1;
                    apgf4.a |= 4;
                    if ((context.getApplicationInfo().flags & 128) == 0) {
                        i14 = 2;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    apgf apgf5 = (apgf) o.b;
                    apgf5.f = i14 - 1;
                    apgf5.a |= 8;
                }
                a2.add(new RegistrationInfo(registrationInfo.a, registrationInfo.b, registrationInfo.c, ((apgf) o.i()).k(), registrationInfo.e, registrationInfo.f, registrationInfo.g));
            } else {
                Context context2 = context;
                if (!nil.g) {
                    a2.add(registrationInfo);
                }
            }
        }
        return a2;
    }
}
