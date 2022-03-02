package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.R;

/* renamed from: cyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cyj {
    public static Intent a(Context context, Uri uri) {
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", que.b(context, 16842801, R.color.google_white));
        bundle.putString("com.android.browser.application_id", context.getPackageName());
        return new Intent("android.intent.action.VIEW", uri).putExtras(bundle);
    }

    public static Uri a(String str, boolean z, dih dih) {
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (parse.getQueryParameter("hl") == null) {
            buildUpon.appendQueryParameter("hl", dja.b());
        }
        if (z) {
            buildUpon = Uri.parse(awgs.b()).buildUpon().appendQueryParameter("hl", dja.b()).appendQueryParameter("continue", buildUpon.build().toString());
            if (dio.a(dih)) {
                buildUpon.appendQueryParameter("Email", dih.a);
            }
        }
        return buildUpon.build();
    }
}
