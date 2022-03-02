package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.icing.ui.IcingManageSpaceChimeraActivity;

/* renamed from: pto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pto extends ptn {
    final /* synthetic */ IcingManageSpaceChimeraActivity a;
    private final boolean b = true;

    public pto(IcingManageSpaceChimeraActivity icingManageSpaceChimeraActivity) {
        this.a = icingManageSpaceChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final Context a() {
        return this.a.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        ptm ptm = (ptm) obj;
        if (isCancelled()) {
            return;
        }
        if (ptm.a == 0) {
            this.a.a.setVisibility(0);
            this.a.b.setVisibility(4);
            IcingManageSpaceChimeraActivity icingManageSpaceChimeraActivity = this.a;
            icingManageSpaceChimeraActivity.c.setText(Formatter.formatFileSize(icingManageSpaceChimeraActivity, ptm.d));
            this.a.e.setText(R.string.icing_storage_management_empty_list);
            IcingManageSpaceChimeraActivity icingManageSpaceChimeraActivity2 = this.a;
            icingManageSpaceChimeraActivity2.d.setAdapter(new ptr(icingManageSpaceChimeraActivity2, ptm.b));
        } else if (this.a.b.getVisibility() == 0) {
            this.a.b.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        int i;
        View view = this.a.a;
        int i2 = 0;
        if (!this.b) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        View view2 = this.a.b;
        if (!this.b) {
            i2 = 4;
        }
        view2.setVisibility(i2);
    }
}
