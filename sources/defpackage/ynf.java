package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;

/* renamed from: ynf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ynf extends ClickableSpan {
    private final String a;

    public ynf(String str) {
        this.a = str;
    }

    public void onClick(View view) {
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse(this.a));
        List<ResolveInfo> queryIntentActivities = view.getContext().getPackageManager().queryIntentActivities(data, 65536);
        int size = queryIntentActivities.size();
        int i = 0;
        while (i < size) {
            String str = queryIntentActivities.get(i).activityInfo.packageName;
            if ("com.google.android.apps.plus".equals(str)) {
                i++;
            } else {
                data.setPackage(str);
                view.getContext().startActivity(data);
                return;
            }
        }
    }
}
