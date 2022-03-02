package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* renamed from: yte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yte extends Loader implements ica, icb, yum {
    public ConnectionResult a;
    public String b;
    private yuv c;
    private ile d;
    private final ArrayList e = new ArrayList();
    private final yui f;
    private final Account g;
    private final int h;
    private final String i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yte(Context context, Account account, int i2, String str) {
        super(context);
        yui yui = yuv.a;
        this.g = account;
        this.h = i2;
        this.i = str;
        this.f = yui;
    }

    public final void a() {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ile) this.e.get(i2)).c();
        }
        this.e.clear();
    }

    public final void g(Bundle bundle) {
        a(this.c);
    }

    /* access modifiers changed from: protected */
    public final void onForceLoad() {
        super.onForceLoad();
        if (this.c.l()) {
            a(this.c);
        } else {
            this.c.t();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        ile ile = this.d;
        if (ile != null) {
            ile.c();
            a();
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.c == null) {
            this.c = ymb.b(this.f, getContext(), this, this, this.g.name);
        }
        ile ile = this.d;
        if (ile != null) {
            deliverResult(ile);
        }
        if (takeContentChanged() || this.d == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        yuv yuv = this.c;
        if (yuv != null && yuv.l()) {
            this.c.j();
        }
    }

    public final void a(int i2) {
        if (isStarted()) {
            onStartLoading();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        a(connectionResult, (ile) null);
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult, ile ile) {
        this.a = connectionResult;
        deliverResult(ile);
    }

    public final void a(ConnectionResult connectionResult, yxj yxj, String str) {
        this.b = str;
        a(connectionResult, yxj);
    }

    /* renamed from: a */
    public final void deliverResult(ile ile) {
        if (!isReset()) {
            ile ile2 = this.d;
            this.d = ile;
            if (isStarted()) {
                super.deliverResult(ile);
            }
            if (ile2 != null && ile2 != ile) {
                this.e.add(ile2);
                a();
            }
        } else if (ile != null) {
            ile.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(yuv yuv) {
        yuv.a((yum) this, this.h, this.i);
    }
}
