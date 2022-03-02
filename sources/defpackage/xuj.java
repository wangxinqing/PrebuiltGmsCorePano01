package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.R;

/* renamed from: xuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuj extends qcf {
    public final Dialog onCreateDialog(Bundle bundle) {
        ajwe ajwe = new ajwe(getActivity());
        ajwe.c((int) R.string.people_contacts_sync_turn_on_master_sync_dialog_title);
        ajwe.b((int) R.string.people_contacts_sync_turn_on_master_sync_dialog_body);
        ajwe.b((int) R.string.common_turn_on, (DialogInterface.OnClickListener) new xuh((xui) getTargetFragment()));
        ajwe.c(17039360, (DialogInterface.OnClickListener) null);
        ajwe.b(false);
        return ajwe.b();
    }
}
