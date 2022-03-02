package defpackage;

import android.content.Context;

/* renamed from: nvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nvz extends qwf {
    private nvx a;

    public final int a(qxz qxz) {
        this.a.a();
        return 0;
    }

    public final void onCreate() {
        super.onCreate();
        this.a = new nvx(this, new nvy(this, qwq.a((Context) this)));
    }

    public final void onDestroy() {
        super.onDestroy();
        nvx.c();
    }
}
