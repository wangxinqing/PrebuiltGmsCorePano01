package defpackage;

import android.content.Context;

/* renamed from: thj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class thj extends thi {
    public thj(Context context, String str, String str2) {
        super(context, str, str2);
    }

    /* access modifiers changed from: protected */
    public final audx b(byte[] bArr) {
        try {
            return ((audx) a()).av().a(bArr).i();
        } catch (auda e) {
            anih anih = (anih) tgb.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("thj", "b", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to merge proto, bytes length=%s", bArr.length);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return ((audx) a()).av().a(bArr).i();
        } catch (auda e) {
            anih anih = (anih) tgb.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("thj", "b", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to merge proto, bytes length=%s", bArr.length);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] c(audx audx) {
        try {
            return audx.k();
        } catch (OutOfMemoryError e) {
            anih anih = (anih) tgb.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("thj", "a", 26, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert proto to bytes");
            return null;
        }
    }
}
