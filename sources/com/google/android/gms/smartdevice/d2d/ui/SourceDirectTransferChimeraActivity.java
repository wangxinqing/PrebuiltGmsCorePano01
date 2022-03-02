package com.google.android.gms.smartdevice.d2d.ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceDirectTransferChimeraActivity extends bjs implements acmm, accj, ackg, aced, acmc {
    public static final acpz c = acqa.a("SourceDirectTransferActivity");
    aceo a;
    abqf b;
    private accm d;
    private ResultReceiver e;
    private int f;
    private boolean g;
    private ProxyResultReceiver h;
    private long i;
    private boolean j;

    public static PendingIntent a(Context context, ResultReceiver resultReceiver, BootstrapConfigurations bootstrapConfigurations, BootstrapOptions bootstrapOptions, boolean z, boolean z2) {
        ResultReceiver resultReceiver2;
        int i2;
        Context context2 = context;
        BootstrapOptions bootstrapOptions2 = bootstrapOptions;
        Map b2 = bootstrapConfigurations.b();
        Context applicationContext = context.getApplicationContext();
        boolean z3 = bootstrapConfigurations.j;
        long j2 = bootstrapOptions2.l;
        PostTransferAction postTransferAction = bootstrapOptions2.u;
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferActivity");
        intent.addFlags(268468224);
        if (azjz.a.a().c()) {
            Parcel obtain = Parcel.obtain();
            resultReceiver.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            obtain.recycle();
            resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        } else {
            resultReceiver2 = resultReceiver;
        }
        intent.putExtra("resultReceiver", resultReceiver2);
        anvn a2 = acgp.a(context, postTransferAction);
        anvn anvn = anvn.NONE;
        String str = (String) b2.get("directTransferConfirmationBodyText");
        String str2 = (String) b2.get("directTransfer3pConfirmationBodyText");
        String str3 = (String) b2.get("directTransferConfirmationTitleText");
        String str4 = (String) b2.get("directTransferConfirmationWatchIcon");
        String str5 = (String) b2.get(BootstrapConfigurations.b);
        String str6 = (String) b2.get(BootstrapConfigurations.a);
        if (!z) {
            if (a2 == anvn) {
                i2 = R.string.smartdevice_d2d_copy_account_text;
            } else {
                i2 = R.string.copy_confirmation_description;
            }
            a(context, intent, "styledConfirmationText", str, i2);
        } else {
            a(context, intent, "styledConfirmationText", str2, a2 == anvn ? R.string.smartdevice_d2d_copy_3p_account_text : R.string.copy_confirmation_description_3p);
        }
        a(context, intent, "confirmationTitle", str3, R.string.smartdevice_d2d_copy_account_title);
        if (!azjz.b() || TextUtils.isEmpty(str5)) {
            intent.putExtra("confirmButton", context.getString(R.string.smartdevice_action_copy));
        } else {
            intent.putExtra("confirmButton", str5);
        }
        if (azjz.b() && !TextUtils.isEmpty(str6)) {
            intent.putExtra("transitionTitle", str6);
        }
        if (!TextUtils.isEmpty(str4)) {
            intent.putExtra("deviceIconType", str4);
        } else {
            intent.putExtra("deviceIconType", "deviceIconPhone");
        }
        return PendingIntent.getActivity(applicationContext, 8, intent.putExtra("sessionId", j2).putExtra("hasUserConfirmed", z3).putExtra("targetAcceptsManagedAccounts", z2), 134217728);
    }

    private final void k() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("resultReceiver", this.h);
        this.e.send(1001, bundle);
    }

    private final void l() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("lockScreenConfirmed", this.g);
        this.e.send(1004, bundle);
    }

    private final void m() {
        this.e.send(1002, Bundle.EMPTY);
    }

    public final void b(int i2, Bundle bundle) {
        if (i2 != 2001) {
            if (i2 == 2002) {
                onBackPressed();
                return;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("Unknown action: ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        } else if (!azjn.a.a().h()) {
            e();
        } else if (this.j) {
            c.d("Account transfer is in progress, skip the second click", new Object[0]);
        } else {
            this.j = true;
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        int i2 = this.f;
        if (i2 == 2) {
            if (azll.b()) {
                this.f = 4;
                l();
            } else {
                this.f++;
            }
            this.d.a(this.f, 1);
        } else if (i2 == 3) {
            this.f = i2 + 1;
            l();
            this.d.a(this.f, 1);
        } else if (i2 == 4) {
            throw new IllegalStateException("Unexpected next() when state is STATE_IN_PROGRESS");
        } else if (i2 != 5) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        } else {
            throw new IllegalStateException("Unexpected next() when state is STATE_ACCOUNT_CHALLENGE");
        }
    }

    public final void f() {
        if (!azjn.a.a().d()) {
            this.g = true;
            e();
        } else if (!this.g) {
            this.g = true;
            c.b("Screen unlocked", new Object[0]);
            e();
        } else {
            c.d("Unexpected screen unlock", new Object[0]);
        }
    }

    public final void h() {
        this.g = false;
        e();
    }

    public final void i() {
        this.d.a(this.f, 4);
    }

    public final void j() {
    }

    public final void onBackPressed() {
        this.e.send(1005, (Bundle) null);
        acpg.a(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        aceg.a((Activity) this);
        setContentView((int) R.layout.smartdevice_fragment_container);
        Intent intent = getIntent();
        this.e = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        String stringExtra = intent.getStringExtra("styledConfirmationText");
        String stringExtra2 = intent.getStringExtra("confirmationTitle");
        String stringExtra3 = intent.getStringExtra("deviceIconType");
        String stringExtra4 = intent.getStringExtra("confirmButton");
        String stringExtra5 = intent.getStringExtra("transitionTitle");
        boolean booleanExtra = intent.getBooleanExtra("hasUserConfirmed", false);
        boolean booleanExtra2 = intent.getBooleanExtra("targetAcceptsManagedAccounts", false);
        this.i = intent.getLongExtra("sessionId", -1);
        this.d = new accm(this, new accx(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5));
        if (acmn.a(this)) {
            i2 = booleanExtra ? 4 : 3;
        } else {
            i2 = 2;
        }
        if (bundle != null) {
            this.f = bundle.getInt("state", i2);
            this.g = bundle.getBoolean("didUnlock");
        } else {
            this.f = i2;
            this.d.a(i2, 1);
        }
        if (acec.c(this).a() && !booleanExtra2) {
            this.d.a(7, 4);
        }
        this.a = new acfp(this);
        this.b = abmr.b(this);
        if (azjz.a.a().b()) {
            acwa a2 = this.b.a((ihb) new abyw(this.i));
            aceo aceo = this.a;
            long j2 = this.i;
            iha b2 = ihb.b();
            b2.a = new acfm(j2);
            b2.b = new Feature[]{abmo.e};
            acws.b(a2, ((iby) aceo).a(b2.a())).a((acvp) new accw(this));
        }
        this.j = false;
        if (azjn.c()) {
            this.h = new ProxyResultReceiver((Handler) null, this);
            k();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.d = null;
        if (azjn.c()) {
            m();
            this.h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!azjn.c()) {
            m();
            this.h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!azjn.c()) {
            this.h = new ProxyResultReceiver((Handler) null, this);
            k();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.f);
        bundle.putBoolean("didUnlock", this.g);
    }

    private static void a(Context context, Intent intent, String str, String str2, int i2) {
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(str, str2);
        } else {
            intent.putExtra(str, context.getString(i2));
        }
    }

    public final void a(int i2, int i3) {
        if (i2 == 1) {
            this.e.send(1006, (Bundle) null);
            acpg.a(this);
        }
    }

    public final void a(int i2, Bundle bundle) {
        switch (i2) {
            case 1010:
                this.d.a(5, 1, bundle);
                return;
            case 1011:
            case 1012:
            case 1013:
                acpg.a(this);
                return;
            default:
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unknown ResultReceiver resultCode: ");
                sb.append(i2);
                throw new RuntimeException(sb.toString());
        }
    }

    public final void a(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        this.e.send(1003, bundle);
    }
}
