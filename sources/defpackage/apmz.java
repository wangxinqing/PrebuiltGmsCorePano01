package defpackage;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;

/* renamed from: apmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apmz extends apna {
    private final SliceManager a;

    public apmz(Context context) {
        this.a = (SliceManager) context.getSystemService(SliceManager.class);
    }

    public final void a(String str, Uri uri) {
        this.a.grantSlicePermission(str, uri);
    }
}
