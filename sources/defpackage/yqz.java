package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.R;
import com.google.android.gms.plus.audience.AudienceAvatarImageView;
import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;

/* renamed from: yqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqz implements icm {
    final /* synthetic */ UpdateCirclesChimeraActivity a;

    public yqz(UpdateCirclesChimeraActivity updateCirclesChimeraActivity) {
        this.a = updateCirclesChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlj wlj = (wlj) icl;
        ParcelFileDescriptor b = wlj.b();
        if (wlj.aO().c() && b != null) {
            this.a.w = wlu.a(b);
            UpdateCirclesChimeraActivity updateCirclesChimeraActivity = this.a;
            if (updateCirclesChimeraActivity.w != null) {
                updateCirclesChimeraActivity.findViewById(R.id.add_to_circles_user_icon).setVisibility(0);
                ((AudienceAvatarImageView) this.a.findViewById(R.id.add_to_circles_user_icon)).a(this.a.w);
            }
        }
    }
}
