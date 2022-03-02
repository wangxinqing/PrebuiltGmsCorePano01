package defpackage;

import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcu extends lec {
    private final List a = new ArrayList();

    public lcu(ldz ldz) {
        super(ldz);
    }

    public final DriveId a(krk krk, lnj lnj, boolean z) {
        DriveId a2 = super.a(krk, lnj, z);
        if (a2 != null) {
            this.a.add(lnj.g());
        }
        return a2;
    }

    public final List a() {
        return Collections.unmodifiableList(this.a);
    }
}
