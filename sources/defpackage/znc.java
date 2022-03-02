package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;

/* renamed from: znc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class znc extends DialogFragment implements DialogInterface.OnClickListener {
    private int a;
    private int b;
    private int c;
    private int d;

    public static znc a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("title", 0);
        bundle.putInt("message", i);
        bundle.putInt("finish_button", 17039370);
        bundle.putInt("retry_button", 0);
        znc znc = new znc();
        znc.setArguments(bundle);
        return znc;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(true);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -2);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getInt("title");
        this.b = arguments.getInt("message");
        this.c = arguments.getInt("finish_button");
        this.d = arguments.getInt("retry_button");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132019132));
        int i = this.a;
        if (i != 0) {
            builder.setTitle(i);
        }
        builder.setMessage(this.b).setNegativeButton(this.c, this).setCancelable(true);
        int i2 = this.d;
        if (i2 != 0) {
            builder.setPositiveButton(i2, this);
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    private final void a(boolean z) {
        Activity activity;
        if (z && (activity = getActivity()) != null) {
            activity.setResult(0);
            activity.finish();
        }
        dismiss();
    }
}
