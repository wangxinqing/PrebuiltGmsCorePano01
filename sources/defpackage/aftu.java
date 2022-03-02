package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: aftu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aftu implements amsv {
    private final Context a;

    public aftu(Context context) {
        this.a = context;
    }

    public final Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
