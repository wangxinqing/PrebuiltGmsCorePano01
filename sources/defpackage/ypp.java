package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ypp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ypp extends ypo {
    public final TextView a = ((TextView) findViewById(R.id.audience_selection_circle_name));
    public View.OnClickListener b;
    public boolean c;

    public void onClick(View view) {
        super.onClick(view);
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public ypp(Context context) {
        super(context, (AttributeSet) null);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.plus_audience_selection_list_update_circle, this, true);
        findViewById(R.id.audience_selection_update_circle_view).setOnClickListener(this);
        this.e = (CheckBox) findViewById(R.id.audience_selection_checkbox);
        this.e.setOnCheckedChangeListener(this);
        this.e.setOnClickListener(this);
        int i = Build.VERSION.SDK_INT;
        if (jjy.a()) {
            this.c = true;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((LinearLayout) this.e.getParent()).getLayoutParams();
        if (this.c) {
            layoutParams.addRule(9, -1);
        } else {
            layoutParams.addRule(11, -1);
        }
        ((LinearLayout) this.e.getParent()).setLayoutParams(layoutParams);
    }
}
