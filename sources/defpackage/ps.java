package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: ps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ps {
    public final Object a;

    private ps(Object obj) {
        this.a = obj;
    }

    public static ps a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ps(PointerIcon.getSystemIcon(context, 1002));
        }
        return new ps((Object) null);
    }
}
