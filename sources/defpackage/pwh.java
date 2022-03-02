package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: pwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pwh extends put {
    final /* synthetic */ pwi a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pwh(pwi pwi, String str) {
        super(str);
        this.a = pwi;
    }

    /* access modifiers changed from: protected */
    public final Context a() {
        return this.a.getActivity();
    }

    /* access modifiers changed from: protected */
    public final View b() {
        return this.a.a;
    }

    /* access modifiers changed from: protected */
    public final View c() {
        return this.a.b;
    }

    /* access modifiers changed from: protected */
    public final TextView d() {
        return this.a.c;
    }
}
