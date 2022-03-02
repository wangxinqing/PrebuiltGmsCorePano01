package defpackage;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.os.Build;

/* renamed from: acph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acph {
    private static final iwd a = acqa.a("Utils", "BackupUtils");

    public static String a(Context context) {
        Account account;
        int i = Build.VERSION.SDK_INT;
        boolean isBackupEnabled = new BackupManager(context).isBackupEnabled();
        iwd iwd = a;
        StringBuilder sb = new StringBuilder(21);
        sb.append("Backup enabled: ");
        sb.append(isBackupEnabled);
        iwd.c(sb.toString(), new Object[0]);
        if (isBackupEnabled) {
            account = new gsa(context).a();
        } else {
            account = null;
        }
        if (account != null) {
            return account.name;
        }
        return null;
    }
}
