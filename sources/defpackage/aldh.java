package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.chimera.Activity;

/* renamed from: aldh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aldh {
    private final Activity a;

    public aldh(Activity activity) {
        this.a = activity;
    }

    public final BitmapDrawable a(String str, int i) {
        BitmapDrawable bitmapDrawable;
        PackageManager packageManager = this.a.getPackageManager();
        String str2 = null;
        if (packageManager == null) {
            str2 = "No PackageManager";
            bitmapDrawable = null;
        } else {
            try {
                Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
                if (resourcesForApplication == null) {
                    String valueOf = String.valueOf(str);
                    str2 = valueOf.length() == 0 ? new String("No Resources for package: ") : "No Resources for package: ".concat(valueOf);
                    bitmapDrawable = null;
                } else {
                    Drawable drawable = resourcesForApplication.getDrawable(i);
                    if (!(drawable instanceof BitmapDrawable)) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("Invalid Drawable for resourceId: ");
                        sb.append(i);
                        str2 = sb.toString();
                        bitmapDrawable = null;
                    } else {
                        bitmapDrawable = (BitmapDrawable) drawable;
                    }
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException e) {
                str2 = e.toString();
                bitmapDrawable = null;
            }
        }
        if (str2 != null) {
            String valueOf2 = String.valueOf(str2);
            alfy.a("Places", valueOf2.length() == 0 ? new String("Unable to get Drawable from resources: ") : "Unable to get Drawable from resources: ".concat(valueOf2));
        }
        return bitmapDrawable;
    }
}
