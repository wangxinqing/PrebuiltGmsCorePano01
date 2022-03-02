package defpackage;

import android.content.Context;

/* renamed from: upd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upd implements Runnable {
    private final upf a;
    private final Context b;

    public upd(upf upf, Context context) {
        this.a = upf;
        this.b = context;
    }

    public final void run() {
        arzk.a((Runnable) new upe(this.a, this.b), "RestoreDeviceName", new arzi(aymi.a.a().v()).a());
    }
}
