package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.fitness.data.BleDevice;

/* renamed from: yna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yna extends DialogFragment {
    public final Dialog onCreateDialog(Bundle bundle) {
        String str = ((BleDevice) getArguments().getParcelable("device")).b;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.fitness_settings_disconnect_device_dialog_title);
        builder.setMessage(String.format(getResources().getString(R.string.fitness_settings_connected_device_content), new Object[]{str}));
        builder.setPositiveButton(17039370, new ymy(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        return builder.create();
    }
}
