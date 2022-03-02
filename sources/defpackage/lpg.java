package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

/* renamed from: lpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lpg implements View.OnClickListener {
    private final lpq a;

    public lpg(lpq lpq) {
        this.a = lpq;
    }

    public void onClick(View view) {
        lpq lpq = this.a;
        int id = view.getId();
        boolean z = true;
        if (id == R.id.drive_button_bar_button_right) {
            DriveId driveId = lpq.i.c;
            if (driveId == null) {
                z = false;
            }
            iva.a(z);
            if (lpq.f) {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(lpq.e));
                    Scope scope = jzf.a;
                    icc icc = lpq.g;
                    long longValue = valueOf.longValue();
                    if (longValue == 0) {
                        throw new IllegalArgumentException("projectNumber must be provided and nonzero.");
                    } else if (driveId != null) {
                        icc.b((idf) new kvg(icc, longValue, driveId)).a(lpq.d);
                    } else {
                        throw new IllegalArgumentException("driveId must be provided.");
                    }
                } catch (NumberFormatException e) {
                    lpq.d.a(new Status(8, "Unable to authorize the app with non-numeric sdkAppId."));
                }
            } else {
                lpq.a(driveId);
            }
        } else if (id != R.id.drive_button_bar_button_left) {
            lpq.a.b("SelectFileFragment", "Unknown view clicked: %s, %s.", Integer.valueOf(view.getId()), view);
        } else {
            lpq.getActivity().setResult(0);
            lpq.getActivity().finish();
            lpq.a(1);
        }
    }
}
