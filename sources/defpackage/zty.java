package defpackage;

import android.content.Context;

/* renamed from: zty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class zty {
    public final Context a;
    protected final zvd b;
    protected final zsc c;
    protected final ztj d;

    static {
        zsg.a("ContactsDataLogger");
    }

    protected zty(Context context, zvd zvd, zsc zsc, ztj ztj) {
        this.a = context;
        this.b = zvd;
        this.c = zsc;
        this.d = ztj;
    }

    protected static final void a(zuk zuk, byte[] bArr, String str, ztj ztj) {
        int b2 = (int) azdq.a.a().b();
        if (zuk.e) {
            b2 = (int) azdq.a.a().y();
        }
        ztj.a(str, bArr, b2);
    }

    protected static final boolean a(byte[] bArr, String str, ztj ztj) {
        ztj.a(str, bArr, (int) azdq.a.a().D());
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(zuk zuk, byte[] bArr, String str) {
        a(zuk, bArr, str, this.d);
        return true;
    }
}
