package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.common.account.OriginalSimpleAccountPickerChimeraActivity;

/* renamed from: hzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hzi implements DialogInterface.OnClickListener {
    final /* synthetic */ OriginalSimpleAccountPickerChimeraActivity a;

    public hzi(OriginalSimpleAccountPickerChimeraActivity originalSimpleAccountPickerChimeraActivity) {
        this.a = originalSimpleAccountPickerChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.onBackPressed();
    }
}
