package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: qu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qu extends qt {
    public qu(qv qvVar) {
        super(qvVar);
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        qs b = this.a.b(i);
        if (b != null) {
            return b.a;
        }
        return null;
    }
}
