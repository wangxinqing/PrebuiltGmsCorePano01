package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqo extends Fragment {
    public static final iwd a = adnt.i("OtaPanoSetupUpdateReadyFragment");
    public TextView b;
    private int c;

    public final void a(int i) {
        TextView textView;
        iwd iwd = a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("setSeconds(). seconds = ");
        sb.append(i);
        iwd.b(sb.toString(), new Object[0]);
        if (i < 0) {
            i = 0;
        }
        this.c = i;
        if (isResumed() && (textView = this.b) != null) {
            Resources resources = getResources();
            int i2 = this.c;
            textView.setText(resources.getQuantityString(R.plurals.system_update_restarting_countdown, i2, new Object[]{Integer.valueOf(i2)}));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            int i = bundle.getInt("remaining_seconds", 0);
            this.c = i;
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(61);
            sb.append("onCreate(). From saved instance, mRemainSeconds = ");
            sb.append(i);
            iwd.b(sb.toString(), new Object[0]);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.c = arguments.getInt("countdown_total_seconds", 0);
        }
        iwd iwd2 = a;
        int i2 = this.c;
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("onCreate(). From arguments, mRemainSeconds = ");
        sb2.append(i2);
        iwd2.b(sb2.toString(), new Object[0]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.system_update_actiontext_fragment, viewGroup, false);
        String string = getString(R.string.system_update_ready_title);
        String i = adjk.i();
        if (!TextUtils.isEmpty(i)) {
            str = Html.fromHtml(i).toString();
        } else {
            str = getString(R.string.system_update_default_ready_description);
        }
        ((TextView) inflate.findViewById(R.id.guidance_title)).setText(string);
        ((TextView) inflate.findViewById(R.id.guidance_description)).setText(str);
        this.b = (TextView) inflate.findViewById(R.id.action_text);
        a(this.c);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("remaining_seconds", this.c);
    }
}
