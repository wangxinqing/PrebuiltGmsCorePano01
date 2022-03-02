package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: qr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qr {
    final Object a;

    public qr(Object obj) {
        this.a = obj;
    }

    public static qr a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = Build.VERSION.SDK_INT;
        return new qr(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
