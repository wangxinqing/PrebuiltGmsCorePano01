package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.R;

/* renamed from: abjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abjn implements jsw {
    private final abjp a;
    private final View b;

    public abjn(abjp abjp, View view) {
        this.a = abjp;
        this.b = view;
    }

    public final void a(amri amri) {
        abjp abjp = this.a;
        View view = this.b;
        if (amri.a()) {
            ((ImageView) view.findViewById(R.id.avatar_icon)).setImageDrawable(new BitmapDrawable(abjp.a.getResources(), jpr.a((Bitmap) amri.b(), (int) abjp.a.getResources().getDimension(R.dimen.profile_card_people_avatar_diameter))));
        }
    }
}
