package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* renamed from: fzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzp {
    private static final iwd a = ehv.a("PackageManagerHelper");
    private final Context b;

    public fzp(Context context) {
        this.b = context;
    }

    public final CharSequence a(String str) {
        try {
            return jni.b(this.b).b(str);
        } catch (PackageManager.NameNotFoundException e) {
            a.d("Package does not exist: %s", str, e);
            return null;
        }
    }

    public final Drawable b(String str) {
        try {
            return (Drawable) jni.b(this.b).c(str).b;
        } catch (PackageManager.NameNotFoundException e) {
            a.d("Package does not exist: %s", str, e);
            return null;
        }
    }
}
