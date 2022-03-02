package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: adhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhc extends View.AccessibilityDelegate {
    final /* synthetic */ adhe a;
    private final CheckBox b;

    public adhc(adhe adhe, CheckBox checkBox) {
        this.a = adhe;
        this.b = checkBox;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        view.addChildrenForAccessibility(arrayList);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) arrayList.get(i2);
            if (view2 instanceof TextView) {
                sb.append(((TextView) view2).getText());
                sb.append(" ");
            }
        }
        Fragment fragment = this.a.c;
        if (!this.b.isChecked()) {
            i = R.string.udc_expand_content_description;
        } else {
            i = R.string.udc_collapse_content_description;
        }
        sb.append(fragment.getString(i));
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }
}
