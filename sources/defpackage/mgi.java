package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: mgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mgi implements View.OnClickListener {
    private final Activity a;

    public mgi(Activity activity) {
        this.a = activity;
    }

    public void onClick(View view) {
        this.a.onBackPressed();
    }
}
