package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.ref.WeakReference;

/* renamed from: eav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eav {
    private static final SparseArray a = new SparseArray();
    private static final SparseArray b = new SparseArray();

    public static Drawable a(Context context, int i, int i2, boolean z) {
        SparseArray sparseArray;
        Resources resources;
        if (i == 0) {
            return null;
        }
        String packageName = context.getPackageName();
        if (!z || TextUtils.isEmpty(packageName)) {
            sparseArray = a;
            resources = context.getResources();
        } else {
            sparseArray = b;
            try {
                Context createPackageContext = context.createPackageContext(packageName, 0);
                resources = createPackageContext != null ? createPackageContext.getResources() : null;
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }
        if (resources == null) {
            return null;
        }
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(i);
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray();
            sparseArray.put(i, sparseArray2);
        }
        WeakReference weakReference = (WeakReference) sparseArray2.get(i2);
        if (weakReference == null || weakReference.get() == null) {
            try {
                Drawable f = ma.f(resources.getDrawable(i).mutate());
                ma.a(f, i2);
                weakReference = new WeakReference(f);
                sparseArray2.put(i2, weakReference);
            } catch (Resources.NotFoundException e2) {
                return null;
            }
        }
        return (Drawable) weakReference.get();
    }
}
