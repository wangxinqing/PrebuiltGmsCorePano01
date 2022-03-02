package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: akxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxr {
    public final icc a;
    public aklh b = null;
    public boolean c = false;
    public boolean d = false;
    public final rfj e;
    private final Context f;
    private final Intent g;

    public akxr(Context context, icc icc, rfj rfj) {
        this.f = context;
        this.a = icc;
        this.e = rfj;
        Intent intent = new Intent("com.google.android.places.signals.action.activity_recognition");
        this.g = intent;
        intent.setPackage("com.google.android.gms");
    }

    public final void a() {
        a(false);
    }

    public final PendingIntent b() {
        return PendingIntent.getBroadcast(this.f, 0, this.g, 134217728);
    }

    public final void a(boolean z) {
        if (!this.d) {
            return;
        }
        if (this.c) {
            this.a.e();
            icc icc = this.a;
            icc.a((ica) new akxq(this, icc, z));
        } else if (z) {
            this.a.g();
        }
    }
}
