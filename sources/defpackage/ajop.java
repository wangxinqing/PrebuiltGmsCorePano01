package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: ajop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajop implements View.OnClickListener {
    final /* synthetic */ LocationHistorySettingsChimeraActivity a;

    public ajop(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.a = locationHistorySettingsChimeraActivity;
    }

    public void onClick(View view) {
        qub.a((Context) this.a).a("com.google", (String) null, (String[]) null, (Bundle) null, this.a.getContainerActivity(), (AccountManagerCallback) null);
    }
}
