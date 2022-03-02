package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: qmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmg implements acvv {
    final /* synthetic */ boolean a;
    final /* synthetic */ OptInChimeraActivity b;

    public qmg(OptInChimeraActivity optInChimeraActivity, boolean z) {
        this.b = optInChimeraActivity;
        this.a = z;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        OptInInfo optInInfo = (OptInInfo) obj;
        Account[] accountArr = optInInfo != null ? optInInfo.c : null;
        if (accountArr == null || accountArr.length == 0) {
            OptInChimeraActivity.a.c("No accounts found. Showing error.", new Object[0]);
            this.b.a(1);
        } else if (!this.a && this.b.c.findFragmentById(R.id.content_wrapper) != null) {
            qna qna = this.b.b;
            qna.d.setAlpha(1.0f);
            qna.c.setVisibility(0);
            qna.f = 2;
        } else if (optInInfo.a != 1) {
            OptInChimeraActivity optInChimeraActivity = this.b;
            String stringExtra = optInChimeraActivity.getIntent().getStringExtra("defaultAccount");
            boolean booleanExtra = this.b.getIntent().getBooleanExtra("lastChance", false);
            qmp qmp = new qmp();
            Bundle bundle = new Bundle();
            bundle.putString("defaultAccount", stringExtra);
            bundle.putBoolean("lastChance", booleanExtra);
            bundle.putParcelableArrayList("eligibleAccounts", new ArrayList(Arrays.asList(accountArr)));
            qmp.setArguments(bundle);
            optInChimeraActivity.a((qnh) qmp);
        } else if (!qfm.b(this.b)) {
            this.b.o();
        } else if (!this.b.getIntent().getBooleanExtra("downloadSupervisorShowPrompt", false)) {
            this.b.e();
        } else {
            OptInChimeraActivity optInChimeraActivity2 = this.b;
            Intent p = optInChimeraActivity2.p();
            qms qms = new qms();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("browserIntent", p);
            qms.setArguments(bundle2);
            optInChimeraActivity2.a((qnh) qms);
        }
    }
}
