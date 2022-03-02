package defpackage;

import android.content.Context;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.concurrent.ExecutionException;

/* renamed from: ajis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajis extends jfx {
    final /* synthetic */ Context a;
    final /* synthetic */ ajit e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajis(ajit ajit, Context context) {
        super(10);
        this.e = ajit;
        this.a = context;
    }

    public final void run() {
        String str = this.e.a;
        if (str.length() == 0) {
            new String("Updating experiment tokens for ");
        } else {
            "Updating experiment tokens for ".concat(str);
        }
        try {
            this.e.a((ExperimentTokens) acws.a(yef.a(this.a).h(this.e.a)));
        } catch (InterruptedException | ExecutionException e2) {
            String str2 = this.e.a;
            ajix.c("GCoreUlr", str2.length() == 0 ? new String("Failed to get experiment tokens for ") : "Failed to get experiment tokens for ".concat(str2));
            this.e.a();
        }
    }
}
