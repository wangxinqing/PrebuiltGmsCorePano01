package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: ptq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ptq {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final Context d;

    public ptq(Context context, View view) {
        this.d = context;
        this.a = (TextView) view.findViewById(R.id.app_name);
        this.b = (TextView) view.findViewById(R.id.app_size);
        this.c = (ImageView) view.findViewById(R.id.app_icon);
    }
}
