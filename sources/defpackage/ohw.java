package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: ohw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohw extends DialogFragment {
    private static final DialogInterface.OnClickListener c = oht.a;
    public Bundle a;
    public ohv b;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public static ohu a() {
        return new ohu();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (ohv) activity;
        } catch (ClassCastException e2) {
            throw new ClassCastException(String.valueOf(activity.toString()).concat(" must implement OnPositiveClickListener"));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.d = arguments.getInt("title_res_id");
        this.e = arguments.getInt("message_res_id");
        this.f = arguments.getInt("positive_button_text_res_id");
        this.g = arguments.getInt("negative_button_text_res_id");
        this.h = arguments.getInt("button_text_color_res_id");
        this.a = arguments.getBundle("extra_args");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        sr srVar = new sr(getActivity());
        int i = this.d;
        if (i != -1) {
            srVar.a(i);
        }
        int i2 = this.e;
        if (i2 != -1) {
            srVar.b(i2);
        }
        int i3 = this.f;
        if (i3 != -1) {
            srVar.b(i3, (DialogInterface.OnClickListener) new ohs(this));
        }
        int i4 = this.g;
        if (i4 != -1) {
            srVar.a(i4, c);
        }
        return srVar.b();
    }

    public final void onStart() {
        super.onStart();
        if (this.h != -1) {
            int b2 = kf.b(getActivity(), this.h);
            ss ssVar = (ss) getDialog();
            ssVar.a(-1).setTextColor(b2);
            ssVar.a(-2).setTextColor(b2);
        }
    }
}
