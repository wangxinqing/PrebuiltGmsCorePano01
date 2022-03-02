package defpackage;

import android.text.format.Formatter;
import android.widget.TextView;
import com.google.android.gms.app.settings.ManageSpaceChimeraActivity;

/* renamed from: drt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class drt implements acvv {
    final /* synthetic */ ManageSpaceChimeraActivity a;

    public drt(ManageSpaceChimeraActivity manageSpaceChimeraActivity) {
        this.a = manageSpaceChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        long j;
        ick ick = (ick) obj;
        long j2 = 0;
        if (ick != null) {
            j2 = ick.l();
            j = ick.m();
        } else {
            j = 0;
        }
        ManageSpaceChimeraActivity manageSpaceChimeraActivity = this.a;
        manageSpaceChimeraActivity.a.setText(Formatter.formatFileSize(manageSpaceChimeraActivity, j2));
        ManageSpaceChimeraActivity manageSpaceChimeraActivity2 = this.a;
        TextView textView = manageSpaceChimeraActivity2.c;
        if (textView != null) {
            textView.setText(Formatter.formatFileSize(manageSpaceChimeraActivity2, j));
        }
    }
}
