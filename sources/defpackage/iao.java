package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;

/* renamed from: iao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iao {
    private static volatile iao a;

    private iao() {
    }

    public static final aohg a(Context context) {
        int i;
        int i2;
        File[] listFiles;
        String packageName = context.getPackageName();
        int a2 = aogz.a(jlo.h());
        int i3 = 1;
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = aohf.a(jlo.j());
        if (a3 == 0) {
            a3 = 1;
        }
        int a4 = aohc.a(jlo.k());
        if (a4 == 0) {
            a4 = 1;
        }
        aucd o = aohg.q.o();
        String e = jhg.e(context);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg = (aohg) o.b;
        e.getClass();
        aohg.a |= 1;
        aohg.b = e;
        long g = jlo.g();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg2 = (aohg) o.b;
        int i4 = aohg2.a | 2;
        aohg2.a = i4;
        aohg2.c = g;
        aohg2.d = a2 - 1;
        int i5 = i4 | 4;
        aohg2.a = i5;
        aohg2.e = a3 - 1;
        int i6 = i5 | 8;
        aohg2.a = i6;
        aohg2.f = a4 - 1;
        aohg2.a = i6 | 16;
        aucd o2 = aohx.h.o();
        String property = System.getProperty("java.vm.version");
        if (property != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohx aohx = (aohx) o2.b;
            property.getClass();
            aohx.a |= 1;
            aohx.b = property;
        }
        String property2 = System.getProperty("java.vm.vendor");
        if (property2 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohx aohx2 = (aohx) o2.b;
            property2.getClass();
            aohx2.a |= 2;
            aohx2.c = property2;
        }
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohx aohx3 = (aohx) o2.b;
            property3.getClass();
            aohx3.a |= 4;
            aohx3.d = property3;
        }
        String property4 = System.getProperty("java.vm.specification.version");
        if (property4 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohx aohx4 = (aohx) o2.b;
            property4.getClass();
            aohx4.a |= 8;
            aohx4.e = property4;
        }
        String property5 = System.getProperty("java.vm.specification.vendor");
        if (property5 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohx aohx5 = (aohx) o2.b;
            property5.getClass();
            aohx5.a |= 16;
            aohx5.f = property5;
        }
        String property6 = System.getProperty("java.vm.specification.name");
        if (property6 != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aohx aohx6 = (aohx) o2.b;
            property6.getClass();
            aohx6.a |= 32;
            aohx6.g = property6;
        }
        aohx aohx7 = (aohx) o2.i();
        int size = jgu.d(context, packageName).size();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg3 = (aohg) o.b;
        aohg3.a |= 64;
        aohg3.h = size;
        try {
            PackageInfo b = jni.b(context).b(packageName, 0);
            hya.a(context);
            if (hya.b(b, false)) {
                i = 2;
            } else if (hya.b(b, true)) {
                i = 3;
            } else {
                i = 1;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            i = 1;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg4 = (aohg) o.b;
        aohg4.i = i - 1;
        aohg4.a |= 128;
        try {
            i2 = jni.b(context).a(packageName, 0).flags;
        } catch (PackageManager.NameNotFoundException e3) {
            i2 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg5 = (aohg) o.b;
        aohg5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aohg5.j = i2;
        String a5 = jke.a(context, "gmscore");
        if (a5 == null) {
            File a6 = jke.a(context);
            if (!(a6 == null || !a6.exists() || (listFiles = a6.listFiles()) == null)) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        String[] list = listFiles[i7].list();
                        if (list != null && list.length > 0) {
                            i3 = 5;
                            break;
                        }
                        i7++;
                    }
                }
            }
            try {
                ApplicationInfo a7 = jni.b(context).a(packageName, 0);
                i3 = !new File(a7.nativeLibraryDir, "libgmscore.so").exists() ? 2 : (a7.flags & 128) != 0 ? 4 : 3;
            } catch (PackageManager.NameNotFoundException e4) {
            }
        } else if (!a5.startsWith("/system")) {
            File a8 = jke.a(context);
            i3 = a8 != null ? !a5.startsWith(a8.getAbsolutePath()) ? 4 : 5 : 4;
        } else {
            i3 = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg6 = (aohg) o.b;
        aohg6.k = i3 - 1;
        aohg6.a |= 512;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg7 = (aohg) o.b;
        aohg7.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        aohg7.l = j;
        boolean d = jix.d(context);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg8 = (aohg) o.b;
        aohg8.a |= 16384;
        aohg8.m = d;
        if (((Boolean) iks.z.c()).booleanValue()) {
            Resources resources = context.getResources();
            String language = resources.getConfiguration().locale.getLanguage();
            if (apen.a(resources, language, packageName)) {
                TypedValue typedValue = new TypedValue();
                try {
                    resources.getValue(String.valueOf(context.getPackageName()).concat(":current_locale_sanity_check"), typedValue, false);
                } catch (Resources.NotFoundException e5) {
                    typedValue.string = null;
                }
                String charSequence = typedValue.string != null ? typedValue.string.toString() : "??";
                if (!language.equals(typedValue.string)) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aohg aohg9 = (aohg) o.b;
                    language.getClass();
                    int i8 = aohg9.a | 131072;
                    aohg9.a = i8;
                    aohg9.n = language;
                    charSequence.getClass();
                    aohg9.a = 262144 | i8;
                    aohg9.o = charSequence;
                }
            }
        }
        String installerPackageName = context.getPackageManager().getInstallerPackageName("com.google.android.gms");
        if (installerPackageName == null) {
            installerPackageName = "";
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohg aohg10 = (aohg) o.b;
        installerPackageName.getClass();
        int i9 = aohg10.a | 524288;
        aohg10.a = i9;
        aohg10.p = installerPackageName;
        aohx7.getClass();
        aohg10.g = aohx7;
        aohg10.a = i9 | 32;
        return (aohg) o.i();
    }

    public static iao a() {
        iao iao = a;
        if (iao != null) {
            return iao;
        }
        iao iao2 = new iao();
        a = iao2;
        return iao2;
    }

    public static final void a(Context context, int i, int i2, aoip aoip) {
        aucd o = aohl.u.o();
        aohg a2 = a(context);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aohl aohl = (aohl) o.b;
        a2.getClass();
        aohl.b = a2;
        int i3 = aohl.a | 1;
        aohl.a = i3;
        aoip.getClass();
        aohl.c = aoip;
        aohl.a = i3 | 2;
        if (!ixm.b.a().isEmpty()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aohl aohl2 = (aohl) o.b;
            aohl2.a |= 8;
            aohl2.i = true;
        }
        if (i == 1) {
            a(context, "system_health", ((aohl) o.i()).k());
            return;
        }
        if (i2 >= 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aohl aohl3 = (aohl) o.b;
            aohl3.a |= 32;
            aohl3.k = i2;
        }
        hoi a3 = iwt.a().b(context).a(((aohl) o.i()).k());
        avsd avsd = avsd.DEFAULT;
        if (jgu.b(context) && (i == 8 || i == 10)) {
            avsd = avsd.FAST_IF_RADIO_AWAKE;
        }
        if (i == 8) {
            a3.b("system_health");
        }
        a3.b(i - 1);
        a3.f = avsd;
        a3.b();
    }

    public static final void a(Context context, int i, aoip aoip) {
        a(context, i, -1, aoip);
    }

    public static final void a(Context context, String str, byte[] bArr) {
        hoi a2 = iwt.a().b(context).a(bArr);
        a2.b(str);
        a2.b();
    }
}
