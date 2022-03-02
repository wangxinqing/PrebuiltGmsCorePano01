package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.google.android.gms.R;

/* renamed from: abht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abht implements jsw {
    final /* synthetic */ abhu a;

    public abht(abhu abhu) {
        this.a = abhu;
    }

    public final void a(amri amri) {
        abhu abhu = this.a;
        if (amri.a()) {
            abhu.a.setImageDrawable(new BitmapDrawable(abhu.b.e, jpr.a((Bitmap) amri.b(), (int) abhu.b.e.getDimension(R.dimen.profile_card_people_avatar_diameter))));
            return;
        }
        int i = Build.VERSION.SDK_INT;
        abhu.a.setImageDrawable(abhu.b.e.getDrawable(R.drawable.product_logo_avatar_anonymous_color_48, (Resources.Theme) null));
    }
}
