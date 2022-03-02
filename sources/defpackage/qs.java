package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qs {
    public static int d = 0;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    private qs(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static final SparseArray a(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] c(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    @Deprecated
    public final void b(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void d(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void e(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qs)) {
            qs qsVar = (qs) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (accessibilityNodeInfo != null) {
                if (!accessibilityNodeInfo.equals(qsVar.a)) {
                    return false;
                }
            } else if (qsVar.a != null) {
                return false;
            }
            return this.c == qsVar.c && this.b == qsVar.b;
        }
    }

    public final void f(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final CharSequence g() {
        return this.a.getClassName();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo != null) {
            return accessibilityNodeInfo.hashCode();
        }
        return 0;
    }

    public final CharSequence i() {
        return this.a.getContentDescription();
    }

    public final Bundle j() {
        int i = Build.VERSION.SDK_INT;
        return this.a.getExtras();
    }

    public final void k() {
        this.a.setFocusable(true);
    }

    public final String toString() {
        List list;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(g());
        sb.append("; text: ");
        sb.append(h());
        sb.append("; contentDescription: ");
        sb.append(i());
        sb.append("; viewId: ");
        int i = Build.VERSION.SDK_INT;
        sb.append(this.a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(b());
        sb.append("; focusable: ");
        sb.append(c());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(d());
        sb.append("; password: ");
        sb.append(e());
        sb.append("; scrollable: " + f());
        sb.append("; [");
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList != null) {
            list = new ArrayList();
            int size = actionList.size();
            for (int i4 = 0; i4 < size; i4++) {
                list.add(new qp(actionList.get(i4), 0, (CharSequence) null, (rf) null, (Class) null));
            }
        } else {
            list = Collections.emptyList();
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            qp qpVar = (qp) list.get(i5);
            int a2 = qpVar.a();
            if (a2 == 1) {
                str = "ACTION_FOCUS";
            } else if (a2 != 2) {
                switch (a2) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case FragmentTransaction.TRANSIT_ENTER_MASK:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case FragmentTransaction.TRANSIT_EXIT_MASK:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a2) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a2) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && qpVar.b() != null) {
                str = qpVar.b().toString();
            }
            sb.append(str);
            if (i5 != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static qs a() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void c(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void d(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void e(boolean z) {
        this.a.setScrollable(z);
    }

    public final void f(boolean z) {
        int i = Build.VERSION.SDK_INT;
        this.a.setDismissable(z);
    }

    public final CharSequence h() {
        if (a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.a.getText();
        }
        List a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < a2.size(); i++) {
            spannableString.setSpan(new qo(((Integer) a5.get(i)).intValue(), this, j().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue(), ((Integer) a4.get(i)).intValue());
        }
        return spannableString;
    }

    public static qs a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new qs(accessibilityNodeInfo);
    }

    public final void b(Object obj) {
        int i = Build.VERSION.SDK_INT;
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((qr) obj).a);
    }

    public final void c(boolean z) {
        this.a.setClickable(z);
    }

    public final void d(boolean z) {
        this.a.setEnabled(z);
    }

    public final boolean e() {
        return this.a.isPassword();
    }

    public final boolean f() {
        return this.a.isScrollable();
    }

    public final List a(String str) {
        int i = Build.VERSION.SDK_INT;
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void b(qp qpVar) {
        int i = Build.VERSION.SDK_INT;
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) qpVar.k);
    }

    public final boolean c() {
        return this.a.isFocusable();
    }

    public final boolean d() {
        return this.a.isEnabled();
    }

    public final void b(boolean z) {
        int i = Build.VERSION.SDK_INT;
        this.a.setAccessibilityFocused(z);
    }

    public final boolean b() {
        return this.a.isChecked();
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final void a(int i, boolean z) {
        Bundle j = j();
        if (j != null) {
            int i2 = j.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            j.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    public final void a(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void a(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void a(Object obj) {
        int i = Build.VERSION.SDK_INT;
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) (obj != null ? ((qq) obj).a : null));
    }

    public final void a(qp qpVar) {
        int i = Build.VERSION.SDK_INT;
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) qpVar.k);
    }

    public final void a(boolean z) {
        this.a.setCheckable(z);
    }
}
