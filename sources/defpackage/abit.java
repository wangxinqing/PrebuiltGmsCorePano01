package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: abit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abit implements View.OnClickListener {
    private final abiv a;
    private final String b;
    private final View c;

    public abit(abiv abiv, String str, View view) {
        this.a = abiv;
        this.b = str;
        this.c = view;
    }

    public void onClick(View view) {
        abiv abiv = this.a;
        String str = this.b;
        View view2 = this.c;
        PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(abiv.a).inflate(R.layout.custom_tooltip, (ViewGroup) null), -2, -2);
        ((TextView) popupWindow.getContentView().findViewById(R.id.source_context)).setText(str);
        popupWindow.getContentView().measure(0, 0);
        rw.a(popupWindow, true);
        int dimensionPixelOffset = abiv.a.getResources().getDimensionPixelOffset(R.dimen.entry_icon_size) + abiv.a.getResources().getDimensionPixelOffset(R.dimen.communicate_card_entry_padding) + abiv.a.getResources().getDimensionPixelOffset(R.dimen.custom_tooltip_padding);
        int measuredWidth = dimensionPixelOffset - popupWindow.getContentView().getMeasuredWidth();
        if (((AccessibilityManager) abiv.b.getContext().getSystemService("accessibility")).isEnabled()) {
            popupWindow.setFocusable(true);
        } else {
            popupWindow.setOutsideTouchable(true);
        }
        popupWindow.showAsDropDown(view2, measuredWidth, dimensionPixelOffset);
    }
}
