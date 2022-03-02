package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;

/* renamed from: qmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmr implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ qms c;

    public qmr(qms qms, boolean z, Intent intent) {
        this.c = qms;
        this.a = z;
        this.b = intent;
    }

    public void onClick(View view) {
        String str;
        if (this.a) {
            try {
                this.c.startActivity(this.b);
            } catch (ActivityNotFoundException e) {
                qms.a.a(e);
            }
        }
        qnf qnf = this.c.f;
        if (!this.a) {
            str = "RestoreSupervisorFragment.Cancel";
        } else {
            str = "RestoreSupervisorFragment.OpenInWeb";
        }
        qnf.a(str);
        this.c.e.i();
    }
}
