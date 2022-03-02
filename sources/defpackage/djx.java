package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.utils.ButtonConfig;
import java.util.regex.Pattern;

/* renamed from: djx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class djx extends DialogFragment {
    static final Pattern a = Pattern.compile("myaccount\\.google\\.com");
    ViewGroup b;
    public djw c;
    boolean d = false;

    static {
        dit.a("MessageDialog");
    }

    private static final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.as_message_dialog, viewGroup, false);
        qb.f(inflate, 1);
        qb.b(inflate, 1);
        return inflate;
    }

    private static final String b(Bundle bundle, String str) {
        ButtonConfig a2 = a(bundle, str);
        if (a2 != null) {
            return a2.a;
        }
        return null;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof djw) {
            this.c = (djw) activity;
            return;
        }
        throw new IllegalStateException("Needs to implement OnClickListener");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        if (bundle != null) {
            this.d = bundle.getBoolean("shownAsDialog", this.d);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        this.b = (ViewGroup) a(getActivity().getLayoutInflater(), (ViewGroup) null);
        sr srVar = new sr(getActivity());
        srVar.b((View) this.b);
        srVar.a(true);
        return srVar.b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.d) {
            return a(layoutInflater, viewGroup);
        }
        a(this.b);
        return null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.d) {
            bundle.putBoolean("shownAsDialog", true);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.b = viewGroup;
        a(viewGroup);
    }

    public final void show(FragmentManager fragmentManager, String str) {
        this.d = true;
        super.show(fragmentManager, str);
    }

    public static final ButtonConfig a(Bundle bundle, String str) {
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof ButtonConfig) {
            return (ButtonConfig) parcelable;
        }
        return null;
    }

    public static djx a(CharSequence charSequence, CharSequence charSequence2, ButtonConfig buttonConfig, ButtonConfig buttonConfig2) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(charSequence)) {
            bundle.putCharSequence("titleText", charSequence);
        }
        bundle.putCharSequence("msgText", charSequence2);
        if (buttonConfig != null) {
            bundle.putParcelable("negativeBtn", buttonConfig);
        }
        bundle.putParcelable("positiveBtn", buttonConfig2);
        djx djx = new djx();
        djx.setArguments(bundle);
        return djx;
    }

    private final void a(ViewGroup viewGroup) {
        Bundle arguments = getArguments();
        TextView textView = (TextView) viewGroup.findViewById(R.id.as_message_title);
        CharSequence charSequence = arguments.getCharSequence("titleText");
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.as_message_text);
        CharSequence charSequence2 = arguments.getCharSequence("msgText");
        textView2.setVisibility(0);
        textView2.setText(charSequence2);
        if (getString(R.string.accountsettings_missing_account).contentEquals(charSequence2)) {
            Linkify.addLinks(textView2, a, "https://");
        }
        String b2 = b(arguments, "neutralBtn");
        Button button = (Button) viewGroup.findViewById(R.id.button_neutral);
        if (!TextUtils.isEmpty(b2)) {
            button.setText(b2);
            button.setVisibility(0);
            button.setOnClickListener(new djt(this));
        } else {
            button.setVisibility(8);
        }
        String b3 = b(arguments, "negativeBtn");
        Button button2 = (Button) viewGroup.findViewById(R.id.button_negative);
        if (!TextUtils.isEmpty(b3)) {
            button2.setText(b3);
            button2.setVisibility(0);
            button2.setOnClickListener(new dju(this));
        } else {
            button2.setVisibility(8);
        }
        String b4 = b(arguments, "positiveBtn");
        Button button3 = (Button) viewGroup.findViewById(R.id.button_positive);
        if (!TextUtils.isEmpty(b4)) {
            button3.setText(b4);
            button3.setVisibility(0);
            button3.setOnClickListener(new djv(this));
            return;
        }
        button3.setVisibility(8);
    }
}
