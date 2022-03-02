package defpackage;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: drv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drv extends DialogFragment implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = getActivity();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull("gms:ads:ads_identifier:adid_key");
        contentValues.putNull("gms:ads:ads_identifier:enable_limit_ad_tracking");
        activity.getContentResolver().update(new Uri.Builder().scheme("content").authority("com.google.android.gsf.gservices").appendPath("override").build(), contentValues, (String) null, (String[]) null);
        ((ActivityManager) activity.getSystemService("activity")).clearApplicationUserData();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setTitle(getActivity().getText(R.string.icing_storage_management_clear_all_data_dlg_title)).setIconAttribute(16843605).setMessage(getActivity().getText(R.string.icing_storage_management_clear_all_data_dlg_text)).setPositiveButton(17039370, this).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }
}
