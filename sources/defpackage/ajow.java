package defpackage;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.location.settings.LocationSettingsCheckerChimeraActivity;
import java.util.List;

/* renamed from: ajow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ajow implements Runnable {
    private final LocationSettingsCheckerChimeraActivity a;
    private final List b;

    public ajow(LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity, List list) {
        this.a = locationSettingsCheckerChimeraActivity;
        this.b = list;
    }

    public final void run() {
        LocationSettingsCheckerChimeraActivity locationSettingsCheckerChimeraActivity = this.a;
        List list = this.b;
        if (!locationSettingsCheckerChimeraActivity.isFinishing()) {
            locationSettingsCheckerChimeraActivity.d.clear();
            locationSettingsCheckerChimeraActivity.d.add(-1);
            locationSettingsCheckerChimeraActivity.d.add(Integer.valueOf(R.string.location_settings_dialog_positive_button));
            locationSettingsCheckerChimeraActivity.d.add(Integer.valueOf(R.string.common_no_thanks));
            AlertDialog.Builder builder = new AlertDialog.Builder(locationSettingsCheckerChimeraActivity);
            Resources resources = locationSettingsCheckerChimeraActivity.getResources();
            builder.setOnCancelListener(locationSettingsCheckerChimeraActivity);
            View inflate = locationSettingsCheckerChimeraActivity.getLayoutInflater().inflate(R.layout.location_settings_dialog, (ViewGroup) null);
            LocationSettingsCheckerChimeraActivity.a(inflate);
            TextView textView = (TextView) inflate.findViewById(R.id.message);
            int i = !locationSettingsCheckerChimeraActivity.b ? R.string.location_settings_dialog_message_title_for_better_experience : R.string.location_settings_dialog_message_title_to_continue;
            locationSettingsCheckerChimeraActivity.d.add(Integer.valueOf(i));
            SpannableString spannableString = new SpannableString(String.valueOf(locationSettingsCheckerChimeraActivity.getString(i)).concat(" "));
            Drawable drawable = resources.getDrawable(R.drawable.quantum_ic_keyboard_arrow_down_grey600_18);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            ImageSpan imageSpan = new ImageSpan(drawable, 0);
            ma.a(imageSpan.getDrawable(), kf.b(locationSettingsCheckerChimeraActivity, R.color.location_settings_dialog_key_down_arrow));
            spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
            textView.setText(spannableString);
            jix.g(locationSettingsCheckerChimeraActivity);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.messages);
            if (locationSettingsCheckerChimeraActivity.c) {
                locationSettingsCheckerChimeraActivity.a(spannableString, imageSpan, textView, linearLayout, list);
                LocationSettingsCheckerChimeraActivity.a(inflate);
            } else {
                ajoy ajoy = r1;
                ajoy ajoy2 = new ajoy(locationSettingsCheckerChimeraActivity, spannableString, imageSpan, textView, linearLayout, list, inflate);
                textView.setOnClickListener(ajoy);
            }
            builder.setPositiveButton(R.string.location_settings_dialog_positive_button, locationSettingsCheckerChimeraActivity);
            builder.setNegativeButton(R.string.common_no_thanks, locationSettingsCheckerChimeraActivity);
            AlertDialog create = builder.create();
            create.setView(inflate, 0, 0, 0, 0);
            create.setCanceledOnTouchOutside(false);
            locationSettingsCheckerChimeraActivity.a = SystemClock.elapsedRealtime();
            create.show();
            locationSettingsCheckerChimeraActivity.a("show_dialog");
        }
    }
}
