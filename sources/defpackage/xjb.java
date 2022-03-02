package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import java.util.ArrayList;

/* renamed from: xjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xjb extends DialogFragment implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener {
    private static String[] a;
    private static String b;
    private static String c;

    private static String[] a(Context context) {
        if (a == null) {
            b = context.getString(R.string.common_take_photo_label);
            c = context.getString(R.string.people_avatar_dialog_item_pick_photo);
            boolean isEmpty = context.getPackageManager().queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 65536).isEmpty();
            ArrayList arrayList = new ArrayList();
            if (!isEmpty) {
                arrayList.add(b);
            }
            arrayList.add(c);
            a = (String[]) arrayList.toArray(new String[0]);
        }
        return a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ((xja) getActivity()).c();
        dismiss();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = a(getActivity())[i];
        if (b.equals(str)) {
            ((xja) getActivity()).a();
            dismiss();
        } else if (c.equals(str)) {
            ((xja) getActivity()).b();
            dismiss();
        } else {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unrecognized avatar source option: ") : "Unrecognized avatar source option: ".concat(valueOf));
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(getActivity(), 2132018396));
        xip.a();
        if (Boolean.valueOf(aywy.a.a().bJ()).booleanValue()) {
            alertDialog = builder.setTitle(R.string.people_set_avatar_redirect_title).setMessage(R.string.people_set_avatar_redirect_message).setPositiveButton(R.string.people_set_avatar_open_browser, new xiy(this)).setNegativeButton(R.string.common_cancel, new xiz(this)).create();
        } else {
            alertDialog = builder.setTitle(R.string.people_avatar_dialog_title).setItems(a(getActivity()), this).create();
        }
        alertDialog.setCancelable(true);
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.setOnKeyListener(this);
        return alertDialog;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        ((xja) getActivity()).c();
        dismiss();
        return true;
    }
}
