package defpackage;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import java.util.Set;

/* renamed from: anw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anw {
    public static anw a(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new any((SliceManager) context.getSystemService(SliceManager.class));
        }
        return new anx(context);
    }

    public abstract int a(Uri uri, int i, int i2);

    public abstract List a();

    public abstract Set a(Uri uri);
}
