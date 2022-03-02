package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: pvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pvw {
    public final TextView a;
    public final TextView b;
    public final ImageView c;

    public pvw(View view) {
        this.a = (TextView) view.findViewById(R.id.app_name);
        this.b = (TextView) view.findViewById(R.id.app_package_name);
        this.c = (ImageView) view.findViewById(R.id.app_icon);
    }
}
