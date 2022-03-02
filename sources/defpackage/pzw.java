package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: pzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pzw {
    public static final /* synthetic */ int a = 0;
    private static final Intent b = new Intent("com.google.android.gms.auth.account.HANDLE_MANAGED").setPackage("com.google.android.gms");

    public static amri a(Context context, Account account, Bundle bundle) {
        amrl.a((Object) context, (Object) "Context cannot be null");
        amrl.a((Object) account, (Object) "Account cannot be null");
        amrl.a((Object) bundle, (Object) "Options cannot be null");
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(b, 128)) {
            if (next.activityInfo != null && next.activityInfo.metaData != null && "all".equals(next.activityInfo.metaData.getString("handle.managed.account.category"))) {
                Intent component = new Intent().setComponent(new ComponentName("com.google.android.gms", next.activityInfo.name));
                component.putExtra("account", account).putExtra("is_setup_wizard", false).putExtra("ui_parameters", Bundle.EMPTY).putExtra("suppress_account_provisioning", false).putExtra("is_user_owner", true).putExtra("dm_status", "dmStatus").putExtra("flow", 1).putExtra("options", bundle);
                return amri.b(component);
            }
        }
        return ampu.a;
    }

    public static PendingIntent a(Context context, PendingIntent pendingIntent, amzy amzy) {
        return PendingIntent.getActivity(context.getApplicationContext(), 0, new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity").setData(Uri.parse(String.format("intent://%s/%s", new Object[]{"com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity", UUID.randomUUID()}))).putExtra("com.google.android.gms.auth.redirect.INTENT", pendingIntent).putStringArrayListExtra("com.google.android.gms.auth.redirect.whitelist", new ArrayList(amzy)), 0);
    }

    public static Intent a(Context context, Account account) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity").putExtra("account", account);
    }

    public static Intent a(Context context, TokenRequest tokenRequest, TokenResponse tokenResponse, boolean z) {
        jix.h(context);
        if (!jkr.e() && z) {
            AppDescription appDescription = tokenRequest.j;
            String str = appDescription.e;
            int i = appDescription.b;
            String str2 = tokenRequest.b;
            return new Intent().setComponent(new ComponentName("com.google.android.gsf.notouch", "com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity")).putExtra("callingPkg", str).putExtra("callingUid", i).putExtra("service", str2).putExtra("acctName", tokenRequest.a().name).putParcelableArrayListExtra("scopeDetail", new ArrayList(tokenResponse.c()));
        }
        String string = tokenRequest.b().getString("KEY_DEVICE_NAME");
        eie a2 = eie.a(tokenRequest.b());
        boolean z2 = !a2.d();
        String c = a2.c();
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
        className.putExtra("callingPkg", tokenRequest.j.e);
        className.putExtra("callingUid", tokenRequest.j.b);
        className.putExtra("service", tokenRequest.b);
        className.putExtra("acctName", tokenRequest.a().name);
        className.putParcelableArrayListExtra("scopeData", anda.a(amym.a((Iterable) tokenResponse.c()).a(pzv.a).iterator()));
        className.putExtra("GrantCredentialsWithAclChimeraActivity.hasTitle", tokenResponse.r);
        className.putExtra("GrantCredentialsWithAclChimeraActivity.title", tokenResponse.s);
        className.putExtra("GrantCredentialsWithAclChimeraActivity.consentCookieWrapper", tokenResponse.y);
        if (string != null) {
            className.putExtra("KEY_DEVICE_NAME", string);
        }
        className.putExtra("GrantCredentialsWithAclChimeraActivity.isRemoteApp", z2);
        className.putExtra("GrantCredentialsWithAclChimeraActivity.remoteAppLabel", c);
        return className;
    }
}
