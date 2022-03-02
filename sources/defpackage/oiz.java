package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Calendar;

/* renamed from: oiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oiz extends DialogFragment {
    private final long a = 1587020400000L;
    private View b;

    public final Dialog onCreateDialog(Bundle bundle) {
        String str;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) getActivity();
        View inflate = helpChimeraActivity.getLayoutInflater().inflate(R.layout.gh_version_dialog, (ViewGroup) null);
        this.b = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.gh_application_logo);
        TextView textView = (TextView) this.b.findViewById(R.id.gh_application_title);
        TextView textView2 = (TextView) this.b.findViewById(R.id.gh_application_version);
        String str2 = helpChimeraActivity.x.b;
        PackageManager packageManager = helpChimeraActivity.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str2, 0);
            imageView.setImageDrawable(packageManager.getApplicationIcon(applicationInfo));
            textView.setText(packageManager.getApplicationLabel(applicationInfo));
            PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
            if (TextUtils.isEmpty(packageInfo.versionName) || !Character.isDigit(packageInfo.versionName.charAt(0))) {
                str = packageInfo.versionName;
            } else {
                str = helpChimeraActivity.getString(R.string.gh_subtitle_format_for_version_number, new Object[]{packageInfo.versionName});
            }
            textView2.setText(str);
        } catch (PackageManager.NameNotFoundException e) {
        }
        View view = this.b;
        Calendar a2 = jii.a();
        int i = a2.get(1);
        a2.setTimeInMillis(this.a);
        ((TextView) view.findViewById(R.id.gh_application_copyright)).setText(getString(R.string.gh_copyright, Integer.valueOf(Math.max(a2.get(1), i))));
        return new AlertDialog.Builder(helpChimeraActivity).setView(this.b).create();
    }
}
