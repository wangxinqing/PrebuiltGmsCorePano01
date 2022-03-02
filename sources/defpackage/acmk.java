package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: acmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acmk extends Fragment {
    private GlifLayout a;
    private String b;
    private String c;

    public static acmk a(String str) {
        return a(str, (String) null);
    }

    public static Bundle b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.title", str);
        if (str2 != null) {
            bundle.putString("smartdevice.message", str2);
        }
        return bundle;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("smartdevice.title");
            iva.a((Object) string);
            this.b = string;
            if (arguments.containsKey("smartdevice.message")) {
                String string2 = arguments.getString("smartdevice.message");
                iva.a((Object) string2);
                this.c = string2;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.smartdevice_glif_setup_info, viewGroup, false);
        this.a = glifLayout;
        return glifLayout;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a.a((CharSequence) this.b);
        if (this.c != null) {
            ((TextView) view.findViewById(R.id.setup_info_text)).setText(this.c);
        }
        this.a.b(true);
    }

    public static acmk a(String str, String str2) {
        iva.a((Object) str);
        acmk acmk = new acmk();
        acmk.setArguments(b(str, str2));
        return acmk;
    }
}
