package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.CommitGmsPhenotypeOperation;
import com.google.android.gms.people.phenotype.CommitUiPhenotypeOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;

/* renamed from: xir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class xir implements acvp {
    private final RegisterPhenotypeOperation a;
    private final Context b;
    private final String c;
    private final Intent d;

    public xir(RegisterPhenotypeOperation registerPhenotypeOperation, Context context, String str, Intent intent) {
        this.a = registerPhenotypeOperation;
        this.b = context;
        this.c = str;
        this.d = intent;
    }

    public final void a(acwa acwa) {
        Intent intent;
        RegisterPhenotypeOperation registerPhenotypeOperation = this.a;
        Context context = this.b;
        String str = this.c;
        Intent intent2 = this.d;
        if ("com.google.android.gms.people.ui".equalsIgnoreCase(str)) {
            intent = IntentOperation.getStartIntent(context, CommitUiPhenotypeOperation.class, "com.google.android.gms.phenotype.UPDATE");
        } else {
            intent = IntentOperation.getStartIntent(context, CommitGmsPhenotypeOperation.class, "com.google.android.gms.phenotype.UPDATE");
        }
        registerPhenotypeOperation.startService(intent);
        if (acwa.b() && str.equals("com.google.android.gms.people")) {
            context.getSharedPreferences("ppl_first_sdk", 0).edit().putInt("com.google.android.gms.people.firstSdk", RegisterPhenotypeOperation.a(context, intent2)).commit();
        }
    }
}
