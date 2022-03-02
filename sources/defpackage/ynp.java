package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;

/* renamed from: ynp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynp extends Loader implements ica, icb {
    public ConnectionResult a;
    public MomentsFeed b;
    private final yui c;
    private yuv d;
    private final Account e;
    private final String f;
    private final String g;
    private final int h;
    private final String i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ynp(Context context, Account account, String str, String str2, int i2, String str3) {
        super(context);
        yui yui = yuv.a;
        this.e = account;
        this.f = str;
        this.g = str2;
        this.h = i2;
        this.i = str3;
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
            this.d = ymb.a(this.c, getContext(), this, this, this.e.name);
        }
        MomentsFeed momentsFeed = this.b;
        if (momentsFeed != null) {
            deliverResult(momentsFeed);
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
        this.a = connectionResult;
        deliverResult((Object) null);
    }

    /* access modifiers changed from: protected */
    public final void a(yuv yuv) {
        String str = this.g;
        if (str == null) {
            String str2 = this.f;
            if (str2 == null) {
                str2 = "all";
            }
            yuv.b(this, str2, this.h, this.i);
            return;
        }
        yuv.a(this, str, this.h, this.i);
    }
}
