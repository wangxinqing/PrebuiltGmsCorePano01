package defpackage;

import android.app.slice.SliceManager;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

/* renamed from: any  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class any extends anw {
    private final SliceManager a;

    public any(SliceManager sliceManager) {
        this.a = sliceManager;
    }

    public final int a(Uri uri, int i, int i2) {
        return this.a.checkSlicePermission(uri, i, i2);
    }

    public final List a() {
        return this.a.getPinnedSlices();
    }

    public final Set a(Uri uri) {
        if (Build.VERSION.SDK_INT == 28 && uri != null && !uri.getAuthority().contains("@")) {
            String authority = uri.getAuthority();
            Uri.Builder buildUpon = uri.buildUpon();
            StringBuilder sb = new StringBuilder();
            UserHandle myUserHandle = Process.myUserHandle();
            int i = 0;
            try {
                i = ((Integer) myUserHandle.getClass().getDeclaredMethod("getIdentifier", new Class[0]).invoke(myUserHandle, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            }
            sb.append(i);
            sb.append("@");
            sb.append(authority);
            uri = buildUpon.encodedAuthority(sb.toString()).build();
        }
        return ans.b(this.a.getPinnedSpecs(uri));
    }
}
