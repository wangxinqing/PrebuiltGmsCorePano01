package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;

/* renamed from: qnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qnc implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ qnd c;

    public qnc(qnd qnd, boolean z, Intent intent) {
        this.c = qnd;
        this.a = z;
        this.b = intent;
    }

    public void onClick(View view) {
        String str;
        if (this.a) {
            try {
                this.c.startActivity(this.b);
            } catch (ActivityNotFoundException e) {
                qnd.a.a(e);
            }
        }
        qnf qnf = this.c.f;
        if (!this.a) {
            str = "SetupFailureFragment.Cancel";
        } else {
            str = "SetupFailureFragment.OpenInWeb";
        }
        qnf.a(str);
        this.c.f.h();
    }
}
