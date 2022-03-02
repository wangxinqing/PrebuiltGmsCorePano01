package com.google.android.gms.checkin.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FirstAccountReadySender$1 extends nla {
    final /* synthetic */ SharedPreferences a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirstAccountReadySender$1(String str, SharedPreferences sharedPreferences) {
        super(str);
        this.a = sharedPreferences;
    }

    public final void a(Context context, Intent intent) {
        if (getResultCode() == -1) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putBoolean("first.account.ready.received", true);
            edit.apply();
        }
    }
}
