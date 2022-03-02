package defpackage;

import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.location.settings.LocationSettingsCheckerChimeraActivity;
import java.util.List;

/* renamed from: ajoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajoy implements View.OnClickListener {
    private final LocationSettingsCheckerChimeraActivity a;
    private final SpannableString b;
    private final ImageSpan c;
    private final TextView d;
    private final LinearLayout e;
    private final List f;
    private final View g;

    public ajoy(LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity, SpannableString spannableString, ImageSpan imageSpan, TextView textView, LinearLayout linearLayout, List list, View view) {
        this.a = locationSettingsCheckerChimeraActivity;
        this.b = spannableString;
        this.c = imageSpan;
        this.d = textView;
        this.e = linearLayout;
        this.f = list;
        this.g = view;
    }

    public void onClick(View view) {
        LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity = this.a;
        SpannableString spannableString = this.b;
        ImageSpan imageSpan = this.c;
        TextView textView = this.d;
        LinearLayout linearLayout = this.e;
        List list = this.f;
        View view2 = this.g;
        locationSettingsCheckerChimeraActivity.a(spannableString, imageSpan, textView, linearLayout, list);
        LocationSettingsCheckerChimeraActivity.a(view2);
    }
}
