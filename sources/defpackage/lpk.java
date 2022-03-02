package defpackage;

import com.google.android.gms.R;

/* renamed from: lpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lpk implements Runnable {
    final /* synthetic */ lpq a;

    public lpk(lpq lpq) {
        this.a = lpq;
    }

    public final void run() {
        if (this.a.j.a(0) != R.layout.drive_file_list_loading_spinner) {
            this.a.m.a(true);
        }
    }
}
