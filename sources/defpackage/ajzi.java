package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ajzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzi implements ajyy {
    private final float a;

    public ajzi(float f) {
        this.a = f;
    }

    public final float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ajzi) && this.a == ((ajzi) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
