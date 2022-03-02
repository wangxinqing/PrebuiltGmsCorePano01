package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: aoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoo extends aoq {
    public aor a;

    public aoo(Context context, Uri uri) {
        super(context, uri);
        this.a.b();
    }

    /* access modifiers changed from: protected */
    public final aov a() {
        if (a(aoa.c)) {
            return new aou(this.b, aoa.c);
        }
        if (a(aoa.b)) {
            return new aou(this.b, aoa.b);
        }
        if (a(aoa.a)) {
            return new aos(this.b, aoa.a);
        }
        return null;
    }

    public final void a(aov aov) {
        this.a = (aor) aov;
    }
}
