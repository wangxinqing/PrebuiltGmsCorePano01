package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public Button a;
    public Button b;
    private aljq c;

    public NavigationBar(Context context) {
        super(a(context));
        a();
    }

    public void onClick(View view) {
        aljq aljq = this.c;
        if (aljq == null) {
            return;
        }
        if (view == this.b) {
            aljq.aL();
        } else if (view == this.a) {
            aljq.a();
        }
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(a(context), attributeSet);
        a();
    }

    private static Context a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudNavBarTheme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] > fArr2[2]) {
                resourceId = R.style.SudNavBarThemeDark;
            } else {
                resourceId = R.style.SudNavBarThemeLight;
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
        View.inflate(getContext(), R.layout.sud_navbar_view, this);
        this.a = (Button) findViewById(R.id.sud_navbar_next);
        this.b = (Button) findViewById(R.id.sud_navbar_back);
        Button button = (Button) findViewById(R.id.sud_navbar_more);
    }

    public final void a(aljq aljq) {
        this.c = aljq;
        if (aljq != null) {
            this.b.setOnClickListener(this);
            this.a.setOnClickListener(this);
        }
    }
}
