package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: qq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qq {
    final Object a;

    public qq(Object obj) {
        this.a = obj;
    }

    public static qq a(int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return new qq(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
