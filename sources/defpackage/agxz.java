package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: agxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxz {
    static final void a(Context context) {
        try {
            agi agi = new agi();
            int parseColor = Color.parseColor("#eeeeee");
            agi.a.a = Integer.valueOf(parseColor | -16777216);
            agi.a().a(context, Uri.parse("https://www.google.com/policies/privacy/"));
        } catch (ActivityNotFoundException e) {
            throw new agxy();
        }
    }

    public static final void a(Activity activity, String str) {
        a((Fragment) null, activity, str);
    }

    public static final void a(Fragment fragment, Activity activity, String str) {
        if (str == null || str.isEmpty()) {
            a(activity);
            return;
        }
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str).putExtra("extra.screenId", 500);
        if (putExtra.resolveActivity(activity.getPackageManager()) == null) {
            a(activity);
        } else if (fragment == null) {
            activity.startActivityForResult(putExtra, 0);
        } else {
            fragment.startActivityForResult(putExtra, 0);
        }
    }
}
