package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: yrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrm extends Loader implements ica, icb {
    public final String a;
    public PeopleFeed b;
    private final yui c;
    private yuv d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yrm(Context context, String str, String str2, String str3, int i2, int i3, String str4) {
        super(context);
        yui yui = yuv.a;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i2;
        this.i = i3;
        this.a = str4;
        this.c = yui;
    }

    public final void a(int i2) {
        if (isStarted()) {
            onStartLoading();
        }
    }

    public final void g(Bundle bundle) {
        a(this.d);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        if (this.d.l()) {
            a(this.d);
        } else {
            this.d.t();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.d == null) {
            Context context = getContext();
            ywh ywh = new ywh(context);
            ywh.a = this.g;
            ywh.a("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.me");
            ywh.d = new String[]{"service_googleme"};
            ywh.c = this.f;
            ywh.e = this.e;
            this.d = this.c.a(context, ywh.a(), this, this);
        }
        PeopleFeed peopleFeed = this.b;
        if (peopleFeed != null) {
            deliverResult(peopleFeed);
        }
        if (takeContentChanged() || this.b == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        yuv yuv = this.d;
        if (yuv != null && yuv.l()) {
            this.d.j();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        deliverResult((Object) null);
    }

    /* access modifiers changed from: protected */
    public final void a(yuv yuv) {
        yuv.a(this, this.h, this.i, this.a);
    }
}
