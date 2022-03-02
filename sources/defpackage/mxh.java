package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.gms.R;

/* renamed from: mxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mxh implements Runnable {
    final /* synthetic */ Context a;

    public mxh(Context context) {
        this.a = context;
    }

    public final void run() {
        Context context = this.a;
        Toast toast = new Toast(context.getApplicationContext());
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.gf_thank_you_toast, (ViewGroup) null);
        toast.setGravity(119, 0, 0);
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
        if (inflate != null) {
            inflate.setOnTouchListener(new mxi(toast));
        }
    }
}
