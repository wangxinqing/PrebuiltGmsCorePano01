package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: acoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acoe extends Fragment {
    public int a;
    Drawable b;
    public acod c;
    private GlifLayout d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;

    public static acoe a(int i2, String str, String str2, String str3, Integer num, boolean z, boolean z2) {
        iva.a((Object) str);
        iva.a((Object) str2);
        iva.a((Object) str3);
        acoe acoe = new acoe();
        Bundle bundle = new Bundle();
        bundle.putInt("smartdevice.id", i2);
        bundle.putString("smartdevice.title", str);
        bundle.putString("smartdevice.message", str2);
        bundle.putString("smartdevice.nextButtonText", str3);
        bundle.putBoolean("isMagicWand", z);
        bundle.putBoolean("showButton", z2);
        if (num != null) {
            bundle.putInt("icon", num.intValue());
        }
        acoe.setArguments(bundle);
        return acoe;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            try {
                this.c = (acod) parentFragment;
            } catch (ClassCastException e2) {
                throw new RuntimeException("Containing fragment must implement WifiPasswordFragment.Listener", e2);
            }
        } else {
            try {
                this.c = (acod) activity;
            } catch (ClassCastException e3) {
                throw new RuntimeException("Containing activity must implement WifiPasswordFragment.Listener", e3);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.a = arguments.getInt("smartdevice.id");
        String string = arguments.getString("smartdevice.title");
        iva.a((Object) string);
        this.e = string;
        String string2 = arguments.getString("smartdevice.message");
        iva.a((Object) string2);
        this.f = string2;
        this.g = arguments.getString("smartdevice.nextButtonText");
        this.h = arguments.getBoolean("isMagicWand");
        this.i = arguments.getBoolean("showButton");
        if (arguments.containsKey("icon")) {
            Activity activity = getActivity();
            iva.a((Object) activity);
            this.b = activity.getDrawable(arguments.getInt("icon"));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        if (!this.h) {
            i2 = R.layout.smartdevice_glif_text_confirmation;
        } else {
            i2 = R.layout.magicwand_text_confirmation;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i2, viewGroup, false);
        this.d = glifLayout;
        if (!this.h) {
            alhf alhf = new alhf(this.d.getContext());
            alhf.a(R.string.sud_next_button_label);
            alhf.c = 5;
            alhf.d = 2132018060;
            ((alhe) glifLayout.a(alhe.class)).a(alhf.a());
        }
        return this.d;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d.a((CharSequence) this.e);
        Drawable drawable = this.b;
        if (drawable != null) {
            this.d.a(drawable);
        }
        ((TextView) view.findViewById(R.id.confirmation_text)).setText(this.f);
        if (this.h) {
            Button button = (Button) view.findViewById(R.id.text_confirmation_fragment_next_button);
            button.setText(this.g);
            button.setOnClickListener(new acob(this));
            if (!this.i) {
                button.setVisibility(8);
                return;
            }
            return;
        }
        alhg alhg = ((alhe) this.d.a(alhe.class)).c;
        alhg.a((CharSequence) this.g);
        alhg.f = new acoc(this);
    }

    public static acoe a(int i2, String str, String str2, String str3, boolean z) {
        return a(i2, str, str2, str3, (Integer) null, true, z);
    }

    public static acoe a(String str, String str2, String str3) {
        return a(0, str, str2, str3, (Integer) null, false, true);
    }
}
