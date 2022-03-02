package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: qt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class qt extends AccessibilityNodeProvider {
    final qv a;

    public qt(qv qvVar) {
        this.a = qvVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        qs a2 = this.a.a(i);
        if (a2 != null) {
            return a2.a;
        }
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.a(i, i2, bundle);
    }
}
