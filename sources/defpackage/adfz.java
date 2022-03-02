package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: adfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adfz extends DialogFragment {
    public static final jjg a = jjg.a();
    protected boolean b = false;

    public static adfz a(FragmentManager fragmentManager) {
        try {
            return (adfz) fragmentManager.findFragmentByTag("UdcDialog");
        } catch (ClassCastException e) {
            anih anih = (anih) a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("adfz", "a", 33, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error finding dialog fragment");
            return null;
        }
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        if (bundle != null) {
            this.b = bundle.getBoolean("UdcShownAsDialog", this.b);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.b) {
            return a(layoutInflater, viewGroup);
        }
        return null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.b) {
            bundle.putBoolean("UdcShownAsDialog", true);
        }
    }

    public final int show(FragmentTransaction fragmentTransaction, String str) {
        this.b = true;
        return super.show(fragmentTransaction, str);
    }

    public final void show(FragmentManager fragmentManager, String str) {
        this.b = true;
        super.show(fragmentManager, str);
    }

    protected static void a(View view, int i, CharSequence charSequence) {
        TextView textView = (TextView) view.findViewById(i);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(Html.fromHtml(charSequence.toString()));
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
