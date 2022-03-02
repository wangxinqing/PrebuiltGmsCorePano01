package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: hcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hcr {
    private static final iwd a = gzk.a("ManagingAppModule");

    static amri a(Context context) {
        jnl a2 = jnl.a();
        String e = a2.e(context);
        if (e != null) {
            return amri.b(a(context, e));
        }
        String d = a2.d(context);
        return d != null ? amri.b(a(context, d)) : ampu.a;
    }

    private static amri a(Context context, String str, String str2) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray();
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(byteArray, 0, byteArray.length);
                return amri.b(instance.digest());
            } catch (NoSuchAlgorithmException e) {
                a.f("no support for %s?", e, str2);
                return ampu.a;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            a.e("package info for managing app not found:%s.", e2, e2.getMessage());
            return ampu.a;
        }
    }

    private static gzv a(Context context, String str) {
        aucd o = gzv.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzv gzv = (gzv) o.b;
        str.getClass();
        gzv.a |= 1;
        gzv.b = str;
        amri a2 = a(context, str, "SHA1");
        if (a2.a()) {
            auay a3 = auay.a((byte[]) a2.b());
            if (o.c) {
                o.c();
                o.c = false;
            }
            gzv gzv2 = (gzv) o.b;
            a3.getClass();
            gzv2.a |= 2;
            gzv2.c = a3;
        }
        amri a4 = a(context, str, "SHA256");
        if (a4.a()) {
            auay a5 = auay.a((byte[]) a4.b());
            if (o.c) {
                o.c();
                o.c = false;
            }
            gzv gzv3 = (gzv) o.b;
            a5.getClass();
            gzv3.a |= 4;
            gzv3.d = a5;
        }
        return (gzv) o.i();
    }
}
