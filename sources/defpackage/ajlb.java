package defpackage;

import com.android.volley.Response;
import java.util.HashMap;

/* renamed from: ajlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajlb extends iys {
    final /* synthetic */ byte[] f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajlb(int i, String str, Class cls, Object obj, Response.Listener listener, Response.ErrorListener errorListener, String str2, String str3, boolean z, HashMap hashMap, int i2, int i3, byte[] bArr) {
        super(i, str, (String) null, cls, obj, listener, errorListener, str2, str3, z, hashMap, i2, i3);
        this.f = bArr;
    }

    public final byte[] getBody() {
        return this.f;
    }
}
