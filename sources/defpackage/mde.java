package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: mde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mde implements bkm {
    public final void a(Context context, int i) {
        a(context, i, "");
    }

    public final void a(Context context, int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("[");
        sb.append(i - 1);
        sb.append("] ");
        sb.append(str);
        Log.i("DynamiteLoaderV2", sb.toString());
    }
}
