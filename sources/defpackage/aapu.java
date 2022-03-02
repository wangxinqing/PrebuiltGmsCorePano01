package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* renamed from: aapu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aapu extends jna {
    public aapu(View view) {
        super(view);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int dimension = (int) view.getResources().getDimension(R.dimen.warning_icon_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.icon_frame);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(linearLayout.getLayoutParams());
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
    }

    public final void a(jmt jmt) {
        super.a((aapw) jmt);
    }
}
