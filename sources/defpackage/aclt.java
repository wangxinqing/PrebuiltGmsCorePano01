package defpackage;

import com.google.android.gms.R;

/* renamed from: aclt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aclt implements Runnable {
    final /* synthetic */ acly a;

    public aclt(acly acly) {
        this.a = acly;
    }

    public final void run() {
        this.a.d();
        this.a.b.e();
        acly acly = this.a;
        acly.d.a((CharSequence) acly.getString(R.string.common_no_devices_found));
        this.a.a(false);
        this.a.e.a(0);
    }
}
