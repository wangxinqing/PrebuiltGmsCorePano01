package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;

/* renamed from: xus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xus {
    static Account a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Account(str, "com.google");
        }
        return null;
    }

    static boolean a(BackupAndSyncOptInState backupAndSyncOptInState) {
        return backupAndSyncOptInState != null && backupAndSyncOptInState.c == 3;
    }

    static agbl b(String str) {
        agbk g = agbl.g();
        g.a(str);
        return g.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b(com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState r1) {
        /*
            r0 = 1
            if (r1 == 0) goto L_0x000b
            int r1 = r1.c
            if (r1 == r0) goto L_0x000b
            if (r1 == 0) goto L_0x000b
            r1 = 0
            return r1
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xus.b(com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState):boolean");
    }

    static Intent a(Account account, String str) {
        return a(account, str, (ArrayList) null);
    }

    static Intent a(Account account, String str, ArrayList arrayList) {
        ArrayList arrayList2;
        hwu hwu = new hwu();
        hwu.a = account;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        hwu.b = arrayList2;
        hwu.c();
        hwu.a(anda.a((Object[]) new String[]{"com.google"}));
        hwu.b();
        hwu.f = 1001;
        hwu.c = str;
        return hwy.a(hwu.a());
    }

    static String a(Account account) {
        if (account != null) {
            return account.name;
        }
        return null;
    }

    static void a(String str, View view) {
        view.setClickable(true);
        qb.b(view, 1);
        qb.a(view, (oz) new xur(str));
    }
}
