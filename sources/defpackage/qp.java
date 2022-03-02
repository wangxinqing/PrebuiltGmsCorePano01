package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qp {
    public static final qp a = new qp(16, (CharSequence) null);
    public static final qp b = new qp((int) FragmentTransaction.TRANSIT_ENTER_MASK, (CharSequence) null);
    public static final qp c = new qp((int) FragmentTransaction.TRANSIT_EXIT_MASK, (CharSequence) null);
    public static final qp d = new qp(262144, (CharSequence) null);
    public static final qp e = new qp(524288, (CharSequence) null);
    public static final qp f = new qp(1048576, (CharSequence) null);
    public static final qp g = new qp(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (rf) null, (Class) null);
    public static final qp h = new qp(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (rf) null, (Class) null);
    public static final qp i;
    public static final qp j;
    final Object k;
    public final int l;
    public final Class m;
    public final rf n;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11 = null;
        new qp(1, (CharSequence) null);
        new qp(2, (CharSequence) null);
        new qp(4, (CharSequence) null);
        new qp(8, (CharSequence) null);
        new qp(32, (CharSequence) null);
        new qp(64, (CharSequence) null);
        new qp(128, (CharSequence) null);
        new qp((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, qy.class);
        new qp(512, qy.class);
        new qp(1024, qz.class);
        new qp(2048, qz.class);
        new qp(16384, (CharSequence) null);
        new qp(32768, (CharSequence) null);
        new qp(65536, (CharSequence) null);
        new qp(131072, rd.class);
        new qp(2097152, re.class);
        new qp(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (rf) null, (Class) null);
        new qp(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (rf) null, rb.class);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction = null;
        }
        i = new qp(accessibilityAction, 16908346, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction2 = null;
        }
        j = new qp(accessibilityAction2, 16908347, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction3 = null;
        }
        new qp(accessibilityAction3, 16908358, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction4 = null;
        }
        new qp(accessibilityAction4, 16908359, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction5 = null;
        }
        new qp(accessibilityAction5, 16908360, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 29) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new qp(accessibilityAction6, 16908361, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction7 = null;
        }
        new qp(accessibilityAction7, 16908348, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction8 = null;
        }
        new qp(accessibilityAction8, 16908349, (CharSequence) null, (rf) null, rc.class);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction9 = null;
        }
        new qp(accessibilityAction9, 16908354, (CharSequence) null, (rf) null, ra.class);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction10 = null;
        }
        new qp(accessibilityAction10, 16908356, (CharSequence) null, (rf) null, (Class) null);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        }
        new qp(accessibilityAction11, 16908357, (CharSequence) null, (rf) null, (Class) null);
    }

    public qp(int i2, CharSequence charSequence) {
        this((Object) null, i2, charSequence, (rf) null, (Class) null);
    }

    public final int a() {
        int i2 = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.k).getId();
    }

    public final CharSequence b() {
        int i2 = Build.VERSION.SDK_INT;
        return ((AccessibilityNodeInfo.AccessibilityAction) this.k).getLabel();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        Object obj2 = this.k;
        if (obj2 != null) {
            if (obj2.equals(qpVar.k)) {
                return true;
            }
            return false;
        } else if (qpVar.k != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.k;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private qp(int i2, Class cls) {
        this((Object) null, i2, (CharSequence) null, (rf) null, cls);
    }

    public qp(Object obj, int i2, CharSequence charSequence, rf rfVar, Class cls) {
        this.l = i2;
        this.n = rfVar;
        int i3 = Build.VERSION.SDK_INT;
        this.k = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.m = cls;
    }
}
