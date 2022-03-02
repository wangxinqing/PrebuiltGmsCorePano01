package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: mya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mya extends DialogFragment {
    public final mvt a;
    private final ErrorReport b;

    public mya(mvt mvt, ErrorReport errorReport) {
        this.a = mvt;
        this.b = errorReport;
    }

    public final void a() {
        String str = this.b.R;
        try {
            String valueOf = String.valueOf(axmj.t());
            String valueOf2 = String.valueOf(str);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2))));
            this.a.a(122, this.b);
            getActivity().finish();
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
            sb.append("Can't view ");
            sb.append(str);
            sb.append(" in Play Store");
            Log.w("UpdateDialogFragment", sb.toString(), e);
            this.a.a(124, this.b);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.a.a();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        sr srVar = new sr(getActivity());
        srVar.a((int) R.string.gf_upgrade_title);
        srVar.b((int) R.string.gf_upgrade_message);
        srVar.b((int) R.string.common_update, (DialogInterface.OnClickListener) new mxx(this));
        srVar.a((int) R.string.common_no_thanks, (DialogInterface.OnClickListener) new mxy(this));
        srVar.a((DialogInterface.OnKeyListener) new mxz(this));
        return srVar.b();
    }
}
