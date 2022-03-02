package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: dje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dje {
    static final String[] a = {"com.google.android.webview", "com.android.webview"};
    public static final iwd b = dit.a("RequestContextHelper");
    private static final amsv e = amta.a(djc.a, 1, TimeUnit.HOURS);
    public final Context c = ihs.b();
    public final amsv d;
    private final amsv f;
    private final amsv g;

    public dje(ModuleManager moduleManager) {
        amsv amsv = e;
        this.f = amta.a(new djd(moduleManager), 1, TimeUnit.HOURS);
        this.g = amta.a(new djb(this), awgs.a.a().z(), TimeUnit.MILLISECONDS);
        this.d = amsv;
    }

    public final aqqr a() {
        String str;
        String str2;
        aucd o = aqqr.i.o();
        String str3 = Build.VERSION.RELEASE;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqr aqqr = (aqqr) o.b;
        str3.getClass();
        aqqr.a |= 1;
        aqqr.b = str3;
        String num = Integer.toString(Build.VERSION.SDK_INT);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqr aqqr2 = (aqqr) o.b;
        num.getClass();
        aqqr2.a |= 2;
        aqqr2.c = num;
        String num2 = Integer.toString(201216073);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqr aqqr3 = (aqqr) o.b;
        num2.getClass();
        aqqr3.a |= 8;
        aqqr3.e = num2;
        if (awgs.d()) {
            int i = Build.VERSION.SDK_INT;
            String str4 = (String) this.g.a();
            if (str4 != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqqr aqqr4 = (aqqr) o.b;
                str4.getClass();
                aqqr4.a |= 4;
                aqqr4.d = str4;
            }
        }
        ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) ((anaf) this.f.a()).get("accountsettings");
        if (moduleInfo != null) {
            String num3 = Integer.toString(moduleInfo.moduleVersion);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqqr aqqr5 = (aqqr) o.b;
            num3.getClass();
            int i2 = aqqr5.a | 16;
            aqqr5.a = i2;
            aqqr5.f = num3;
            ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
            if (!(moduleApkInfo == null || (str2 = moduleApkInfo.apkVersionName) == null)) {
                str2.getClass();
                aqqr5.a = i2 | 32;
                aqqr5.g = str2;
            }
        }
        ModuleManager.ModuleInfo moduleInfo2 = (ModuleManager.ModuleInfo) ((anaf) this.f.a()).get("octarine");
        if (moduleInfo2 != null) {
            str = Integer.toString(moduleInfo2.moduleVersion);
        } else {
            str = null;
        }
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqqr aqqr6 = (aqqr) o.b;
            str.getClass();
            aqqr6.a |= 64;
            aqqr6.h = str;
        }
        return (aqqr) o.i();
    }

    public final aqqq b() {
        aqqp aqqp = (aqqp) aqqq.k.o();
        amzt j = amzy.j();
        j.b((Object[]) new Integer[]{2, 3, 4, 5, 7, 10});
        anhk i = j.a().listIterator();
        while (i.hasNext()) {
            int intValue = ((Integer) i.next()).intValue();
            aucd o = aqtm.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqtm aqtm = (aqtm) o.b;
            aqtm.a |= 1;
            aqtm.b = intValue;
            if (aqqp.c) {
                aqqp.c();
                aqqp.c = false;
            }
            aqqq aqqq = (aqqq) aqqp.b;
            aqtm aqtm2 = (aqtm) o.i();
            aqtm2.getClass();
            if (!aqqq.b.a()) {
                aqqq.b = aucj.a(aqqq.b);
            }
            aqqq.b.add(aqtm2);
        }
        anhk i2 = amzy.a(aqrk.CHEVRON_RIGHT_ICON, aqrk.CHEVRON_LEFT_ICON, aqrk.CHEVRON_FORWARD_ICON, aqrk.IMAGE_PLACEHOLDER_ICON, aqrk.EDIT_ICON, aqrk.ACCOUNT_ICON, aqrk.SEARCH_ICON, aqrk.SUPPORT_ICON, aqrk.MENU_ICON, aqrk.CLOUD_OFF_ICON, aqrk.GENERIC_ERROR_ICON, aqrk.OPEN_IN_NEW_ICON, aqrk.PHONE_ANDROID_ICON, aqrk.GOOGLE_G_COLORED_ICON, aqrk.PAYMENT_ICON, aqrk.PERM_DEVICE_INFO_ICON, aqrk.LOCAL_HOSPITAL_ICON, aqrk.GROUP_ICON, aqrk.GOOGLE_G_ICON, aqrk.PERSONAL_INFO_ICON, aqrk.TOGGLE_ON_ICON, aqrk.PEOPLE_OUTLINE_ICON, aqrk.LOCK_ICON).listIterator();
        while (i2.hasNext()) {
            aucd o2 = aqtl.c.o();
            int i3 = ((aqrk) i2.next()).H;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqtl aqtl = (aqtl) o2.b;
            aqtl.a |= 1;
            aqtl.b = i3;
            if (aqqp.c) {
                aqqp.c();
                aqqp.c = false;
            }
            aqqq aqqq2 = (aqqq) aqqp.b;
            aqtl aqtl2 = (aqtl) o2.i();
            aqtl2.getClass();
            if (!aqqq2.c.a()) {
                aqqq2.c = aucj.a(aqqq2.c);
            }
            aqqq2.c.add(aqtl2);
        }
        amzt j2 = amzy.j();
        int i4 = Build.VERSION.SDK_INT;
        j2.b((Object[]) new Integer[]{6, 8});
        j2.b((Object[]) new Integer[]{4, 9, 2, 3});
        anhk i5 = j2.a().listIterator();
        while (i5.hasNext()) {
            int intValue2 = ((Integer) i5.next()).intValue();
            aucd o3 = aqtk.c.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aqtk aqtk = (aqtk) o3.b;
            aqtk.a |= 1;
            aqtk.b = intValue2;
            aqqp.a(o3);
        }
        if (awgy.k()) {
            if (aqqp.c) {
                aqqp.c();
                aqqp.c = false;
            }
            aqqq aqqq3 = (aqqq) aqqp.b;
            aqqq3.a |= 128;
            aqqq3.j = true;
        }
        if (awgs.d()) {
            if (((anaf) this.f.a()).containsKey("octarine")) {
                int i6 = Build.VERSION.SDK_INT;
                aucd o4 = aqtk.c.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aqtk aqtk2 = (aqtk) o4.b;
                aqtk2.a |= 1;
                aqtk2.b = 5;
                aqqp.a(o4);
                aucd o5 = aqtv.e.o();
                boolean a2 = ayoc.a.a().a();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aqtv aqtv = (aqtv) o5.b;
                aqtv.a |= 1;
                aqtv.b = a2;
                boolean b2 = ayoc.a.a().b();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aqtv aqtv2 = (aqtv) o5.b;
                aqtv2.a |= 2;
                aqtv2.c = b2;
                boolean c2 = ayoc.a.a().c();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aqtv aqtv3 = (aqtv) o5.b;
                aqtv3.a |= 4;
                aqtv3.d = c2;
                aqtv aqtv4 = (aqtv) o5.i();
                if (aqqp.c) {
                    aqqp.c();
                    aqqp.c = false;
                }
                aqqq aqqq4 = (aqqq) aqqp.b;
                aqtv4.getClass();
                aqqq4.e = aqtv4;
                aqqq4.a |= 1;
            }
        }
        aucd o6 = aqrw.c.o();
        if (o6.c) {
            o6.c();
            o6.c = false;
        }
        aqrw aqrw = (aqrw) o6.b;
        aqrw.a |= 1;
        aqrw.b = true;
        if (aqqp.c) {
            aqqp.c();
            aqqp.c = false;
        }
        aqqq aqqq5 = (aqqq) aqqp.b;
        aqrw aqrw2 = (aqrw) o6.i();
        aqrw2.getClass();
        aqqq5.i = aqrw2;
        aqqq5.a |= 64;
        aucd o7 = aqqi.m.o();
        if (o7.c) {
            o7.c();
            o7.c = false;
        }
        aqqi aqqi = (aqqi) o7.b;
        int i7 = aqqi.a | 1;
        aqqi.a = i7;
        aqqi.b = true;
        int i8 = 2 | i7;
        aqqi.a = i8;
        aqqi.c = true;
        int i9 = i8 | 4;
        aqqi.a = i9;
        aqqi.d = true;
        int i10 = i9 | 8;
        aqqi.a = i10;
        aqqi.e = true;
        int i11 = i10 | 64;
        aqqi.a = i11;
        aqqi.g = true;
        int i12 = i11 | 128;
        aqqi.a = i12;
        aqqi.h = true;
        int i13 = i12 | 512;
        aqqi.a = i13;
        aqqi.j = true;
        int i14 = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aqqi.a = i14;
        aqqi.i = true;
        int i15 = i14 | 32;
        aqqi.a = i15;
        aqqi.f = true;
        int i16 = i15 | 1024;
        aqqi.a = i16;
        aqqi.k = true;
        aqqi.a = i16 | 2048;
        aqqi.l = true;
        aqqi aqqi2 = (aqqi) o7.i();
        if (aqqp.c) {
            aqqp.c();
            aqqp.c = false;
        }
        aqqq aqqq6 = (aqqq) aqqp.b;
        aqqi2.getClass();
        aqqq6.f = aqqi2;
        int i17 = aqqq6.a | 8;
        aqqq6.a = i17;
        aqqq6.a = i17 | 16;
        aqqq6.g = true;
        if (awgy.h()) {
            aucd o8 = aqpu.c.o();
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            aqpu aqpu = (aqpu) o8.b;
            aqpu.a |= 1;
            aqpu.b = true;
            if (aqqp.c) {
                aqqp.c();
                aqqp.c = false;
            }
            aqqq aqqq7 = (aqqq) aqqp.b;
            aqpu aqpu2 = (aqpu) o8.i();
            aqpu2.getClass();
            aqqq7.h = aqpu2;
            aqqq7.a |= 32;
        }
        return (aqqq) aqqp.i();
    }

    public final void c() {
        jix.g(this.c);
    }
}
