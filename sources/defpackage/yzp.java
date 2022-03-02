package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: yzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzp extends yzn implements View.OnClickListener, ica, icb {
    final yzo i = new yzo(this);
    private final yui j;
    private final yuv k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yzp(Context context, int i2, int i3, String str) {
        super(context, i2, i3, str);
        yui yui = yuv.a;
        ywh ywh = new ywh(context);
        ywh.b();
        PlusSession a = ywh.a();
        this.j = yui;
        yuv a2 = yui.a(context, a, this, this);
        this.k = a2;
        a2.a((ica) this);
        this.k.a((icb) this);
        a(this.k);
    }

    public final void a(int i2) {
    }

    public final void g(Bundle bundle) {
        String str = this.g;
        if (str != null) {
            this.k.a((yup) this.i, str);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yuv yuv = this.k;
        if (yuv != null && !yuv.l() && !this.k.m()) {
            this.k.t();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yuv yuv = this.k;
        if (yuv == null) {
            return;
        }
        if (yuv.l() || this.k.m()) {
            this.k.j();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        int i2 = connectionResult.c;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Failed to establish connection with status: ");
        sb.append(i2);
        Log.w("PlusOneButtonView", sb.toString());
        b();
    }
}
