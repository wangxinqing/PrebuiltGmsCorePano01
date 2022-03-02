package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: oim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oim extends jfx {
    final /* synthetic */ nzu a;
    final /* synthetic */ HelpChimeraActivity e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oim(HelpChimeraActivity helpChimeraActivity, nzu nzu) {
        super(10);
        this.e = helpChimeraActivity;
        this.a = nzu;
    }

    public final void run() {
        ExperimentTokens experimentTokens;
        byte[] bArr;
        try {
            nzu nzu = this.a;
            nzu.k();
            acwa h = yef.a((Context) nzu).h("com.google.android.gms.googlehelp");
            acws.a(h, axmj.a.a().an(), TimeUnit.SECONDS);
            HelpChimeraActivity helpChimeraActivity = this.e;
            if (h.b() && (experimentTokens = (ExperimentTokens) h.d()) != null && (bArr = experimentTokens.c) != null) {
                String encodeToString = Base64.encodeToString(bArr, 11);
                if (!TextUtils.isEmpty(encodeToString) && helpChimeraActivity.x != null) {
                    aucd o = olo.I.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    olo olo = (olo) o.b;
                    olo.j = 156;
                    int i = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    olo.a = i;
                    encodeToString.getClass();
                    olo.b |= 1;
                    olo.A = encodeToString;
                    HelpConfig helpConfig = helpChimeraActivity.x;
                    String str = helpConfig.b;
                    str.getClass();
                    olo.a = i | 2;
                    olo.d = str;
                    if (!TextUtils.isEmpty(helpConfig.e)) {
                        String str2 = helpChimeraActivity.x.e;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        olo olo2 = (olo) o.b;
                        str2.getClass();
                        olo2.a |= 64;
                        olo2.i = str2;
                    }
                    MetricsIntentOperation.a(helpChimeraActivity, (olo) o.i(), false);
                }
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
        }
    }
}
