package defpackage;

import android.content.DialogInterface;
import com.google.android.gms.drive.DriveId;

/* renamed from: lol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lol implements DialogInterface.OnClickListener {
    final /* synthetic */ lop a;

    public lol(lop lop) {
        this.a = lop;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        loo loo = this.a.c;
        if (loo != null) {
            loo.a(1, (DriveId) null);
        }
    }
}
