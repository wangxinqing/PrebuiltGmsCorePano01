package defpackage;

import android.app.AlertDialog;
import android.os.Build;
import android.text.Html;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: ajoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajoo extends ClickableSpan {
    final /* synthetic */ LocationHistorySettingsChimeraActivity a;

    public ajoo(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.a = locationHistorySettingsChimeraActivity;
    }

    public void onClick(View view) {
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.a;
        String i = locationHistorySettingsChimeraActivity.i();
        AlertDialog.Builder builder = new AlertDialog.Builder(locationHistorySettingsChimeraActivity.getContainerActivity(), R.style.AlertThemeSelector);
        builder.setTitle(locationHistorySettingsChimeraActivity.getResources().getString(R.string.common_learn_more)).setPositiveButton(locationHistorySettingsChimeraActivity.getString(17039370), new ajou());
        if (Build.VERSION.SDK_INT < 24) {
            builder.setMessage(Html.fromHtml(i));
        } else {
            builder.setMessage(Html.fromHtml(i, 0));
        }
        builder.create().show();
    }
}
