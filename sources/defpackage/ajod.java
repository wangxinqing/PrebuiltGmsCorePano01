package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.location.settings.ActivityRecognitionPermissionChimeraActivity;

/* renamed from: ajod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajod implements View.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ ActivityRecognitionPermissionChimeraActivity b;

    public ajod(ActivityRecognitionPermissionChimeraActivity activityRecognitionPermissionChimeraActivity, Context context) {
        this.b = activityRecognitionPermissionChimeraActivity;
        this.a = context;
    }

    public void onClick(View view) {
        ahol.a(this.a).a(4);
        this.b.finish();
    }
}
