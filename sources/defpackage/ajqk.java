package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ajqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqk {
    public static final int a(Context context) {
        int i = 2;
        int i2 = 0;
        if (ayap.j()) {
            iby a = rmf.a(context);
            Account[] accountArr = ahxz.a(context).b;
            int length = accountArr.length;
            while (i2 < length) {
                try {
                    if (((ReportingState) acws.a(a.a(accountArr[i2]))).a) {
                        return 2;
                    }
                    i2++;
                } catch (InterruptedException | ExecutionException e) {
                }
            }
            return 1;
        }
        ibz ibz = new ibz(context);
        ibz.a(rmf.a);
        icc b = ibz.b();
        b.a(1500, TimeUnit.MILLISECONDS);
        if (!b.i()) {
            return 0;
        }
        Account[] accountArr2 = ahxz.a(context).b;
        int length2 = accountArr2.length;
        while (true) {
            if (i2 >= length2) {
                i = 1;
                break;
            }
            rmr rmr = (rmr) b.a((idf) new rme(b, accountArr2[i2])).a(1500, TimeUnit.MILLISECONDS);
            if (rmr.a.c()) {
                Status status = rmr.a;
                if (status.i == 0) {
                    if (rma.a(rmr.b.a())) {
                        break;
                    }
                } else {
                    String valueOf = String.valueOf(status);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                    sb.append("Illegal to call this method when status is failure: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            i2++;
        }
        b.g();
        return i;
    }
}
