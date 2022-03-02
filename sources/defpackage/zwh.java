package defpackage;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: zwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class zwh implements DialogInterface.OnClickListener {
    private final zwj a;

    public zwh(zwj zwj) {
        this.a = zwj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zwj zwj = this.a;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.backup.ACTION_BACKUP_SETTINGS");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.BackupSettingsActivity");
        intent.putExtra("hide_reset", true);
        zwj.getActivity().startActivityForResult(intent, 3);
    }
}
