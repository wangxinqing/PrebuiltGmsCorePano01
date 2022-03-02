package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: oz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class oz {
    private static final View.AccessibilityDelegate b = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate c;

    public oz() {
        this(b);
    }

    static List b(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public qv a(View view) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = this.c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new qv(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public oz(View.AccessibilityDelegate accessibilityDelegate) {
        this.c = accessibilityDelegate;
        this.a = new oy(this);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, int i) {
        this.c.sendAccessibilityEvent(view, i);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void a(View view, qs qsVar) {
        this.c.onInitializeAccessibilityNodeInfo(view, qsVar.a);
    }

    public boolean a(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List b2 = b(view);
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            qp qpVar = (qp) b2.get(i2);
            if (qpVar.a() != i) {
                i2++;
            } else if (qpVar.n != null) {
                Class cls = qpVar.m;
                if (cls != null) {
                    try {
                        qx qxVar = (qx) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        Class cls2 = qpVar.m;
                        String name = cls2 != null ? cls2.getName() : "null";
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    }
                }
                z = qpVar.n.a(view);
            }
        }
        z = false;
        if (!z) {
            int i3 = Build.VERSION.SDK_INT;
            z = this.c.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        ClickableSpan[] c2 = qs.c(view.createAccessibilityNodeInfo().getText());
        int i5 = 0;
        while (c2 != null && i5 < c2.length) {
            if (!clickableSpan.equals(c2[i5])) {
                i5++;
            } else {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
