package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* renamed from: ygj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ygj extends IInterface {
    void a(Status status);

    void a(Status status, long j);

    void a(Status status, Configurations configurations);

    void a(Status status, DogfoodsToken dogfoodsToken);

    void a(Status status, ExperimentTokens experimentTokens);

    void a(Status status, Flag flag);

    void a(Status status, FlagOverrides flagOverrides);

    void b(Status status);

    void b(Status status, long j);

    void b(Status status, Configurations configurations);

    void c(Status status);

    void d(Status status);

    void e(Status status);

    void f(Status status);

    void g(Status status);
}
