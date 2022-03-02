package defpackage;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.feedback.ThemeSettings;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* renamed from: cza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cza extends cyi {
    private final aqrv c;
    private final dih d;
    private final Fragment e;

    public cza(aqrv aqrv, dih dih, Fragment fragment, czc czc, czb czb) {
        super(czc, czb);
        this.c = aqrv;
        this.d = dih;
        this.e = fragment;
    }

    public static Intent a(String str) {
        return mfk.a((mfl) new mfm(str, "asm"));
    }

    public static Intent b(String str) {
        return new Intent("com.google.android.gms.people.profile.ACTION_SET_AVATAR").putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", str);
    }

    public static Intent c(String str) {
        return new Intent("android.intent.action.VIEW", Uri.fromParts("google.maps.timeline", "", (String) null)).setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity")).putExtra("account_name", str);
    }

    public static Intent d(String str) {
        return new Intent().setClassName(ihs.b().getApplicationContext(), "com.google.android.gms.auth.account.otp.OtpActivity").putExtra("account_name", str);
    }

    public static boolean a(Intent intent) {
        return jhg.a(ihs.b().getApplicationContext(), intent);
    }

    public static boolean b() {
        return jkr.b() || kf.a((Context) ihs.b(), "android.permission.MANAGE_ACCOUNTS") == 0;
    }

    public final void a() {
        int i;
        quj.a();
        try {
            aqrv aqrv = this.c;
            switch (aqrv.b) {
                case 2:
                    String b = dio.b(this.d);
                    Uri build = Uri.parse(awgs.a.a().r()).buildUpon().appendQueryParameter("hl", dja.b()).build();
                    Spanned fromHtml = Html.fromHtml(this.e.getContext().getString(R.string.accountsettings_set_avatar_dialog_message, new Object[]{build.toString()}));
                    Context context = this.e.getContext();
                    if (!qud.h()) {
                        i = R.style.AsCenteredMaterialDialogThemeLight;
                    } else {
                        i = R.style.AsCenteredMaterialDialogThemeDark;
                    }
                    ajwe ajwe = new ajwe(context, i);
                    ajwe.b(true);
                    ajwe.c((int) R.string.accountsettings_set_avatar_dialog_title);
                    ajwe.c((CharSequence) fromHtml);
                    ajwe.c(17039360, (DialogInterface.OnClickListener) new cys(this));
                    ajwe.d((int) R.string.accountsettings_set_avatar_dialog_positive_button, (DialogInterface.OnClickListener) new cyt(this, b));
                    ss b2 = ajwe.b();
                    b2.setOnShowListener(new cyu(b2, build));
                    b2.setOnCancelListener(new cyv(this));
                    b2.show();
                    return;
                case 3:
                    a(a(dio.b(this.d)), 4);
                    return;
                case 4:
                    a(c(dio.b(this.d)), 5);
                    return;
                case 5:
                    a(d(dio.b(this.d)), 8);
                    return;
                case 7:
                    aqrc aqrc = aqrv.c;
                    if (aqrc == null) {
                        aqrc = aqrc.c;
                    }
                    dih dih = this.d;
                    mwc mwc = new mwc();
                    if (aqrc.b) {
                        mwc.b(iby.a(this.e.getActivity().getContainerActivity()));
                    }
                    if (dio.a(dih)) {
                        mwc.a = dih.a;
                    }
                    if (!jlh.d(aqrc.a)) {
                        mwc.c = aqrc.a;
                    }
                    ThemeSettings themeSettings = new ThemeSettings();
                    themeSettings.a = 0;
                    themeSettings.b = ThemeSettings.a(this.e.getActivity().getContainerActivity());
                    mwc.e = themeSettings;
                    acwa a = mvd.a(this.e.getActivity().getContainerActivity()).a(mwc.a());
                    a.a(this.e.getActivity(), (acvv) new cyw(this));
                    a.a(this.e.getActivity(), (acvs) new cyx(this));
                    return;
                case 10:
                    if (b()) {
                        qub.a(this.e.getContext()).a("com.google", (String) null, (String[]) null, (Bundle) null, (Activity) null, new cyr(this));
                        return;
                    } else {
                        this.b.a(new IllegalStateException("Missing permission MANAGE_ACCOUNTS"));
                        return;
                    }
                case 11:
                    aqrg aqrg = aqrv.d;
                    if (aqrg == null) {
                        aqrg = aqrg.c;
                    }
                    dih dih2 = this.d;
                    int i2 = aqrg.b;
                    if (i2 != 0) {
                        cvs a2 = cvs.a();
                        Intent intent = null;
                        if (a2.b.getCount() <= 0) {
                            cvr cvr = a2.a;
                            anaf anaf = cvr.a;
                            Integer valueOf = Integer.valueOf(i2);
                            if (anaf.containsKey(valueOf)) {
                                intent = ((GoogleSettingsItem) cvr.a.get(valueOf)).b;
                            }
                        }
                        if (intent != null) {
                            if (dio.a(dih2)) {
                                intent.putExtra("extra.accountName", dih2.a);
                                intent.putExtra("authAccount", dih2.a);
                            }
                            a(intent, 14);
                            return;
                        }
                    }
                    this.b.a(new IllegalStateException("Item is unspecified or intent is null"));
                    return;
                case 12:
                    quj.a(Uri.parse((String) ((amsz) iks.g).a), this.e.getActivity());
                    return;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    quj.d(this.e.getContext());
                    return;
                case Service.START_CONTINUATION_MASK:
                    quj.c(this.e.getContext());
                    return;
                default:
                    this.b.a(new IllegalArgumentException("Unknown native action ID"));
                    return;
            }
        } catch (din e2) {
            this.b.a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AccountManagerFuture accountManagerFuture) {
        try {
            a((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 13);
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            this.b.a(e2);
        }
    }

    public final void a(Intent intent, int i) {
        try {
            this.e.startActivityForResult(intent, i);
            this.a.a(true);
        } catch (ActivityNotFoundException e2) {
            this.b.a(e2);
        }
    }
}
