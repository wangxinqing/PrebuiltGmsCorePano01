package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* renamed from: pb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pb {
    public final GestureDetector a;

    public pb(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, (Handler) null);
    }
}
