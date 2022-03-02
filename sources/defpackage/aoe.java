package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.slice.Slice;

/* renamed from: aoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aoe {
    public static aoe a(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new aom(context);
        }
        return new aol(context);
    }

    public abstract Uri a(Intent intent);

    public abstract void a(Uri uri);

    public abstract void a(Uri uri, aod aod);

    public abstract void b(Uri uri);

    public abstract void b(Uri uri, aod aod);

    public abstract Slice c(Uri uri);
}
