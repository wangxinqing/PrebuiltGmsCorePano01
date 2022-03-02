package defpackage;

import android.os.Build;

/* renamed from: qj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qj {
    public final qm a;

    public qj() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new ql();
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.a = new qk();
        } else {
            this.a = new qm();
        }
    }

    public qj(qn qnVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new ql(qnVar);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        this.a = new qk(qnVar);
    }
}
