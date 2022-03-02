package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: gnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnn extends Fragment {
    private String a;
    private String b;

    public static gnn a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("appName", str);
        gnn gnn = new gnn();
        gnn.setArguments(bundle);
        return gnn;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getString("appName");
        this.b = arguments.getString("appDeviceName");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.auth_consent_app_user_info, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.app_name);
        Resources resources = getResources();
        String str = this.b;
        if (str == null) {
            textView.setText(resources.getString(R.string.auth_plus_info_fragment_app_name, new Object[]{this.a}));
        } else {
            textView.setText(resources.getString(R.string.auth_plus_info_fragment_app_name_with_device, new Object[]{this.a, str}));
        }
        return inflate;
    }
}
