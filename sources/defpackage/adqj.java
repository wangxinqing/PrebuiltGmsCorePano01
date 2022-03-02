package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adqj extends Fragment {
    public TextView a;
    private final iwd b = adnt.i("OtaPanoSetupProgressbarFragment");
    private int c;
    private TextView d;
    private ProgressBar e;

    public abstract String a();

    public final void a(int i) {
        iwd iwd = this.b;
        StringBuilder sb = new StringBuilder(36);
        sb.append("setProgress(). percent = ");
        sb.append(i);
        iwd.b(sb.toString(), new Object[0]);
        if (i < 0) {
            i = 0;
        }
        this.c = i;
        String string = getString(R.string.system_update_percent_format);
        TextView textView = this.d;
        if (!(textView == null || string == null)) {
            if (this.c != 0) {
                textView.setVisibility(0);
                this.d.setText(TextUtils.expandTemplate(string, new CharSequence[]{Integer.toString(this.c)}));
            } else {
                textView.setVisibility(4);
            }
        }
        ProgressBar progressBar = this.e;
        if (progressBar == null) {
            return;
        }
        if (this.c != 0) {
            progressBar.setIndeterminate(false);
            this.e.setProgress(this.c);
            return;
        }
        progressBar.setIndeterminate(true);
    }

    public abstract String b();

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        iwd iwd = this.b;
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("onCreate(). savedInstanceState: ");
        sb.append(z);
        iwd.b(sb.toString(), new Object[0]);
        if (bundle != null) {
            int i = bundle.getInt("progress", 0);
            this.c = i;
            iwd iwd2 = this.b;
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Recovered mProgress from savedInstanceState: ");
            sb2.append(i);
            iwd2.b(sb2.toString(), new Object[0]);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.system_update_progressbar_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.guidance_title)).setText(a());
        TextView textView = (TextView) inflate.findViewById(R.id.guidance_description);
        this.a = textView;
        textView.setText(b());
        this.d = (TextView) inflate.findViewById(R.id.percentage_text);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressbar);
        this.e = progressBar;
        progressBar.setMax(100);
        a(this.c);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("progress", this.c);
    }
}
