package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: sdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sdz implements aoqb {
    public final Context a;
    public final ahdg b;
    private final aoru c;

    public sdz(Context context, aoru aoru, ahdg ahdg) {
        this.a = context;
        this.c = aoru;
        this.b = ahdg;
    }

    public final /* bridge */ /* synthetic */ aorr a(Object obj) {
        return this.c.b(new sdx(this, (Uri) obj));
    }
}
