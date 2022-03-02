package defpackage;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* renamed from: psa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psa implements acvp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ aosh c;

    public psa(String str, String str2, aosh aosh) {
        this.a = str;
        this.b = str2;
        this.c = aosh;
    }

    public final void a(acwa acwa) {
        if (!acwa.b()) {
            Object[] objArr = {this.a, this.b, acwa.e()};
            this.c.b((Object) false);
            return;
        }
        for (Configuration configuration : ((Configurations) acwa.d()).e.values()) {
            Flag[] flagArr = configuration.b;
            int length = flagArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Flag flag = flagArr[i];
                    if (flag.a.equals("SherlogAndroid__sherlog_android_optin")) {
                        Boolean valueOf = Boolean.valueOf(flag.b());
                        Object[] objArr2 = {this.a, this.b, valueOf};
                        this.c.b((Object) valueOf);
                        return;
                    }
                    i++;
                }
            }
        }
        this.c.b((Object) false);
    }
}
