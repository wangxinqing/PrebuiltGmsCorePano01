package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public NavigationBar(Context context) {
        super(a(context));
        a();
    }

    public void onClick(View view) {
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(a(context), attributeSet);
        a();
    }

    private static Context a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.suwNavBarTheme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] > fArr2[2]) {
                resourceId = R.style.SuwNavBarThemeDark;
            } else {
                resourceId = R.style.SuwNavBarThemeLight;
            }
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(a(context), attributeSet, i);
        a();
    }

    private final void a() {
        View.inflate(getContext(), R.layout.suw_navbar_view, this);
        Button button = (Button) findViewById(R.id.suw_navbar_next);
        Button button2 = (Button) findViewById(R.id.suw_navbar_back);
        Button button3 = (Button) findViewById(R.id.suw_navbar_more);
    }
}
