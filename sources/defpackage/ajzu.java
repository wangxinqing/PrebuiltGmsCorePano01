package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* renamed from: ajzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ajzu {
    static final Matrix c = new Matrix();

    public final void a(ajyv ajyv, int i, Canvas canvas) {
        a(c, ajyv, i, canvas);
    }

    public abstract void a(Matrix matrix, ajyv ajyv, int i, Canvas canvas);
}
