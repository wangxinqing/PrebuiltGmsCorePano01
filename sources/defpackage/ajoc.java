package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.view.View;
import com.google.android.location.settings.ActivityRecognitionPermissionChimeraActivity;

/* renamed from: ajoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajoc implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Context c;
    final /* synthetic */ ContentResolver d;
    final /* synthetic */ ActivityRecognitionPermissionChimeraActivity e;

    public ajoc(ActivityRecognitionPermissionChimeraActivity activityRecognitionPermissionChimeraActivity, boolean z, boolean z2, Context context, ContentResolver contentResolver) {
        this.e = activityRecognitionPermissionChimeraActivity;
        this.a = z;
        this.b = z2;
        this.c = context;
        this.d = contentResolver;
    }

    public void onClick(View view) {
        String a2;
        if (this.a) {
            this.e.finish();
        } else if (this.b) {
            this.e.startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
            this.e.finish();
        } else {
            iwq a3 = iwq.a(this.c);
            if (a3 != null && !a3.e() && ActivityRecognitionPermissionChimeraActivity.e() && !ActivityRecognitionPermissionChimeraActivity.b(this.d)) {
                ContentResolver contentResolver = this.d;
                String a4 = ActivityRecognitionPermissionChimeraActivity.a(contentResolver);
                StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 23);
                sb.append(a4);
                sb.append(":com.google.android.gms");
                if (Settings.Secure.putString(contentResolver, "enabled_notification_policy_access_packages", sb.toString()) && a3.e() && (a2 = ahoo.a(this.c, a3)) != null && !a2.isEmpty()) {
                    this.e.a = true;
                    ahol.a(this.c).a(5);
                    this.e.finish();
                }
            }
            if (!this.e.a) {
                Intent intent = new Intent();
                intent.setAction("com.google.android.location.settings.ACTIVITY_RECOGNITION_PERMISSION");
                intent.putExtra("secondIntroPage", true);
                this.e.startActivity(intent);
            }
        }
    }
}
