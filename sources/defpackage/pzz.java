package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: pzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pzz implements amrm {
    static final amrm a = new pzz();

    private pzz() {
    }

    public final boolean a(Object obj) {
        qab qab = qac.a;
        PackageManager packageManager = ((Context) obj).getPackageManager();
        return ((Boolean) pzu.a.c()).booleanValue() && jkr.e() && (packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
    }
}
