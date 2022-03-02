package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: acmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acmd extends DialogFragment {
    public int a;
    public acmc b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;

    public static DialogFragment a(int i, String str, String str2, String str3, String str4, boolean z) {
        iva.a((Object) str);
        iva.a((Object) str3);
        acmd acmd = new acmd();
        Bundle bundle = new Bundle();
        bundle.putInt("smartdevice.id", i);
        bundle.putString("smartdevice.title", str);
        bundle.putString("smartdevice.positiveButtonText", str3);
        bundle.putBoolean("smartdevice.cancelable", z);
        bundle.putString("smartdevice.message", str2);
        bundle.putString("smartdevice.negativeButtonText", str4);
        acmd.setArguments(bundle);
        return acmd;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.b = (acmc) activity;
        } catch (ClassCastException e2) {
            throw new RuntimeException("Containing activity must implement ErrorAlertDialogFragment.Listener", e2);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.b.a(this.a, 4);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.a = arguments.getInt("smartdevice.id");
        this.a = arguments.getInt("smartdevice.id");
        String string = arguments.getString("smartdevice.title");
        iva.a((Object) string);
        this.c = string;
        this.d = arguments.getString("smartdevice.message");
        String string2 = arguments.getString("smartdevice.positiveButtonText");
        iva.a((Object) string2);
        this.e = string2;
        this.f = arguments.getString("smartdevice.negativeButtonText");
        this.g = arguments.getBoolean("smartdevice.cancelable");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        if (activity != null) {
            AlertDialog.Builder cancelable = new AlertDialog.Builder(activity).setTitle(this.c).setPositiveButton(this.e, new acma(this)).setCancelable(this.g);
            if (!TextUtils.isEmpty(this.d)) {
                cancelable.setMessage(this.d);
            }
            if (!TextUtils.isEmpty(this.f)) {
                cancelable.setNegativeButton(this.f, new acmb(this));
            }
            AlertDialog create = cancelable.create();
            create.setCanceledOnTouchOutside(this.g);
            return create;
        }
        throw new IllegalStateException("activity null");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.b.a(this.a, 3);
    }
}
