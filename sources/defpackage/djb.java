package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: djb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class djb implements amsv {
    private final dje a;

    public djb(dje dje) {
        this.a = dje;
    }

    public final Object a() {
        Context context = this.a.c;
        String[] strArr = dje.a;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                return context.getPackageManager().getPackageInfo(strArr[i], 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                i++;
            }
        }
        return null;
    }
}
