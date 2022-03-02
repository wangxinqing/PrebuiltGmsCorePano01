package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;

/* renamed from: zwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwj extends DialogFragment {
    public String a;

    public final Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getContext()).setTitle(R.string.romanesco_change_backup_account_title).setMessage(getString(R.string.romanesco_change_backup_account_message, this.a)).setPositiveButton(R.string.romanesco_go_to_backup_settings, new zwh(this)).setNegativeButton(R.string.common_cancel, zwi.a).create();
    }
}
