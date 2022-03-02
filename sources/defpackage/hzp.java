package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import java.util.List;

/* renamed from: hzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hzp implements DialogInterface.OnClickListener {
    private final SimpleDialogAccountPickerChimeraActivity a;
    private final List b;

    public hzp(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity, List list) {
        this.a = simpleDialogAccountPickerChimeraActivity;
        this.b = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity = this.a;
        simpleDialogAccountPickerChimeraActivity.e.a((pzh) this.b.get(simpleDialogAccountPickerChimeraActivity.g));
    }
}
