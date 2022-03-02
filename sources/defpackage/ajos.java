package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: ajos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajos implements View.OnClickListener {
    final /* synthetic */ LocationHistorySettingsChimeraActivity a;

    public ajos(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.a = locationHistorySettingsChimeraActivity;
    }

    public void onClick(View view) {
        qub a2 = qub.a((Context) this.a);
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.a;
        a2.a(locationHistorySettingsChimeraActivity.c, (Bundle) null, locationHistorySettingsChimeraActivity.getContainerActivity(), (AccountManagerCallback) null, (Handler) null);
    }
}
