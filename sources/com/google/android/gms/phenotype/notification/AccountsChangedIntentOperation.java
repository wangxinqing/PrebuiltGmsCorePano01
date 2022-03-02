package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import com.google.android.chimera.IntentOperation;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountsChangedIntentOperation extends IntentOperation {
    private Context a;
    private yfg b;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public final void onCreate() {
        yfg a2 = yfg.a(this);
        this.a = this;
        this.b = a2;
    }

    public final void onDestroy() {
        this.b.close();
    }

    public final void onHandleIntent(Intent intent) {
        try {
            Set a2 = yfv.a(this.b.getWritableDatabase());
            String[] a3 = ygd.a(this.a);
            int length = a3.length;
            int i = 0;
            while (i < length) {
                if (a2.contains(a3[i])) {
                    i++;
                } else {
                    yij.a((Context) this, 6, (String) null);
                    return;
                }
            }
        } catch (SQLiteException e) {
        }
    }
}
