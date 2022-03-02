package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.common.account.OriginalSimpleAccountPickerChimeraActivity;

/* renamed from: hzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hzj implements DialogInterface.OnClickListener {
    final /* synthetic */ OriginalSimpleAccountPickerChimeraActivity a;

    public hzj(OriginalSimpleAccountPickerChimeraActivity originalSimpleAccountPickerChimeraActivity) {
        this.a = originalSimpleAccountPickerChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.k();
    }
}
