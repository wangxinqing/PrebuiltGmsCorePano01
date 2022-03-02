package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

/* renamed from: ajzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajzo extends ajzu {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public ajzo(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    public final void a(Matrix matrix, ajyv ajyv, int i, Canvas canvas) {
        List list = this.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ajzu) list.get(i2)).a(this.b, ajyv, i, canvas);
        }
    }
}
