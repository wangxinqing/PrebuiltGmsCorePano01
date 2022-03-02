package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;

/* renamed from: aes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aes extends ContextWrapper {
    public final AssetManager getAssets() {
        throw null;
    }

    public final Resources getResources() {
        throw null;
    }

    public final Resources.Theme getTheme() {
        throw null;
    }

    public final void setTheme(int i) {
        throw null;
    }

    public static void a(Context context) {
        if (!(context instanceof aes) && !(context.getResources() instanceof aeu) && !(context.getResources() instanceof afl)) {
            int i = Build.VERSION.SDK_INT;
            afl.a();
        }
    }
}
