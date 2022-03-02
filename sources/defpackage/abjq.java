package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: abjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjq implements jsw {
    private final abjs a;
    private final View b;

    public abjq(abjs abjs, View view) {
        this.a = abjs;
        this.b = view;
    }

    public final void a(amri amri) {
        abjs abjs = this.a;
        View view = this.b;
        if (amri.a()) {
            ((ImageView) view.findViewById(R.id.avatar_icon)).setImageDrawable(new BitmapDrawable(abjs.b.getResources(), jpr.a((Bitmap) amri.b(), (int) abjs.b.getResources().getDimension(R.dimen.profile_card_people_avatar_diameter))));
        }
    }
}
