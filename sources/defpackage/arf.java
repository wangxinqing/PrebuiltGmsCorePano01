package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;

/* renamed from: arf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arf {
    static ObjectAnimator a(Object obj, Property property, Path path) {
        int i = Build.VERSION.SDK_INT;
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }
}
