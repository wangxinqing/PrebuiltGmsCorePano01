package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: aahm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aahm extends isy {
    private final String a;

    public aahm(Context context, Looper looper, int i, ise ise, iea iea, igg igg, aafk aafk) {
        super(context, looper, i, ise, iea, igg);
        this.a = aafk != null ? aafk.a : null;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.icing.INDEX_SERVICE";
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle f = super.f();
        f.putString("ComponentName", this.a);
        return f;
    }
}
