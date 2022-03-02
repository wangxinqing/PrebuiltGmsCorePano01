package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: smj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smj extends smk {
    /* access modifiers changed from: protected */
    public final void a(Activity activity) {
        snb.g(activity);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        amrl.a((Object) activity);
        return new AlertDialog.Builder(activity).setTitle(R.string.common_mdm_feature_name).setMessage(R.string.mdm_activate_device_admin_dialog_message).setPositiveButton(R.string.mdm_activate_device_admin_dialog_positive, this).setNegativeButton(R.string.common_not_now, (DialogInterface.OnClickListener) null).create();
    }
}
