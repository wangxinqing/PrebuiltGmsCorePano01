package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;

/* renamed from: udg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class udg extends je {
    private final Context E;

    public udg(Context context) {
        super(context);
        this.E = context;
    }

    public final void d(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", z ? this.E.getResources().getString(R.string.common_devices) : this.E.getResources().getString(R.string.common_nearby_title));
        a(bundle);
    }

    static Uri a(Context context) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(R.raw.discovery_silence)).appendPath(resources.getResourceTypeName(R.raw.discovery_silence)).appendPath(resources.getResourceEntryName(R.raw.discovery_silence)).build();
    }

    public final void b(String str) {
        int i = Build.VERSION.SDK_INT;
        d(str);
    }

    public final void a(String str) {
        if (!udl.a()) {
            int a = udl.a(str);
            this.j = a;
            if (a > 0) {
                a(a(this.a));
                a(new long[0]);
                return;
            }
            return;
        }
        this.z = str;
    }
}
