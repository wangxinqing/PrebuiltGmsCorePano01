package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.net.URISyntaxException;

/* renamed from: acgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgp {
    private static Intent a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("intent:")) {
            try {
                return Intent.parseUri(str, 1);
            } catch (URISyntaxException e) {
                return null;
            }
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            return intent;
        }
    }

    public static anvn a(Context context, PostTransferAction postTransferAction) {
        if (postTransferAction == null) {
            return anvn.NONE;
        }
        anvn anvn = (anvn) a(context.getPackageManager(), postTransferAction).a;
        return anvn == null ? anvn.NONE : anvn;
    }

    public static oq a(PackageManager packageManager, PostTransferAction postTransferAction) {
        Intent a = a(postTransferAction.c);
        Intent a2 = a(postTransferAction.d);
        boolean a3 = a(packageManager, a);
        boolean a4 = a(packageManager, a2);
        boolean z = false;
        if (azmd.a.a().d()) {
            String str = postTransferAction.e;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (packageManager.getPackageInfo(str, 0) != null) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
        if ((a4 || z) && azmd.a.a().c()) {
            return oq.a(anvn.OEM_APP, a2);
        }
        if (!a3 || !awpx.a.a().a()) {
            return oq.a(anvn.NONE, (Object) null);
        }
        return oq.a(anvn.WIFI_D2D, a);
    }

    private static boolean a(PackageManager packageManager, Intent intent) {
        return (intent == null || packageManager.resolveActivity(intent, 0) == null) ? false : true;
    }
}
