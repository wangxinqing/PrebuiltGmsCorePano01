package defpackage;

import android.text.TextUtils;

/* renamed from: xva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xva {
    public final xuz a;
    public String b;
    public boolean c;

    protected xva(xuz xuz, String str) {
        this.a = xuz;
        this.b = str;
    }

    public abstract Object a();

    /* access modifiers changed from: protected */
    public final void a(String str) {
        this.b = str;
        this.c = TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        iva.a(!this.c);
    }
}
