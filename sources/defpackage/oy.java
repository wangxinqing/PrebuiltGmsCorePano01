package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oy extends View.AccessibilityDelegate {
    final oz a;

    public oy(oz ozVar) {
        this.a = ozVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        qv a2 = this.a.a(view);
        if (a2 != null) {
            return (AccessibilityNodeProvider) a2.a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        View view2 = view;
        qs a2 = qs.a(accessibilityNodeInfo);
        boolean G = qb.G(view);
        if (Build.VERSION.SDK_INT >= 28) {
            a2.a.setScreenReaderFocusable(G);
        } else {
            a2.a(1, G);
        }
        Boolean bool = (Boolean) qb.a().b(view2);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            a2.a.setHeading(z);
        } else {
            a2.a(2, z);
        }
        CharSequence H = qb.H(view);
        if (Build.VERSION.SDK_INT >= 28) {
            a2.a.setPaneTitle(H);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            a2.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", H);
        }
        this.a.a(view2, a2);
        CharSequence text = accessibilityNodeInfo.getText();
        int i3 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 26) {
            int i4 = Build.VERSION.SDK_INT;
            a2.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            a2.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            a2.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            a2.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray a3 = qs.a(view);
            if (a3 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < a3.size(); i5++) {
                    if (((WeakReference) a3.valueAt(i5)).get() == null) {
                        arrayList.add(Integer.valueOf(i5));
                    }
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    a3.remove(((Integer) arrayList.get(i6)).intValue());
                }
            }
            ClickableSpan[] c = qs.c(text);
            if (c != null && c.length > 0) {
                a2.j().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray a4 = qs.a(view);
                if (a4 == null) {
                    a4 = new SparseArray();
                    view2.setTag(R.id.tag_accessibility_clickable_spans, a4);
                }
                for (int i7 = 0; i7 < c.length; i7++) {
                    ClickableSpan clickableSpan = c[i7];
                    int i8 = 0;
                    while (true) {
                        if (i8 < a4.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) a4.valueAt(i8)).get())) {
                                i = a4.keyAt(i8);
                                break;
                            }
                            i8++;
                        } else {
                            i = qs.d;
                            qs.d = i + 1;
                            break;
                        }
                    }
                    a4.put(i, new WeakReference(c[i7]));
                    ClickableSpan clickableSpan2 = c[i7];
                    Spanned spanned = (Spanned) text;
                    a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    a2.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List b = oz.b(view);
        for (int i9 = 0; i9 < b.size(); i9++) {
            a2.a((qp) b.get(i9));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.a.a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }
}
