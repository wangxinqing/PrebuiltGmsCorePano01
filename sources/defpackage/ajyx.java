package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ajyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajyx implements ajyy {
    private final ajyy a;
    private final float b;

    public ajyx(float f, ajyy ajyy) {
        while (ajyy instanceof ajyx) {
            ajyy = ((ajyx) ajyy).a;
            f += ((ajyx) ajyy).b;
        }
        this.a = ajyy;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajyx) {
            ajyx ajyx = (ajyx) obj;
            return this.a.equals(ajyx.a) && this.b == ajyx.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
