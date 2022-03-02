package defpackage;

import android.content.Context;

/* renamed from: isq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class isq {
    private final String a;
    private final hya b;
    private Boolean c;

    public isq(String str) {
        hya a2 = hya.a((Context) ihs.b());
        this.a = str;
        this.b = a2;
    }

    public final boolean a() {
        if (this.c == null) {
            this.c = Boolean.valueOf(this.b.b(this.a));
        }
        return this.c.booleanValue();
    }

    public final void b() {
        if (!a()) {
            throw new SecurityException(String.valueOf(this.a).concat(" is not authorized"));
        }
    }
}
