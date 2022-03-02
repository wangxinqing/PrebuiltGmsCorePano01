package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: ygc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygc {
    public static avsu a(Context context, String str, String str2, int i, boolean z) {
        Intent intent = new Intent("com.google.android.gms.phenotype.UPDATE");
        if (ayzr.a.a().b()) {
            intent.setFlags(32);
        }
        intent.setPackage(str2);
        if (!ayzr.a.a().c()) {
            intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
        } else {
            String a = ygb.a(str);
            if ((ygb.c(a).a & 2) != 0) {
                intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", a);
                int indexOf = str.indexOf(35);
                if (indexOf != -1) {
                    String substring = str.substring(indexOf + 1);
                    if (!TextUtils.isEmpty(substring)) {
                        intent.putExtra("com.google.android.gms.phenotype.SUBPACKAGE_NAME", substring);
                    }
                }
            } else {
                intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
            }
        }
        intent.putExtra("com.google.android.gms.phenotype.UPDATE_REASON", i);
        if (z) {
            intent.putExtra("com.google.android.gms.phenotype.URGENT", true);
        }
        context.sendBroadcast(intent);
        if (!ayzv.a.a().f()) {
            return null;
        }
        aucd o = avsu.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avsu avsu = (avsu) o.b;
        str.getClass();
        int i2 = avsu.a | 1;
        avsu.a = i2;
        avsu.b = str;
        str2.getClass();
        int i3 = i2 | 2;
        avsu.a = i3;
        avsu.c = str2;
        int i4 = i3 | 4;
        avsu.a = i4;
        avsu.d = i;
        avsu.a = i4 | 8;
        avsu.e = z;
        return (avsu) o.i();
    }
}
