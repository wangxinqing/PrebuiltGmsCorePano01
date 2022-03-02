package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: wju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wju {
    public static amgy a(Context context, String str, auuv auuv) {
        int i;
        if (auuv == null) {
            auuv = auuv.GOOGLE_PLAY_SERVICES;
        }
        boolean a = jix.a(context.getResources());
        aucd o = bayz.e.o();
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            i = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        bayz bayz = (bayz) o.b;
        int i2 = bayz.a | 512;
        bayz.a = i2;
        bayz.c = i;
        str.getClass();
        bayz.a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        bayz.b = str;
        aucd o2 = auuy.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auuy auuy = (auuy) o2.b;
        auuy.c = auuv.iZ;
        int i3 = auuy.a | 2;
        auuy.a = i3;
        auuy.b = (!a ? 3 : 4) - 1;
        int i4 = i3 | 1;
        auuy.a = i4;
        auuy.d = 2;
        int i5 = i4 | 4;
        auuy.a = i5;
        auuy.e = 100;
        auuy.a = i5 | 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        bayz bayz2 = (bayz) o.b;
        auuy auuy2 = (auuy) o2.i();
        auuy2.getClass();
        bayz2.d = auuy2;
        bayz2.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        bayz bayz3 = (bayz) o.i();
        aucd o3 = amgy.c.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        amgy amgy = (amgy) o3.b;
        bayz3.getClass();
        amgy.b = bayz3;
        amgy.a |= 2;
        return (amgy) o3.i();
    }
}
