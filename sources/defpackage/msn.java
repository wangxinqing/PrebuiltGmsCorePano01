package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: msn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msn implements Runnable {
    private final mta a;
    private final uaj b;

    public msn(mta mta, uaj uaj) {
        this.a = mta;
        this.b = uaj;
    }

    public final void run() {
        mta mta = this.a;
        uaj uaj = this.b;
        View view = mta.e;
        if (view == null || mta.f == null) {
            ((anih) ((anih) mte.a.c()).a("mta", "a", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: UpdateHeader but view is null.");
            return;
        }
        ((ImageView) view.findViewById(R.id.icon)).setImageBitmap(mru.a(uaj));
        mta.f.setText(uaj.h);
    }
}
