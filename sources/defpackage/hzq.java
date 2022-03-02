package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

/* renamed from: hzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hzq implements DialogInterface.OnClickListener {
    private final SimpleDialogAccountPickerChimeraActivity a;

    public hzq(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity) {
        this.a = simpleDialogAccountPickerChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.onBackPressed();
    }
}
