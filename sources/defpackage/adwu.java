package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.UUID;

/* renamed from: adwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adwu {
    public final Intent a;
    protected final Bundle b = new Bundle();
    private final adxt c;
    private final adxr d;
    private final boolean e;

    public final Intent a() {
        adxt adxt = this.c;
        ApplicationParameters applicationParameters = this.d.a;
        BuyFlowConfig buyFlowConfig = adxt.a;
        buyFlowConfig.b = applicationParameters;
        if (buyFlowConfig.a == null) {
            buyFlowConfig.a = UUID.randomUUID().toString();
        }
        BuyFlowConfig buyFlowConfig2 = adxt.a;
        this.a.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig2);
        if (this.e) {
            Account account = buyFlowConfig2.b.b;
            iva.a((Object) account, (Object) "Buyer account is required");
            this.a.putExtra("com.google.android.gms.wallet.account", account);
        }
        if (this.a.getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0) == 0) {
            this.a.putExtra("com.google.android.gms.wallet.intentBuildTimeMs", SystemClock.elapsedRealtime());
        }
        Intent intent = this.a;
        b();
        return intent;
    }

    public final void a(int i) {
        this.d.a.a = i;
    }

    public final void a(Account account) {
        this.d.a.b = account;
    }

    public final void a(WalletCustomTheme walletCustomTheme) {
        this.d.a.f = walletCustomTheme;
    }

    /* access modifiers changed from: protected */
    public void b() {
        throw null;
    }

    public adwu(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent();
        this.a = intent;
        intent.setPackage("com.google.android.gms");
        this.a.setAction(str);
        adxr adxr = new adxr(new ApplicationParameters());
        adxr.a.c = this.b;
        this.d = adxr;
        adxt adxt = new adxt(new BuyFlowConfig());
        String packageName = context.getPackageName();
        BuyFlowConfig buyFlowConfig = adxt.a;
        buyFlowConfig.c = packageName;
        buyFlowConfig.d = str2;
        this.c = adxt;
        this.e = z;
    }
}
