package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: eak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eak extends DialogFragment {
    private jgs a;

    public static eak a() {
        eak eak = new eak();
        Bundle bundle = new Bundle();
        bundle.putString("message", (String) null);
        bundle.putBoolean("cancelable", false);
        eak.setArguments(bundle);
        return eak;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, getTheme());
        setCancelable(getArguments().getBoolean("cancelable"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.appinvite_material_progress_dialog, viewGroup, false);
        String string = getArguments().getString("message");
        TextView textView = (TextView) inflate.findViewById(R.id.progress_message);
        textView.setText(string);
        if (TextUtils.isEmpty(string)) {
            i = 8;
        }
        textView.setVisibility(i);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.progress_bar);
        jgs a2 = a(imageView);
        this.a = a2;
        imageView.setImageDrawable(a2);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        jgs jgs = this.a;
        if (jgs != null && !jgs.isRunning()) {
            this.a.start();
        }
    }

    public final void onStop() {
        jgs jgs = this.a;
        if (jgs != null && jgs.isRunning()) {
            this.a.stop();
        }
        super.onStop();
    }

    public static jgs a(View view) {
        jgs jgs = new jgs(view.getContext(), view);
        jgs.setAlpha(255);
        jgs.a(view.getResources().getColor(R.color.appinvite_light_black));
        return jgs;
    }
}
