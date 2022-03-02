package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: us  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class us implements Drawable.Callback {
    public Drawable.Callback a;

    public final Drawable.Callback a() {
        Drawable.Callback callback = this.a;
        this.a = null;
        return callback;
    }

    public final void invalidateDrawable(Drawable drawable) {
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.a;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.a;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
