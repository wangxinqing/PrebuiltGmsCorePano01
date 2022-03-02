package defpackage;

import android.content.Context;

/* renamed from: asbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asbh extends asay {
    private final asbo g;

    public asbh(Context context, asfj asfj) {
        super(context, asfj);
        this.g = (asbo) thl.a(context, asbo.class);
    }

    /* access modifiers changed from: protected */
    public final ashv a(asfs asfs) {
        return this.g.b(asfs);
    }

    /* access modifiers changed from: protected */
    public final void a(ashv ashv) {
        if (ashv instanceof asbn) {
            this.g.c((asbn) ashv);
        } else {
            ((anih) ((anih) asil.a.b()).a("asbh", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected connection to release from BleGattConnect: %s", (Object) ashv);
        }
    }
}
