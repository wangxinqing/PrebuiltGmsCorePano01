package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* renamed from: ypm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ypm extends RelativeLayout {
    public ypm(Context context, View.OnClickListener onClickListener) {
        super(context, (AttributeSet) null);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.plus_audience_selection_list_create_circle, this, true);
        if (onClickListener != null) {
            findViewById(R.id.audience_selection_create_circle_view).setOnClickListener(onClickListener);
        }
    }
}
