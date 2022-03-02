package defpackage;

import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import org.chromium.net.UrlRequest;

/* renamed from: ygi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygi extends bhw implements ygj {
    private final acwd a;

    public ygi() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    public final void a(Status status) {
        ihd.a(status, this.a);
    }

    public final void b(Status status) {
        ihd.a(status, this.a);
    }

    public final void c(Status status) {
        ihd.a(status, this.a);
    }

    public final void d(Status status) {
        ihd.a(status, this.a);
    }

    public final void e(Status status) {
        ihd.a(status, this.a);
    }

    public final void f(Status status) {
        ihd.a(status, this.a);
    }

    public final void g(Status status) {
        ihd.a(status, this.a);
    }

    public final void a(Status status, long j) {
        ihd.a(status, Long.valueOf(j), this.a);
    }

    public final void b(Status status, long j) {
        ihd.a(status, Long.valueOf(j), this.a);
    }

    public ygi(acwd acwd) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = acwd;
    }

    public final void a(Status status, Configurations configurations) {
        ihd.a(status, configurations, this.a);
    }

    public final void b(Status status, Configurations configurations) {
        ihd.a(status, configurations, this.a);
    }

    public final void a(Status status, DogfoodsToken dogfoodsToken) {
        ihd.a(status, dogfoodsToken, this.a);
    }

    public final void a(Status status, ExperimentTokens experimentTokens) {
        ihd.a(status, experimentTokens, this.a);
    }

    public final void a(Status status, Flag flag) {
        ihd.a(status, flag, this.a);
    }

    public final void a(Status status, FlagOverrides flagOverrides) {
        ihd.a(status, flagOverrides, this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 3:
                d((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 4:
                a((Status) bhx.a(parcel, Status.CREATOR), (Configurations) bhx.a(parcel, Configurations.CREATOR));
                return true;
            case 5:
                e((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 6:
                a((Status) bhx.a(parcel, Status.CREATOR), (ExperimentTokens) bhx.a(parcel, ExperimentTokens.CREATOR));
                return true;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (DogfoodsToken) bhx.a(parcel, DogfoodsToken.CREATOR));
                return true;
            case 8:
                f((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 9:
                a((Status) bhx.a(parcel, Status.CREATOR), (Flag) bhx.a(parcel, Flag.CREATOR));
                return true;
            case 10:
                b((Status) bhx.a(parcel, Status.CREATOR), (Configurations) bhx.a(parcel, Configurations.CREATOR));
                return true;
            case 11:
                a((Status) bhx.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 12:
                g((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                a((Status) bhx.a(parcel, Status.CREATOR), (FlagOverrides) bhx.a(parcel, FlagOverrides.CREATOR));
                return true;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                c((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case Service.START_CONTINUATION_MASK:
                ihd.a((Status) bhx.a(parcel, Status.CREATOR), this.a);
                return true;
            case 16:
                b((Status) bhx.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            default:
                return false;
        }
    }
}
