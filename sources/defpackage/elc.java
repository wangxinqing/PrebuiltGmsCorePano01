package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;

/* renamed from: elc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elc extends jeu {
    private final elw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public elc(Context context) {
        super(context, "auth_account");
        context.getString(R.string.auth_confirm_creds_authority);
        elw elw = new elw(new fyk(context));
        new ild(context);
        this.a = elw;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1037;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (!awly.c()) {
            if (bundle != null && bundle.getBoolean("initialize", false)) {
                String valueOf = String.valueOf(account.name);
                if (valueOf.length() == 0) {
                    new String("Initializing CredentialStateSyncAdapter for account ");
                } else {
                    "Initializing CredentialStateSyncAdapter for account ".concat(valueOf);
                }
                ContentResolver.setIsSyncable(account, str, 1);
                ContentResolver.setSyncAutomatically(account, str, true);
            }
            Context context = getContext();
            ild.a(account, str, new Bundle(), ent.X());
            acup.a(context.getContentResolver(), account, str, "credential-state", "credential-state");
            this.a.a(new ReauthSettingsRequest(3, account.name, true, (Account) null, (String) null));
        }
    }
}
