package defpackage;

import android.widget.RatingBar;

/* renamed from: ocd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ocd implements RatingBar.OnRatingBarChangeListener {
    final /* synthetic */ ocf a;

    public ocd(ocf ocf) {
        this.a = ocf;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        oct oct = this.a.b;
        if (oct != null) {
            oct.a();
        }
        this.a.a((int) f);
    }
}
